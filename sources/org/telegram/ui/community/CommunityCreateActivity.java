package org.telegram.ui.community;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Gifts.AuctionBidSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda53;
import org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda12;
import org.telegram.ui.web.HistoryFragment;

public final class CommunityCreateActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public CommunityHeaderView communityHeaderView;
    public FrameLayout containerView;
    public TLRPC.Chat currentChat;
    public TLRPC.User currentUser;
    public long dialogId;
    public ArrayList joinedCommunities;
    public UniversalRecyclerView listView;
    public NotificationCenter.ObserversGroup observersGroup;

    public final class CommunityHeaderView extends FrameLayout implements Theme.Colorable {
        public final BackupImageView avatarView;
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView subtitleView;
        public final TextView titleView;

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
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            Drawable drawable = Theme.dialogs_communityCardsDrawable;
            BackupImageView backupImageView = this.avatarView;
            DrawableUtils.drawCommunityCardDrawable(canvas, drawable, (backupImageView.getWidth() / 2.0f) + backupImageView.getLeft(), (backupImageView.getHeight() / 2.0f) + backupImageView.getTop(), backupImageView.getHeight());
        }

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(218.0f), 1073741824));
        }

        public void setSubtitle(CharSequence charSequence) {
            this.subtitleView.setText(charSequence);
        }

        public void setTitle(CharSequence charSequence) {
            this.titleView.setText(charSequence);
        }

        @Override
        public final void updateColors() {
            int i = Theme.key_windowBackgroundWhiteBlackText;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            this.titleView.setTextColor(Theme.getColor(i, resourcesProvider));
            this.subtitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        }
    }

    public final void createNewCommunity(String str, boolean z) {
        if (ChatObject.isChannel(this.currentChat) || this.currentUser != null) {
            getMessagesController().createCommunity(str, this.dialogId, z, new CommunityCreateActivity$$ExternalSyntheticLambda0(this, 1));
            return;
        }
        AlertDialog alertDialog = new AlertDialog(getContext(), 3, null);
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 250L);
        getMessagesController().convertToMegaGroup(getParentActivity(), -this.dialogId, this, new RichInlineButtonEditor$$ExternalSyntheticLambda12(this, alertDialog, str, z));
    }

    @Override
    public final View createView(Context context) {
        int i;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        zzki.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new HistoryFragment.AnonymousClass1(this, 18));
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        blurredBackgroundSourceColor.paint.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        this.actionBar.setBackground(null);
        this.actionBar.setupGlass(blurredBackgroundDrawableViewFactory, BlurredBackgroundProviderImpl.topPanelChatActivity(this.resourceProvider));
        this.actionBar.setGlassOnlyBack();
        FrameLayout frameLayout = new FrameLayout(context);
        this.containerView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        CommunityHeaderView communityHeaderView = new CommunityHeaderView(context, this.resourceProvider);
        this.communityHeaderView = communityHeaderView;
        communityHeaderView.setTitle(LocaleController.getString(R.string.CommunityTitle));
        CommunityHeaderView communityHeaderView2 = this.communityHeaderView;
        if (this.currentUser != null) {
            i = R.string.CommunityDescriptionBot;
        } else {
            i = ChatObject.isChannelAndNotMegaGroup(this.currentChat) ? R.string.CommunityDescriptionChannel : R.string.CommunityDescriptionGroup;
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
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new CommunityCreateActivity$$ExternalSyntheticLambda0(this, 0), new CommunityCreateActivity$$ExternalSyntheticLambda1(this), new CommunityCreateActivity$$ExternalSyntheticLambda1(this));
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

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j = chatFull.id;
            View viewFindViewByItemId = this.listView.findViewByItemId((int) (j ^ (j >>> 32)));
            if (!(viewFindViewByItemId instanceof ProfileSearchCell)) {
                this.listView.adapter.update(false);
                return;
            }
            ProfileSearchCell profileSearchCell = (ProfileSearchCell) viewFindViewByItemId;
            ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
            profileSearchCell.setSubLabel(LocaleController.formatPluralString("Chats", arrayList != null ? arrayList.size() : 0, new Object[0]));
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void linkToCommunity(long j, boolean z) {
        if (ChatObject.isChannel(this.currentChat) || this.currentUser != null) {
            int i = this.currentAccount;
            long j2 = -this.dialogId;
            MessagesController.getInstance(i).linkCommunity(-j2, j, z, new AuctionBidSheet$$ExternalSyntheticLambda18(this, j2, 2));
        } else {
            AlertDialog alertDialog = new AlertDialog(getContext(), 3, null);
            AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.dialogId, this, new CommunitySheet$$ExternalSyntheticLambda6(this, alertDialog, j, z, 1));
        }
    }

    public final void onClick$8(UItem uItem) {
        CommunityCreateActivity communityCreateActivity;
        if (uItem.id == 1) {
            communityCreateActivity = this;
            AlertsCreator.createSimpleTextInputAlert(getContext(), communityCreateActivity, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, Integer.MAX_VALUE, LocaleController.getString(R.string.Create), this.resourceProvider, new CommunityCreateActivity$$ExternalSyntheticLambda1(this));
        } else {
            communityCreateActivity = this;
        }
        Object obj = uItem.object;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            getMessagesController().getChat(Long.valueOf(-communityCreateActivity.dialogId));
            showDialog(new CommunityAddOptionsSheet(getContext(), chat, communityCreateActivity.dialogId, new GiftSheet$$ExternalSyntheticLambda4(28, this, chat)));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.dialogId = this.arguments.getLong("dialog_id", 0L);
        this.currentChat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
        this.currentUser = getMessagesController().getUser(Long.valueOf(this.dialogId));
        this.joinedCommunities = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new RichEditor$$ExternalSyntheticLambda53(this, 9), this.classGuid);
        this.observersGroup = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.observersGroup;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.observersGroup = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        super.onInsets(i, i2, i3, i4);
        this.listView.setPadding(0, i2, 0, i4);
    }
}
