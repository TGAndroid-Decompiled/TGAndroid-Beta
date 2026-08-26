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

    public void lambda$smoothScrollBy$0(int[] iArr, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = iIntValue - this.lastScrolled;
        this.recyclerListView.scrollBy(0, i);
        iArr[0] = iArr[0] + i;
        this.lastScrolled = iIntValue;
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
        final int[] iArr = new int[1];
        this.lastScrolled = 0;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i);
        this.valueAnimator = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new QrActivity$$ExternalSyntheticLambda2(5, this, iArr));
        this.valueAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                RecyclerListViewScroller.this.recyclerListView.scrollBy(0, i - iArr[0]);
                RecyclerListViewScroller.this.valueAnimator = null;
            }
        });
        this.valueAnimator.setDuration(j);
        this.valueAnimator.setInterpolator(interpolator);
        this.valueAnimator.start();
    }
}
