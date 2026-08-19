package org.telegram.ui.community;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;

public class CommunityCreateActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private CommunityHeaderView communityHeaderView;
    private FrameLayout containerView;
    private TLRPC.Chat currentChat;
    private TLRPC.User currentUser;
    private long dialogId;
    private ArrayList joinedCommunities;
    private UniversalRecyclerView listView;
    private NotificationCenter.ObserversGroup observersGroup;

    public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        return false;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    public CommunityCreateActivity(Bundle bundle) {
        super(bundle);
    }

    @Override
    public boolean onFragmentCreate() {
        this.dialogId = this.arguments.getLong("dialog_id", 0L);
        this.currentChat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
        this.currentUser = getMessagesController().getUser(Long.valueOf(this.dialogId));
        this.joinedCommunities = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                CommunityCreateActivity.$r8$lambda$CXHzNj6tVaV5F66iLVvIw4Cf40A(this.f$0, (ArrayList) obj);
            }
        }, this.classGuid);
        this.observersGroup = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    public static void $r8$lambda$CXHzNj6tVaV5F66iLVvIw4Cf40A(CommunityCreateActivity communityCreateActivity, ArrayList arrayList) {
        ArrayList arrayList2 = communityCreateActivity.joinedCommunities;
        boolean z = arrayList2 == null || arrayList2.isEmpty();
        communityCreateActivity.joinedCommunities = arrayList;
        UniversalRecyclerView universalRecyclerView = communityCreateActivity.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(z);
        }
    }

    @Override
    public View createView(Context context) {
        int i;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    CommunityCreateActivity.this.finishFragment();
                }
            }
        });
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        blurredBackgroundSourceColor.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        this.actionBar.setBackground(null);
        this.actionBar.setupGlass(blurredBackgroundDrawableViewFactory, BlurredBackgroundProviderImpl.topPanelChatActivity(this.resourceProvider));
        this.actionBar.setGlassOnlyBack();
        FrameLayout frameLayout = new FrameLayout(context);
        this.containerView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        CommunityHeaderView communityHeaderView = new CommunityHeaderView(context, this.resourceProvider);
        this.communityHeaderView = communityHeaderView;
        communityHeaderView.setTitle(LocaleController.getString(R.string.CommunityTitle));
        CommunityHeaderView communityHeaderView2 = this.communityHeaderView;
        if (this.currentUser != null) {
            i = R.string.CommunityDescriptionBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(this.currentChat)) {
            i = R.string.CommunityDescriptionChannel;
        } else {
            i = R.string.CommunityDescriptionGroup;
        }
        communityHeaderView2.setSubtitle(LocaleController.getString(i));
        this.communityHeaderView.setTag(-33024);
        TLRPC.User user = this.currentUser;
        if (user != null) {
            this.communityHeaderView.avatarView.setForUserOrChat(user, new AvatarDrawable(this.currentUser));
        } else {
            TLRPC.Chat chat = this.currentChat;
            if (chat != null) {
                this.communityHeaderView.avatarView.setForUserOrChat(chat, new AvatarDrawable(this.currentChat));
            }
        }
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f$0.onClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, new Utilities.Callback5Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return Boolean.valueOf(this.f$0.onLongClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue()));
            }
        });
        this.listView = universalRecyclerView;
        universalRecyclerView.setClipToPadding(false);
        this.listView.adapter.setApplyBackground(false);
        this.listView.setSections();
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2, 48));
        FrameLayout frameLayout2 = this.containerView;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        String string;
        arrayList.add(UItem.asCustomShadow(0, this.communityHeaderView));
        arrayList.add(UItem.asButton(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity)).accent());
        arrayList.add(UItem.asSpace(2, AndroidUtilities.dp(14.0f)));
        ArrayList arrayList2 = this.joinedCommunities;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        arrayList.add(UItem.asHeader(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
        ArrayList arrayList3 = this.joinedCommunities;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.id);
            UItem uItemAsProfileCell = UItem.asProfileCell(chat);
            uItemAsProfileCell.id = SessionDetails$$ExternalSyntheticBackport0.m(chat.id);
            if (chatFull != null) {
                ArrayList<TL_communities.CommunityPeer> arrayList4 = chatFull.linked_peers;
                string = LocaleController.formatPluralString("Chats", arrayList4 != null ? arrayList4.size() : 0, new Object[0]);
            } else {
                string = LocaleController.getString(R.string.Loading);
            }
            uItemAsProfileCell.subtext = string;
            arrayList.add(uItemAsProfileCell);
        }
    }

    public void onClick(UItem uItem, View view, int i, float f, float f2) {
        CommunityCreateActivity communityCreateActivity;
        if (uItem.id == 1) {
            communityCreateActivity = this;
            AlertsCreator.createSimpleTextInputAlert(getContext(), communityCreateActivity, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, Integer.MAX_VALUE, LocaleController.getString(R.string.Create), this.resourceProvider, new MessagesStorage.StringCallback() {
                @Override
                public final void run(String str) {
                    CommunityCreateActivity.$r8$lambda$MojKJ3avD5jL8738eah4iO27dbc(this.f$0, str);
                }
            });
        } else {
            communityCreateActivity = this;
        }
        Object obj = uItem.object;
        if (obj instanceof TLRPC.Chat) {
            final TLRPC.Chat chat = (TLRPC.Chat) obj;
            getMessagesController().getChat(Long.valueOf(-communityCreateActivity.dialogId));
            showDialog(new CommunityAddOptionsSheet(getContext(), chat, communityCreateActivity.dialogId, new Utilities.Callback() {
                @Override
                public final void run(Object obj2) {
                    CommunityCreateActivity.$r8$lambda$1rCwOsGBx2nerhnOHbJAR90r2IA(this.f$0, chat, (Boolean) obj2);
                }
            }));
        }
    }

    public static void $r8$lambda$MojKJ3avD5jL8738eah4iO27dbc(final CommunityCreateActivity communityCreateActivity, final String str) {
        communityCreateActivity.getMessagesController().getChat(Long.valueOf(-communityCreateActivity.dialogId));
        communityCreateActivity.showDialog(new CommunityAddOptionsSheet(communityCreateActivity.getContext(), null, communityCreateActivity.dialogId, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                CommunityCreateActivity.m4857$r8$lambda$8AKimRmoDNGY8VgGR5Np72m8l4(this.f$0, str, (Boolean) obj);
            }
        }));
    }

    public static void m4857$r8$lambda$8AKimRmoDNGY8VgGR5Np72m8l4(CommunityCreateActivity communityCreateActivity, String str, Boolean bool) {
        communityCreateActivity.getClass();
        communityCreateActivity.createNewCommunity(str, bool.booleanValue());
    }

    public static void $r8$lambda$1rCwOsGBx2nerhnOHbJAR90r2IA(CommunityCreateActivity communityCreateActivity, TLRPC.Chat chat, Boolean bool) {
        communityCreateActivity.getClass();
        communityCreateActivity.linkToCommunity(chat.id, bool.booleanValue());
    }

    private void createNewCommunity(final String str, final boolean z) {
        if (!ChatObject.isChannel(this.currentChat) && this.currentUser == null) {
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
            alertDialog.showDelayed(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.dialogId, this, new MessagesStorage.LongCallback() {
                @Override
                public final void run(long j) {
                    CommunityCreateActivity.m4858$r8$lambda$SxllwebjK9no8nlH4Gm7rpsAi8(this.f$0, alertDialog, str, z, j);
                }
            });
            return;
        }
        getMessagesController().createCommunity(str, this.dialogId, z, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                CommunityCreateActivity.m4860$r8$lambda$v923dn0izPmJr450BaI3jYSkkk(this.f$0, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void m4858$r8$lambda$SxllwebjK9no8nlH4Gm7rpsAi8(CommunityCreateActivity communityCreateActivity, AlertDialog alertDialog, String str, boolean z, long j) {
        communityCreateActivity.getClass();
        alertDialog.dismiss();
        if (j == 0) {
            return;
        }
        communityCreateActivity.dialogId = -j;
        communityCreateActivity.currentChat = communityCreateActivity.getMessagesController().getChat(Long.valueOf(j));
        communityCreateActivity.createNewCommunity(str, z);
    }

    public static void m4860$r8$lambda$v923dn0izPmJr450BaI3jYSkkk(CommunityCreateActivity communityCreateActivity, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            communityCreateActivity.getClass();
            BulletinFactory.of(communityCreateActivity).showForError(tL_error);
        } else {
            CommunityUtils.onCommunityLinkSuccess(communityCreateActivity, communityCreateActivity.dialogId, 0);
        }
    }

    private void linkToCommunity(final long j, final boolean z) {
        if (!ChatObject.isChannel(this.currentChat) && this.currentUser == null) {
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
            alertDialog.showDelayed(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.dialogId, this, new MessagesStorage.LongCallback() {
                @Override
                public final void run(long j2) {
                    CommunityCreateActivity.$r8$lambda$MG6Ydo5tRxctomN_GXmwPCU_LSA(this.f$0, alertDialog, j, z, j2);
                }
            });
            return;
        }
        CommunityUtils.linkToCommunityWithoutConvert(this, this.currentAccount, -this.dialogId, j, z);
    }

    public static void $r8$lambda$MG6Ydo5tRxctomN_GXmwPCU_LSA(CommunityCreateActivity communityCreateActivity, AlertDialog alertDialog, long j, boolean z, long j2) {
        communityCreateActivity.getClass();
        alertDialog.dismiss();
        if (j2 == 0) {
            return;
        }
        communityCreateActivity.dialogId = -j2;
        communityCreateActivity.currentChat = communityCreateActivity.getMessagesController().getChat(Long.valueOf(j2));
        communityCreateActivity.linkToCommunity(j, z);
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        super.onInsets(i, i2, i3, i4);
        this.listView.setPadding(0, i2, 0, i4);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            View viewFindViewByItemId = this.listView.findViewByItemId(SessionDetails$$ExternalSyntheticBackport0.m(chatFull.id));
            if (viewFindViewByItemId instanceof ProfileSearchCell) {
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) viewFindViewByItemId;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                profileSearchCell.setSubLabel(LocaleController.formatPluralString("Chats", arrayList != null ? arrayList.size() : 0, new Object[0]));
                return;
            }
            this.listView.adapter.update(false);
        }
    }

    @Override
    public void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.observersGroup;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.observersGroup = null;
        }
        super.onFragmentDestroy();
    }

    public static class CommunityHeaderView extends FrameLayout implements Theme.Colorable {
        public final BackupImageView avatarView;
        private final Theme.ResourcesProvider resourcesProvider;
        private final TextView subtitleView;
        private final TextView titleView;

        public int[] getColorKeys() {
            return Theme.Colorable.CC.$default$getColorKeys(this);
        }

        public CommunityHeaderView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
            addView(backupImageView, LayoutHelper.createFrame(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 24.0f, 123.0f, 24.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 49, 32.0f, 157.0f, 32.0f, 0.0f));
            updateColors();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            DrawableUtils.drawCommunityCardDrawable(canvas, Theme.dialogs_communityCardsDrawable, this.avatarView.getLeft() + (this.avatarView.getWidth() / 2.0f), this.avatarView.getTop() + (this.avatarView.getHeight() / 2.0f), this.avatarView.getHeight());
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(218.0f), 1073741824));
        }

        @Override
        public void updateColors() {
            this.titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            this.subtitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider));
        }

        public void setTitle(CharSequence charSequence) {
            this.titleView.setText(charSequence);
        }

        public void setSubtitle(CharSequence charSequence) {
            this.subtitleView.setText(charSequence);
        }
    }
}
