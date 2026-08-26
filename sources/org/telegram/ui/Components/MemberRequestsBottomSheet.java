package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Delegates.ChatActivityMemberRequestsDelegate;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MemberRequestsActivity;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda61;
import org.telegram.ui.UsersSelectActivity;

public abstract class MemberRequestsBottomSheet extends UsersAlertBase {
    public final FlickerLoadingView currentLoadingView;
    public final MemberRequestsActivity.AnonymousClass1 delegate;
    public boolean enterEventSent;
    public final StickerEmptyView membersEmptyView;
    public final StickerEmptyView membersSearchEmptyView;
    public final int touchSlop;
    public float yOffset;

    public MemberRequestsBottomSheet(BaseFragment baseFragment, long j) {
        super(baseFragment.getParentActivity(), baseFragment.getCurrentAccount(), baseFragment.getResourceProvider());
        this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i = Theme.key_windowBackgroundGray;
        setBackgroundColor(getThemedColor(i));
        this.keyListViewBackground = i;
        this.keyInviteMembersBackground = i;
        setColorProgress$1(0.0f);
        fixNavigationBar(getThemedColor(i));
        this.needSnapToTop = false;
        this.isEmptyViewVisible = false;
        MemberRequestsActivity.AnonymousClass1 anonymousClass1 = new MemberRequestsActivity.AnonymousClass1((ChatActivityMemberRequestsDelegate.AnonymousClass2) this, baseFragment, this.container, j);
        this.delegate = anonymousClass1;
        anonymousClass1.isShowLastItemDivider = false;
        setDimBehindAlpha(75);
        this.searchView.searchEditText.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        MemberRequestsDelegate.Adapter adapter = anonymousClass1.adapter;
        this.listViewAdapter = adapter;
        this.searchListViewAdapter = adapter;
        this.listView.setAdapter(adapter);
        this.listView.setSections();
        UsersAlertBase.AnonymousClass1 anonymousClass2 = this.listView;
        anonymousClass1.recyclerView = anonymousClass2;
        anonymousClass2.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(anonymousClass1, 8));
        RecyclerView.OnScrollListener onScrollListener = anonymousClass2.getOnScrollListener();
        if (onScrollListener == null) {
            anonymousClass2.setOnScrollListener(anonymousClass1.listScrollListener);
        } else {
            anonymousClass2.setOnScrollListener(new ChatActivity.AnonymousClass35(4, anonymousClass1, onScrollListener));
        }
        int iIndexOfChild = ((ViewGroup) this.listView.getParent()).indexOfChild(this.listView);
        FlickerLoadingView loadingView = anonymousClass1.getLoadingView();
        this.currentLoadingView = loadingView;
        this.containerView.addView(loadingView, iIndexOfChild, LayoutHelper.createFrame(-1.0f, -1));
        StickerEmptyView emptyView = anonymousClass1.getEmptyView();
        this.membersEmptyView = emptyView;
        this.containerView.addView(emptyView, iIndexOfChild, LayoutHelper.createFrame(-1.0f, -1));
        StickerEmptyView searchEmptyView = anonymousClass1.getSearchEmptyView();
        this.membersSearchEmptyView = searchEmptyView;
        this.containerView.addView(searchEmptyView, iIndexOfChild, LayoutHelper.createFrame(-1.0f, -1));
        anonymousClass1.loadMembers();
    }

    @Override
    public final void lambda$openCrafting$8() {
        MemberRequestsDelegate.PreviewDialog previewDialog = this.delegate.previewDialog;
        if (previewDialog != null) {
            previewDialog.runAnimation(false);
        } else {
            super.lambda$openCrafting$8();
        }
    }

    @Override
    public final void onSearchViewTouched(MotionEvent motionEvent, UsersSelectActivity.AnonymousClass4 anonymousClass4) {
        BaseFragment baseFragment;
        RecyclerListView recyclerListView;
        int i;
        int i2;
        int action = motionEvent.getAction();
        MemberRequestsActivity.AnonymousClass1 anonymousClass1 = this.delegate;
        if (action == 0) {
            this.yOffset = this.scrollOffsetY;
            RecyclerListView recyclerListView2 = anonymousClass1.recyclerView;
            if (recyclerListView2 != null && (i2 = !MemberRequestsDelegate.this.isShowLastItemDivider ? 1 : 0) >= 0 && i2 < recyclerListView2.getChildCount()) {
                anonymousClass1.recyclerView.getChildAt(i2).setEnabled(false);
            }
        } else if (motionEvent.getAction() == 1 && Math.abs(this.scrollOffsetY - this.yOffset) < this.touchSlop && !this.enterEventSent) {
            Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
            if (activityFindActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activityFindActivity;
                baseFragment = (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) launchActivity.getActionBarLayout(), 1, ((ActionBarLayout) launchActivity.getActionBarLayout()).getFragmentStack());
            } else {
                baseFragment = null;
            }
            if (baseFragment instanceof ChatActivity) {
                boolean zNeedEnterText = ((ChatActivity) baseFragment).needEnterText();
                this.enterEventSent = true;
                AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(10, this, anonymousClass4), zNeedEnterText ? 200L : 0L);
            } else {
                this.enterEventSent = true;
                setFocusable(true);
                anonymousClass4.requestFocus();
                AndroidUtilities.runOnUIThread(new InviteMembersBottomSheet$$ExternalSyntheticLambda1(anonymousClass4, 2));
            }
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (recyclerListView = anonymousClass1.recyclerView) != null && (i = !MemberRequestsDelegate.this.isShowLastItemDivider ? 1 : 0) >= 0 && i < recyclerListView.getChildCount()) {
            anonymousClass1.recyclerView.getChildAt(i).setEnabled(true);
        }
    }

    @Override
    public final void search(String str) {
        this.delegate.setQuery(str);
    }

    @Override
    public final void setTranslationY(int i) {
        super.setTranslationY(i);
        this.currentLoadingView.setTranslationY(this.frameLayout.getMeasuredHeight() + i);
        float f = i;
        this.membersEmptyView.setTranslationY(f);
        this.membersSearchEmptyView.setTranslationY(f);
    }

    @Override
    public final void show() {
        MemberRequestsActivity.AnonymousClass1 anonymousClass1 = this.delegate;
        if (anonymousClass1.isNeedRestoreList && this.scrollOffsetY == 0) {
            this.scrollOffsetY = AndroidUtilities.dp(8.0f);
        }
        super.show();
        anonymousClass1.isNeedRestoreList = false;
    }

    @Override
    public final void updateLayout$5() {
        UsersAlertBase.AnonymousClass1 anonymousClass1 = this.listView;
        if (anonymousClass1.getChildCount() > 0) {
            super.updateLayout$5();
            return;
        }
        int paddingTop = anonymousClass1.getVisibility() == 0 ? anonymousClass1.getPaddingTop() - AndroidUtilities.dp(8.0f) : 0;
        if (this.scrollOffsetY != paddingTop) {
            this.scrollOffsetY = paddingTop;
            setTranslationY(paddingTop);
        }
    }
}
