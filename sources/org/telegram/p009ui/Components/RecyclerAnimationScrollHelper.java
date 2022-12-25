package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessagesController;
import org.telegram.p009ui.Cells.ChatMessageCell;
import org.telegram.p009ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.tgnet.ConnectionsManager;

public class RecyclerAnimationScrollHelper {
    private AnimationCallback animationCallback;
    private ValueAnimator animator;
    private LinearLayoutManager layoutManager;
    private RecyclerListView recyclerView;
    private int scrollDirection;
    private ScrollListener scrollListener;
    public SparseArray<View> positionToOldView = new SparseArray<>();
    private HashMap<Long, View> oldStableIds = new HashMap<>();

    public static class AnimationCallback {
        public void ignoreView(View view, boolean z) {
        }

        public void onEndAnimation() {
            throw null;
        }

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
        RecyclerListView recyclerListView = this.recyclerView;
        if (recyclerListView.fastScrollAnimationRunning) {
            return;
        }
        if (recyclerListView.getItemAnimator() == null || !this.recyclerView.getItemAnimator().isRunning()) {
            if (!z2 || this.scrollDirection == -1) {
                this.layoutManager.scrollToPositionWithOffset(i, i2, z);
                return;
            }
            int childCount = this.recyclerView.getChildCount();
            if (childCount == 0 || !MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                this.layoutManager.scrollToPositionWithOffset(i, i2, z);
                return;
            }
            boolean z3 = this.scrollDirection == 0;
            this.recyclerView.setScrollEnabled(false);
            ArrayList arrayList = new ArrayList();
            this.positionToOldView.clear();
            RecyclerView.Adapter adapter = this.recyclerView.getAdapter();
            this.oldStableIds.clear();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.recyclerView.getChildAt(i3);
                arrayList.add(childAt);
                this.positionToOldView.put(this.layoutManager.getPosition(childAt), childAt);
                if (adapter != null && adapter.hasStableIds()) {
                    this.oldStableIds.put(Long.valueOf(((RecyclerView.LayoutParams) childAt.getLayoutParams()).mViewHolder.getItemId()), childAt);
                }
                if (childAt instanceof ChatMessageCell) {
                    ((ChatMessageCell) childAt).setAnimationRunning(true, true);
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
            this.recyclerView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC27071(adapter, arrayList, z3, animatableAdapter));
        }
    }

    public class View$OnLayoutChangeListenerC27071 implements View.OnLayoutChangeListener {
        final RecyclerView.Adapter val$adapter;
        final AnimatableAdapter val$finalAnimatableAdapter;
        final ArrayList val$oldViews;
        final boolean val$scrollDown;

        View$OnLayoutChangeListenerC27071(RecyclerView.Adapter adapter, ArrayList arrayList, boolean z, AnimatableAdapter animatableAdapter) {
            this.val$adapter = adapter;
            this.val$oldViews = arrayList;
            this.val$scrollDown = z;
            this.val$finalAnimatableAdapter = animatableAdapter;
        }

        @Override
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int height;
            long min;
            View view2;
            final ArrayList arrayList = new ArrayList();
            RecyclerAnimationScrollHelper.this.recyclerView.stopScroll();
            int childCount = RecyclerAnimationScrollHelper.this.recyclerView.getChildCount();
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            boolean z = false;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = RecyclerAnimationScrollHelper.this.recyclerView.getChildAt(i12);
                arrayList.add(childAt);
                if (childAt.getTop() < i9) {
                    i9 = childAt.getTop();
                }
                if (childAt.getBottom() > i10) {
                    i10 = childAt.getBottom();
                }
                if (childAt instanceof ChatMessageCell) {
                    ((ChatMessageCell) childAt).setAnimationRunning(true, false);
                }
                RecyclerView.Adapter adapter = this.val$adapter;
                if (adapter != null && adapter.hasStableIds()) {
                    long itemId = this.val$adapter.getItemId(RecyclerAnimationScrollHelper.this.recyclerView.getChildAdapterPosition(childAt));
                    if (RecyclerAnimationScrollHelper.this.oldStableIds.containsKey(Long.valueOf(itemId)) && (view2 = (View) RecyclerAnimationScrollHelper.this.oldStableIds.get(Long.valueOf(itemId))) != null) {
                        if (view2 instanceof ChatMessageCell) {
                            ((ChatMessageCell) view2).setAnimationRunning(false, false);
                        }
                        this.val$oldViews.remove(view2);
                        if (RecyclerAnimationScrollHelper.this.animationCallback != null) {
                            RecyclerAnimationScrollHelper.this.animationCallback.recycleView(view2);
                        }
                        int top = childAt.getTop() - view2.getTop();
                        if (top != 0) {
                            i11 = top;
                        }
                        z = true;
                    }
                }
            }
            RecyclerAnimationScrollHelper.this.oldStableIds.clear();
            Iterator it = this.val$oldViews.iterator();
            int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i14 = 0;
            while (it.hasNext()) {
                View view3 = (View) it.next();
                int bottom = view3.getBottom();
                int top2 = view3.getTop();
                if (bottom > i14) {
                    i14 = bottom;
                }
                if (top2 < i13) {
                    i13 = top2;
                }
                if (view3.getParent() == null) {
                    RecyclerAnimationScrollHelper.this.recyclerView.addView(view3);
                    RecyclerAnimationScrollHelper.this.layoutManager.ignoreView(view3);
                    if (RecyclerAnimationScrollHelper.this.animationCallback != null) {
                        RecyclerAnimationScrollHelper.this.animationCallback.ignoreView(view3, true);
                    }
                }
                if (view3 instanceof ChatMessageCell) {
                    ((ChatMessageCell) view3).setAnimationRunning(true, true);
                }
            }
            int i15 = i13 != Integer.MAX_VALUE ? i13 : 0;
            if (RecyclerAnimationScrollHelper.this.animationCallback != null) {
                RecyclerAnimationScrollHelper.this.animationCallback.onPreAnimation();
            }
            if (this.val$oldViews.isEmpty()) {
                height = Math.abs(i11);
            } else {
                if (!this.val$scrollDown) {
                    i14 = RecyclerAnimationScrollHelper.this.recyclerView.getHeight() - i15;
                }
                height = (this.val$scrollDown ? -i9 : i10 - RecyclerAnimationScrollHelper.this.recyclerView.getHeight()) + i14;
            }
            final int i16 = height;
            if (RecyclerAnimationScrollHelper.this.animator != null) {
                RecyclerAnimationScrollHelper.this.animator.removeAllListeners();
                RecyclerAnimationScrollHelper.this.animator.cancel();
            }
            RecyclerAnimationScrollHelper.this.animator = ValueAnimator.ofFloat(0.0f, 1.0f);
            ValueAnimator valueAnimator = RecyclerAnimationScrollHelper.this.animator;
            final ArrayList arrayList2 = this.val$oldViews;
            final boolean z2 = this.val$scrollDown;
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    RecyclerAnimationScrollHelper.View$OnLayoutChangeListenerC27071.this.lambda$onLayoutChange$0(arrayList2, z2, i16, arrayList, valueAnimator2);
                }
            });
            RecyclerAnimationScrollHelper.this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (RecyclerAnimationScrollHelper.this.animator == null) {
                        return;
                    }
                    RecyclerAnimationScrollHelper.this.recyclerView.fastScrollAnimationRunning = false;
                    Iterator it2 = View$OnLayoutChangeListenerC27071.this.val$oldViews.iterator();
                    while (it2.hasNext()) {
                        View view4 = (View) it2.next();
                        if (view4 instanceof ChatMessageCell) {
                            ((ChatMessageCell) view4).setAnimationRunning(false, true);
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
                    for (int i17 = 0; i17 < childCount2; i17++) {
                        View childAt2 = RecyclerAnimationScrollHelper.this.recyclerView.getChildAt(i17);
                        if (childAt2 instanceof ChatMessageCell) {
                            ((ChatMessageCell) childAt2).setAnimationRunning(false, false);
                        }
                        childAt2.setTranslationY(0.0f);
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        View view5 = (View) it3.next();
                        if (view5 instanceof ChatMessageCell) {
                            ((ChatMessageCell) view5).setAnimationRunning(false, false);
                        }
                        view5.setTranslationY(0.0f);
                    }
                    AnimatableAdapter animatableAdapter = View$OnLayoutChangeListenerC27071.this.val$finalAnimatableAdapter;
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
            RecyclerAnimationScrollHelper.this.recyclerView.removeOnLayoutChangeListener(this);
            if (z) {
                min = 600;
            } else {
                long measuredHeight = ((i16 / RecyclerAnimationScrollHelper.this.recyclerView.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight < 300) {
                    measuredHeight = 300;
                }
                min = Math.min(measuredHeight, 1300L);
            }
            RecyclerAnimationScrollHelper.this.animator.setDuration(min);
            RecyclerAnimationScrollHelper.this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            RecyclerAnimationScrollHelper.this.animator.start();
        }

        public void lambda$onLayoutChange$0(ArrayList arrayList, boolean z, int i, ArrayList arrayList2, ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) arrayList.get(i2);
                float y = view.getY();
                if (view.getY() + view.getMeasuredHeight() >= 0.0f && y <= RecyclerAnimationScrollHelper.this.recyclerView.getMeasuredHeight()) {
                    if (z) {
                        view.setTranslationY((-i) * floatValue);
                    } else {
                        view.setTranslationY(i * floatValue);
                    }
                }
            }
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                View view2 = (View) arrayList2.get(i3);
                if (z) {
                    view2.setTranslationY(i * (1.0f - floatValue));
                } else {
                    view2.setTranslationY((-i) * (1.0f - floatValue));
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
            if (childAt instanceof ChatMessageCell) {
                ((ChatMessageCell) childAt).setAnimationRunning(false, false);
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
        private ArrayList<Integer> rangeInserted = new ArrayList<>();
        private ArrayList<Integer> rangeRemoved = new ArrayList<>();
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
                return;
            }
            this.rangeInserted.add(Integer.valueOf(i));
            this.rangeInserted.add(1);
        }

        @Override
        public void notifyItemRangeInserted(int i, int i2) {
            if (!this.animationRunning) {
                super.notifyItemRangeInserted(i, i2);
                return;
            }
            this.rangeInserted.add(Integer.valueOf(i));
            this.rangeInserted.add(Integer.valueOf(i2));
        }

        @Override
        public void notifyItemRemoved(int i) {
            if (!this.animationRunning) {
                super.notifyItemRemoved(i);
                return;
            }
            this.rangeRemoved.add(Integer.valueOf(i));
            this.rangeRemoved.add(1);
        }

        @Override
        public void notifyItemRangeRemoved(int i, int i2) {
            if (!this.animationRunning) {
                super.notifyItemRangeRemoved(i, i2);
                return;
            }
            this.rangeRemoved.add(Integer.valueOf(i));
            this.rangeRemoved.add(Integer.valueOf(i2));
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
