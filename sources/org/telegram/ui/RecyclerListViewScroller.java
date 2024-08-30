package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RecyclerListView;

public class RecyclerListViewScroller {
    int lastScrolled;
    final RecyclerListView recyclerListView;
    ValueAnimator valueAnimator;

    public RecyclerListViewScroller(RecyclerListView recyclerListView) {
        this.recyclerListView = recyclerListView;
    }

    public void lambda$smoothScrollBy$0(int i, ValueAnimator valueAnimator) {
        int floatValue = (int) (i * ((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.recyclerListView.scrollBy(0, floatValue - this.lastScrolled);
        this.lastScrolled = floatValue;
    }

    public void cancel() {
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.valueAnimator.cancel();
            this.valueAnimator = null;
        }
    }

    public boolean isRunning() {
        return this.valueAnimator != null;
    }

    public void smoothScrollBy(int i) {
        smoothScrollBy(i, 200L, CubicBezierInterpolator.DEFAULT);
    }

    public void smoothScrollBy(final int i, long j, Interpolator interpolator) {
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.valueAnimator.cancel();
        }
        this.lastScrolled = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.valueAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                RecyclerListViewScroller.this.lambda$smoothScrollBy$0(i, valueAnimator2);
            }
        });
        this.valueAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                RecyclerListViewScroller recyclerListViewScroller = RecyclerListViewScroller.this;
                recyclerListViewScroller.recyclerListView.scrollBy(0, i - recyclerListViewScroller.lastScrolled);
                RecyclerListViewScroller.this.valueAnimator = null;
            }
        });
        this.valueAnimator.setDuration(j);
        this.valueAnimator.setInterpolator(interpolator);
        this.valueAnimator.start();
    }
}
