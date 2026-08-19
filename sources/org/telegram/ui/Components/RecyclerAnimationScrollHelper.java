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

    public void scrollToPosition(int i, int i2, boolean z, boolean z2, boolean z3) {
        final RecyclerAnimationScrollHelper recyclerAnimationScrollHelper;
        final int i3;
        final int i4;
        final boolean z4;
        final boolean z5;
        long itemId;
        RecyclerListView recyclerListView = this.recyclerView;
        if (recyclerListView.fastScrollAnimationRunning) {
            return;
        }
        if (recyclerListView.getItemAnimator() == null) {
            recyclerAnimationScrollHelper = this;
            i3 = i;
            i4 = i2;
            z4 = z;
            z5 = z2;
        } else if (z3) {
            recyclerAnimationScrollHelper = this;
            i3 = i;
            i4 = i2;
            z4 = z;
            z5 = z2;
            if (this.recyclerView.getItemAnimator().isRunning(new RecyclerView.ItemAnimator.ItemAnimatorFinishedListener() {
                @Override
                public final void onAnimationsFinished() {
                    this.f$0.scrollToPosition(i3, i4, z4, z5, false);
                }
            })) {
                return;
            }
        } else {
            recyclerAnimationScrollHelper = this;
            i3 = i;
            i4 = i2;
            z4 = z;
            z5 = z2;
            if (recyclerAnimationScrollHelper.recyclerView.getItemAnimator().isRunning()) {
                return;
            }
        }
        if (!z5 || recyclerAnimationScrollHelper.scrollDirection == -1) {
            recyclerAnimationScrollHelper.layoutManager.scrollToPositionWithOffset(i3, i4, z4);
            return;
        }
        int childCount = recyclerAnimationScrollHelper.recyclerView.getChildCount();
        if (childCount == 0 || !MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            recyclerAnimationScrollHelper.layoutManager.scrollToPositionWithOffset(i3, i4, z4);
            return;
        }
        boolean z6 = recyclerAnimationScrollHelper.scrollDirection == 0;
        recyclerAnimationScrollHelper.recyclerView.setScrollEnabled(false);
        boolean z7 = z4;
        ArrayList arrayList = new ArrayList();
        recyclerAnimationScrollHelper.positionToOldView.clear();
        RecyclerView.Adapter adapter = recyclerAnimationScrollHelper.recyclerView.getAdapter();
        recyclerAnimationScrollHelper.oldStableIds.clear();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerAnimationScrollHelper.recyclerView.getChildAt(i5);
            arrayList.add(childAt);
            recyclerAnimationScrollHelper.positionToOldView.put(recyclerAnimationScrollHelper.layoutManager.getPosition(childAt), childAt);
            if (adapter != null && (adapter.hasStableIds() || recyclerAnimationScrollHelper.forceUseStableId)) {
                if (recyclerAnimationScrollHelper.forceUseStableId) {
                    int adapterPosition = ((RecyclerView.LayoutParams) childAt.getLayoutParams()).mViewHolder.getAdapterPosition();
                    if (adapterPosition >= 0) {
                        itemId = adapter.getItemId(adapterPosition);
                    }
                } else {
                    itemId = ((RecyclerView.LayoutParams) childAt.getLayoutParams()).mViewHolder.getItemId();
                }
                recyclerAnimationScrollHelper.oldStableIds.put(Long.valueOf(itemId), childAt);
                if (childAt instanceof IMessageCell) {
                    ((IMessageCell) childAt).setAnimationRunning(true, true);
                }
            } else if (childAt instanceof IMessageCell) {
                ((IMessageCell) childAt).setAnimationRunning(true, true);
            }
        }
        recyclerAnimationScrollHelper.recyclerView.prepareForFastScroll();
        AnimatableAdapter animatableAdapter = adapter instanceof AnimatableAdapter ? (AnimatableAdapter) adapter : null;
        recyclerAnimationScrollHelper.layoutManager.scrollToPositionWithOffset(i3, i4, z7);
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        recyclerAnimationScrollHelper.recyclerView.stopScroll();
        recyclerAnimationScrollHelper.recyclerView.setVerticalScrollBarEnabled(false);
        AnimationCallback animationCallback = recyclerAnimationScrollHelper.animationCallback;
        if (animationCallback != null) {
            animationCallback.onStartAnimation();
        }
        recyclerAnimationScrollHelper.recyclerView.fastScrollAnimationRunning = true;
        if (animatableAdapter != null) {
            animatableAdapter.onAnimationStart();
        }
        recyclerAnimationScrollHelper.recyclerView.addOnLayoutChangeListener(new AnonymousClass1(adapter, arrayList, z6, animatableAdapter));
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
            ArrayList arrayList2 = this.val$oldViews;
            int size = arrayList2.size();
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            int height2 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                View view3 = (View) obj;
                int bottom2 = view3.getBottom();
                int top3 = view3.getTop();
                if (bottom2 > height2) {
                    height2 = bottom2;
                }
                if (top3 < i12) {
                    i12 = top3;
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
            int i13 = i12 == Integer.MAX_VALUE ? 0 : i12;
            if (RecyclerAnimationScrollHelper.this.animationCallback != null) {
                RecyclerAnimationScrollHelper.this.animationCallback.onPreAnimation();
            }
            if (this.val$oldViews.isEmpty()) {
                height = Math.abs(i9);
            } else {
                if (!this.val$scrollDown) {
                    height2 = RecyclerAnimationScrollHelper.this.recyclerView.getHeight() - i13;
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
            final ArrayList arrayList3 = this.val$oldViews;
            final boolean z2 = this.val$scrollDown;
            final int i14 = height;
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    RecyclerAnimationScrollHelper.AnonymousClass1.$r8$lambda$rCqVsTUDvLxLqP9sttH8K9YxE3U(this.f$0, arrayList3, z2, i14, paddingBottom, arrayList, valueAnimator2);
                }
            });
            RecyclerAnimationScrollHelper.this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (RecyclerAnimationScrollHelper.this.animator == null) {
                        return;
                    }
                    RecyclerAnimationScrollHelper.this.recyclerView.fastScrollAnimationRunning = false;
                    ArrayList arrayList4 = AnonymousClass1.this.val$oldViews;
                    int size2 = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj2 = arrayList4.get(i15);
                        i15++;
                        View view4 = (View) obj2;
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
                    for (int i16 = 0; i16 < childCount2; i16++) {
                        View childAt2 = RecyclerAnimationScrollHelper.this.recyclerView.getChildAt(i16);
                        if (childAt2 instanceof IMessageCell) {
                            ((IMessageCell) childAt2).setAnimationRunning(false, false);
                        }
                        childAt2.setTranslationY(0.0f);
                    }
                    ArrayList arrayList5 = arrayList;
                    int size3 = arrayList5.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj3 = arrayList5.get(i17);
                        i17++;
                        View view5 = (View) obj3;
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
                    long measuredHeight = (long) (((i14 / recyclerAnimationScrollHelper.recyclerView.getMeasuredHeight()) + 1.0f) * 200.0f);
                    jMin = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
                }
                RecyclerAnimationScrollHelper.this.animator.setDuration(jMin);
                RecyclerAnimationScrollHelper.this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            } else if (z) {
                recyclerAnimationScrollHelper.animator.setDuration(150L);
                RecyclerAnimationScrollHelper.this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            } else {
                long measuredHeight2 = (long) (((i14 / recyclerAnimationScrollHelper.recyclerView.getMeasuredHeight()) + 1.0f) * 200.0f);
                RecyclerAnimationScrollHelper.this.animator.setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
                RecyclerAnimationScrollHelper.this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            }
            RecyclerAnimationScrollHelper.this.animator.start();
        }

        public static void $r8$lambda$rCqVsTUDvLxLqP9sttH8K9YxE3U(AnonymousClass1 anonymousClass1, ArrayList arrayList, boolean z, int i, int i2, ArrayList arrayList2, ValueAnimator valueAnimator) {
            anonymousClass1.getClass();
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
