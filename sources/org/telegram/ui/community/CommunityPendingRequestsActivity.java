package org.telegram.ui.community;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import java.util.WeakHashMap;
import kotlinx.coroutines.flow.SafeFlow;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda155;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.chat.layouts.ChatActivityFadeView;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotDownloads$$ExternalSyntheticLambda0;
import org.telegram.ui.community.cells.CommunityPendingRequestCell;
import org.telegram.ui.community.sheet.CommunityInviteOnlySheet;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;
import org.telegram.ui.web.HistoryFragment;

public final class CommunityPendingRequestsActivity extends BaseFragment implements FactorAnimator.Target {
    public final BoolAnimator animatorIsRequestsEmpty;
    public ButtonWithCounterView buttonAddAllView;
    public ButtonWithCounterView buttonDeclineAllView;
    public LinearLayout buttonsLayout;
    public long communityId;
    public FrameLayout containerView;
    public StickerEmptyView emptyView;
    public ChatActivityFadeView fadeView;
    public TLRPC.ChatFull info;
    public UniversalRecyclerView listView;
    public CommunityUtils.PendingRequests pendingRequestsList;

    public final class AnonymousClass4 implements Bulletin.Delegate {
        @Override
        public final boolean allowLayoutChanges() {
            return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
        }

        @Override
        public final boolean bottomOffsetAnimated() {
            return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
        }

        @Override
        public final boolean clipWithGradient(int i) {
            return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
        }

        @Override
        public final int getBottomOffset(int i) {
            return AndroidUtilities.dp(64.0f) + AndroidUtilities.navigationBarHeight;
        }

        @Override
        public final int getLeftPadding() {
            return Bulletin.Delegate.CC.$default$getLeftPadding(this);
        }

        @Override
        public final int getRightPadding() {
            return Bulletin.Delegate.CC.$default$getRightPadding(this);
        }

        @Override
        public final int getTopOffset(int i) {
            return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
        }

        @Override
        public final void onBottomOffsetChange(float f) {
            Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
        }

        @Override
        public final void onHide(Bulletin bulletin) {
            Bulletin.Delegate.CC.$default$onHide(this, bulletin);
        }

        @Override
        public final void onShow(Bulletin bulletin) {
            Bulletin.Delegate.CC.$default$onShow(this, bulletin);
        }
    }

    public CommunityPendingRequestsActivity(Bundle bundle) {
        super(bundle);
        this.animatorIsRequestsEmpty = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 320L, false);
    }

    public final void checkPaddings(int i) {
        this.listView.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i);
        this.buttonsLayout.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i);
        this.emptyView.setTranslationY((this.listView.getPaddingTop() - this.listView.getPaddingBottom()) / 2.0f);
        this.fadeView.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i);
    }

    @Override
    public final View createView(Context context) {
        boolean z = true;
        z = true;
        setHasOwnBackground(true);
        CommunityUtils.PendingRequests pendingRequests = new CommunityUtils.PendingRequests(getContext(), this.resourceProvider, BulletinFactory.of(this), this.currentAccount, this.communityId);
        this.pendingRequestsList = pendingRequests;
        pendingRequests.delegate = new SafeFlow(this);
        pendingRequests.loadNext();
        this.pendingRequestsList.markAsViewed();
        zzki.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new HistoryFragment.AnonymousClass1(this, 20));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.containerView = frameLayout;
        int i = Theme.key_windowBackgroundGray;
        final int i2 = 0;
        frameLayout.setBackgroundColor(Theme.getColor(null, i, false));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new BotDownloads$$ExternalSyntheticLambda0(this, 14), new CommunityPendingRequestsActivity$$ExternalSyntheticLambda1(this), new CommunityPendingRequestsActivity$$ExternalSyntheticLambda1(this));
        this.listView = universalRecyclerView;
        universalRecyclerView.setClipToPadding(false);
        this.listView.adapter.setApplyBackground(false);
        this.listView.setSections();
        this.listView.addOnScrollListener(new StarGiftSheet.AnonymousClass8(this, 19));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        ChatActivityFadeView chatActivityFadeView = new ChatActivityFadeView(context);
        this.fadeView = chatActivityFadeView;
        chatActivityFadeView.setupColorKey(i);
        this.fadeView.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.fadeView.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.containerView.addView(this.fadeView, LayoutHelper.createFrameMatchParent());
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.buttonsLayout = linearLayout;
        linearLayout.setOrientation(0);
        this.buttonsLayout.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, this.resourceProvider);
        this.buttonDeclineAllView = buttonWithCounterView;
        buttonWithCounterView.setNeutral();
        this.buttonDeclineAllView.setColor(ColorUtils.blendARGB(0.125f, getThemedColor(Theme.key_windowBackgroundWhite), getThemedColor(Theme.key_windowBackgroundWhiteBlackText)));
        this.buttonDeclineAllView.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.buttonDeclineAllView.setRound();
        this.buttonDeclineAllView.setOnClickListener(new View.OnClickListener(this) {
            public final CommunityPendingRequestsActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f$0.pendingRequestsList.onResolveAllJoinRequests(false, true);
                        break;
                    default:
                        this.f$0.pendingRequestsList.onResolveAllJoinRequests(true, true);
                        break;
                }
            }
        });
        this.buttonsLayout.addView(this.buttonDeclineAllView, LayoutHelper.createLinear(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, true, this.resourceProvider);
        this.buttonAddAllView = buttonWithCounterView2;
        buttonWithCounterView2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.buttonAddAllView.setRound();
        ButtonWithCounterView buttonWithCounterView3 = this.buttonAddAllView;
        final int i3 = z ? 1 : 0;
        buttonWithCounterView3.setOnClickListener(new View.OnClickListener(this) {
            public final CommunityPendingRequestsActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f$0.pendingRequestsList.onResolveAllJoinRequests(false, true);
                        break;
                    default:
                        this.f$0.pendingRequestsList.onResolveAllJoinRequests(true, true);
                        break;
                }
            }
        });
        this.buttonsLayout.addView(this.buttonAddAllView, LayoutHelper.createLinear(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.containerView.addView(this.buttonsLayout, LayoutHelper.createFrame(-1, -2, 80));
        StickerEmptyView stickerEmptyView = new StickerEmptyView(getContext(), null, 16, this.resourceProvider);
        this.emptyView = stickerEmptyView;
        stickerEmptyView.title.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.emptyView.subtitle.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.emptyView.setAnimateLayoutChange(true);
        this.emptyView.setVisibility(8);
        this.containerView.addView(this.emptyView, LayoutHelper.createFrame(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z = false;
        }
        this.animatorIsRequestsEmpty.setValue(z, false);
        checkPaddings(0);
        FrameLayout frameLayout2 = this.containerView;
        CommunityPendingRequestsActivity$$ExternalSyntheticLambda1 communityPendingRequestsActivity$$ExternalSyntheticLambda1 = new CommunityPendingRequestsActivity$$ExternalSyntheticLambda1(this);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(frameLayout2, communityPendingRequestsActivity$$ExternalSyntheticLambda1);
        Bulletin.addDelegate(this, new AnonymousClass4());
        FrameLayout frameLayout3 = this.containerView;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void onClick$10(UItem uItem) {
        Object obj = uItem.object;
        if (obj instanceof CommunityPendingRequestCell.Data) {
            CommunityPendingRequestCell.Data data = (CommunityPendingRequestCell.Data) obj;
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-data.dialogToAdd));
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(data.dialogToAdd));
            if (user != null) {
                presentFragment(ChatActivity.of(user.id));
            } else if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
                presentFragment(ChatActivity.of(-chat.id));
            } else {
                new CommunityInviteOnlySheet(getContext(), chat, new RichTableCell$$ExternalSyntheticLambda3(19, this, data)).show();
            }
        }
    }

    @Override
    public final void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        float f3 = 1.0f - f;
        this.buttonsLayout.setAlpha(f3);
        this.buttonsLayout.setVisibility(f3 > 0.0f ? 0 : 8);
        this.emptyView.setAlpha(f);
        this.emptyView.setVisibility(f > 0.0f ? 0 : 8);
    }

    @Override
    public final boolean onFragmentCreate() {
        this.communityId = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.communityId));
        this.info = getMessagesController().getChatFull(this.communityId);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        CommunityUtils.PendingRequests pendingRequests = this.pendingRequestsList;
        ChatActivity$$ExternalSyntheticLambda155 chatActivity$$ExternalSyntheticLambda155 = pendingRequests.doCommitRunnable;
        if (chatActivity$$ExternalSyntheticLambda155 != null) {
            chatActivity$$ExternalSyntheticLambda155.run();
        }
        pendingRequests.doCommitRunnable = null;
    }
}
