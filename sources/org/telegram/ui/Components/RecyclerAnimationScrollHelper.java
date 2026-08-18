package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.IMessageCell;

public class RecyclerAnimationScrollHelper {
    private AnimationCallback animationCallback;
    private ValueAnimator animator;
    public boolean forceUseStableId;
    public boolean isDialogs;
    private LinearLayoutManager layoutManager;
    private RecyclerListView recyclerView;
    private int scrollDirection;
    private ScrollListener scrollListener;
    public SparseArray positionToOldView = new SparseArray();
    private HashMap oldStableIds = new HashMap();

    public static class AnimationCallback {
        public void ignoreView(View view, boolean z) {
        }

        public abstract void onEndAnimation();

        public void onPreAnimation() {
        }

        public void onStartAnimation() {
        }

        public void recycleView(View view) {
        }
    }

    public interface ScrollListener {
        void onScroll();
    }

    public RecyclerAnimationScrollHelper(RecyclerListView recyclerListView, LinearLayoutManager linearLayoutManager) {
        this.recyclerView = recyclerListView;
        this.layoutManager = linearLayoutManager;
    }

    public void scrollToPosition(int i, int i2, boolean z, boolean z2) {
        scrollToPosition(i, i2, z, z2, false);
    }

    public void scrollToPosition(final int i, final int i2, final boolean z, final boolean z2, boolean z3) {
        long itemId;
        RecyclerListView recyclerListView = this.recyclerView;
        if (recyclerListView.fastScrollAnimationRunning) {
            return;
        }
        if (recyclerListView.getItemAnimator() != null) {
            if (z3) {
                if (this.recyclerView.getItemAnimator().isRunning(new RecyclerView.ItemAnimator.ItemAnimatorFinishedListener() {
                    @Override
                    public final void onAnimationsFinished() {
                        this.f$0.lambda$scrollToPosition$0(i, i2, z, z2);
                    }
                })) {
                    return;
                }
            } else if (this.recyclerView.getItemAnimator().isRunning()) {
                return;
            }
        }
        if (!z2 || this.scrollDirection == -1) {
            this.layoutManager.scrollToPositionWithOffset(i, i2, z);
            return;
        }
        int childCount = this.recyclerView.getChildCount();
        if (childCount == 0 || !MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.layoutManager.scrollToPositionWithOffset(i, i2, z);
            return;
        }
        boolean z4 = this.scrollDirection == 0;
        this.recyclerView.setScrollEnabled(false);
        ArrayList arrayList = new ArrayList();
        this.positionToOldView.clear();
        RecyclerView.Adapter adapter = this.recyclerView.getAdapter();
        this.oldStableIds.clear();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.recyclerView.getChildAt(i3);
            arrayList.add(childAt);
            this.positionToOldView.put(this.layoutManager.getPosition(childAt), childAt);
            if (adapter != null && (adapter.hasStableIds() || this.forceUseStableId)) {
                if (this.forceUseStableId) {
                    int adapterPosition = ((RecyclerView.LayoutParams) childAt.getLayoutParams()).mViewHolder.getAdapterPosition();
                    if (adapterPosition >= 0) {
                        itemId = adapter.getItemId(adapterPosition);
                    }
                } else {
                    itemId = ((RecyclerView.LayoutParams) childAt.getLayoutParams()).mViewHolder.getItemId();
                }
                this.oldStableIds.put(Long.valueOf(itemId), childAt);
                if (childAt instanceof IMessageCell) {
                    ((IMessageCell) childAt).setAnimationRunning(true, true);
                }
            } else if (childAt instanceof IMessageCell) {
                ((IMessageCell) childAt).setAnimationRunning(true, true);
            }
        }
        this.recyclerView.prepareForFastScroll();
        AnimatableAdapter animatableAdapter = adapter instanceof AnimatableAdapter ? (AnimatableAdapter) adapter : null;
        this.layoutManager.scrollToPositionWithOffset(i, i2, z);
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        this.recyclerView.stopScroll();
        this.recyclerView.setVerticalScrollBarEnabled(false);
        AnimationCallback animationCallback = this.animationCallback;
        if (animationCallback != null) {
            animationCallback.onStartAnimation();
        }
        this.recyclerView.fastScrollAnimationRunning = true;
        if (animatableAdapter != null) {
            animatableAdapter.onAnimationStart();
        }
        this.recyclerView.addOnLayoutChangeListener(new AnonymousClass1(adapter, arrayList, z4, animatableAdapter));
    }

    public void lambda$scrollToPosition$0(int i, int i2, boolean z, boolean z2) {
        scrollToPosition(i, i2, z, z2, false);
    }

    class AnonymousClass1 implements View.OnLayoutChangeListener {
        final RecyclerView.Adapter val$adapter;
        final AnimatableAdapter val$finalAnimatableAdapter;
        final ArrayList val$oldViews;
        final boolean val$scrollDown;

        AnonymousClass1(RecyclerView.Adapter adapter, ArrayList arrayList, boolean z, AnimatableAdapter animatableAdapter) {
            this.val$adapter = adapter;
            this.val$oldViews = arrayList;
            this.val$scrollDown = z;
            this.val$finalAnimatableAdapter = animatableAdapter;
        }

        @Override
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int height;
            long jMin;
            View view2;
            RecyclerAnimationScrollHelper.this.recyclerView.removeOnLayoutChangeListener(this);
            final ArrayList arrayList = new ArrayList();
            RecyclerAnimationScrollHelper.this.recyclerView.stopScroll();
            int childCount = RecyclerAnimationScrollHelper.this.recyclerView.getChildCount();
            int top = 0;
            int bottom = 0;
            int i9 = 0;
            boolean z = false;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = RecyclerAnimationScrollHelper.this.recyclerView.getChildAt(i10);
                arrayList.add(childAt);
                if (childAt.getTop() < top) {
                    top = childAt.getTop();
                }
                if (childAt.getBottom() > bottom) {
                    bottom = childAt.getBottom();
                }
                if (childAt instanceof IMessageCell) {
                    ((IMessageCell) childAt).setAnimationRunning(true, false);
                }
                RecyclerView.Adapter adapter = this.val$adapter;
                if (adapter != null && (adapter.hasStableIds() || RecyclerAnimationScrollHelper.this.forceUseStableId)) {
                    long itemId = this.val$adapter.getItemId(RecyclerAnimationScrollHelper.this.recyclerView.getChildAdapterPosition(childAt));
                    if (RecyclerAnimationScrollHelper.this.oldStableIds.containsKey(Long.valueOf(itemId)) && (view2 = (View) RecyclerAnimationScrollHelper.this.oldStableIds.get(Long.valueOf(itemId))) != 0) {
                        if (view2 instanceof IMessageCell) {
                            ((IMessageCell) view2).setAnimationRunning(false, false);
                        }
                        this.val$oldViews.remove(view2);
                        if (RecyclerAnimationScrollHelper.this.animationCallback != null) {
                            RecyclerAnimationScrollHelper.this.animationCallback.recycleView(view2);
                        }
                        int top2 = childAt.getTop() - view2.getTop();
                        if (top2 != 0) {
                            i9 = top2;
                        }
                        z = true;
                    }
                }
            }
            RecyclerAnimationScrollHelper.this.oldStableIds.clear();
            int i11 = Integer.MAX_VALUE;
            int height2 = 0;
            for (View view3 : this.val$oldViews) {
                int bottom2 = view3.getBottom();
                int top3 = view3.getTop();
                if (bottom2 > height2) {
                    height2 = bottom2;
                }
                if (top3 < i11) {
                    i11 = top3;
                }
                if (view3.getParent() == null) {
                    RecyclerAnimationScrollHelper.this.recyclerView.addView(view3);
                    RecyclerAnimationScrollHelper.this.layoutManager.ignoreView(view3);
                    if (RecyclerAnimationScrollHelper.this.animationCallback != null) {
                        RecyclerAnimationScrollHelper.this.animationCallback.ignoreView(view3, true);
                    }
                }
                if (view3 instanceof IMessageCell) {
                    ((IMessageCell) view3).setAnimationRunning(true, true);
                }
            }
            int i12 = i11 != Integer.MAX_VALUE ? i11 : 0;
            if (RecyclerAnimationScrollHelper.this.animationCallback != null) {
                RecyclerAnimationScrollHelper.this.animationCallback.onPreAnimation();
            }
            if (this.val$oldViews.isEmpty()) {
                height = Math.abs(i9);
            } else {
                if (!this.val$scrollDown) {
                    height2 = RecyclerAnimationScrollHelper.this.recyclerView.getHeight() - i12;
                }
                height = (this.val$scrollDown ? -top : bottom - RecyclerAnimationScrollHelper.this.recyclerView.getHeight()) + height2;
            }
            final int paddingBottom = RecyclerAnimationScrollHelper.this.recyclerView.getPaddingBottom();
            if (RecyclerAnimationScrollHelper.this.animator != null) {
                RecyclerAnimationScrollHelper.this.animator.removeAllListeners();
                RecyclerAnimationScrollHelper.this.animator.cancel();
            }
            RecyclerAnimationScrollHelper.this.animator = ValueAnimator.ofFloat(0.0f, 1.0f);
            ValueAnimator valueAnimator = RecyclerAnimationScrollHelper.this.animator;
            final ArrayList arrayList2 = this.val$oldViews;
            final boolean z2 = this.val$scrollDown;
            final int i13 = height;
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$onLayoutChange$0(arrayList2, z2, i13, paddingBottom, arrayList, valueAnimator2);
                }
            });
            RecyclerAnimationScrollHelper.this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (RecyclerAnimationScrollHelper.this.animator == null) {
                        return;
                    }
                    RecyclerAnimationScrollHelper.this.recyclerView.fastScrollAnimationRunning = false;
                    for (View view4 : AnonymousClass1.this.val$oldViews) {
                        if (view4 instanceof IMessageCell) {
                            ((IMessageCell) view4).setAnimationRunning(false, true);
                        }
                        view4.setTranslationY(0.0f);
                        RecyclerAnimationScrollHelper.this.layoutManager.stopIgnoringView(view4);
                        RecyclerAnimationScrollHelper.this.recyclerView.removeView(view4);
                        if (RecyclerAnimationScrollHelper.this.animationCallback != null) {
                            RecyclerAnimationScrollHelper.this.animationCallback.ignoreView(view4, false);
                            RecyclerAnimationScrollHelper.this.animationCallback.recycleView(view4);
                        }
                    }
                    RecyclerAnimationScrollHelper.this.recyclerView.setScrollEnabled(true);
                    RecyclerAnimationScrollHelper.this.recyclerView.setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (RecyclerAnimationScrollHelper.this.recyclerView.mChildHelper.getChildCount() == RecyclerAnimationScrollHelper.this.recyclerView.getChildCount()) {
                            if (RecyclerAnimationScrollHelper.this.recyclerView.mChildHelper.getHiddenChildCount() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount2 = RecyclerAnimationScrollHelper.this.recyclerView.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        View childAt2 = RecyclerAnimationScrollHelper.this.recyclerView.getChildAt(i14);
                        if (childAt2 instanceof IMessageCell) {
                            ((IMessageCell) childAt2).setAnimationRunning(false, false);
                        }
                        childAt2.setTranslationY(0.0f);
                    }
                    for (View view5 : arrayList) {
                        if (view5 instanceof IMessageCell) {
                            ((IMessageCell) view5).setAnimationRunning(false, false);
                        }
                        view5.setTranslationY(0.0f);
                    }
                    AnimatableAdapter animatableAdapter = AnonymousClass1.this.val$finalAnimatableAdapter;
                    if (animatableAdapter != null) {
                        animatableAdapter.onAnimationEnd();
                    }
                    if (RecyclerAnimationScrollHelper.this.animationCallback != null) {
                        RecyclerAnimationScrollHelper.this.animationCallback.onEndAnimation();
                    }
                    RecyclerAnimationScrollHelper.this.positionToOldView.clear();
                    RecyclerAnimationScrollHelper.this.animator = null;
                }
            });
            RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = RecyclerAnimationScrollHelper.this;
            if (!recyclerAnimationScrollHelper.isDialogs) {
                if (z) {
                    jMin = 600;
                } else {
                    long measuredHeight = (long) (((height / recyclerAnimationScrollHelper.recyclerView.getMeasuredHeight()) + 1.0f) * 200.0f);
                    jMin = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
                }
                RecyclerAnimationScrollHelper.this.animator.setDuration(jMin);
                RecyclerAnimationScrollHelper.this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            } else if (z) {
                recyclerAnimationScrollHelper.animator.setDuration(150L);
                RecyclerAnimationScrollHelper.this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            } else {
                long measuredHeight2 = (long) (((height / recyclerAnimationScrollHelper.recyclerView.getMeasuredHeight()) + 1.0f) * 200.0f);
                RecyclerAnimationScrollHelper.this.animator.setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
                RecyclerAnimationScrollHelper.this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            }
            RecyclerAnimationScrollHelper.this.animator.start();
        }

        public void lambda$onLayoutChange$0(ArrayList arrayList, boolean z, int i, int i2, ArrayList arrayList2, ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = (View) arrayList.get(i3);
                float y = view.getY();
                if (view.getY() + view.getMeasuredHeight() >= 0.0f && y <= RecyclerAnimationScrollHelper.this.recyclerView.getMeasuredHeight()) {
                    if (z) {
                        view.setTranslationY((-i) * fFloatValue);
                    } else {
                        view.setTranslationY(i * fFloatValue);
                    }
                }
            }
            int paddingBottom = i2 - RecyclerAnimationScrollHelper.this.recyclerView.getPaddingBottom();
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                View view2 = (View) arrayList2.get(i4);
                if (z) {
                    view2.setTranslationY((i * (1.0f - fFloatValue)) + paddingBottom);
                } else {
                    view2.setTranslationY((-i) * (1.0f - fFloatValue));
                }
            }
            RecyclerAnimationScrollHelper.this.recyclerView.invalidate();
            if (RecyclerAnimationScrollHelper.this.scrollListener != null) {
                RecyclerAnimationScrollHelper.this.scrollListener.onScroll();
            }
        }
    }

    public void cancel() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        clear();
    }

    private void clear() {
        this.recyclerView.setVerticalScrollBarEnabled(true);
        RecyclerListView recyclerListView = this.recyclerView;
        recyclerListView.fastScrollAnimationRunning = false;
        RecyclerView.Adapter adapter = recyclerListView.getAdapter();
        if (adapter instanceof AnimatableAdapter) {
            ((AnimatableAdapter) adapter).onAnimationEnd();
        }
        this.animator = null;
        int childCount = this.recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.recyclerView.getChildAt(i);
            childAt.setTranslationY(0.0f);
            if (childAt instanceof IMessageCell) {
                ((IMessageCell) childAt).setAnimationRunning(false, false);
            }
        }
    }

    public void setScrollDirection(int i) {
        this.scrollDirection = i;
    }

    public void setScrollListener(ScrollListener scrollListener) {
        this.scrollListener = scrollListener;
    }

    public void setAnimationCallback(AnimationCallback animationCallback) {
        this.animationCallback = animationCallback;
    }

    public static abstract class AnimatableAdapter extends RecyclerListView.SelectionAdapter {
        public boolean animationRunning;
        private ArrayList rangeInserted = new ArrayList();
        private ArrayList rangeRemoved = new ArrayList();
        private boolean shouldNotifyDataSetChanged;

        @Override
        public void notifyDataSetChanged() {
            if (!this.animationRunning) {
                super.notifyDataSetChanged();
            } else {
                this.shouldNotifyDataSetChanged = true;
            }
        }

        @Override
        public void notifyItemInserted(int i) {
            if (!this.animationRunning) {
                super.notifyItemInserted(i);
            } else {
                this.rangeInserted.add(Integer.valueOf(i));
                this.rangeInserted.add(1);
            }
        }

        @Override
        public void notifyItemRangeInserted(int i, int i2) {
            if (!this.animationRunning) {
                super.notifyItemRangeInserted(i, i2);
            } else {
                this.rangeInserted.add(Integer.valueOf(i));
                this.rangeInserted.add(Integer.valueOf(i2));
            }
        }

        @Override
        public void notifyItemRemoved(int i) {
            if (!this.animationRunning) {
                super.notifyItemRemoved(i);
            } else {
                this.rangeRemoved.add(Integer.valueOf(i));
                this.rangeRemoved.add(1);
            }
        }

        @Override
        public void notifyItemRangeRemoved(int i, int i2) {
            if (!this.animationRunning) {
                super.notifyItemRangeRemoved(i, i2);
            } else {
                this.rangeRemoved.add(Integer.valueOf(i));
                this.rangeRemoved.add(Integer.valueOf(i2));
            }
        }

        @Override
        public void notifyItemChanged(int i) {
            if (this.animationRunning) {
                return;
            }
            super.notifyItemChanged(i);
        }

        @Override
        public void notifyItemRangeChanged(int i, int i2) {
            if (this.animationRunning) {
                return;
            }
            super.notifyItemRangeChanged(i, i2);
        }

        public void onAnimationStart() {
            this.animationRunning = true;
            this.shouldNotifyDataSetChanged = false;
            this.rangeInserted.clear();
            this.rangeRemoved.clear();
        }

        public void onAnimationEnd() {
            this.animationRunning = false;
            if (!this.shouldNotifyDataSetChanged && this.rangeInserted.isEmpty() && this.rangeRemoved.isEmpty()) {
                return;
            }
            notifyDataSetChanged();
        }
    }
}
