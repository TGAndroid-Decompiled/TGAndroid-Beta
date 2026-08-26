package org.telegram.ui.community;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import java.util.WeakHashMap;
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
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda286;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.chat.layouts.ChatActivityFadeView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SettingsActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.community.cells.CommunityPendingRequestCell;
import org.telegram.ui.community.sheet.CommunityInviteOnlySheet;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;

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
        CommunityUtils.PendingRequests pendingRequests = new CommunityUtils.PendingRequests(getParentActivity(), this.resourceProvider, BulletinFactory.of(this), this.currentAccount, this.communityId);
        this.pendingRequestsList = pendingRequests;
        pendingRequests.delegate = new PhotoViewer.AnonymousClass24(this, 9);
        pendingRequests.loadNext();
        this.pendingRequestsList.markAsViewed();
        zzkt.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new UserInfoActivity.AnonymousClass4(this, 9));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.containerView = frameLayout;
        int i = Theme.key_windowBackgroundGray;
        final int i2 = 0;
        frameLayout.setBackgroundColor(Theme.getColor(null, i, false));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(getParentActivity(), getCurrentAccount(), getClassGuid(), new TodoItemMenu$$ExternalSyntheticLambda17(this, 15), new CommunityPendingRequestsActivity$$ExternalSyntheticLambda1(this), new CommunityPendingRequestsActivity$$ExternalSyntheticLambda1(this), getResourceProvider());
        this.listView = universalRecyclerView;
        universalRecyclerView.setClipToPadding(false);
        UniversalRecyclerView universalRecyclerView2 = this.listView;
        universalRecyclerView2.adapter.applyBackground = false;
        universalRecyclerView2.setSections();
        this.listView.addOnScrollListener(new SettingsActivity.AnonymousClass5(this, 23));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        ChatActivityFadeView chatActivityFadeView = new ChatActivityFadeView(context);
        this.fadeView = chatActivityFadeView;
        chatActivityFadeView.setupColorKey(i);
        this.fadeView.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.fadeView.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.containerView.addView(this.fadeView, LayoutHelper.createFrame(-1.0f, -1));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.buttonsLayout = linearLayout;
        linearLayout.setOrientation(0);
        this.buttonsLayout.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourceProvider, true);
        this.buttonDeclineAllView = buttonWithCounterView;
        buttonWithCounterView.setNeutral();
        this.buttonDeclineAllView.setColor(ColorUtils.blendARGB(0.125f, getThemedColor(Theme.key_windowBackgroundWhite), getThemedColor(Theme.key_windowBackgroundWhiteBlackText)));
        this.buttonDeclineAllView.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.buttonDeclineAllView.setRoundRadius(24);
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
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, this.resourceProvider, true);
        this.buttonAddAllView = buttonWithCounterView2;
        buttonWithCounterView2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.buttonAddAllView.setRoundRadius(24);
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
        StickerEmptyView stickerEmptyView = new StickerEmptyView(16, this.resourceProvider, getParentActivity(), null);
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
        setBulletinDelegate(new LaunchActivity.AnonymousClass7(16));
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

    public final void onClick$15(UItem uItem) {
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
                new CommunityInviteOnlySheet(getParentActivity(), chat, new RichTableCell$$ExternalSyntheticLambda3(8, this, data)).show();
            }
        }
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
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
        ChatActivity$$ExternalSyntheticLambda286 chatActivity$$ExternalSyntheticLambda286 = pendingRequests.doCommitRunnable;
        if (chatActivity$$ExternalSyntheticLambda286 != null) {
            chatActivity$$ExternalSyntheticLambda286.run();
        }
        pendingRequests.doCommitRunnable = null;
    }
}
