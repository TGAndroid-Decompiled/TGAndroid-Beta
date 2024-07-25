package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.BottomSheet;
public class NestedSizeNotifierLayout extends SizeNotifierFrameLayout implements NestedScrollingParent3, View.OnLayoutChangeListener {
    boolean attached;
    BottomSheet.ContainerView bottomSheetContainerView;
    ChildLayout childLayout;
    int maxTop;
    private NestedScrollingParentHelper nestedScrollingParentHelper;
    View targetListView;

    public interface ChildLayout {
        void addOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener);

        RecyclerListView getListView();

        int getMeasuredHeight();

        int getTop();

        boolean isAttached();

        void removeOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener);
    }

    @Override
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override
    public void onStopNestedScroll(View view) {
    }

    public NestedSizeNotifierLayout(Context context) {
        super(context);
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
    }

    private boolean childAttached() {
        ChildLayout childLayout = this.childLayout;
        return (childLayout == null || !childLayout.isAttached() || this.childLayout.getListView() == null) ? false : true;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        updateMaxTop();
    }

    private void updateMaxTop() {
        View view = this.targetListView;
        if (view == null || this.childLayout == null) {
            return;
        }
        this.maxTop = (view.getMeasuredHeight() - this.targetListView.getPaddingBottom()) - this.childLayout.getMeasuredHeight();
    }

    @Override
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (view == this.targetListView && childAttached()) {
            RecyclerListView listView = this.childLayout.getListView();
            if (this.childLayout.getTop() == this.maxTop) {
                iArr[1] = i4;
                listView.scrollBy(0, i4);
            }
        }
    }

    @Override
    public boolean onNestedPreFling(View view, float f, float f2) {
        return super.onNestedPreFling(view, f, f2);
    }

    @Override
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (view == this.targetListView && childAttached()) {
            int top = this.childLayout.getTop();
            if (i2 < 0) {
                if (top <= this.maxTop) {
                    RecyclerListView listView = this.childLayout.getListView();
                    int findFirstVisibleItemPosition = ((LinearLayoutManager) listView.getLayoutManager()).findFirstVisibleItemPosition();
                    if (findFirstVisibleItemPosition != -1) {
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition = listView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                        int top2 = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.itemView.getTop() : -1;
                        int paddingTop = listView.getPaddingTop();
                        if (top2 == paddingTop && findFirstVisibleItemPosition == 0) {
                            return;
                        }
                        iArr[1] = findFirstVisibleItemPosition != 0 ? i2 : Math.max(i2, top2 - paddingTop);
                        listView.scrollBy(0, i2);
                        return;
                    }
                    return;
                } else if (this.bottomSheetContainerView == null || this.targetListView.canScrollVertically(i2)) {
                    return;
                } else {
                    this.bottomSheetContainerView.onNestedScroll(view, 0, 0, i, i2);
                    return;
                }
            }
            BottomSheet.ContainerView containerView = this.bottomSheetContainerView;
            if (containerView != null) {
                containerView.onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    @Override
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return view != null && view.isAttachedToWindow() && i == 2;
    }

    @Override
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i);
    }

    @Override
    public void onStopNestedScroll(View view, int i) {
        this.nestedScrollingParentHelper.onStopNestedScroll(view);
        BottomSheet.ContainerView containerView = this.bottomSheetContainerView;
        if (containerView != null) {
            containerView.onStopNestedScroll(view);
        }
    }

    public void setTargetListView(View view) {
        this.targetListView = view;
        updateMaxTop();
    }

    public void setChildLayout(ChildLayout childLayout) {
        if (this.childLayout != childLayout) {
            this.childLayout = childLayout;
            if (this.attached && childLayout != null && childLayout.getListView() != null) {
                childLayout.getListView().addOnLayoutChangeListener(this);
            }
            updateMaxTop();
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        ChildLayout childLayout = this.childLayout;
        if (childLayout != null) {
            childLayout.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        ChildLayout childLayout = this.childLayout;
        if (childLayout != null) {
            childLayout.removeOnLayoutChangeListener(this);
        }
    }

    public boolean isPinnedToTop() {
        ChildLayout childLayout = this.childLayout;
        return childLayout != null && childLayout.getTop() == this.maxTop;
    }

    @Override
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        updateMaxTop();
    }

    public void setBottomSheetContainerView(BottomSheet.ContainerView containerView) {
        this.bottomSheetContainerView = containerView;
    }
}
