package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.CreationTextCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DotDividerSpan;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.TimerParticles;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.HintView2;

public class ManageLinksActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private long adminId;
    private int adminsDividerRow;
    private int adminsEndRow;
    private int adminsHeaderRow;
    boolean adminsLoaded;
    private int adminsStartRow;
    private boolean canEdit;
    private int createLinkHelpRow;
    private int createNewLinkRow;
    private int creatorDividerRow;
    private int creatorRow;
    private TLRPC.Chat currentChat;
    private long currentChatId;
    boolean deletingRevokedLinks;
    private int dividerRow;
    boolean hasMore;
    private int helpRow;
    private TLRPC.ChatFull info;
    private TLRPC.TL_chatInviteExported invite;
    private InviteLinkBottomSheet inviteLinkBottomSheet;
    private int invitesCount;
    private boolean isChannel;
    private boolean isOpened;
    private boolean isPublic;
    private int lastDivider;
    Drawable linkIcon;
    Drawable linkIconRevenue;
    Drawable linkIconRevoked;
    private int linksEndRow;
    private int linksHeaderRow;
    private int linksInfoRow;
    boolean linksLoading;
    private int linksLoadingRow;
    private int linksStartRow;
    private RecyclerListView listView;
    private ListAdapter listViewAdapter;
    boolean loadAdmins;
    private int permanentLinkHeaderRow;
    private int permanentLinkRow;
    private RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
    private int revokeAllDivider;
    private int revokeAllRow;
    private int revokedDivider;
    private int revokedHeader;
    private int revokedLinksEndRow;
    private int revokedLinksStartRow;
    private int rowCount;
    long timeDif;
    private ArrayList invites = new ArrayList();
    private ArrayList revokedInvites = new ArrayList();
    private HashMap users = new HashMap();
    private ArrayList admins = new ArrayList();
    Runnable updateTimerRunnable = new Runnable() {
        @Override
        public void run() {
            if (ManageLinksActivity.this.listView == null) {
                return;
            }
            for (int i = 0; i < ManageLinksActivity.this.listView.getChildCount(); i++) {
                View childAt = ManageLinksActivity.this.listView.getChildAt(i);
                if (childAt instanceof LinkCell) {
                    LinkCell linkCell = (LinkCell) childAt;
                    if (linkCell.timerRunning) {
                        linkCell.setLink(linkCell.invite, linkCell.position);
                    }
                }
            }
            AndroidUtilities.runOnUIThread(this, 500L);
        }
    };
    boolean loadRevoked = false;
    private final LinkEditActivity.Callback linkEditActivityCallback = new AnonymousClass6();
    AnimationNotificationsLocker notificationsLocker = new AnimationNotificationsLocker();

    @Override
    public boolean needDelayOpenAnimation() {
        return true;
    }

    private static class EmptyView extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
        private final int currentAccount;
        private BackupImageView stickerView;

        public EmptyView(Context context) {
            super(context);
            this.currentAccount = UserConfig.selectedAccount;
            setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
            setOrientation(1);
            BackupImageView backupImageView = new BackupImageView(context);
            this.stickerView = backupImageView;
            addView(backupImageView, LayoutHelper.createLinear(104, 104, 49, 0, 2, 0, 0));
        }

        private void setSticker() {
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByName("tg_placeholders_android");
            if (stickerSetByName == null) {
                stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName("tg_placeholders_android");
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 4) {
                TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
                this.stickerView.setImage(ImageLocation.getForDocument(document), "104_104", "tgs", DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 1.0f), tL_messages_stickerSet);
            } else {
                MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName("tg_placeholders_android", false, tL_messages_stickerSet == null);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            setSticker();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0])) {
                setSticker();
            }
        }
    }

    public ManageLinksActivity(long j, long j2, int i) {
        boolean z = false;
        this.currentChatId = j;
        this.invitesCount = i;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
        this.currentChat = chat;
        this.isChannel = ChatObject.isChannel(chat) && !this.currentChat.megagroup;
        if (j2 == 0) {
            this.adminId = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.adminId = j2;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.adminId));
        if (this.adminId == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z = true;
        }
        this.canEdit = z;
    }

    public void loadLinks(boolean z) {
        if (this.loadAdmins && !this.adminsLoaded) {
            this.linksLoading = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-this.currentChatId);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ManageLinksActivity.$r8$lambda$z2iL34_1ON2TXZSJRi6StbnUY40(this.f$0, tLObject, tL_error);
                }
            }), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.currentChatId);
            if (this.adminId == getUserConfig().getClientUserId()) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(this.adminId);
            }
            final boolean z2 = this.loadRevoked;
            if (z2) {
                tL_messages_getExportedChatInvites.revoked = true;
                if (!this.revokedInvites.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    ArrayList arrayList = this.revokedInvites;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) arrayList.get(arrayList.size() - 1)).link;
                    ArrayList arrayList2 = this.revokedInvites;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) arrayList2.get(arrayList2.size() - 1)).date;
                }
            } else if (!this.invites.isEmpty()) {
                tL_messages_getExportedChatInvites.flags |= 4;
                ArrayList arrayList3 = this.invites;
                tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) arrayList3.get(arrayList3.size() - 1)).link;
                ArrayList arrayList4 = this.invites;
                tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) arrayList4.get(arrayList4.size() - 1)).date;
            }
            this.linksLoading = true;
            final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.isPublic ? null : this.invite;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ManageLinksActivity.$r8$lambda$416hkoGTUNPWPyNyV0HswcZxMcc(this.f$0, tL_chatInviteExported, z2, tLObject, tL_error);
                }
            }), getClassGuid());
        }
        if (z) {
            updateRows(true);
        }
    }

    public static void $r8$lambda$z2iL34_1ON2TXZSJRi6StbnUY40(final ManageLinksActivity manageLinksActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        manageLinksActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ManageLinksActivity manageLinksActivity2 = this.f$0;
                manageLinksActivity2.getNotificationCenter().doOnIdle(new Runnable() {
                    @Override
                    public final void run() {
                        ManageLinksActivity.$r8$lambda$bjSGIoy7EAFd3Ot711BFF_XoVjM(manageLinksActivity2, tL_error, tLObject);
                    }
                });
            }
        });
    }

    public static void $r8$lambda$bjSGIoy7EAFd3Ot711BFF_XoVjM(ManageLinksActivity manageLinksActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
        manageLinksActivity.linksLoading = false;
        if (tL_error == null) {
            TLRPC.TL_messages_chatAdminsWithInvites tL_messages_chatAdminsWithInvites = (TLRPC.TL_messages_chatAdminsWithInvites) tLObject;
            for (int i = 0; i < tL_messages_chatAdminsWithInvites.admins.size(); i++) {
                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = tL_messages_chatAdminsWithInvites.admins.get(i);
                if (tL_chatAdminWithInvites.admin_id != manageLinksActivity.getAccountInstance().getUserConfig().clientUserId) {
                    manageLinksActivity.admins.add(tL_chatAdminWithInvites);
                }
            }
            for (int i2 = 0; i2 < tL_messages_chatAdminsWithInvites.users.size(); i2++) {
                TLRPC.User user = tL_messages_chatAdminsWithInvites.users.get(i2);
                manageLinksActivity.users.put(Long.valueOf(user.id), user);
            }
        }
        int i3 = manageLinksActivity.rowCount;
        manageLinksActivity.adminsLoaded = true;
        manageLinksActivity.hasMore = false;
        if (manageLinksActivity.admins.size() > 0 && (recyclerItemsEnterAnimator = manageLinksActivity.recyclerItemsEnterAnimator) != null && !manageLinksActivity.isPaused && manageLinksActivity.isOpened) {
            recyclerItemsEnterAnimator.showItemsAnimated(i3 + 1);
        }
        if (!manageLinksActivity.hasMore || manageLinksActivity.invites.size() + manageLinksActivity.revokedInvites.size() + manageLinksActivity.admins.size() >= 5) {
            manageLinksActivity.resumeDelayedFragmentAnimation();
        }
        if (!manageLinksActivity.hasMore && !manageLinksActivity.loadRevoked) {
            manageLinksActivity.hasMore = true;
            manageLinksActivity.loadRevoked = true;
            manageLinksActivity.loadLinks(false);
        }
        manageLinksActivity.updateRows(true);
    }

    public static void $r8$lambda$416hkoGTUNPWPyNyV0HswcZxMcc(final ManageLinksActivity manageLinksActivity, TLRPC.TL_chatInviteExported tL_chatInviteExported, final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported2;
        manageLinksActivity.getClass();
        if (tL_error != null) {
            tL_chatInviteExported2 = null;
            break;
        }
        TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
        if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported != null) {
            int i = 0;
            while (true) {
                if (i >= tL_messages_exportedChatInvites.invites.size()) {
                    tL_chatInviteExported2 = null;
                    break;
                } else {
                    if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i)).link.equals(tL_chatInviteExported.link)) {
                        tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i);
                        break;
                    }
                    i++;
                }
            }
        } else {
            tL_chatInviteExported2 = null;
            break;
        }
        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ManageLinksActivity manageLinksActivity2 = this.f$0;
                manageLinksActivity2.getNotificationCenter().doOnIdle(new Runnable() {
                    @Override
                    public final void run() {
                        ManageLinksActivity.m3544$r8$lambda$OAuw5ymj7jsqLNsCkmkQrtxvIA(manageLinksActivity2, tL_chatInviteExported, tL_error, tLObject, z);
                    }
                });
            }
        });
    }

    public static void m3544$r8$lambda$OAuw5ymj7jsqLNsCkmkQrtxvIA(ManageLinksActivity manageLinksActivity, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        boolean z2;
        boolean z3;
        DiffCallback diffCallbackSaveListState = manageLinksActivity.saveListState();
        manageLinksActivity.linksLoading = false;
        manageLinksActivity.hasMore = false;
        if (tL_chatInviteExported != null) {
            manageLinksActivity.invite = tL_chatInviteExported;
            TLRPC.ChatFull chatFull = manageLinksActivity.info;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            }
        }
        if (tL_error == null) {
            TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
            if (z) {
                for (int i = 0; i < tL_messages_exportedChatInvites.invites.size(); i++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i);
                    manageLinksActivity.fixDate(tL_chatInviteExported2);
                    manageLinksActivity.revokedInvites.add(tL_chatInviteExported2);
                }
            } else {
                if (manageLinksActivity.adminId != manageLinksActivity.getAccountInstance().getUserConfig().clientUserId && manageLinksActivity.invites.size() == 0 && tL_messages_exportedChatInvites.invites.size() > 0) {
                    manageLinksActivity.invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(0);
                    tL_messages_exportedChatInvites.invites.remove(0);
                }
                for (int i2 = 0; i2 < tL_messages_exportedChatInvites.invites.size(); i2++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i2);
                    manageLinksActivity.fixDate(tL_chatInviteExported3);
                    manageLinksActivity.invites.add(tL_chatInviteExported3);
                }
            }
            for (int i3 = 0; i3 < tL_messages_exportedChatInvites.users.size(); i3++) {
                manageLinksActivity.users.put(Long.valueOf(tL_messages_exportedChatInvites.users.get(i3).id), tL_messages_exportedChatInvites.users.get(i3));
            }
            int i4 = manageLinksActivity.rowCount;
            if (tL_messages_exportedChatInvites.invites.size() == 0) {
                manageLinksActivity.hasMore = false;
            } else if (z) {
                manageLinksActivity.hasMore = manageLinksActivity.revokedInvites.size() + 1 < tL_messages_exportedChatInvites.count;
            } else {
                manageLinksActivity.hasMore = manageLinksActivity.invites.size() + 1 < tL_messages_exportedChatInvites.count;
            }
            if (tL_messages_exportedChatInvites.invites.size() <= 0 || !manageLinksActivity.isOpened) {
                z2 = true;
            } else {
                RecyclerItemsEnterAnimator recyclerItemsEnterAnimator = manageLinksActivity.recyclerItemsEnterAnimator;
                if (recyclerItemsEnterAnimator != null && !manageLinksActivity.isPaused) {
                    recyclerItemsEnterAnimator.showItemsAnimated(i4 + 1);
                }
                z2 = false;
            }
            TLRPC.ChatFull chatFull2 = manageLinksActivity.info;
            if (chatFull2 != null && !z) {
                chatFull2.invitesCount = tL_messages_exportedChatInvites.count;
                manageLinksActivity.getMessagesStorage().saveChatLinksCount(manageLinksActivity.currentChatId, manageLinksActivity.info.invitesCount);
            }
        } else {
            manageLinksActivity.hasMore = false;
            z2 = false;
        }
        if (!manageLinksActivity.hasMore && !manageLinksActivity.loadRevoked && manageLinksActivity.adminId == manageLinksActivity.getAccountInstance().getUserConfig().clientUserId) {
            manageLinksActivity.hasMore = true;
            manageLinksActivity.loadAdmins = true;
        } else {
            if (manageLinksActivity.hasMore || manageLinksActivity.loadRevoked) {
                z3 = false;
            } else {
                manageLinksActivity.hasMore = true;
                manageLinksActivity.loadRevoked = true;
            }
            if (manageLinksActivity.hasMore || manageLinksActivity.invites.size() + manageLinksActivity.revokedInvites.size() + manageLinksActivity.admins.size() >= 5) {
                manageLinksActivity.resumeDelayedFragmentAnimation();
            }
            if (z3) {
                manageLinksActivity.loadLinks(false);
            }
            if (!z2 && manageLinksActivity.listViewAdapter != null && manageLinksActivity.listView.getChildCount() > 0) {
                manageLinksActivity.updateRecyclerViewAnimated(diffCallbackSaveListState);
                return;
            }
            manageLinksActivity.updateRows(true);
        }
        z3 = true;
        if (manageLinksActivity.hasMore) {
            manageLinksActivity.resumeDelayedFragmentAnimation();
        } else {
            manageLinksActivity.resumeDelayedFragmentAnimation();
        }
        if (z3) {
            manageLinksActivity.loadLinks(false);
        }
        if (!z2) {
        }
        manageLinksActivity.updateRows(true);
    }

    public void updateRows(boolean z) {
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.currentChatId));
        this.currentChat = chat;
        if (chat == null) {
            return;
        }
        this.creatorRow = -1;
        this.creatorDividerRow = -1;
        this.linksStartRow = -1;
        this.linksEndRow = -1;
        this.linksLoadingRow = -1;
        this.revokedLinksStartRow = -1;
        this.revokedLinksEndRow = -1;
        this.revokedHeader = -1;
        this.revokedDivider = -1;
        this.lastDivider = -1;
        this.revokeAllRow = -1;
        this.revokeAllDivider = -1;
        this.createLinkHelpRow = -1;
        this.helpRow = -1;
        this.createNewLinkRow = -1;
        this.adminsEndRow = -1;
        this.adminsStartRow = -1;
        this.adminsDividerRow = -1;
        this.adminsHeaderRow = -1;
        this.linksHeaderRow = -1;
        this.dividerRow = -1;
        this.linksInfoRow = -1;
        this.rowCount = 0;
        boolean z2 = this.adminId != getAccountInstance().getUserConfig().clientUserId;
        if (z2) {
            int i = this.rowCount;
            this.creatorRow = i;
            this.rowCount = i + 2;
            this.creatorDividerRow = i + 1;
        } else {
            int i2 = this.rowCount;
            this.rowCount = i2 + 1;
            this.helpRow = i2;
        }
        int i3 = this.rowCount;
        this.permanentLinkHeaderRow = i3;
        int i4 = i3 + 2;
        this.rowCount = i4;
        this.permanentLinkRow = i3 + 1;
        if (!z2) {
            this.dividerRow = i4;
            this.rowCount = i3 + 4;
            this.createNewLinkRow = i3 + 3;
        } else if (!this.invites.isEmpty()) {
            int i5 = this.rowCount;
            this.dividerRow = i5;
            this.rowCount = i5 + 2;
            this.linksHeaderRow = i5 + 1;
        }
        if (!this.invites.isEmpty()) {
            int i6 = this.rowCount;
            this.linksStartRow = i6;
            int size = i6 + this.invites.size();
            this.rowCount = size;
            this.linksEndRow = size;
        }
        if (!z2 && this.invites.isEmpty() && this.createNewLinkRow >= 0 && (!this.linksLoading || this.loadAdmins || this.loadRevoked)) {
            int i7 = this.rowCount;
            this.rowCount = i7 + 1;
            this.createLinkHelpRow = i7;
        }
        if (!z2 && this.admins.size() > 0) {
            if ((!this.invites.isEmpty() || this.createNewLinkRow >= 0) && this.createLinkHelpRow == -1) {
                int i8 = this.rowCount;
                this.rowCount = i8 + 1;
                this.adminsDividerRow = i8;
            }
            int i9 = this.rowCount;
            int i10 = i9 + 1;
            this.rowCount = i10;
            this.adminsHeaderRow = i9;
            this.adminsStartRow = i10;
            int size2 = i10 + this.admins.size();
            this.rowCount = size2;
            this.adminsEndRow = size2;
        }
        if (!this.revokedInvites.isEmpty()) {
            if (this.adminsStartRow >= 0) {
                int i11 = this.rowCount;
                this.rowCount = i11 + 1;
                this.revokedDivider = i11;
            } else if ((!this.invites.isEmpty() || this.createNewLinkRow >= 0) && this.createLinkHelpRow == -1) {
                int i12 = this.rowCount;
                this.rowCount = i12 + 1;
                this.revokedDivider = i12;
            } else if (z2 && this.linksStartRow == -1) {
                int i13 = this.rowCount;
                this.rowCount = i13 + 1;
                this.revokedDivider = i13;
            }
            int i14 = this.rowCount;
            int i15 = i14 + 1;
            this.rowCount = i15;
            this.revokedHeader = i14;
            this.revokedLinksStartRow = i15;
            int size3 = i15 + this.revokedInvites.size();
            this.revokedLinksEndRow = size3;
            this.revokeAllDivider = size3;
            this.rowCount = size3 + 2;
            this.revokeAllRow = size3 + 1;
        }
        if (!this.loadAdmins && !this.loadRevoked && ((this.linksLoading || this.hasMore) && !z2)) {
            int i16 = this.rowCount;
            this.rowCount = i16 + 1;
            this.linksLoadingRow = i16;
        }
        if (!this.invites.isEmpty()) {
            int i17 = this.linksEndRow;
            int i18 = this.rowCount;
            if (i17 == i18) {
                this.rowCount = i18 + 1;
                this.linksInfoRow = i18;
            } else if (this.invites.isEmpty() || !this.revokedInvites.isEmpty()) {
                int i19 = this.rowCount;
                this.rowCount = i19 + 1;
                this.lastDivider = i19;
            }
        } else if (this.invites.isEmpty()) {
            int i110 = this.rowCount;
            this.rowCount = i110 + 1;
            this.lastDivider = i110;
        } else {
            int i111 = this.rowCount;
            this.rowCount = i111 + 1;
            this.lastDivider = i111;
        }
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter == null || !z) {
            return;
        }
        listAdapter.notifyDataSetChanged();
    }

    @Override
    public View createView(final Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLinks));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    ManageLinksActivity.this.finishFragment();
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(ManageLinksActivity.this.updateTimerRunnable, 500L);
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(ManageLinksActivity.this.updateTimerRunnable);
            }
        };
        this.fragmentView = frameLayout;
        int i = Theme.key_windowBackgroundGray;
        frameLayout.setBackgroundColor(Theme.getColor(i));
        this.fragmentView.setTag(Integer.valueOf(i));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        this.listView.setLayoutManager(linearLayoutManager);
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                super.onScrolled(recyclerView, i2, i3);
                ManageLinksActivity manageLinksActivity = ManageLinksActivity.this;
                if (!manageLinksActivity.hasMore || manageLinksActivity.linksLoading) {
                    return;
                }
                if (ManageLinksActivity.this.rowCount - linearLayoutManager.findLastVisibleItemPosition() < 10) {
                    ManageLinksActivity.this.loadLinks(true);
                }
            }
        });
        this.recyclerItemsEnterAnimator = new RecyclerItemsEnterAnimator(this.listView, false);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(420L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                ManageLinksActivity.m3542$r8$lambda$LXsXyqGTUJIuZzWYVJxvprmSM(this.f$0, context, view, i2);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i2) {
                return ManageLinksActivity.$r8$lambda$06n_r1CohXTlZDsscwmJVBa0xTM(this.f$0, view, i2);
            }
        });
        this.linkIcon = ContextCompat.getDrawable(context, R.drawable.msg_link_1);
        this.linkIconRevoked = ContextCompat.getDrawable(context, R.drawable.msg_link_2);
        this.linkIconRevenue = ContextCompat.getDrawable(context, R.drawable.large_income);
        this.linkIcon.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        updateRows(true);
        this.timeDif = ((long) getConnectionsManager().getCurrentTime()) - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public static void m3542$r8$lambda$LXsXyqGTUJIuZzWYVJxvprmSM(final ManageLinksActivity manageLinksActivity, Context context, View view, int i) {
        if (i == manageLinksActivity.creatorRow) {
            TLRPC.User user = (TLRPC.User) manageLinksActivity.users.get(Long.valueOf(manageLinksActivity.invite.admin_id));
            if (user != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                MessagesController.getInstance(UserConfig.selectedAccount).putUser(user, false);
                manageLinksActivity.presentFragment(new ProfileActivity(bundle));
                return;
            }
            return;
        }
        if (i == manageLinksActivity.createNewLinkRow) {
            LinkEditActivity linkEditActivity = new LinkEditActivity(0, manageLinksActivity.currentChatId);
            linkEditActivity.setCallback(manageLinksActivity.linkEditActivityCallback);
            manageLinksActivity.presentFragment(linkEditActivity);
            return;
        }
        int i2 = manageLinksActivity.linksStartRow;
        if (i >= i2 && i < manageLinksActivity.linksEndRow) {
            InviteLinkBottomSheet inviteLinkBottomSheet = new InviteLinkBottomSheet(context, (TLRPC.TL_chatInviteExported) manageLinksActivity.invites.get(i - i2), manageLinksActivity.info, manageLinksActivity.users, manageLinksActivity, manageLinksActivity.currentChatId, false, manageLinksActivity.isChannel);
            manageLinksActivity.inviteLinkBottomSheet = inviteLinkBottomSheet;
            inviteLinkBottomSheet.setCanEdit(manageLinksActivity.canEdit);
            manageLinksActivity.inviteLinkBottomSheet.show();
            return;
        }
        int i3 = manageLinksActivity.revokedLinksStartRow;
        if (i >= i3 && i < manageLinksActivity.revokedLinksEndRow) {
            InviteLinkBottomSheet inviteLinkBottomSheet2 = new InviteLinkBottomSheet(context, (TLRPC.TL_chatInviteExported) manageLinksActivity.revokedInvites.get(i - i3), manageLinksActivity.info, manageLinksActivity.users, manageLinksActivity, manageLinksActivity.currentChatId, false, manageLinksActivity.isChannel);
            manageLinksActivity.inviteLinkBottomSheet = inviteLinkBottomSheet2;
            inviteLinkBottomSheet2.show();
            return;
        }
        if (i == manageLinksActivity.revokeAllRow) {
            if (manageLinksActivity.deletingRevokedLinks) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(manageLinksActivity.getParentActivity());
            builder.setTitle(LocaleController.getString(R.string.DeleteAllRevokedLinks));
            builder.setMessage(LocaleController.getString(R.string.DeleteAllRevokedLinkHelp));
            builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i4) {
                    ManageLinksActivity.m3545$r8$lambda$hHbL2QxMYCIDjQCkQXv69Xghzg(this.f$0, alertDialog, i4);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            manageLinksActivity.showDialog(builder.create());
            return;
        }
        int i4 = manageLinksActivity.adminsStartRow;
        if (i < i4 || i >= manageLinksActivity.adminsEndRow) {
            return;
        }
        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) manageLinksActivity.admins.get(i - i4);
        if (manageLinksActivity.users.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
            manageLinksActivity.getMessagesController().putUser((TLRPC.User) manageLinksActivity.users.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
        }
        ManageLinksActivity manageLinksActivity2 = new ManageLinksActivity(manageLinksActivity.currentChatId, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
        manageLinksActivity2.setInfo(manageLinksActivity.info, null);
        manageLinksActivity.presentFragment(manageLinksActivity2);
    }

    public static void m3545$r8$lambda$hHbL2QxMYCIDjQCkQXv69Xghzg(final ManageLinksActivity manageLinksActivity, AlertDialog alertDialog, int i) {
        manageLinksActivity.getClass();
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        tL_messages_deleteRevokedExportedChatInvites.peer = manageLinksActivity.getMessagesController().getInputPeer(-manageLinksActivity.currentChatId);
        if (manageLinksActivity.adminId == manageLinksActivity.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = manageLinksActivity.getMessagesController().getInputUser(manageLinksActivity.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = manageLinksActivity.getMessagesController().getInputUser(manageLinksActivity.adminId);
        }
        manageLinksActivity.deletingRevokedLinks = true;
        manageLinksActivity.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ManageLinksActivity.$r8$lambda$XFbPeKfEEBMjRQBxyC09idJRdjw(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$XFbPeKfEEBMjRQBxyC09idJRdjw(final ManageLinksActivity manageLinksActivity, TLObject tLObject, final TLRPC.TL_error tL_error) {
        manageLinksActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ManageLinksActivity.m3541$r8$lambda$3xDwJ1BoqsdvNZWBv0DyPWNCKk(this.f$0, tL_error);
            }
        });
    }

    public static void m3541$r8$lambda$3xDwJ1BoqsdvNZWBv0DyPWNCKk(ManageLinksActivity manageLinksActivity, TLRPC.TL_error tL_error) {
        manageLinksActivity.deletingRevokedLinks = false;
        if (tL_error == null) {
            DiffCallback diffCallbackSaveListState = manageLinksActivity.saveListState();
            manageLinksActivity.revokedInvites.clear();
            manageLinksActivity.updateRecyclerViewAnimated(diffCallbackSaveListState);
        }
    }

    public static boolean $r8$lambda$06n_r1CohXTlZDsscwmJVBa0xTM(ManageLinksActivity manageLinksActivity, View view, int i) {
        if ((i < manageLinksActivity.linksStartRow || i >= manageLinksActivity.linksEndRow) && (i < manageLinksActivity.revokedLinksStartRow || i >= manageLinksActivity.revokedLinksEndRow)) {
            return false;
        }
        ((LinkCell) view).optionsView.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public void setInfo(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.info = chatFull;
        this.invite = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.isPublic = ChatObject.isPublic(this.currentChat);
        loadLinks(true);
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public class HintInnerCell extends FrameLayout {
        private EmptyView emptyView;
        private TextView messageTextView;

        public HintInnerCell(Context context) {
            super(context);
            EmptyView emptyView = new EmptyView(context);
            this.emptyView = emptyView;
            addView(emptyView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.messageTextView = textView;
            textView.setTextColor(Theme.getColor(Theme.key_chats_message));
            this.messageTextView.setTextSize(1, 14.0f);
            this.messageTextView.setGravity(17);
            this.messageTextView.setText(LocaleController.getString(ManageLinksActivity.this.isChannel ? R.string.PrimaryLinkHelpChannel : R.string.PrimaryLinkHelp));
            addView(this.messageTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }

    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            if (ManageLinksActivity.this.creatorRow == adapterPosition || ManageLinksActivity.this.createNewLinkRow == adapterPosition) {
                return true;
            }
            if (adapterPosition >= ManageLinksActivity.this.linksStartRow && adapterPosition < ManageLinksActivity.this.linksEndRow) {
                return true;
            }
            if ((adapterPosition < ManageLinksActivity.this.revokedLinksStartRow || adapterPosition >= ManageLinksActivity.this.revokedLinksEndRow) && adapterPosition != ManageLinksActivity.this.revokeAllRow) {
                return adapterPosition >= ManageLinksActivity.this.adminsStartRow && adapterPosition < ManageLinksActivity.this.adminsEndRow;
            }
            return true;
        }

        @Override
        public int getItemCount() {
            return ManageLinksActivity.this.rowCount;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            switch (i) {
                case 1:
                    headerCell = new HeaderCell(this.mContext, 23);
                    break;
                case 2:
                    Context context = this.mContext;
                    ManageLinksActivity manageLinksActivity = ManageLinksActivity.this;
                    final LinkActionView linkActionView = new LinkActionView(context, manageLinksActivity, null, manageLinksActivity.currentChatId, true, ManageLinksActivity.this.isChannel);
                    linkActionView.setPermanent(true);
                    linkActionView.setDelegate(new LinkActionView.Delegate() {
                        @Override
                        public void editLink() {
                            LinkActionView.Delegate.CC.$default$editLink(this);
                        }

                        @Override
                        public void removeLink() {
                            LinkActionView.Delegate.CC.$default$removeLink(this);
                        }

                        @Override
                        public void revokeLink() {
                            ManageLinksActivity.this.revokePermanent();
                        }

                        @Override
                        public void showUsersForPermanentLink() {
                            ManageLinksActivity manageLinksActivity2 = ManageLinksActivity.this;
                            Context context2 = linkActionView.getContext();
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = ManageLinksActivity.this.invite;
                            TLRPC.ChatFull chatFull = ManageLinksActivity.this.info;
                            HashMap map = ManageLinksActivity.this.users;
                            ManageLinksActivity manageLinksActivity3 = ManageLinksActivity.this;
                            manageLinksActivity2.inviteLinkBottomSheet = new InviteLinkBottomSheet(context2, tL_chatInviteExported, chatFull, map, manageLinksActivity3, manageLinksActivity3.currentChatId, true, ManageLinksActivity.this.isChannel);
                            ManageLinksActivity.this.inviteLinkBottomSheet.show();
                        }
                    });
                    headerCell = linkActionView;
                    break;
                case 3:
                    headerCell = new CreationTextCell(this.mContext, 64, ((BaseFragment) ManageLinksActivity.this).resourceProvider);
                    break;
                case 4:
                    headerCell = new ShadowSectionCell(this.mContext);
                    break;
                case 5:
                    headerCell = ManageLinksActivity.this.new LinkCell(this.mContext);
                    break;
                case 6:
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                    flickerLoadingView.setIsSingleCell(true);
                    flickerLoadingView.setViewType(9);
                    flickerLoadingView.showDate(false);
                    headerCell = flickerLoadingView;
                    break;
                case 7:
                    headerCell = new ShadowSectionCell(this.mContext);
                    break;
                case 8:
                    TextSettingsCell textSettingsCell = new TextSettingsCell(this.mContext);
                    textSettingsCell.setText(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                    textSettingsCell.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
                    headerCell = textSettingsCell;
                    break;
                case 9:
                    headerCell = new TextInfoPrivacyCell(this.mContext);
                    break;
                case 10:
                    headerCell = new ManageChatUserCell(this.mContext, 8, 6, false);
                    break;
                case 11:
                    headerCell = new TextInfoPrivacyCell(this.mContext, ((BaseFragment) ManageLinksActivity.this).resourceProvider);
                    break;
                default:
                    HintInnerCell hintInnerCell = ManageLinksActivity.this.new HintInnerCell(this.mContext);
                    hintInnerCell.setTag(-33024);
                    headerCell = hintInnerCell;
                    break;
            }
            headerCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(headerCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported;
            int i2;
            TLRPC.User user;
            int itemViewType = viewHolder.getItemViewType();
            boolean z = true;
            if (itemViewType == 1) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i == ManageLinksActivity.this.permanentLinkHeaderRow) {
                    if (ManageLinksActivity.this.isPublic && ManageLinksActivity.this.adminId == ManageLinksActivity.this.getAccountInstance().getUserConfig().clientUserId) {
                        headerCell.setText(LocaleController.getString(R.string.PublicLink));
                        return;
                    } else if (ManageLinksActivity.this.adminId == ManageLinksActivity.this.getAccountInstance().getUserConfig().clientUserId) {
                        headerCell.setText(LocaleController.getString(R.string.ChannelInviteLinkTitle));
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.PermanentLinkForThisAdmin));
                        return;
                    }
                }
                if (i != ManageLinksActivity.this.revokedHeader) {
                    if (i != ManageLinksActivity.this.linksHeaderRow) {
                        if (i == ManageLinksActivity.this.adminsHeaderRow) {
                            headerCell.setText(LocaleController.getString(R.string.LinksCreatedByOtherAdmins));
                            return;
                        }
                        return;
                    }
                    headerCell.setText(LocaleController.getString(R.string.LinksCreatedByThisAdmin));
                    return;
                }
                headerCell.setText(LocaleController.getString(R.string.RevokedLinks));
                return;
            }
            if (itemViewType == 2) {
                LinkActionView linkActionView = (LinkActionView) viewHolder.itemView;
                linkActionView.setCanEdit(ManageLinksActivity.this.adminId == ManageLinksActivity.this.getAccountInstance().getUserConfig().clientUserId);
                if (!ManageLinksActivity.this.isPublic || ManageLinksActivity.this.adminId != ManageLinksActivity.this.getAccountInstance().getUserConfig().clientUserId) {
                    linkActionView.hideRevokeOption(!ManageLinksActivity.this.canEdit);
                    if (ManageLinksActivity.this.invite != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ManageLinksActivity.this.invite;
                        linkActionView.setLink(tL_chatInviteExported2.link);
                        linkActionView.loadUsers(tL_chatInviteExported2, ManageLinksActivity.this.currentChatId);
                        return;
                    } else {
                        linkActionView.setLink(null);
                        linkActionView.loadUsers(null, ManageLinksActivity.this.currentChatId);
                        return;
                    }
                }
                if (ManageLinksActivity.this.info != null) {
                    linkActionView.setLink("https://t.me/" + ChatObject.getPublicUsername(ManageLinksActivity.this.currentChat));
                    linkActionView.setUsers(0, null);
                    linkActionView.hideRevokeOption(true);
                    return;
                }
                return;
            }
            if (itemViewType == 3) {
                CreationTextCell creationTextCell = (CreationTextCell) viewHolder.itemView;
                Drawable drawable = this.mContext.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = this.mContext.getResources().getDrawable(R.drawable.poll_add_plus);
                int color = Theme.getColor(Theme.key_switchTrackChecked);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_checkboxCheck), mode));
                creationTextCell.setTextAndIcon(LocaleController.getString(R.string.CreateNewLink), new CombinedDrawable(drawable, drawable2), !ManageLinksActivity.this.invites.isEmpty());
                return;
            }
            if (itemViewType == 5) {
                if (i < ManageLinksActivity.this.linksStartRow || i >= ManageLinksActivity.this.linksEndRow) {
                    tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ManageLinksActivity.this.revokedInvites.get(i - ManageLinksActivity.this.revokedLinksStartRow);
                    if (i == ManageLinksActivity.this.revokedLinksEndRow - 1) {
                        z = false;
                    }
                } else {
                    tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ManageLinksActivity.this.invites.get(i - ManageLinksActivity.this.linksStartRow);
                    if (i == ManageLinksActivity.this.linksEndRow - 1) {
                        z = false;
                    }
                }
                LinkCell linkCell = (LinkCell) viewHolder.itemView;
                linkCell.setLink(tL_chatInviteExported, i - ManageLinksActivity.this.linksStartRow);
                linkCell.drawDivider = z;
                return;
            }
            switch (itemViewType) {
                case 9:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    TLRPC.ChatFull chatFull = ManageLinksActivity.this.getMessagesController().getChatFull(ManageLinksActivity.this.currentChatId);
                    TLRPC.Chat chat = ManageLinksActivity.this.getMessagesController().getChat(Long.valueOf(ManageLinksActivity.this.currentChatId));
                    if (chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(chat)) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                    }
                    break;
                case 10:
                    ManageChatUserCell manageChatUserCell = (ManageChatUserCell) viewHolder.itemView;
                    if (i == ManageLinksActivity.this.creatorRow) {
                        user = ManageLinksActivity.this.getMessagesController().getUser(Long.valueOf(ManageLinksActivity.this.adminId));
                        i2 = ManageLinksActivity.this.invitesCount;
                    } else {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ManageLinksActivity.this.admins.get(i - ManageLinksActivity.this.adminsStartRow);
                        TLRPC.User user2 = (TLRPC.User) ManageLinksActivity.this.users.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        i2 = tL_chatAdminWithInvites.invites_count;
                        if (i == ManageLinksActivity.this.adminsEndRow - 1) {
                            user = user2;
                        } else {
                            user = user2;
                        }
                        if (user != null) {
                            manageChatUserCell.setData(user, ContactsController.formatName(user.first_name, user.last_name), LocaleController.formatPluralString("InviteLinkCount", i2, new Object[0]), z);
                        }
                    }
                    z = false;
                    if (user != null) {
                        manageChatUserCell.setData(user, ContactsController.formatName(user.first_name, user.last_name), LocaleController.formatPluralString("InviteLinkCount", i2, new Object[0]), z);
                    }
                    break;
                case 11:
                    TextInfoPrivacyCell textInfoPrivacyCell2 = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (i == ManageLinksActivity.this.linksInfoRow) {
                        TLRPC.ChatFull chatFull2 = ManageLinksActivity.this.getMessagesController().getChatFull(ManageLinksActivity.this.currentChatId);
                        TLRPC.Chat chat2 = ManageLinksActivity.this.getMessagesController().getChat(Long.valueOf(ManageLinksActivity.this.currentChatId));
                        if (chatFull2 != null && chatFull2.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            textInfoPrivacyCell2.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                        } else {
                            textInfoPrivacyCell2.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                        }
                    }
                    break;
            }
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).recycle();
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i == ManageLinksActivity.this.helpRow) {
                return 0;
            }
            if (i == ManageLinksActivity.this.permanentLinkHeaderRow || i == ManageLinksActivity.this.revokedHeader || i == ManageLinksActivity.this.adminsHeaderRow || i == ManageLinksActivity.this.linksHeaderRow) {
                return 1;
            }
            if (i == ManageLinksActivity.this.permanentLinkRow) {
                return 2;
            }
            if (i == ManageLinksActivity.this.createNewLinkRow) {
                return 3;
            }
            if (i == ManageLinksActivity.this.dividerRow || i == ManageLinksActivity.this.revokedDivider || i == ManageLinksActivity.this.revokeAllDivider || i == ManageLinksActivity.this.creatorDividerRow || i == ManageLinksActivity.this.adminsDividerRow) {
                return 4;
            }
            if (i >= ManageLinksActivity.this.linksStartRow && i < ManageLinksActivity.this.linksEndRow) {
                return 5;
            }
            if (i >= ManageLinksActivity.this.revokedLinksStartRow && i < ManageLinksActivity.this.revokedLinksEndRow) {
                return 5;
            }
            if (i == ManageLinksActivity.this.linksLoadingRow) {
                return 6;
            }
            if (i == ManageLinksActivity.this.lastDivider) {
                return 7;
            }
            if (i == ManageLinksActivity.this.revokeAllRow) {
                return 8;
            }
            if (i == ManageLinksActivity.this.createLinkHelpRow) {
                return 9;
            }
            if (i == ManageLinksActivity.this.creatorRow) {
                return 10;
            }
            if (i < ManageLinksActivity.this.adminsStartRow || i >= ManageLinksActivity.this.adminsEndRow) {
                return i == ManageLinksActivity.this.linksInfoRow ? 11 : 1;
            }
            return 10;
        }
    }

    public void revokePermanent() {
        if (this.adminId == getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.currentChatId);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.invite;
            this.invite = null;
            this.info.exported_invite = null;
            int iSendRequest = getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ManageLinksActivity.$r8$lambda$KnA0UHWfx4mzASkiXZLweom_G6o(this.f$0, tL_chatInviteExported, tLObject, tL_error);
                }
            });
            AndroidUtilities.updateVisibleRows(this.listView);
            getConnectionsManager().bindRequestToGuid(iSendRequest, this.classGuid);
            return;
        }
        revokeLink(this.invite);
    }

    public static void $r8$lambda$KnA0UHWfx4mzASkiXZLweom_G6o(final ManageLinksActivity manageLinksActivity, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        manageLinksActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ManageLinksActivity.$r8$lambda$F2xByJbt4FznXOopKlRiuIZITc4(this.f$0, tL_error, tLObject, tL_chatInviteExported);
            }
        });
    }

    public static void $r8$lambda$F2xByJbt4FznXOopKlRiuIZITc4(ManageLinksActivity manageLinksActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        manageLinksActivity.getClass();
        if (tL_error == null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
            manageLinksActivity.invite = tL_chatInviteExported2;
            TLRPC.ChatFull chatFull = manageLinksActivity.info;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported2;
            }
            if (manageLinksActivity.getParentActivity() == null) {
                return;
            }
            tL_chatInviteExported.revoked = true;
            DiffCallback diffCallbackSaveListState = manageLinksActivity.saveListState();
            manageLinksActivity.revokedInvites.add(0, tL_chatInviteExported);
            manageLinksActivity.updateRecyclerViewAnimated(diffCallbackSaveListState);
            BulletinFactory.of(manageLinksActivity).createSimpleBulletin(R.raw.linkbroken, LocaleController.getString(R.string.InviteRevokedHint)).show();
        }
    }

    class LinkCell extends FrameLayout {
        int animateFromState;
        boolean animateHideExpiring;
        float animateToStateProgress;
        boolean drawDivider;
        TLRPC.TL_chatInviteExported invite;
        float lastDrawExpringProgress;
        int lastDrawingState;
        ImageView optionsView;
        Paint paint;
        Paint paint2;
        int position;
        private final LinearLayout priceLayout;
        private final TextView priceSubitleView;
        private final TextView priceTitleView;
        RectF rectF;
        private final TextView subtitleView;
        private final LinearLayout textLayout;
        private final TimerParticles timerParticles;
        boolean timerRunning;
        private final TextView titleView;

        private boolean hasProgress(int i) {
            return i == 2 || i == 1;
        }

        public LinkCell(Context context) {
            super(context);
            this.paint = new Paint(1);
            this.paint2 = new Paint(1);
            this.rectF = new RectF();
            this.animateToStateProgress = 1.0f;
            this.timerParticles = new TimerParticles();
            this.paint2.setStyle(Paint.Style.STROKE);
            this.paint2.setStrokeCap(Paint.Cap.ROUND);
            LinearLayout linearLayout = new LinearLayout(context);
            this.textLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 16, 64.0f, 0.0f, 30.0f, 0.0f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 16.0f);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i));
            textView.setLines(1);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setTextSize(1, 13.0f);
            int i2 = Theme.key_windowBackgroundWhiteGrayText;
            textView2.setTextColor(Theme.getColor(i2));
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 4.33f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.optionsView = imageView;
            imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_ab_other));
            this.optionsView.setScaleType(ImageView.ScaleType.CENTER);
            this.optionsView.setColorFilter(Theme.getColor(Theme.key_stickers_menu));
            this.optionsView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ManageLinksActivity.LinkCell.$r8$lambda$7Ri7yhHPO7FcRlYDyaeAJ2KYRS0(this.f$0, view);
                }
            });
            this.optionsView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector), 1));
            addView(this.optionsView, LayoutHelper.createFrame(48, 48.0f, 21, 0.0f, 0.0f, 8.0f, 0.0f));
            setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            setWillNotDraw(false);
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.priceLayout = linearLayout2;
            linearLayout2.setOrientation(1);
            TextView textView3 = new TextView(context);
            this.priceTitleView = textView3;
            textView3.setTextSize(1, 16.0f);
            textView3.setTextColor(Theme.getColor(i));
            textView3.setLines(1);
            textView3.setEllipsize(truncateAt);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(5);
            linearLayout2.addView(textView3, LayoutHelper.createLinear(-1, -2, 5));
            TextView textView4 = new TextView(context);
            this.priceSubitleView = textView4;
            textView4.setTextSize(1, 13.0f);
            textView4.setTextColor(Theme.getColor(i2));
            textView4.setGravity(5);
            linearLayout2.addView(textView4, LayoutHelper.createLinear(-1, -2, 5, 0, 1, 0, 0));
            addView(linearLayout2, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            linearLayout2.setVisibility(8);
        }

        public static void $r8$lambda$7Ri7yhHPO7FcRlYDyaeAJ2KYRS0(final LinkCell linkCell, View view) {
            if (linkCell.invite == null) {
                return;
            }
            View view2 = ManageLinksActivity.this.fragmentView;
            if (view2 instanceof ViewGroup) {
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions((ViewGroup) view2, linkCell);
                if (linkCell.invite.revoked) {
                    itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Delete), true, new Runnable() {
                        @Override
                        public final void run() {
                            ManageLinksActivity.LinkCell.$r8$lambda$BaCfSZOWSbqwGn_nBQcKNA9PP9c(this.f$0);
                        }
                    });
                } else {
                    itemOptionsMakeOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable() {
                        @Override
                        public final void run() {
                            ManageLinksActivity.LinkCell.$r8$lambda$3OymL_Iul21jXaR8SE5jhRmg7X0(this.f$0);
                        }
                    });
                    itemOptionsMakeOptions.add(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() {
                        @Override
                        public final void run() {
                            ManageLinksActivity.LinkCell.m3548$r8$lambda$omckYb3HVQHGVjzZLWRdQFu6Ow(this.f$0);
                        }
                    });
                    itemOptionsMakeOptions.addIf(!linkCell.invite.permanent && ManageLinksActivity.this.canEdit, R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() {
                        @Override
                        public final void run() {
                            ManageLinksActivity.LinkCell linkCell2 = this.f$0;
                            ManageLinksActivity.this.editLink(linkCell2.invite);
                        }
                    });
                    itemOptionsMakeOptions.addIf(ManageLinksActivity.this.canEdit, R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.RevokeLink), true, new Runnable() {
                        @Override
                        public final void run() {
                            ManageLinksActivity.LinkCell.$r8$lambda$Z9ZqojPSr5Xr5FsNMTYY2kD9z8o(this.f$0);
                        }
                    });
                }
                itemOptionsMakeOptions.setScrimViewBackground(ManageLinksActivity.this.listView.getClipBackground(linkCell));
                itemOptionsMakeOptions.show();
            }
        }

        public static void $r8$lambda$BaCfSZOWSbqwGn_nBQcKNA9PP9c(final LinkCell linkCell) {
            final TLRPC.TL_chatInviteExported tL_chatInviteExported = linkCell.invite;
            new AlertDialog.Builder(ManageLinksActivity.this.getParentActivity()).setTitle(LocaleController.getString(R.string.DeleteLink)).setMessage(LocaleController.getString(R.string.DeleteLinkHelp)).setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    ManageLinksActivity.this.deleteLink(tL_chatInviteExported);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
        }

        public static void $r8$lambda$3OymL_Iul21jXaR8SE5jhRmg7X0(LinkCell linkCell) {
            linkCell.getClass();
            try {
                if (linkCell.invite.link == null) {
                    return;
                }
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", linkCell.invite.link));
                BulletinFactory.createCopyLinkBulletin(ManageLinksActivity.this).show();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public static void m3548$r8$lambda$omckYb3HVQHGVjzZLWRdQFu6Ow(LinkCell linkCell) {
            linkCell.getClass();
            try {
                if (linkCell.invite.link == null) {
                    return;
                }
                ManageLinksActivity manageLinksActivity = ManageLinksActivity.this;
                Context context = linkCell.getContext();
                String str = linkCell.invite.link;
                ArrayList arrayList = null;
                manageLinksActivity.showDialog(new ShareAlert(context, arrayList, str, false, str, false, ManageLinksActivity.this.getResourceProvider()) {
                    @Override
                    protected void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                        String string;
                        if (z) {
                            if (longSparseArray != null && longSparseArray.size() == 1) {
                                long j = ((TLRPC.Dialog) longSparseArray.valueAt(0)).id;
                                if (j == 0 || j == ManageLinksActivity.this.getUserConfig().getClientUserId()) {
                                    string = LocaleController.getString(R.string.InvLinkToSavedMessages);
                                } else {
                                    string = LocaleController.formatString(R.string.InvLinkToUser, ManageLinksActivity.this.getMessagesController().getPeerName(j, true));
                                }
                            } else {
                                string = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i, new Object[0]));
                            }
                            Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(ManageLinksActivity.this).createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(string));
                            bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
                            bulletinCreateSimpleBulletin.show(true);
                        }
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public static void $r8$lambda$Z9ZqojPSr5Xr5FsNMTYY2kD9z8o(final LinkCell linkCell) {
            final TLRPC.TL_chatInviteExported tL_chatInviteExported = linkCell.invite;
            new AlertDialog.Builder(ManageLinksActivity.this.getParentActivity()).setMessage(LocaleController.getString(R.string.RevokeAlert)).setTitle(LocaleController.getString(R.string.RevokeLink)).setPositiveButton(LocaleController.getString(R.string.RevokeButton), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    ManageLinksActivity.this.revokeLink(tL_chatInviteExported);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
            this.paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float f;
            float f2;
            float fMin;
            int color;
            float f3;
            Canvas canvas2 = canvas;
            if (this.invite == null) {
                return;
            }
            int iDp = AndroidUtilities.dp(32.0f);
            int measuredHeight = getMeasuredHeight() / 2;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.invite;
            int i = 3;
            if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked) {
                f = 32.0f;
                i = tL_chatInviteExported.revoked ? 4 : 3;
                f2 = 1.0f;
                fMin = 0.0f;
            } else {
                int i2 = tL_chatInviteExported.expire_date;
                if (i2 > 0 || tL_chatInviteExported.usage_limit > 0) {
                    if (i2 > 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis() + (ManageLinksActivity.this.timeDif * 1000);
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.invite;
                        f = 32.0f;
                        long j = ((long) tL_chatInviteExported2.expire_date) * 1000;
                        int i3 = tL_chatInviteExported2.start_date;
                        if (i3 <= 0) {
                            i3 = tL_chatInviteExported2.date;
                        }
                        long j2 = ((long) i3) * 1000;
                        f2 = 1.0f - ((jCurrentTimeMillis - j2) / (j - j2));
                    } else {
                        f = 32.0f;
                        f2 = 1.0f;
                    }
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = this.invite;
                    int i4 = tL_chatInviteExported3.usage_limit;
                    fMin = Math.min(f2, i4 > 0 ? (i4 - tL_chatInviteExported3.usage) / i4 : 1.0f);
                    if (fMin <= 0.0f) {
                        this.invite.expired = true;
                        AndroidUtilities.updateVisibleRows(ManageLinksActivity.this.listView);
                    } else {
                        i = 1;
                    }
                } else {
                    f2 = 1.0f;
                    fMin = 0.0f;
                    i = 0;
                    f = 32.0f;
                }
            }
            int i5 = this.lastDrawingState;
            if (i != i5 && i5 >= 0) {
                this.animateFromState = i5;
                this.animateToStateProgress = 0.0f;
                if (hasProgress(i5) && !hasProgress(i)) {
                    this.animateHideExpiring = true;
                } else {
                    this.animateHideExpiring = false;
                }
            }
            this.lastDrawingState = i;
            float f4 = this.animateToStateProgress;
            if (f4 != 1.0f) {
                float f5 = f4 + 0.064f;
                this.animateToStateProgress = f5;
                if (f5 >= 1.0f) {
                    this.animateToStateProgress = 1.0f;
                    this.animateHideExpiring = false;
                } else {
                    invalidate();
                }
            }
            if (this.animateToStateProgress != 1.0f) {
                color = ColorUtils.blendARGB(getColor(this.animateFromState, fMin), getColor(i, fMin), this.animateToStateProgress);
            } else {
                color = getColor(i, fMin);
            }
            this.paint.setColor(color);
            canvas2.drawCircle(iDp, measuredHeight, AndroidUtilities.dp(f) / 2.0f, this.paint);
            boolean z = this.animateHideExpiring;
            if (z) {
                if (z) {
                    f2 = this.lastDrawExpringProgress;
                }
                f3 = f2;
                this.paint2.setColor(color);
                this.rectF.set(iDp - AndroidUtilities.dp(20.0f), measuredHeight - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) + iDp, AndroidUtilities.dp(20.0f) + measuredHeight);
                if (this.animateToStateProgress == 1.0f) {
                    float f6 = (-f3) * 360.0f;
                    canvas.drawArc(this.rectF, -90.0f, f6, false, this.paint2);
                    this.timerParticles.draw(canvas, this.paint2, this.rectF, f6, 1.0f);
                    canvas2 = canvas;
                } else {
                    float f7 = (-f3) * 360.0f;
                    canvas.drawArc(this.rectF, -90.0f, f7, false, this.paint2);
                    this.timerParticles.draw(canvas, this.paint2, this.rectF, f7, 1.0f);
                    canvas2 = canvas;
                }
                if (!((BaseFragment) ManageLinksActivity.this).isPaused) {
                    invalidate();
                }
                this.lastDrawExpringProgress = f3;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported4 = this.invite;
                if (!tL_chatInviteExported4.expired && tL_chatInviteExported4.expire_date > 0 && !tL_chatInviteExported4.revoked) {
                    if (z) {
                        f2 = this.lastDrawExpringProgress;
                    }
                    f3 = f2;
                    this.paint2.setColor(color);
                    this.rectF.set(iDp - AndroidUtilities.dp(20.0f), measuredHeight - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) + iDp, AndroidUtilities.dp(20.0f) + measuredHeight);
                    if (this.animateToStateProgress == 1.0f && (!hasProgress(this.animateFromState) || this.animateHideExpiring)) {
                        canvas2.save();
                        float f8 = this.animateHideExpiring ? 1.0f - this.animateToStateProgress : this.animateToStateProgress;
                        float f9 = (float) (((double) (0.3f * f8)) + 0.7d);
                        canvas2.scale(f9, f9, this.rectF.centerX(), this.rectF.centerY());
                        float f10 = (-f3) * 360.0f;
                        canvas2.drawArc(this.rectF, -90.0f, f10, false, this.paint2);
                        this.timerParticles.draw(canvas, this.paint2, this.rectF, f10, f8);
                        canvas.restore();
                        canvas2 = canvas;
                    } else {
                        float f11 = (-f3) * 360.0f;
                        canvas.drawArc(this.rectF, -90.0f, f11, false, this.paint2);
                        this.timerParticles.draw(canvas, this.paint2, this.rectF, f11, 1.0f);
                        canvas2 = canvas;
                    }
                    if (!((BaseFragment) ManageLinksActivity.this).isPaused) {
                        invalidate();
                    }
                    this.lastDrawExpringProgress = f3;
                }
            }
            TLRPC.TL_chatInviteExported tL_chatInviteExported5 = this.invite;
            if (tL_chatInviteExported5.subscription_pricing != null) {
                ManageLinksActivity.this.linkIconRevenue.setBounds(iDp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), iDp + AndroidUtilities.dp(12.0f), measuredHeight + AndroidUtilities.dp(12.0f));
                ManageLinksActivity.this.linkIconRevenue.draw(canvas2);
            } else if (tL_chatInviteExported5.revoked) {
                ManageLinksActivity.this.linkIconRevoked.setBounds(iDp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), iDp + AndroidUtilities.dp(12.0f), measuredHeight + AndroidUtilities.dp(12.0f));
                ManageLinksActivity.this.linkIconRevoked.draw(canvas2);
            } else {
                ManageLinksActivity.this.linkIcon.setBounds(iDp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), iDp + AndroidUtilities.dp(12.0f), measuredHeight + AndroidUtilities.dp(12.0f));
                ManageLinksActivity.this.linkIcon.draw(canvas2);
            }
            if (this.drawDivider) {
                canvas2.drawLine(AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() + AndroidUtilities.dp(23.0f), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        private int getColor(int i, float f) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.invite;
            if (tL_chatInviteExported != null && tL_chatInviteExported.subscription_pricing != null) {
                return Theme.getColor(Theme.key_color_green);
            }
            if (i == 3) {
                return Theme.getColor(Theme.key_chat_attachAudioBackground);
            }
            if (i == 1) {
                if (f > 0.5f) {
                    return ColorUtils.blendARGB(Theme.getColor(Theme.key_chat_attachLocationBackground), Theme.getColor(Theme.key_chat_attachPollBackground), 1.0f - ((f - 0.5f) / 0.5f));
                }
                return ColorUtils.blendARGB(Theme.getColor(Theme.key_chat_attachPollBackground), Theme.getColor(Theme.key_chat_attachAudioBackground), 1.0f - (f / 0.5f));
            }
            if (i == 2) {
                return Theme.getColor(Theme.key_chat_attachPollBackground);
            }
            if (i == 4) {
                return Theme.getColor(Theme.key_chats_unreadCounterMuted);
            }
            return Theme.getColor(Theme.key_featuredStickers_addButton);
        }

        public void setLink(TLRPC.TL_chatInviteExported tL_chatInviteExported, int i) {
            String pluralString;
            int i2;
            this.timerRunning = false;
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.invite;
            if (tL_chatInviteExported2 == null || tL_chatInviteExported == null || !tL_chatInviteExported2.link.equals(tL_chatInviteExported.link)) {
                this.lastDrawingState = -1;
                this.animateToStateProgress = 1.0f;
            }
            this.invite = tL_chatInviteExported;
            this.position = i;
            if (tL_chatInviteExported == null) {
                return;
            }
            int iDp = AndroidUtilities.dp(30.0f);
            if (tL_chatInviteExported.subscription_pricing != null) {
                this.priceLayout.setVisibility(0);
                this.optionsView.setVisibility(8);
                this.priceTitleView.setText(StarsIntroActivity.replaceStarsWithPlain("⭐️ " + LocaleController.formatNumber(tL_chatInviteExported.subscription_pricing.amount, ','), 0.75f));
                int i3 = tL_chatInviteExported.subscription_pricing.period;
                if (i3 == 2592000) {
                    this.priceSubitleView.setText(LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth));
                } else if (i3 == 300) {
                    this.priceSubitleView.setText("per 5 minutes");
                } else if (i3 == 60) {
                    this.priceSubitleView.setText("each minute");
                }
                iDp = AndroidUtilities.dp(28.0f) + ((int) Math.max(HintView2.measureCorrectly(this.priceTitleView.getText(), this.priceTitleView.getPaint()), HintView2.measureCorrectly(this.priceSubitleView.getText(), this.priceSubitleView.getPaint())));
            } else {
                this.priceLayout.setVisibility(8);
                this.optionsView.setVisibility(8);
            }
            ((ViewGroup.MarginLayoutParams) this.textLayout.getLayoutParams()).rightMargin = iDp;
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                Emoji.replaceEmoji(spannableStringBuilder, this.titleView.getPaint().getFontMetricsInt(), false);
                this.titleView.setText(spannableStringBuilder);
            } else if (tL_chatInviteExported.link.startsWith("https://t.me/+")) {
                this.titleView.setText(MessagesController.getInstance(((BaseFragment) ManageLinksActivity.this).currentAccount).linkPrefix + "/" + tL_chatInviteExported.link.substring(14));
            } else if (tL_chatInviteExported.link.startsWith("https://t.me/joinchat/")) {
                this.titleView.setText(tL_chatInviteExported.link.substring(22));
            } else if (tL_chatInviteExported.link.startsWith("https://")) {
                this.titleView.setText(tL_chatInviteExported.link.substring(8));
            } else {
                this.titleView.setText(tL_chatInviteExported.link);
            }
            int i4 = tL_chatInviteExported.usage;
            if (i4 == 0 && tL_chatInviteExported.usage_limit == 0 && tL_chatInviteExported.requested == 0) {
                pluralString = LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined);
            } else {
                int i5 = tL_chatInviteExported.usage_limit;
                if (i5 > 0 && i4 == 0 && !tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
                    pluralString = LocaleController.formatPluralString("CanJoin", i5, new Object[0]);
                } else if (i5 > 0 && tL_chatInviteExported.expired && tL_chatInviteExported.revoked) {
                    pluralString = LocaleController.formatPluralString("PeopleJoined", tL_chatInviteExported.usage, new Object[0]) + ", " + LocaleController.formatPluralString("PeopleJoinedRemaining", tL_chatInviteExported.usage_limit - tL_chatInviteExported.usage, new Object[0]);
                } else {
                    if (i4 <= 0) {
                        pluralString = "";
                    } else {
                        pluralString = LocaleController.formatPluralString("PeopleJoined", i4, new Object[0]);
                    }
                    if (tL_chatInviteExported.requested > 0) {
                        if (tL_chatInviteExported.usage > 0) {
                            pluralString = pluralString + ", ";
                        }
                        pluralString = pluralString + LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]);
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
            if (tL_chatInviteExported.permanent && !tL_chatInviteExported.revoked) {
                DotDividerSpan dotDividerSpan = new DotDividerSpan();
                dotDividerSpan.setTopPadding(AndroidUtilities.dp(1.5f));
                spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(dotDividerSpan, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Permanent));
            } else if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked) {
                if (tL_chatInviteExported.revoked && tL_chatInviteExported.usage == 0) {
                    String string = LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined);
                    spannableStringBuilder2.clear();
                    spannableStringBuilder2.append((CharSequence) string);
                }
                DotDividerSpan dotDividerSpan2 = new DotDividerSpan();
                dotDividerSpan2.setTopPadding(AndroidUtilities.dp(1.5f));
                spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(dotDividerSpan2, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                boolean z = tL_chatInviteExported.revoked;
                if (z || (i2 = tL_chatInviteExported.usage_limit) <= 0 || tL_chatInviteExported.usage < i2) {
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(z ? R.string.Revoked : R.string.Expired));
                } else {
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkLimitReached));
                }
            } else if (tL_chatInviteExported.expire_date > 0) {
                DotDividerSpan dotDividerSpan3 = new DotDividerSpan();
                dotDividerSpan3.setTopPadding(AndroidUtilities.dp(1.5f));
                spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(dotDividerSpan3, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                long jCurrentTimeMillis = (((long) tL_chatInviteExported.expire_date) * 1000) - (System.currentTimeMillis() + (ManageLinksActivity.this.timeDif * 1000));
                if (jCurrentTimeMillis < 0) {
                    jCurrentTimeMillis = 0;
                }
                if (jCurrentTimeMillis > 86400000) {
                    spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("DaysLeft", (int) (jCurrentTimeMillis / 86400000), new Object[0]));
                } else {
                    long j = jCurrentTimeMillis / 1000;
                    int i6 = (int) (j % 60);
                    long j2 = j / 60;
                    Locale locale = Locale.ENGLISH;
                    spannableStringBuilder2.append((CharSequence) String.format(locale, "%02d", Integer.valueOf((int) (j2 / 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf((int) (j2 % 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i6)));
                    this.timerRunning = true;
                }
            }
            if (tL_chatInviteExported.request_needed) {
                DotDividerSpan dotDividerSpan4 = new DotDividerSpan();
                dotDividerSpan4.setTopPadding(AndroidUtilities.dp(1.5f));
                spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(dotDividerSpan4, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ApprovalRequired));
            }
            this.subtitleView.setText(spannableStringBuilder2);
        }
    }

    public void deleteLink(final TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.currentChatId);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ManageLinksActivity.$r8$lambda$HJ5jTr3BQdrdOcCiRkw2_ZnvisI(this.f$0, tL_chatInviteExported, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$HJ5jTr3BQdrdOcCiRkw2_ZnvisI(final ManageLinksActivity manageLinksActivity, final TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject, final TLRPC.TL_error tL_error) {
        manageLinksActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ManageLinksActivity.m3543$r8$lambda$NKxAn10bSAV8tLt_UvRing0lM(this.f$0, tL_error, tL_chatInviteExported);
            }
        });
    }

    public static void m3543$r8$lambda$NKxAn10bSAV8tLt_UvRing0lM(ManageLinksActivity manageLinksActivity, TLRPC.TL_error tL_error, TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        if (tL_error == null) {
            manageLinksActivity.linkEditActivityCallback.onLinkRemoved(tL_chatInviteExported);
        } else {
            manageLinksActivity.getClass();
        }
    }

    public void editLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        LinkEditActivity linkEditActivity = new LinkEditActivity(1, this.currentChatId);
        linkEditActivity.setCallback(this.linkEditActivityCallback);
        linkEditActivity.setInviteToEdit(tL_chatInviteExported);
        presentFragment(linkEditActivity);
    }

    public void revokeLink(final TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.currentChatId);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ManageLinksActivity.$r8$lambda$6wfeIcWhejYyuhD7MINnjYXKdio(this.f$0, tL_chatInviteExported, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$6wfeIcWhejYyuhD7MINnjYXKdio(final ManageLinksActivity manageLinksActivity, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        manageLinksActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ManageLinksActivity.$r8$lambda$_kve52HRP0y5KWZ3AMBEwc_AvA8(this.f$0, tL_error, tLObject, tL_chatInviteExported);
            }
        });
    }

    public static void $r8$lambda$_kve52HRP0y5KWZ3AMBEwc_AvA8(ManageLinksActivity manageLinksActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        manageLinksActivity.getClass();
        if (tL_error == null) {
            if (tLObject instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject;
                if (!manageLinksActivity.isPublic) {
                    manageLinksActivity.invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                }
                tL_chatInviteExported.revoked = true;
                DiffCallback diffCallbackSaveListState = manageLinksActivity.saveListState();
                if (manageLinksActivity.isPublic && manageLinksActivity.adminId == manageLinksActivity.getAccountInstance().getUserConfig().getClientUserId()) {
                    manageLinksActivity.invites.remove(tL_chatInviteExported);
                    manageLinksActivity.invites.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                } else if (manageLinksActivity.invite != null) {
                    manageLinksActivity.invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                }
                manageLinksActivity.revokedInvites.add(0, tL_chatInviteExported);
                manageLinksActivity.updateRecyclerViewAnimated(diffCallbackSaveListState);
            } else {
                manageLinksActivity.linkEditActivityCallback.onLinkEdited(tL_chatInviteExported, tLObject);
                TLRPC.ChatFull chatFull = manageLinksActivity.info;
                if (chatFull != null) {
                    int i = chatFull.invitesCount - 1;
                    chatFull.invitesCount = i;
                    if (i < 0) {
                        chatFull.invitesCount = 0;
                    }
                    manageLinksActivity.getMessagesStorage().saveChatLinksCount(manageLinksActivity.currentChatId, manageLinksActivity.info.invitesCount);
                }
            }
            if (manageLinksActivity.getParentActivity() != null) {
                BulletinFactory.of(manageLinksActivity).createSimpleBulletin(R.raw.linkbroken, LocaleController.getString(R.string.InviteRevokedHint)).show();
            }
        }
    }

    class AnonymousClass6 implements LinkEditActivity.Callback {
        AnonymousClass6() {
        }

        @Override
        public void onLinkCreated(final TLObject tLObject) {
            if (tLObject instanceof TLRPC.TL_chatInviteExported) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ManageLinksActivity.AnonymousClass6.m3546$r8$lambda$entEJz7UsRyLGVIbajEG_nf4(this.f$0, tLObject);
                    }
                }, 200L);
            }
        }

        public static void m3546$r8$lambda$entEJz7UsRyLGVIbajEG_nf4(AnonymousClass6 anonymousClass6, TLObject tLObject) {
            DiffCallback diffCallbackSaveListState = ManageLinksActivity.this.saveListState();
            ManageLinksActivity.this.invites.add(0, (TLRPC.TL_chatInviteExported) tLObject);
            if (ManageLinksActivity.this.info != null) {
                ManageLinksActivity.this.info.invitesCount++;
                ManageLinksActivity.this.getMessagesStorage().saveChatLinksCount(ManageLinksActivity.this.currentChatId, ManageLinksActivity.this.info.invitesCount);
            }
            ManageLinksActivity.this.updateRecyclerViewAnimated(diffCallbackSaveListState);
        }

        @Override
        public void onLinkEdited(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
            if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
                ManageLinksActivity.this.fixDate(tL_chatInviteExported2);
                for (int i = 0; i < ManageLinksActivity.this.invites.size(); i++) {
                    if (((TLRPC.TL_chatInviteExported) ManageLinksActivity.this.invites.get(i)).link.equals(tL_chatInviteExported.link)) {
                        if (tL_chatInviteExported2.revoked) {
                            DiffCallback diffCallbackSaveListState = ManageLinksActivity.this.saveListState();
                            ManageLinksActivity.this.invites.remove(i);
                            ManageLinksActivity.this.revokedInvites.add(0, tL_chatInviteExported2);
                            ManageLinksActivity.this.updateRecyclerViewAnimated(diffCallbackSaveListState);
                            return;
                        }
                        ManageLinksActivity.this.invites.set(i, tL_chatInviteExported2);
                        ManageLinksActivity.this.updateRows(true);
                        return;
                    }
                }
            }
        }

        @Override
        public void onLinkRemoved(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
            for (int i = 0; i < ManageLinksActivity.this.revokedInvites.size(); i++) {
                if (((TLRPC.TL_chatInviteExported) ManageLinksActivity.this.revokedInvites.get(i)).link.equals(tL_chatInviteExported.link)) {
                    DiffCallback diffCallbackSaveListState = ManageLinksActivity.this.saveListState();
                    ManageLinksActivity.this.revokedInvites.remove(i);
                    ManageLinksActivity.this.updateRecyclerViewAnimated(diffCallbackSaveListState);
                    return;
                }
            }
        }

        @Override
        public void revokeLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
            ManageLinksActivity.this.revokeLink(tL_chatInviteExported);
        }
    }

    public void updateRecyclerViewAnimated(DiffCallback diffCallback) {
        if (this.isPaused || this.listViewAdapter == null || this.listView == null) {
            updateRows(true);
            return;
        }
        updateRows(false);
        diffCallback.fillPositions(diffCallback.newPositionToItem);
        DiffUtil.calculateDiff(diffCallback).dispatchUpdatesTo(this.listViewAdapter);
        AndroidUtilities.updateVisibleRows(this.listView);
    }

    class DiffCallback extends DiffUtil.Callback {
        SparseIntArray newPositionToItem;
        int oldAdminsEndRow;
        int oldAdminsStartRow;
        ArrayList oldLinks;
        int oldLinksEndRow;
        int oldLinksStartRow;
        SparseIntArray oldPositionToItem;
        ArrayList oldRevokedLinks;
        int oldRevokedLinksEndRow;
        int oldRevokedLinksStartRow;
        int oldRowCount;

        private DiffCallback() {
            this.oldPositionToItem = new SparseIntArray();
            this.newPositionToItem = new SparseIntArray();
            this.oldLinks = new ArrayList();
            this.oldRevokedLinks = new ArrayList();
        }

        @Override
        public int getOldListSize() {
            return this.oldRowCount;
        }

        @Override
        public int getNewListSize() {
            return ManageLinksActivity.this.rowCount;
        }

        @Override
        public boolean areItemsTheSame(int i, int i2) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported;
            if (((i >= this.oldLinksStartRow && i < this.oldLinksEndRow) || (i >= this.oldRevokedLinksStartRow && i < this.oldRevokedLinksEndRow)) && ((i2 >= ManageLinksActivity.this.linksStartRow && i2 < ManageLinksActivity.this.linksEndRow) || (i2 >= ManageLinksActivity.this.revokedLinksStartRow && i2 < ManageLinksActivity.this.revokedLinksEndRow))) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (i2 < ManageLinksActivity.this.linksStartRow || i2 >= ManageLinksActivity.this.linksEndRow) ? (TLRPC.TL_chatInviteExported) ManageLinksActivity.this.revokedInvites.get(i2 - ManageLinksActivity.this.revokedLinksStartRow) : (TLRPC.TL_chatInviteExported) ManageLinksActivity.this.invites.get(i2 - ManageLinksActivity.this.linksStartRow);
                int i3 = this.oldLinksStartRow;
                if (i >= i3 && i < this.oldLinksEndRow) {
                    tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.oldLinks.get(i - i3);
                } else {
                    tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.oldRevokedLinks.get(i - this.oldRevokedLinksStartRow);
                }
                return tL_chatInviteExported.link.equals(tL_chatInviteExported2.link);
            }
            if (i >= this.oldAdminsStartRow && i < this.oldAdminsEndRow && i2 >= ManageLinksActivity.this.adminsStartRow && i2 < ManageLinksActivity.this.adminsEndRow) {
                return i - this.oldAdminsStartRow == i2 - ManageLinksActivity.this.adminsStartRow;
            }
            int i4 = this.oldPositionToItem.get(i, -1);
            return i4 >= 0 && i4 == this.newPositionToItem.get(i2, -1);
        }

        @Override
        public boolean areContentsTheSame(int i, int i2) {
            return areItemsTheSame(i, i2);
        }

        public void fillPositions(SparseIntArray sparseIntArray) {
            sparseIntArray.clear();
            put(1, ManageLinksActivity.this.helpRow, sparseIntArray);
            put(2, ManageLinksActivity.this.permanentLinkHeaderRow, sparseIntArray);
            put(3, ManageLinksActivity.this.permanentLinkRow, sparseIntArray);
            put(4, ManageLinksActivity.this.dividerRow, sparseIntArray);
            put(5, ManageLinksActivity.this.createNewLinkRow, sparseIntArray);
            put(6, ManageLinksActivity.this.revokedHeader, sparseIntArray);
            put(7, ManageLinksActivity.this.revokeAllRow, sparseIntArray);
            put(8, ManageLinksActivity.this.createLinkHelpRow, sparseIntArray);
            put(9, ManageLinksActivity.this.creatorRow, sparseIntArray);
            put(10, ManageLinksActivity.this.creatorDividerRow, sparseIntArray);
            put(11, ManageLinksActivity.this.adminsHeaderRow, sparseIntArray);
            put(12, ManageLinksActivity.this.linksHeaderRow, sparseIntArray);
            put(13, ManageLinksActivity.this.linksLoadingRow, sparseIntArray);
        }

        private void put(int i, int i2, SparseIntArray sparseIntArray) {
            if (i2 >= 0) {
                sparseIntArray.put(i2, i);
            }
        }
    }

    public DiffCallback saveListState() {
        DiffCallback diffCallback = new DiffCallback();
        diffCallback.fillPositions(diffCallback.oldPositionToItem);
        diffCallback.oldLinksStartRow = this.linksStartRow;
        diffCallback.oldLinksEndRow = this.linksEndRow;
        diffCallback.oldRevokedLinksStartRow = this.revokedLinksStartRow;
        diffCallback.oldRevokedLinksEndRow = this.revokedLinksEndRow;
        diffCallback.oldAdminsStartRow = this.adminsStartRow;
        diffCallback.oldAdminsEndRow = this.adminsEndRow;
        diffCallback.oldRowCount = this.rowCount;
        diffCallback.oldLinks.clear();
        diffCallback.oldLinks.addAll(this.invites);
        diffCallback.oldRevokedLinks.clear();
        diffCallback.oldRevokedLinks.addAll(this.revokedInvites);
        return diffCallback;
    }

    public void fixDate(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        if (tL_chatInviteExported.expire_date > 0) {
            tL_chatInviteExported.expired = getConnectionsManager().getCurrentTime() >= tL_chatInviteExported.expire_date;
            return;
        }
        int i = tL_chatInviteExported.usage_limit;
        if (i > 0) {
            tL_chatInviteExported.expired = tL_chatInviteExported.usage >= i;
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ManageLinksActivity.$r8$lambda$iG9ohnIqUwC8PVMDS_CIDTci0SE(this.f$0);
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class, CreationTextCell.class, LinkActionView.class, LinkCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND | ThemeDescription.FLAG_CHECKTAG, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND | ThemeDescription.FLAG_CHECKTAG, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        int i3 = Theme.key_windowBackgroundWhiteGrayText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HintInnerCell.class}, new String[]{"messageTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_message));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_unreadCounterMuted));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CreationTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueText2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{CreationTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CreationTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_checkboxCheck));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LinkCell.class}, new String[]{"titleView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LinkCell.class}, new String[]{"subtitleView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{LinkCell.class}, new String[]{"optionsView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_stickers_menu));
        return arrayList;
    }

    public static void $r8$lambda$iG9ohnIqUwC8PVMDS_CIDTci0SE(ManageLinksActivity manageLinksActivity) {
        RecyclerListView recyclerListView = manageLinksActivity.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = manageLinksActivity.listView.getChildAt(i);
                if (childAt instanceof ManageChatUserCell) {
                    ((ManageChatUserCell) childAt).update(0);
                }
                if (childAt instanceof LinkActionView) {
                    ((LinkActionView) childAt).updateColors();
                }
            }
        }
        InviteLinkBottomSheet inviteLinkBottomSheet = manageLinksActivity.inviteLinkBottomSheet;
        if (inviteLinkBottomSheet != null) {
            inviteLinkBottomSheet.updateColors();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        InviteLinkBottomSheet inviteLinkBottomSheet;
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            this.isOpened = true;
            if (z2 && (inviteLinkBottomSheet = this.inviteLinkBottomSheet) != null && inviteLinkBottomSheet.isNeedReopen) {
                inviteLinkBottomSheet.show();
            }
        }
        this.notificationsLocker.unlock();
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        this.notificationsLocker.lock();
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        super.onFragmentDestroy();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.currentChatId)) {
            INavigationLayout iNavigationLayout = this.parentLayout;
            if (iNavigationLayout != null && iNavigationLayout.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }
}
