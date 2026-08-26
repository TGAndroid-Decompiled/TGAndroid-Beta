package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Delegates.ChatActivityMemberRequestsDelegate;
import org.telegram.ui.Delegates.MemberRequestsDelegate;

public final class MemberRequestsActivity extends BaseFragment {
    public final AnonymousClass1 delegate;

    public final class AnonymousClass1 extends MemberRequestsDelegate {
        public final int $r8$classId = 1;
        public final Object this$0;

        public AnonymousClass1(ChatActivityMemberRequestsDelegate.AnonymousClass2 anonymousClass2, BaseFragment baseFragment, FrameLayout frameLayout, long j) {
            super(baseFragment, frameLayout, j, false);
            this.this$0 = anonymousClass2;
        }

        @Override
        public final void onImportersChanged(String str, boolean z, boolean z2) {
            switch (this.$r8$classId) {
                case 0:
                    if (!z2) {
                        super.onImportersChanged(str, z, z2);
                    } else {
                        ((BaseFragment) ((MemberRequestsActivity) this.this$0)).actionBar.setSearchFieldText("");
                    }
                    break;
                default:
                    boolean zIsEmpty = this.allImporters.isEmpty();
                    ChatActivityMemberRequestsDelegate.AnonymousClass2 anonymousClass2 = (ChatActivityMemberRequestsDelegate.AnonymousClass2) this.this$0;
                    if (zIsEmpty) {
                        StickerEmptyView stickerEmptyView = anonymousClass2.membersEmptyView;
                        if (stickerEmptyView.getVisibility() != 4) {
                            stickerEmptyView.setVisibility(4);
                        }
                    } else if (!z2) {
                        super.onImportersChanged(str, z, z2);
                    } else {
                        anonymousClass2.searchView.searchEditText.setText("");
                    }
                    break;
            }
        }

        public AnonymousClass1(MemberRequestsActivity memberRequestsActivity, MemberRequestsActivity memberRequestsActivity2, FrameLayout frameLayout, long j) {
            super(memberRequestsActivity2, frameLayout, j, true);
            this.this$0 = memberRequestsActivity;
        }
    }

    public MemberRequestsActivity(long j) {
        super(null);
        this.delegate = new AnonymousClass1(this, this, getLayoutContainer(), j);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 2));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ActionBar actionBar = this.actionBar;
        AnonymousClass1 anonymousClass1 = this.delegate;
        actionBar.setTitle(LocaleController.getString(anonymousClass1.isChannel ? R.string.SubscribeRequests : R.string.MemberRequests));
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search);
        actionBarMenuItemAddItem.setIsSearchField$1();
        actionBarMenuItemAddItem.listener = new TopicsFragment.AnonymousClass3(this, 14);
        actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString(R.string.Search));
        actionBarMenuItemAddItem.setVisibility(8);
        if (anonymousClass1.rootLayout == null) {
            BaseFragment baseFragment = anonymousClass1.fragment;
            FrameLayout frameLayout = new FrameLayout(baseFragment.getParentActivity());
            anonymousClass1.rootLayout = frameLayout;
            frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, baseFragment.getResourceProvider()));
            FlickerLoadingView loadingView = anonymousClass1.getLoadingView();
            anonymousClass1.loadingView = loadingView;
            anonymousClass1.rootLayout.addView(loadingView, -1, -1);
            StickerEmptyView searchEmptyView = anonymousClass1.getSearchEmptyView();
            anonymousClass1.searchEmptyView = searchEmptyView;
            anonymousClass1.rootLayout.addView(searchEmptyView, -1, -1);
            StickerEmptyView emptyView = anonymousClass1.getEmptyView();
            anonymousClass1.emptyView = emptyView;
            anonymousClass1.rootLayout.addView(emptyView, LayoutHelper.createFrame(-1.0f, -1));
            baseFragment.getParentActivity();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
            RecyclerListView recyclerListView = new RecyclerListView(baseFragment.getParentActivity(), null);
            anonymousClass1.recyclerView = recyclerListView;
            recyclerListView.setAdapter(anonymousClass1.adapter);
            anonymousClass1.recyclerView.setSections();
            anonymousClass1.recyclerView.setLayoutManager(linearLayoutManager);
            anonymousClass1.recyclerView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(anonymousClass1, 9));
            anonymousClass1.recyclerView.setOnScrollListener(anonymousClass1.listScrollListener);
            anonymousClass1.recyclerView.setSelectorDrawableColor(Theme.getColor(Theme.key_listSelector, baseFragment.getResourceProvider()));
            anonymousClass1.rootLayout.addView(anonymousClass1.recyclerView, -1, -1);
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setDurations(350L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.delayAnimations = false;
            defaultItemAnimator.mSupportsChangeAnimations = false;
            anonymousClass1.recyclerView.setItemAnimator(defaultItemAnimator);
        }
        FrameLayout frameLayout2 = anonymousClass1.rootLayout;
        ActionBar actionBar2 = this.actionBar;
        RecyclerListView recyclerListView2 = anonymousClass1.recyclerView;
        actionBar2.getClass();
        actionBar2.setAdaptiveBackground(recyclerListView2, false, Theme.key_windowBackgroundGray, Theme.key_actionBarDefault);
        anonymousClass1.loadMembers();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        MemberRequestsDelegate.PreviewDialog previewDialog = this.delegate.previewDialog;
        if (previewDialog == null) {
            return true;
        }
        if (z) {
            previewDialog.runAnimation(false);
        }
        return false;
    }
}
