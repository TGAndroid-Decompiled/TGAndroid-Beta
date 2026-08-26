package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.NestedScrollingParent3;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.zxing.qrcode.decoder.Version;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.CachedMediaLayout;

public abstract class NestedSizeNotifierLayout extends SizeNotifierFrameLayout implements NestedScrollingParent3, View.OnLayoutChangeListener {
    public boolean attached;
    public BottomSheet.ContainerView bottomSheetContainerView;
    public ChildLayout childLayout;
    public int maxTop;
    public int maxTopPadding;
    public final Version.ECB nestedScrollingParentHelper;
    public View targetListView;

    public interface ChildLayout {
        void addOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener);

        int getMeasuredHeight();

        int getTop();

        void removeOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener);
    }

    public NestedSizeNotifierLayout(Context context) {
        super(context, null);
        this.nestedScrollingParentHelper = new Version.ECB();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        ChildLayout childLayout = this.childLayout;
        if (childLayout != null) {
            childLayout.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        ChildLayout childLayout = this.childLayout;
        if (childLayout != null) {
            childLayout.removeOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        updateMaxTop();
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        updateMaxTop();
    }

    @Override
    public void onNestedPreScroll(ViewGroup viewGroup, int i, int i2, int[] iArr, int i3) {
        ChildLayout childLayout;
        if (viewGroup != this.targetListView || (childLayout = this.childLayout) == null || ((CachedMediaLayout) childLayout).getListView() == null) {
            return;
        }
        int top = this.childLayout.getTop();
        if (i2 >= 0) {
            BottomSheet.ContainerView containerView = this.bottomSheetContainerView;
            if (containerView != null) {
                containerView.onNestedPreScroll(viewGroup, i, i2, iArr);
                return;
            }
            return;
        }
        if (top > this.maxTop) {
            if (this.bottomSheetContainerView == null || this.targetListView.canScrollVertically(i2)) {
                return;
            }
            this.bottomSheetContainerView.onNestedScroll(viewGroup, 0, 0, i, i2);
            return;
        }
        RecyclerListView listView = ((CachedMediaLayout) this.childLayout).getListView();
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) listView.getLayoutManager()).findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition != -1) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = listView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
            int top2 = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView.getTop() : -1;
            int paddingTop = listView.getPaddingTop();
            if (top2 == paddingTop && iFindFirstVisibleItemPosition == 0) {
                return;
            }
            iArr[1] = iFindFirstVisibleItemPosition != 0 ? i2 : Math.max(i2, top2 - paddingTop);
            listView.scrollBy(0, i2);
        }
    }

    @Override
    public void onNestedScroll(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
    }

    @Override
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.nestedScrollingParentHelper.count = i;
    }

    @Override
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return view != null && view.isAttachedToWindow() && i == 2;
    }

    @Override
    public void onStopNestedScroll(View view) {
    }

    public void setBottomSheetContainerView(BottomSheet.ContainerView containerView) {
        this.bottomSheetContainerView = containerView;
    }

    public void setChildLayout(ChildLayout childLayout) {
        setChildLayout(childLayout, 0);
    }

    public void setTargetListView(View view) {
        this.targetListView = view;
        updateMaxTop();
    }

    public final void updateMaxTop() {
        View view = this.targetListView;
        if (view == null || this.childLayout == null) {
            return;
        }
        if (this.maxTopPadding != 0) {
            this.maxTop = view.getPaddingTop() + this.maxTopPadding;
        } else {
            this.maxTop = (view.getMeasuredHeight() - this.targetListView.getPaddingBottom()) - this.childLayout.getMeasuredHeight();
        }
    }

    @Override
    public void onNestedScroll(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ChildLayout childLayout;
        if (viewGroup != this.targetListView || (childLayout = this.childLayout) == null || ((CachedMediaLayout) childLayout).getListView() == null) {
            return;
        }
        RecyclerListView listView = ((CachedMediaLayout) this.childLayout).getListView();
        if (this.childLayout.getTop() == this.maxTop) {
            iArr[1] = i4;
            listView.scrollBy(0, i4);
        }
    }

    @Override
    public void onStopNestedScroll(int i, View view) {
        this.nestedScrollingParentHelper.count = 0;
        BottomSheet.ContainerView containerView = this.bottomSheetContainerView;
        if (containerView != null) {
            containerView.onStopNestedScroll(view);
        }
    }

    public final void setChildLayout(ChildLayout childLayout, int i) {
        this.maxTopPadding = i;
        if (this.childLayout != childLayout) {
            this.childLayout = childLayout;
            if (this.attached && childLayout != null) {
                CachedMediaLayout cachedMediaLayout = (CachedMediaLayout) childLayout;
                if (cachedMediaLayout.getListView() != null) {
                    cachedMediaLayout.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        updateMaxTop();
    }
}
