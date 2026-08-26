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
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzhp;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
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
    private ArrayList<TLRPC.TL_chatAdminWithInvites> admins;
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
    private ArrayList<TLRPC.TL_chatInviteExported> invites;
    private int invitesCount;
    private boolean isChannel;
    private boolean isOpened;
    private boolean isPublic;
    private int lastDivider;
    private final LinkEditActivity.Callback linkEditActivityCallback;
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
    boolean loadRevoked;
    AnimationNotificationsLocker notificationsLocker;
    private int permanentLinkHeaderRow;
    private int permanentLinkRow;
    private RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
    private int revokeAllDivider;
    private int revokeAllRow;
    private int revokedDivider;
    private int revokedHeader;
    private ArrayList<TLRPC.TL_chatInviteExported> revokedInvites;
    private int revokedLinksEndRow;
    private int revokedLinksStartRow;
    private int rowCount;
    long timeDif;
    private boolean transitionFinished;
    Runnable updateTimerRunnable;
    private HashMap<Long, TLRPC.User> users;

    public class AnonymousClass6 implements LinkEditActivity.Callback {
        public AnonymousClass6() {
        }

        public void lambda$onLinkCreated$0(TLObject tLObject) {
            DiffCallback diffCallbackSaveListState = ManageLinksActivity.this.saveListState();
            ManageLinksActivity.this.invites.add(0, (TLRPC.TL_chatInviteExported) tLObject);
            if (ManageLinksActivity.this.info != null) {
                ManageLinksActivity.this.info.invitesCount++;
                ManageLinksActivity.this.getMessagesStorage().saveChatLinksCount(ManageLinksActivity.this.currentChatId, ManageLinksActivity.this.info.invitesCount);
            }
            ManageLinksActivity.this.updateRecyclerViewAnimated(diffCallbackSaveListState);
        }

        @Override
        public void onLinkCreated(TLObject tLObject) {
            if (tLObject instanceof TLRPC.TL_chatInviteExported) {
                AndroidUtilities.runOnUIThread(new PhotoViewer$44$$ExternalSyntheticLambda0(25, this, (TLRPC.TL_chatInviteExported) tLObject), 200L);
            }
        }

        @Override
        public void onLinkEdited(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
            if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
                ManageLinksActivity.this.fixDate(tL_chatInviteExported2);
                for (int i = 0; i < ManageLinksActivity.this.invites.size(); i++) {
                    if (((TLRPC.TL_chatInviteExported) ManageLinksActivity.this.invites.get(i)).link.equals(tL_chatInviteExported.link)) {
                        if (!tL_chatInviteExported2.revoked) {
                            ManageLinksActivity.this.invites.set(i, tL_chatInviteExported2);
                            ManageLinksActivity.this.updateRows(true);
                            return;
                        } else {
                            DiffCallback diffCallbackSaveListState = ManageLinksActivity.this.saveListState();
                            ManageLinksActivity.this.invites.remove(i);
                            ManageLinksActivity.this.revokedInvites.add(0, tL_chatInviteExported2);
                            ManageLinksActivity.this.updateRecyclerViewAnimated(diffCallbackSaveListState);
                            return;
                        }
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

    public class DiffCallback extends DiffUtil.Callback {
        SparseIntArray newPositionToItem;
        int oldAdminsEndRow;
        int oldAdminsStartRow;
        ArrayList<TLRPC.TL_chatInviteExported> oldLinks;
        int oldLinksEndRow;
        int oldLinksStartRow;
        SparseIntArray oldPositionToItem;
        ArrayList<TLRPC.TL_chatInviteExported> oldRevokedLinks;
        int oldRevokedLinksEndRow;
        int oldRevokedLinksStartRow;
        int oldRowCount;

        private DiffCallback() {
            this.oldPositionToItem = new SparseIntArray();
            this.newPositionToItem = new SparseIntArray();
            this.oldLinks = new ArrayList<>();
            this.oldRevokedLinks = new ArrayList<>();
        }

        private void put(int i, int i2, SparseIntArray sparseIntArray) {
            if (i2 >= 0) {
                sparseIntArray.put(i2, i);
            }
        }

        @Override
        public boolean areContentsTheSame(int i, int i2) {
            return areItemsTheSame(i, i2);
        }

        @Override
        public boolean areItemsTheSame(int i, int i2) {
            if (((i >= this.oldLinksStartRow && i < this.oldLinksEndRow) || (i >= this.oldRevokedLinksStartRow && i < this.oldRevokedLinksEndRow)) && ((i2 >= ManageLinksActivity.this.linksStartRow && i2 < ManageLinksActivity.this.linksEndRow) || (i2 >= ManageLinksActivity.this.revokedLinksStartRow && i2 < ManageLinksActivity.this.revokedLinksEndRow))) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (i2 < ManageLinksActivity.this.linksStartRow || i2 >= ManageLinksActivity.this.linksEndRow) ? (TLRPC.TL_chatInviteExported) ManageLinksActivity.this.revokedInvites.get(i2 - ManageLinksActivity.this.revokedLinksStartRow) : (TLRPC.TL_chatInviteExported) ManageLinksActivity.this.invites.get(i2 - ManageLinksActivity.this.linksStartRow);
                int i3 = this.oldLinksStartRow;
                return ((i < i3 || i >= this.oldLinksEndRow) ? this.oldRevokedLinks.get(i - this.oldRevokedLinksStartRow) : this.oldLinks.get(i - i3)).link.equals(tL_chatInviteExported.link);
            }
            if (i >= this.oldAdminsStartRow && i < this.oldAdminsEndRow && i2 >= ManageLinksActivity.this.adminsStartRow && i2 < ManageLinksActivity.this.adminsEndRow) {
                return i - this.oldAdminsStartRow == i2 - ManageLinksActivity.this.adminsStartRow;
            }
            int i4 = this.oldPositionToItem.get(i, -1);
            return i4 >= 0 && i4 == this.newPositionToItem.get(i2, -1);
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

        @Override
        public int getNewListSize() {
            return ManageLinksActivity.this.rowCount;
        }

        @Override
        public int getOldListSize() {
            return this.oldRowCount;
        }
    }

    public static class EmptyView extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
        private static final String stickerSetName = "tg_placeholders_android";
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
            if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() < 4) {
                MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName("tg_placeholders_android", false, tL_messages_stickerSet == null);
            } else {
                TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
                this.stickerView.setImage(ImageLocation.getForDocument(document), "104_104", "tgs", DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 1.0f), tL_messages_stickerSet);
            }
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0])) {
                setSticker();
            }
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            setSticker();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
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
            textView.setTextColor(Theme.getColor(null, Theme.key_chats_message, false));
            this.messageTextView.setTextSize(1, 14.0f);
            this.messageTextView.setGravity(17);
            this.messageTextView.setText(LocaleController.getString(ManageLinksActivity.this.isChannel ? R.string.PrimaryLinkHelpChannel : R.string.PrimaryLinkHelp));
            addView(this.messageTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }

    public class LinkCell extends FrameLayout {
        private static final int LINK_STATE_BLUE = 0;
        private static final int LINK_STATE_GRAY = 4;
        private static final int LINK_STATE_GREEN = 1;
        private static final int LINK_STATE_RED = 3;
        private static final int LINK_STATE_YELLOW = 2;
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
            textView.setTextColor(Theme.getColor(null, i, false));
            textView.setLines(1);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setTextSize(1, 13.0f);
            int i2 = Theme.key_windowBackgroundWhiteGrayText;
            textView2.setTextColor(Theme.getColor(null, i2, false));
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 4.33f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.optionsView = imageView;
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            this.optionsView.setScaleType(ImageView.ScaleType.CENTER);
            this.optionsView.setColorFilter(Theme.getColor(null, Theme.key_stickers_menu, false));
            this.optionsView.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 17));
            this.optionsView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 1, -1));
            addView(this.optionsView, LayoutHelper.createFrame(48, 48.0f, 21, 0.0f, 0.0f, 8.0f, 0.0f));
            setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            setWillNotDraw(false);
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.priceLayout = linearLayout2;
            linearLayout2.setOrientation(1);
            TextView textView3 = new TextView(context);
            this.priceTitleView = textView3;
            textView3.setTextSize(1, 16.0f);
            textView3.setTextColor(Theme.getColor(null, i, false));
            textView3.setLines(1);
            textView3.setEllipsize(truncateAt);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(5);
            linearLayout2.addView(textView3, LayoutHelper.createLinear(-1, -2, 5));
            TextView textView4 = new TextView(context);
            this.priceSubitleView = textView4;
            textView4.setTextSize(1, 13.0f);
            textView4.setTextColor(Theme.getColor(null, i2, false));
            textView4.setGravity(5);
            linearLayout2.addView(textView4, LayoutHelper.createLinear(-1, -2, 5, 0, 1, 0, 0));
            addView(linearLayout2, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            linearLayout2.setVisibility(8);
        }

        private int getColor(int i, float f) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.invite;
            if (tL_chatInviteExported != null && tL_chatInviteExported.subscription_pricing != null) {
                return Theme.getColor(null, Theme.key_color_green, false);
            }
            if (i == 3) {
                return Theme.getColor(null, Theme.key_chat_attachAudioBackground, false);
            }
            if (i == 1) {
                if (f > 0.5f) {
                    return ColorUtils.blendARGB(1.0f - ((f - 0.5f) / 0.5f), Theme.getColor(null, Theme.key_chat_attachLocationBackground, false), Theme.getColor(null, Theme.key_chat_attachPollBackground, false));
                }
                return ColorUtils.blendARGB(1.0f - (f / 0.5f), Theme.getColor(null, Theme.key_chat_attachPollBackground, false), Theme.getColor(null, Theme.key_chat_attachAudioBackground, false));
            }
            if (i == 2) {
                return Theme.getColor(null, Theme.key_chat_attachPollBackground, false);
            }
            return i == 4 ? Theme.getColor(null, Theme.key_chats_unreadCounterMuted, false) : Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
        }

        private boolean hasProgress(int i) {
            return i == 2 || i == 1;
        }

        public void lambda$new$0(TLRPC.TL_chatInviteExported tL_chatInviteExported, AlertDialog alertDialog, int i) {
            ManageLinksActivity.this.deleteLink(tL_chatInviteExported);
        }

        public void lambda$new$1() {
            new AlertDialog.Builder(ManageLinksActivity.this.getParentActivity(), 0, null).setTitle(LocaleController.getString(R.string.DeleteLink)).setMessage(LocaleController.getString(R.string.DeleteLinkHelp)).setPositiveButton(LocaleController.getString(R.string.Delete), new ManageLinksActivity$LinkCell$$ExternalSyntheticLambda1(this, this.invite, 1)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
        }

        public void lambda$new$2() {
            try {
                if (this.invite.link == null) {
                    return;
                }
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.invite.link));
                BulletinFactory.createCopyLinkBulletin(ManageLinksActivity.this).show();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public void lambda$new$3() {
            try {
                if (this.invite.link == null) {
                    return;
                }
                ManageLinksActivity manageLinksActivity = ManageLinksActivity.this;
                Context context = getContext();
                String str = this.invite.link;
                ArrayList arrayList = null;
                manageLinksActivity.showDialog(new ShareAlert(context, arrayList, str, false, str, false, ManageLinksActivity.this.getResourceProvider()) {
                    @Override
                    public void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                        String string;
                        if (z) {
                            if (longSparseArray == null || longSparseArray.size() != 1) {
                                string = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i, new Object[0]));
                            } else {
                                long j = ((TLRPC.Dialog) longSparseArray.valueAt(0)).id;
                                string = (j == 0 || j == ManageLinksActivity.this.getUserConfig().getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, ManageLinksActivity.this.getMessagesController().getPeerName(j, true));
                            }
                            Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(ManageLinksActivity.this).createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(string));
                            bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
                            bulletinCreateSimpleBulletin.show(true);
                        }
                    }

                    @Override
                    public void setLastVisible(boolean z) {
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public void lambda$new$4() {
            ManageLinksActivity.this.editLink(this.invite);
        }

        public void lambda$new$5(TLRPC.TL_chatInviteExported tL_chatInviteExported, AlertDialog alertDialog, int i) {
            ManageLinksActivity.this.revokeLink(tL_chatInviteExported);
        }

        public void lambda$new$6() {
            new AlertDialog.Builder(ManageLinksActivity.this.getParentActivity(), 0, null).setMessage(LocaleController.getString(R.string.RevokeAlert)).setTitle(LocaleController.getString(R.string.RevokeLink)).setPositiveButton(LocaleController.getString(R.string.RevokeButton), new ManageLinksActivity$LinkCell$$ExternalSyntheticLambda1(this, this.invite, 0)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
        }

        public void lambda$new$7(View view) {
            if (this.invite == null) {
                return;
            }
            View view2 = ManageLinksActivity.this.fragmentView;
            if (view2 instanceof ViewGroup) {
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions((ViewGroup) view2, this);
                if (this.invite.revoked) {
                    final int i = 0;
                    itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Delete), true, new Runnable(this) {
                        public final ManageLinksActivity.LinkCell f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i) {
                                case 0:
                                    this.f$0.lambda$new$1();
                                    break;
                                case 1:
                                    this.f$0.lambda$new$2();
                                    break;
                                case 2:
                                    this.f$0.lambda$new$3();
                                    break;
                                case 3:
                                    this.f$0.lambda$new$4();
                                    break;
                                default:
                                    this.f$0.lambda$new$6();
                                    break;
                            }
                        }
                    });
                } else {
                    final int i2 = 1;
                    itemOptionsMakeOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) {
                        public final ManageLinksActivity.LinkCell f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    this.f$0.lambda$new$1();
                                    break;
                                case 1:
                                    this.f$0.lambda$new$2();
                                    break;
                                case 2:
                                    this.f$0.lambda$new$3();
                                    break;
                                case 3:
                                    this.f$0.lambda$new$4();
                                    break;
                                default:
                                    this.f$0.lambda$new$6();
                                    break;
                            }
                        }
                    });
                    final int i3 = 2;
                    itemOptionsMakeOptions.add(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable(this) {
                        public final ManageLinksActivity.LinkCell f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    this.f$0.lambda$new$1();
                                    break;
                                case 1:
                                    this.f$0.lambda$new$2();
                                    break;
                                case 2:
                                    this.f$0.lambda$new$3();
                                    break;
                                case 3:
                                    this.f$0.lambda$new$4();
                                    break;
                                default:
                                    this.f$0.lambda$new$6();
                                    break;
                            }
                        }
                    });
                    final int i4 = 3;
                    itemOptionsMakeOptions.addIf(!this.invite.permanent && ManageLinksActivity.this.canEdit, R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable(this) {
                        public final ManageLinksActivity.LinkCell f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    this.f$0.lambda$new$1();
                                    break;
                                case 1:
                                    this.f$0.lambda$new$2();
                                    break;
                                case 2:
                                    this.f$0.lambda$new$3();
                                    break;
                                case 3:
                                    this.f$0.lambda$new$4();
                                    break;
                                default:
                                    this.f$0.lambda$new$6();
                                    break;
                            }
                        }
                    });
                    final int i5 = 4;
                    itemOptionsMakeOptions.addIf(ManageLinksActivity.this.canEdit, R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.RevokeLink), true, new Runnable(this) {
                        public final ManageLinksActivity.LinkCell f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    this.f$0.lambda$new$1();
                                    break;
                                case 1:
                                    this.f$0.lambda$new$2();
                                    break;
                                case 2:
                                    this.f$0.lambda$new$3();
                                    break;
                                case 3:
                                    this.f$0.lambda$new$4();
                                    break;
                                default:
                                    this.f$0.lambda$new$6();
                                    break;
                            }
                        }
                    });
                }
                itemOptionsMakeOptions.setScrimViewBackground(ManageLinksActivity.this.listView.getClipBackground(this));
                itemOptionsMakeOptions.show();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            float f;
            float fMin;
            float f2;
            Canvas canvas2 = canvas;
            if (this.invite == null) {
                return;
            }
            int iDp = AndroidUtilities.dp(32.0f);
            int measuredHeight = getMeasuredHeight() / 2;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.invite;
            int i = 3;
            if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked) {
                i = tL_chatInviteExported.revoked ? 4 : 3;
                f = 1.0f;
                fMin = 0.0f;
            } else {
                int i2 = tL_chatInviteExported.expire_date;
                if (i2 > 0 || tL_chatInviteExported.usage_limit > 0) {
                    if (i2 > 0) {
                        long jCurrentTimeMillis = (ManageLinksActivity.this.timeDif * 1000) + System.currentTimeMillis();
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.invite;
                        long j = ((long) tL_chatInviteExported2.expire_date) * 1000;
                        int i3 = tL_chatInviteExported2.start_date;
                        if (i3 <= 0) {
                            i3 = tL_chatInviteExported2.date;
                        }
                        long j2 = ((long) i3) * 1000;
                        f = 1.0f - ((jCurrentTimeMillis - j2) / (j - j2));
                    } else {
                        f = 1.0f;
                    }
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = this.invite;
                    int i4 = tL_chatInviteExported3.usage_limit;
                    fMin = Math.min(f, i4 > 0 ? (i4 - tL_chatInviteExported3.usage) / i4 : 1.0f);
                    if (fMin <= 0.0f) {
                        this.invite.expired = true;
                        AndroidUtilities.updateVisibleRows(ManageLinksActivity.this.listView);
                    } else {
                        i = 1;
                    }
                } else {
                    f = 1.0f;
                    fMin = 0.0f;
                    i = 0;
                }
            }
            int i5 = this.lastDrawingState;
            if (i != i5 && i5 >= 0) {
                this.animateFromState = i5;
                this.animateToStateProgress = 0.0f;
                if (!hasProgress(i5) || hasProgress(i)) {
                    this.animateHideExpiring = false;
                } else {
                    this.animateHideExpiring = true;
                }
            }
            this.lastDrawingState = i;
            float f3 = this.animateToStateProgress;
            if (f3 != 1.0f) {
                float f4 = f3 + 0.064f;
                this.animateToStateProgress = f4;
                if (f4 >= 1.0f) {
                    this.animateToStateProgress = 1.0f;
                    this.animateHideExpiring = false;
                } else {
                    invalidate();
                }
            }
            int iBlendARGB = this.animateToStateProgress != 1.0f ? ColorUtils.blendARGB(this.animateToStateProgress, getColor(this.animateFromState, fMin), getColor(i, fMin)) : getColor(i, fMin);
            this.paint.setColor(iBlendARGB);
            canvas2.drawCircle(iDp, measuredHeight, AndroidUtilities.dp(32.0f) / 2.0f, this.paint);
            boolean z = this.animateHideExpiring;
            if (z) {
                if (z) {
                    f = this.lastDrawExpringProgress;
                }
                f2 = f;
                this.paint2.setColor(iBlendARGB);
                this.rectF.set(iDp - AndroidUtilities.dp(20.0f), measuredHeight - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) + iDp, AndroidUtilities.dp(20.0f) + measuredHeight);
                if (this.animateToStateProgress != 1.0f) {
                    float f5 = (-f2) * 360.0f;
                    canvas.drawArc(this.rectF, -90.0f, f5, false, this.paint2);
                    this.timerParticles.draw(canvas, this.paint2, this.rectF, f5, 1.0f);
                    canvas2 = canvas;
                } else {
                    float f6 = (-f2) * 360.0f;
                    canvas.drawArc(this.rectF, -90.0f, f6, false, this.paint2);
                    this.timerParticles.draw(canvas, this.paint2, this.rectF, f6, 1.0f);
                    canvas2 = canvas;
                }
                if (!((BaseFragment) ManageLinksActivity.this).isPaused) {
                    invalidate();
                }
                this.lastDrawExpringProgress = f2;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported4 = this.invite;
                if (!tL_chatInviteExported4.expired && tL_chatInviteExported4.expire_date > 0 && !tL_chatInviteExported4.revoked) {
                    if (z) {
                        f = this.lastDrawExpringProgress;
                    }
                    f2 = f;
                    this.paint2.setColor(iBlendARGB);
                    this.rectF.set(iDp - AndroidUtilities.dp(20.0f), measuredHeight - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) + iDp, AndroidUtilities.dp(20.0f) + measuredHeight);
                    if (this.animateToStateProgress != 1.0f || (hasProgress(this.animateFromState) && !this.animateHideExpiring)) {
                        float f7 = (-f2) * 360.0f;
                        canvas.drawArc(this.rectF, -90.0f, f7, false, this.paint2);
                        this.timerParticles.draw(canvas, this.paint2, this.rectF, f7, 1.0f);
                        canvas2 = canvas;
                    } else {
                        canvas2.save();
                        float f8 = this.animateHideExpiring ? 1.0f - this.animateToStateProgress : this.animateToStateProgress;
                        float f9 = (float) (((double) (0.3f * f8)) + 0.7d);
                        canvas2.scale(f9, f9, this.rectF.centerX(), this.rectF.centerY());
                        float f10 = (-f2) * 360.0f;
                        canvas2.drawArc(this.rectF, -90.0f, f10, false, this.paint2);
                        this.timerParticles.draw(canvas, this.paint2, this.rectF, f10, f8);
                        canvas.restore();
                        canvas2 = canvas;
                    }
                    if (!((BaseFragment) ManageLinksActivity.this).isPaused) {
                        invalidate();
                    }
                    this.lastDrawExpringProgress = f2;
                }
            }
            TLRPC.TL_chatInviteExported tL_chatInviteExported5 = this.invite;
            if (tL_chatInviteExported5.subscription_pricing != null) {
                ManageLinksActivity.this.linkIconRevenue.setBounds(iDp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + iDp, AndroidUtilities.dp(12.0f) + measuredHeight);
                ManageLinksActivity.this.linkIconRevenue.draw(canvas2);
            } else if (tL_chatInviteExported5.revoked) {
                ManageLinksActivity.this.linkIconRevoked.setBounds(iDp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + iDp, AndroidUtilities.dp(12.0f) + measuredHeight);
                ManageLinksActivity.this.linkIconRevoked.draw(canvas2);
            } else {
                ManageLinksActivity.this.linkIcon.setBounds(iDp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + iDp, AndroidUtilities.dp(12.0f) + measuredHeight);
                ManageLinksActivity.this.linkIcon.draw(canvas2);
            }
            if (this.drawDivider) {
                canvas2.drawLine(AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, AndroidUtilities.dp(23.0f) + getMeasuredWidth(), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
            this.paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
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
                this.priceTitleView.setText(StarsIntroActivity.replaceStarsWithPlain(false, BillingController$$ExternalSyntheticOutline0.m(tL_chatInviteExported.subscription_pricing.amount, ',', new StringBuilder("⭐️ ")), 0.75f, null));
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
                    pluralString = i4 > 0 ? LocaleController.formatPluralString("PeopleJoined", i4, new Object[0]) : "";
                    if (tL_chatInviteExported.requested > 0) {
                        if (tL_chatInviteExported.usage > 0) {
                            pluralString = zzhp.m(pluralString, ", ");
                        }
                        StringBuilder sbM = DiffUtil.m(pluralString);
                        sbM.append(LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]));
                        pluralString = sbM.toString();
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
                long jCurrentTimeMillis = (((long) tL_chatInviteExported.expire_date) * 1000) - ((ManageLinksActivity.this.timeDif * 1000) + System.currentTimeMillis());
                if (jCurrentTimeMillis < 0) {
                    jCurrentTimeMillis = 0;
                }
                if (jCurrentTimeMillis > 86400000) {
                    spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("DaysLeft", (int) (jCurrentTimeMillis / 86400000), new Object[0]));
                } else {
                    long j = jCurrentTimeMillis / 1000;
                    int i6 = (int) (j % 60);
                    long j2 = j / 60;
                    int i7 = (int) (j2 % 60);
                    int i8 = (int) (j2 / 60);
                    Locale locale = Locale.ENGLISH;
                    spannableStringBuilder2.append((CharSequence) String.format(locale, "%02d", Integer.valueOf(i8))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i7))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i6)));
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

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return ManageLinksActivity.this.rowCount;
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
                if (i == ManageLinksActivity.this.revokedHeader) {
                    headerCell.setText(LocaleController.getString(R.string.RevokedLinks));
                    return;
                } else if (i == ManageLinksActivity.this.linksHeaderRow) {
                    headerCell.setText(LocaleController.getString(R.string.LinksCreatedByThisAdmin));
                    return;
                } else {
                    if (i == ManageLinksActivity.this.adminsHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.LinksCreatedByOtherAdmins));
                        return;
                    }
                    return;
                }
            }
            if (itemViewType == 2) {
                LinkActionView linkActionView = (LinkActionView) viewHolder.itemView;
                linkActionView.setCanEdit(ManageLinksActivity.this.adminId == ManageLinksActivity.this.getAccountInstance().getUserConfig().clientUserId);
                if (ManageLinksActivity.this.isPublic && ManageLinksActivity.this.adminId == ManageLinksActivity.this.getAccountInstance().getUserConfig().clientUserId) {
                    if (ManageLinksActivity.this.info != null) {
                        linkActionView.setLink("https://t.me/" + ChatObject.getPublicUsername(ManageLinksActivity.this.currentChat));
                        linkActionView.setUsers(0, null);
                        linkActionView.hideRevokeOption(true);
                        return;
                    }
                    return;
                }
                linkActionView.hideRevokeOption(!ManageLinksActivity.this.canEdit);
                if (ManageLinksActivity.this.invite == null) {
                    linkActionView.setLink(null);
                    linkActionView.loadUsers(null, ManageLinksActivity.this.currentChatId);
                    return;
                } else {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ManageLinksActivity.this.invite;
                    linkActionView.setLink(tL_chatInviteExported2.link);
                    linkActionView.loadUsers(tL_chatInviteExported2, ManageLinksActivity.this.currentChatId);
                    return;
                }
            }
            if (itemViewType == 3) {
                CreationTextCell creationTextCell = (CreationTextCell) viewHolder.itemView;
                Drawable drawable = this.mContext.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = this.mContext.getResources().getDrawable(R.drawable.poll_add_plus);
                int color = Theme.getColor(null, Theme.key_switchTrackChecked, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_checkboxCheck, false), mode));
                CombinedDrawable combinedDrawable = new CombinedDrawable(drawable, drawable2);
                String string = LocaleController.getString(R.string.CreateNewLink);
                boolean z2 = !ManageLinksActivity.this.invites.isEmpty();
                creationTextCell.textView.setText(string);
                creationTextCell.imageView.setImageDrawable(combinedDrawable);
                creationTextCell.divider = z2;
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
                    if (i != ManageLinksActivity.this.creatorRow) {
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
                    } else {
                        user = ManageLinksActivity.this.getMessagesController().getUser(Long.valueOf(ManageLinksActivity.this.adminId));
                        i2 = ManageLinksActivity.this.invitesCount;
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
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            View manageChatUserCell;
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
                        public final void editLink() {
                            LinkActionView.Delegate.CC.$default$editLink(this);
                        }

                        @Override
                        public final void removeLink() {
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
                    manageChatUserCell = linkActionView;
                    headerCell = manageChatUserCell;
                    break;
                case 3:
                    headerCell = new CreationTextCell(this.mContext, 64, ((BaseFragment) ManageLinksActivity.this).resourceProvider);
                    break;
                case 4:
                    headerCell = new ShadowSectionCell(this.mContext, null, 0);
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
                    headerCell = new ShadowSectionCell(this.mContext, null, 0);
                    break;
                case 8:
                    TextSettingsCell textSettingsCell = new TextSettingsCell(this.mContext, null, 0);
                    textSettingsCell.setText(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                    textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
                    headerCell = textSettingsCell;
                    break;
                case 9:
                    headerCell = new TextInfoPrivacyCell(this.mContext, 24, null);
                    break;
                case 10:
                    manageChatUserCell = new ManageChatUserCell(this.mContext, 8, 6, false, null);
                    headerCell = manageChatUserCell;
                    break;
                case 11:
                    headerCell = new TextInfoPrivacyCell(this.mContext, 24, ((BaseFragment) ManageLinksActivity.this).resourceProvider);
                    break;
                default:
                    HintInnerCell hintInnerCell = ManageLinksActivity.this.new HintInnerCell(this.mContext);
                    hintInnerCell.setTag(-33024);
                    headerCell = hintInnerCell;
                    break;
            }
            return zzkd.m(headerCell, headerCell, -2);
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }
    }

    public ManageLinksActivity(long j, long j2, int i) {
        super(null);
        this.invites = new ArrayList<>();
        this.revokedInvites = new ArrayList<>();
        this.users = new HashMap<>();
        this.admins = new ArrayList<>();
        this.updateTimerRunnable = new Runnable() {
            @Override
            public void run() {
                if (ManageLinksActivity.this.listView == null) {
                    return;
                }
                for (int i2 = 0; i2 < ManageLinksActivity.this.listView.getChildCount(); i2++) {
                    View childAt = ManageLinksActivity.this.listView.getChildAt(i2);
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
        boolean z = false;
        this.loadRevoked = false;
        this.linkEditActivityCallback = new AnonymousClass6();
        this.notificationsLocker = new AnimationNotificationsLocker();
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

    public boolean lambda$createView$10(View view, int i) {
        if ((i < this.linksStartRow || i >= this.linksEndRow) && (i < this.revokedLinksStartRow || i >= this.revokedLinksEndRow)) {
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

    public void lambda$createView$6(TLRPC.TL_error tL_error) {
        this.deletingRevokedLinks = false;
        if (tL_error == null) {
            DiffCallback diffCallbackSaveListState = saveListState();
            this.revokedInvites.clear();
            updateRecyclerViewAnimated(diffCallbackSaveListState);
        }
    }

    public void lambda$createView$7(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda15(12, this, tL_error));
    }

    public void lambda$createView$8(AlertDialog alertDialog, int i) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        tL_messages_deleteRevokedExportedChatInvites.peer = getMessagesController().getInputPeer(-this.currentChatId);
        if (this.adminId == getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = getMessagesController().getInputUser(this.adminId);
        }
        this.deletingRevokedLinks = true;
        getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new ManageLinksActivity$$ExternalSyntheticLambda5(this, 1));
    }

    public void lambda$createView$9(Context context, View view, int i) {
        if (i == this.creatorRow) {
            TLRPC.User user = this.users.get(Long.valueOf(this.invite.admin_id));
            if (user != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                MessagesController.getInstance(UserConfig.selectedAccount).putUser(user, false);
                presentFragment(new ProfileActivity(bundle));
                return;
            }
            return;
        }
        if (i == this.createNewLinkRow) {
            LinkEditActivity linkEditActivity = new LinkEditActivity(0, this.currentChatId);
            linkEditActivity.setCallback(this.linkEditActivityCallback);
            presentFragment(linkEditActivity);
            return;
        }
        int i2 = this.linksStartRow;
        if (i >= i2 && i < this.linksEndRow) {
            InviteLinkBottomSheet inviteLinkBottomSheet = new InviteLinkBottomSheet(context, this.invites.get(i - i2), this.info, this.users, this, this.currentChatId, false, this.isChannel);
            this.inviteLinkBottomSheet = inviteLinkBottomSheet;
            inviteLinkBottomSheet.setCanEdit(this.canEdit);
            this.inviteLinkBottomSheet.show();
            return;
        }
        int i3 = this.revokedLinksStartRow;
        if (i >= i3 && i < this.revokedLinksEndRow) {
            InviteLinkBottomSheet inviteLinkBottomSheet2 = new InviteLinkBottomSheet(context, this.revokedInvites.get(i - i3), this.info, this.users, this, this.currentChatId, false, this.isChannel);
            this.inviteLinkBottomSheet = inviteLinkBottomSheet2;
            inviteLinkBottomSheet2.show();
            return;
        }
        if (i == this.revokeAllRow) {
            if (this.deletingRevokedLinks) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString(R.string.DeleteAllRevokedLinks));
            builder.setMessage(LocaleController.getString(R.string.DeleteAllRevokedLinkHelp));
            builder.setPositiveButton(LocaleController.getString(R.string.Delete), new ManageLinksActivity$$ExternalSyntheticLambda4(this));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(builder.create());
            return;
        }
        int i4 = this.adminsStartRow;
        if (i < i4 || i >= this.adminsEndRow) {
            return;
        }
        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = this.admins.get(i - i4);
        if (this.users.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
            getMessagesController().putUser(this.users.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
        }
        ManageLinksActivity manageLinksActivity = new ManageLinksActivity(this.currentChatId, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
        manageLinksActivity.setInfo(this.info, null);
        presentFragment(manageLinksActivity);
    }

    public void lambda$deleteLink$13(TLRPC.TL_error tL_error, TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        if (tL_error == null) {
            this.linkEditActivityCallback.onLinkRemoved(tL_chatInviteExported);
        }
    }

    public void lambda$deleteLink$14(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda25((Object) this, (Object) tL_error, (Object) tL_chatInviteExported, 14));
    }

    public void lambda$getThemeDescriptions$17() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof ManageChatUserCell) {
                    ((ManageChatUserCell) childAt).update(0);
                }
                if (childAt instanceof LinkActionView) {
                    ((LinkActionView) childAt).updateColors();
                }
            }
        }
        InviteLinkBottomSheet inviteLinkBottomSheet = this.inviteLinkBottomSheet;
        if (inviteLinkBottomSheet != null) {
            inviteLinkBottomSheet.updateColors();
        }
    }

    public void lambda$loadLinks$0(TLRPC.TL_error tL_error, TLObject tLObject) {
        RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
        this.linksLoading = false;
        if (tL_error == null) {
            TLRPC.TL_messages_chatAdminsWithInvites tL_messages_chatAdminsWithInvites = (TLRPC.TL_messages_chatAdminsWithInvites) tLObject;
            for (int i = 0; i < tL_messages_chatAdminsWithInvites.admins.size(); i++) {
                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = tL_messages_chatAdminsWithInvites.admins.get(i);
                if (tL_chatAdminWithInvites.admin_id != getAccountInstance().getUserConfig().clientUserId) {
                    this.admins.add(tL_chatAdminWithInvites);
                }
            }
            for (int i2 = 0; i2 < tL_messages_chatAdminsWithInvites.users.size(); i2++) {
                TLRPC.User user = tL_messages_chatAdminsWithInvites.users.get(i2);
                this.users.put(Long.valueOf(user.id), user);
            }
        }
        int i3 = this.rowCount;
        this.adminsLoaded = true;
        this.hasMore = false;
        if (this.admins.size() > 0 && (recyclerItemsEnterAnimator = this.recyclerItemsEnterAnimator) != null && !this.isPaused && this.isOpened) {
            recyclerItemsEnterAnimator.showItemsAnimated(i3 + 1);
        }
        if (!this.hasMore) {
            resumeDelayedFragmentAnimation();
        } else if (this.admins.size() + this.revokedInvites.size() + this.invites.size() >= 5) {
            resumeDelayedFragmentAnimation();
        }
        if (!this.hasMore && !this.loadRevoked) {
            this.hasMore = true;
            this.loadRevoked = true;
            loadLinks(false);
        }
        updateRows(true);
    }

    public void lambda$loadLinks$1(TLRPC.TL_error tL_error, TLObject tLObject) {
        getNotificationCenter().doOnIdle(new ManageLinksActivity$$ExternalSyntheticLambda3(this, tL_error, tLObject, 0));
    }

    public void lambda$loadLinks$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ManageLinksActivity$$ExternalSyntheticLambda3(this, tL_error, tLObject, 1));
    }

    public void lambda$loadLinks$3(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        boolean z2;
        boolean z3;
        DiffCallback diffCallbackSaveListState = saveListState();
        this.linksLoading = false;
        this.hasMore = false;
        if (tL_chatInviteExported != null) {
            this.invite = tL_chatInviteExported;
            TLRPC.ChatFull chatFull = this.info;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            }
        }
        if (tL_error == null) {
            TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
            if (z) {
                for (int i = 0; i < tL_messages_exportedChatInvites.invites.size(); i++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i);
                    fixDate(tL_chatInviteExported2);
                    this.revokedInvites.add(tL_chatInviteExported2);
                }
            } else {
                if (this.adminId != getAccountInstance().getUserConfig().clientUserId && this.invites.size() == 0 && tL_messages_exportedChatInvites.invites.size() > 0) {
                    this.invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(0);
                    tL_messages_exportedChatInvites.invites.remove(0);
                }
                for (int i2 = 0; i2 < tL_messages_exportedChatInvites.invites.size(); i2++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i2);
                    fixDate(tL_chatInviteExported3);
                    this.invites.add(tL_chatInviteExported3);
                }
            }
            for (int i3 = 0; i3 < tL_messages_exportedChatInvites.users.size(); i3++) {
                this.users.put(Long.valueOf(tL_messages_exportedChatInvites.users.get(i3).id), tL_messages_exportedChatInvites.users.get(i3));
            }
            int i4 = this.rowCount;
            if (tL_messages_exportedChatInvites.invites.size() == 0) {
                this.hasMore = false;
            } else if (z) {
                this.hasMore = this.revokedInvites.size() + 1 < tL_messages_exportedChatInvites.count;
            } else {
                this.hasMore = this.invites.size() + 1 < tL_messages_exportedChatInvites.count;
            }
            if (tL_messages_exportedChatInvites.invites.size() <= 0 || !this.isOpened) {
                z2 = true;
            } else {
                RecyclerItemsEnterAnimator recyclerItemsEnterAnimator = this.recyclerItemsEnterAnimator;
                if (recyclerItemsEnterAnimator != null && !this.isPaused) {
                    recyclerItemsEnterAnimator.showItemsAnimated(i4 + 1);
                }
                z2 = false;
            }
            TLRPC.ChatFull chatFull2 = this.info;
            if (chatFull2 != null && !z) {
                chatFull2.invitesCount = tL_messages_exportedChatInvites.count;
                getMessagesStorage().saveChatLinksCount(this.currentChatId, this.info.invitesCount);
            }
        } else {
            this.hasMore = false;
            z2 = false;
        }
        if (this.hasMore || this.loadRevoked || this.adminId != getAccountInstance().getUserConfig().clientUserId) {
            if (this.hasMore || this.loadRevoked) {
                z3 = false;
            } else {
                this.hasMore = true;
                this.loadRevoked = true;
            }
            if (this.hasMore) {
                resumeDelayedFragmentAnimation();
            } else if (this.admins.size() + this.revokedInvites.size() + this.invites.size() >= 5) {
                resumeDelayedFragmentAnimation();
            }
            if (z3) {
                loadLinks(false);
            }
            if (!z2 && this.listViewAdapter != null && this.listView.getChildCount() > 0) {
                updateRecyclerViewAnimated(diffCallbackSaveListState);
                return;
            }
            updateRows(true);
        }
        this.hasMore = true;
        this.loadAdmins = true;
        z3 = true;
        if (this.hasMore) {
            resumeDelayedFragmentAnimation();
        } else if (this.admins.size() + this.revokedInvites.size() + this.invites.size() >= 5) {
            resumeDelayedFragmentAnimation();
        }
        if (z3) {
            loadLinks(false);
        }
        if (!z2) {
        }
        updateRows(true);
    }

    public void lambda$loadLinks$4(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        getNotificationCenter().doOnIdle(new ManageLinksActivity$$ExternalSyntheticLambda0(this, tL_chatInviteExported, tL_error, tLObject, z, 1));
    }

    public void lambda$loadLinks$5(TLRPC.TL_chatInviteExported tL_chatInviteExported, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported2;
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
        AndroidUtilities.runOnUIThread(new ManageLinksActivity$$ExternalSyntheticLambda0(this, tL_chatInviteExported2, tL_error, tLObject, z, 0));
    }

    public void lambda$revokeLink$15(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        if (tL_error == null) {
            if (tLObject instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject;
                if (!this.isPublic) {
                    this.invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                }
                tL_chatInviteExported.revoked = true;
                DiffCallback diffCallbackSaveListState = saveListState();
                if (this.isPublic && this.adminId == getAccountInstance().getUserConfig().getClientUserId()) {
                    this.invites.remove(tL_chatInviteExported);
                    this.invites.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                } else if (this.invite != null) {
                    this.invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                }
                this.revokedInvites.add(0, tL_chatInviteExported);
                updateRecyclerViewAnimated(diffCallbackSaveListState);
            } else {
                this.linkEditActivityCallback.onLinkEdited(tL_chatInviteExported, tLObject);
                TLRPC.ChatFull chatFull = this.info;
                if (chatFull != null) {
                    int i = chatFull.invitesCount - 1;
                    chatFull.invitesCount = i;
                    if (i < 0) {
                        chatFull.invitesCount = 0;
                    }
                    getMessagesStorage().saveChatLinksCount(this.currentChatId, this.info.invitesCount);
                }
            }
            if (getParentActivity() != null) {
                FactCheckController$$ExternalSyntheticOutline0.m(R.string.InviteRevokedHint, BulletinFactory.of(this), R.raw.linkbroken);
            }
        }
    }

    public void lambda$revokeLink$16(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ManageLinksActivity$$ExternalSyntheticLambda15(this, tL_error, tLObject, tL_chatInviteExported, 0));
    }

    public void lambda$revokePermanent$11(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        if (tL_error == null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
            this.invite = tL_chatInviteExported2;
            TLRPC.ChatFull chatFull = this.info;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported2;
            }
            if (getParentActivity() == null) {
                return;
            }
            tL_chatInviteExported.revoked = true;
            DiffCallback diffCallbackSaveListState = saveListState();
            this.revokedInvites.add(0, tL_chatInviteExported);
            updateRecyclerViewAnimated(diffCallbackSaveListState);
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.InviteRevokedHint, BulletinFactory.of(this), R.raw.linkbroken);
        }
    }

    public void lambda$revokePermanent$12(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ManageLinksActivity$$ExternalSyntheticLambda15(this, tL_error, tLObject, tL_chatInviteExported, 1));
    }

    public void loadLinks(boolean z) {
        if (!this.loadAdmins || this.adminsLoaded) {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.currentChatId);
            if (this.adminId == getUserConfig().getClientUserId()) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(this.adminId);
            }
            boolean z2 = this.loadRevoked;
            if (z2) {
                tL_messages_getExportedChatInvites.revoked = true;
                if (!this.revokedInvites.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) zzin.m(1, this.revokedInvites)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) zzin.m(1, this.revokedInvites)).date;
                }
            } else if (!this.invites.isEmpty()) {
                tL_messages_getExportedChatInvites.flags |= 4;
                tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) zzin.m(1, this.invites)).link;
                tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) zzin.m(1, this.invites)).date;
            }
            this.linksLoading = true;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new LinkManager$1$$ExternalSyntheticLambda2(this, this.isPublic ? null : this.invite, z2, 7)), getClassGuid());
        } else {
            this.linksLoading = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-this.currentChatId);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new ManageLinksActivity$$ExternalSyntheticLambda5(this, 0)), getClassGuid());
        }
        if (z) {
            updateRows(true);
        }
    }

    public void revokePermanent() {
        if (this.adminId != getAccountInstance().getUserConfig().clientUserId) {
            revokeLink(this.invite);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.currentChatId);
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.invite;
        this.invite = null;
        this.info.exported_invite = null;
        int iSendRequest = getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ManageLinksActivity$$ExternalSyntheticLambda2(this, tL_chatInviteExported, 2));
        AndroidUtilities.updateVisibleRows(this.listView);
        getConnectionsManager().bindRequestToGuid(iSendRequest, this.classGuid);
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

    public void updateRecyclerViewAnimated(DiffCallback diffCallback) {
        if (this.isPaused || this.listViewAdapter == null || this.listView == null) {
            updateRows(true);
            return;
        }
        updateRows(false);
        diffCallback.fillPositions(diffCallback.newPositionToItem);
        DiffUtil.calculateDiff(diffCallback, true).dispatchUpdatesTo(new OpReorderer(this.listViewAdapter));
        AndroidUtilities.updateVisibleRows(this.listView);
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
            int size = this.invites.size() + i6;
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
            int size2 = this.admins.size() + i10;
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
            int size3 = this.revokedInvites.size() + i15;
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
    public View createView(Context context) {
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
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(ManageLinksActivity.this.updateTimerRunnable, 500L);
            }

            @Override
            public void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(ManageLinksActivity.this.updateTimerRunnable);
            }
        };
        this.fragmentView = frameLayout;
        int i = Theme.key_windowBackgroundGray;
        frameLayout.setBackgroundColor(Theme.getColor(null, i, false));
        this.fragmentView.setTag(Integer.valueOf(i));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false) {
            {
                super(i, z);
            }

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
        this.listView.lambda$onCellEnter$52(defaultItemAnimator);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda5(10, this, context));
        this.listView.setOnItemLongClickListener(new ManageLinksActivity$$ExternalSyntheticLambda4(this));
        this.linkIcon = context.getDrawable(R.drawable.msg_link_1);
        this.linkIconRevoked = context.getDrawable(R.drawable.msg_link_2);
        this.linkIconRevenue = context.getDrawable(R.drawable.large_income);
        this.linkIcon.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        updateRows(true);
        this.timeDif = ((long) getConnectionsManager().getCurrentTime()) - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public void deleteLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.currentChatId);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new ManageLinksActivity$$ExternalSyntheticLambda2(this, tL_chatInviteExported, 0));
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.currentChatId)) {
            INavigationLayout iNavigationLayout = this.parentLayout;
            if (iNavigationLayout == null || ((ActionBarLayout) iNavigationLayout).getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public void editLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        LinkEditActivity linkEditActivity = new LinkEditActivity(1, this.currentChatId);
        linkEditActivity.setCallback(this.linkEditActivityCallback);
        linkEditActivity.setInviteToEdit(tL_chatInviteExported);
        presentFragment(linkEditActivity);
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
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 24);
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{HeaderCell.class, CreationTextCell.class, LinkActionView.class, LinkCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, 262145, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.fragmentView, 262145, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i2));
        int i3 = Theme.key_windowBackgroundWhiteGrayText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusColor"}, null, null, -1, introActivity$$ExternalSyntheticLambda0, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusOnlineColor"}, null, null, -1, introActivity$$ExternalSyntheticLambda0, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HintInnerCell.class}, new String[]{"messageTextView"}, null, null, -1, null, Theme.key_chats_message));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_chats_unreadCounterMuted));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CreationTextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueText2));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{CreationTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CreationTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_checkboxCheck));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LinkCell.class}, new String[]{"titleView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LinkCell.class}, new String[]{"subtitleView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 8, new Class[]{LinkCell.class}, new String[]{"optionsView"}, null, null, -1, null, Theme.key_stickers_menu));
        return arrayList;
    }

    @Override
    public boolean needDelayOpenAnimation() {
        return true;
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
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
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

    public void revokeLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.currentChatId);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new ManageLinksActivity$$ExternalSyntheticLambda2(this, tL_chatInviteExported, 1));
    }

    public void setInfo(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.info = chatFull;
        this.invite = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.isPublic = ChatObject.isPublic(this.currentChat);
        loadLinks(true);
    }
}
