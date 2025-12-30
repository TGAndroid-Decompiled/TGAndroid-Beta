package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;

public class RecyclerItemsEnterAnimator {
    boolean alwaysCheckItemsAlpha;
    boolean invalidateAlpha;
    private final RecyclerListView listView;
    private final SparseArray listAlphaItems = new SparseArray();
    HashSet ignoreView = new HashSet();
    public boolean animateAlphaProgressView = true;
    ArrayList currentAnimations = new ArrayList();
    ArrayList preDrawListeners = new ArrayList();

    public RecyclerItemsEnterAnimator(RecyclerListView recyclerListView, boolean z) {
        this.listView = recyclerListView;
        this.alwaysCheckItemsAlpha = z;
        recyclerListView.setItemsEnterAnimator(this);
    }

    public void dispatchDraw() {
        if (this.invalidateAlpha || this.alwaysCheckItemsAlpha) {
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                int childAdapterPosition = this.listView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0 && !this.ignoreView.contains(childAt)) {
                    Float f = (Float) this.listAlphaItems.get(childAdapterPosition, null);
                    if (f == null) {
                        childAt.setAlpha(1.0f);
                    } else {
                        childAt.setAlpha(f.floatValue());
                    }
                }
            }
            this.invalidateAlpha = false;
        }
    }

    public void showItemsAnimated(int i) {
        Animator animatorOfFloat;
        final View progressView = getProgressView();
        final RecyclerView.LayoutManager layoutManager = this.listView.getLayoutManager();
        if (progressView != null && layoutManager != null) {
            this.listView.removeView(progressView);
            this.ignoreView.add(progressView);
            this.listView.addView(progressView);
            layoutManager.ignoreView(progressView);
            if (this.animateAlphaProgressView) {
                animatorOfFloat = ObjectAnimator.ofFloat(progressView, (Property<View, Float>) View.ALPHA, progressView.getAlpha(), 0.0f);
            } else {
                animatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            animatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    progressView.setAlpha(1.0f);
                    layoutManager.stopIgnoringView(progressView);
                    RecyclerItemsEnterAnimator.this.ignoreView.remove(progressView);
                    RecyclerItemsEnterAnimator.this.listView.removeView(progressView);
                }
            });
            animatorOfFloat.start();
            i--;
        }
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(progressView, i);
        this.preDrawListeners.add(anonymousClass2);
        this.listView.getViewTreeObserver().addOnPreDrawListener(anonymousClass2);
    }

    class AnonymousClass2 implements ViewTreeObserver.OnPreDrawListener {
        final int val$finalFrom;
        final View val$finalProgressView;

        AnonymousClass2(View view, int i) {
            this.val$finalProgressView = view;
            this.val$finalFrom = i;
        }

        @Override
        public boolean onPreDraw() {
            RecyclerItemsEnterAnimator.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
            RecyclerItemsEnterAnimator.this.preDrawListeners.remove(this);
            int childCount = RecyclerItemsEnterAnimator.this.listView.getChildCount();
            final AnimatorSet animatorSet = new AnimatorSet();
            for (int i = 0; i < childCount; i++) {
                View childAt = RecyclerItemsEnterAnimator.this.listView.getChildAt(i);
                final int childAdapterPosition = RecyclerItemsEnterAnimator.this.listView.getChildAdapterPosition(childAt);
                if (childAt != this.val$finalProgressView && childAdapterPosition >= this.val$finalFrom - 1 && RecyclerItemsEnterAnimator.this.listAlphaItems.get(childAdapterPosition, null) == null) {
                    RecyclerItemsEnterAnimator.this.listAlphaItems.put(childAdapterPosition, Float.valueOf(0.0f));
                    RecyclerItemsEnterAnimator recyclerItemsEnterAnimator = RecyclerItemsEnterAnimator.this;
                    recyclerItemsEnterAnimator.invalidateAlpha = true;
                    recyclerItemsEnterAnimator.listView.invalidate();
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            this.f$0.lambda$onPreDraw$0(childAdapterPosition, valueAnimator);
                        }
                    });
                    valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            RecyclerItemsEnterAnimator.this.listAlphaItems.remove(childAdapterPosition);
                            RecyclerItemsEnterAnimator recyclerItemsEnterAnimator2 = RecyclerItemsEnterAnimator.this;
                            recyclerItemsEnterAnimator2.invalidateAlpha = true;
                            recyclerItemsEnterAnimator2.listView.invalidate();
                        }
                    });
                    valueAnimatorOfFloat.setStartDelay((int) ((Math.min(RecyclerItemsEnterAnimator.this.listView.getMeasuredHeight(), Math.max(0, childAt.getTop())) / RecyclerItemsEnterAnimator.this.listView.getMeasuredHeight()) * 100.0f));
                    valueAnimatorOfFloat.setDuration(200L);
                    animatorSet.playTogether(valueAnimatorOfFloat);
                }
            }
            RecyclerItemsEnterAnimator.this.currentAnimations.add(animatorSet);
            animatorSet.start();
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    RecyclerItemsEnterAnimator.this.currentAnimations.remove(animatorSet);
                    if (RecyclerItemsEnterAnimator.this.currentAnimations.isEmpty()) {
                        RecyclerItemsEnterAnimator.this.listAlphaItems.clear();
                        RecyclerItemsEnterAnimator recyclerItemsEnterAnimator2 = RecyclerItemsEnterAnimator.this;
                        recyclerItemsEnterAnimator2.invalidateAlpha = true;
                        recyclerItemsEnterAnimator2.listView.invalidate();
                    }
                }
            });
            return false;
        }

        public void lambda$onPreDraw$0(int i, ValueAnimator valueAnimator) {
            RecyclerItemsEnterAnimator.this.listAlphaItems.put(i, (Float) valueAnimator.getAnimatedValue());
            RecyclerItemsEnterAnimator recyclerItemsEnterAnimator = RecyclerItemsEnterAnimator.this;
            recyclerItemsEnterAnimator.invalidateAlpha = true;
            recyclerItemsEnterAnimator.listView.invalidate();
        }
    }

    public View getProgressView() {
        int childCount = this.listView.getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if (this.listView.getChildAdapterPosition(childAt) >= 0 && (childAt instanceof FlickerLoadingView)) {
                view = childAt;
            }
        }
        return view;
    }

    public void onDetached() {
        cancel();
    }

    public void cancel() {
        if (!this.currentAnimations.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.currentAnimations);
            for (int i = 0; i < arrayList.size(); i++) {
                ((AnimatorSet) arrayList.get(i)).end();
                ((AnimatorSet) arrayList.get(i)).cancel();
            }
        }
        this.currentAnimations.clear();
        for (int i2 = 0; i2 < this.preDrawListeners.size(); i2++) {
            this.listView.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) this.preDrawListeners.get(i2));
        }
        this.preDrawListeners.clear();
        this.listAlphaItems.clear();
        this.listView.invalidate();
        this.invalidateAlpha = true;
    }
}
