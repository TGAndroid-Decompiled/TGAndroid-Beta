package org.telegram.ui.Components;

import android.app.Activity;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.LaunchActivity;

public abstract class MemberRequestsBottomSheet extends UsersAlertBase {
    private final FlickerLoadingView currentLoadingView;
    private final MemberRequestsDelegate delegate;
    private boolean enterEventSent;
    private final StickerEmptyView membersEmptyView;
    private final StickerEmptyView membersSearchEmptyView;
    private final int touchSlop;
    private float yOffset;

    public MemberRequestsBottomSheet(BaseFragment baseFragment, long j) {
        super(baseFragment.getParentActivity(), false, baseFragment.getCurrentAccount(), baseFragment.getResourceProvider());
        this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i = Theme.key_windowBackgroundGray;
        setBackgroundColor(getThemedColor(i));
        this.keyListViewBackground = i;
        this.keyInviteMembersBackground = i;
        setColorProgress(0.0f);
        fixNavigationBar(getThemedColor(i));
        this.needSnapToTop = false;
        this.isEmptyViewVisible = false;
        MemberRequestsDelegate memberRequestsDelegate = new MemberRequestsDelegate(baseFragment, this.container, j, false) {
            @Override
            protected void onImportersChanged(String str, boolean z, boolean z2) {
                if (!hasAllImporters()) {
                    if (MemberRequestsBottomSheet.this.membersEmptyView.getVisibility() != 4) {
                        MemberRequestsBottomSheet.this.membersEmptyView.setVisibility(4);
                    }
                } else if (z2) {
                    MemberRequestsBottomSheet.this.searchView.searchEditText.setText("");
                } else {
                    super.onImportersChanged(str, z, z2);
                }
            }
        };
        this.delegate = memberRequestsDelegate;
        memberRequestsDelegate.setShowLastItemDivider(false);
        setDimBehindAlpha(75);
        this.searchView.searchEditText.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        MemberRequestsDelegate.Adapter adapter = memberRequestsDelegate.getAdapter();
        this.listViewAdapter = adapter;
        this.searchListViewAdapter = adapter;
        this.listView.setAdapter(adapter);
        this.listView.setSections();
        memberRequestsDelegate.setRecyclerView(this.listView);
        int iIndexOfChild = ((ViewGroup) this.listView.getParent()).indexOfChild(this.listView);
        FlickerLoadingView loadingView = memberRequestsDelegate.getLoadingView();
        this.currentLoadingView = loadingView;
        this.containerView.addView(loadingView, iIndexOfChild, LayoutHelper.createFrame(-1, -1.0f));
        StickerEmptyView emptyView = memberRequestsDelegate.getEmptyView();
        this.membersEmptyView = emptyView;
        this.containerView.addView(emptyView, iIndexOfChild, LayoutHelper.createFrame(-1, -1.0f));
        StickerEmptyView searchEmptyView = memberRequestsDelegate.getSearchEmptyView();
        this.membersSearchEmptyView = searchEmptyView;
        this.containerView.addView(searchEmptyView, iIndexOfChild, LayoutHelper.createFrame(-1, -1.0f));
        memberRequestsDelegate.lambda$new$8();
    }

    @Override
    public void show() {
        if (this.delegate.isNeedRestoreList && this.scrollOffsetY == 0) {
            this.scrollOffsetY = AndroidUtilities.dp(8.0f);
        }
        super.show();
        this.delegate.isNeedRestoreList = false;
    }

    @Override
    public void lambda$openCrafting$8() {
        if (this.delegate.onBackPressed(true)) {
            super.lambda$openCrafting$8();
        }
    }

    public boolean isNeedRestoreDialog() {
        return this.delegate.isNeedRestoreList;
    }

    @Override
    protected void setTranslationY(int i) {
        super.setTranslationY(i);
        this.currentLoadingView.setTranslationY(this.frameLayout.getMeasuredHeight() + i);
        float f = i;
        this.membersEmptyView.setTranslationY(f);
        this.membersSearchEmptyView.setTranslationY(f);
    }

    @Override
    protected void updateLayout() {
        if (this.listView.getChildCount() <= 0) {
            int paddingTop = this.listView.getVisibility() == 0 ? this.listView.getPaddingTop() - AndroidUtilities.dp(8.0f) : 0;
            if (this.scrollOffsetY != paddingTop) {
                this.scrollOffsetY = paddingTop;
                setTranslationY(paddingTop);
                return;
            }
            return;
        }
        super.updateLayout();
    }

    @Override
    protected void search(String str) {
        super.search(str);
        this.delegate.setQuery(str);
    }

    @Override
    protected void onSearchViewTouched(MotionEvent motionEvent, final EditTextBoldCursor editTextBoldCursor) throws Resources.NotFoundException {
        BaseFragment baseFragment;
        if (motionEvent.getAction() == 0) {
            this.yOffset = this.scrollOffsetY;
            this.delegate.setAdapterItemsEnabled(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.scrollOffsetY - this.yOffset) < this.touchSlop && !this.enterEventSent) {
            Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
            if (activityFindActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activityFindActivity;
                baseFragment = (BaseFragment) launchActivity.getActionBarLayout().getFragmentStack().get(launchActivity.getActionBarLayout().getFragmentStack().size() - 1);
            } else {
                baseFragment = null;
            }
            if (baseFragment instanceof ChatActivity) {
                boolean zNeedEnterText = ((ChatActivity) baseFragment).needEnterText();
                this.enterEventSent = true;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onSearchViewTouched$1(editTextBoldCursor);
                    }
                }, zNeedEnterText ? 200L : 0L);
            } else {
                this.enterEventSent = true;
                setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        AndroidUtilities.showKeyboard(editTextBoldCursor);
                    }
                });
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.delegate.setAdapterItemsEnabled(true);
        }
    }

    public void lambda$onSearchViewTouched$1(final EditTextBoldCursor editTextBoldCursor) {
        setFocusable(true);
        editTextBoldCursor.requestFocus();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            }
        });
    }
}
