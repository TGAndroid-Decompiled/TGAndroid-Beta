package org.telegram.ui.iv;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.CubicBezierInterpolator;

class RichBlockInset {
    private ValueAnimator animator;
    private long boundRowId = Long.MIN_VALUE;
    private int currentPx = -1;

    interface Applier {
        void apply(int i);
    }

    RichBlockInset() {
    }

    void apply(BlockRow blockRow, Applier applier) {
        apply(blockRow, applier, true);
    }

    void apply(BlockRow blockRow, final Applier applier, boolean z) {
        int i;
        int iInsetFor = RichBlockChrome.insetFor(blockRow);
        long j = blockRow != null ? blockRow.id : Long.MIN_VALUE;
        boolean z2 = j == this.boundRowId && this.currentPx >= 0;
        this.boundRowId = j;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.animator = null;
        }
        if (z && z2 && (i = this.currentPx) != iInsetFor) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, iInsetFor);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    RichBlockInset.m4920$r8$lambda$KfrOuEFUlBLg4raSGcYPQEdYY(this.f$0, applier, valueAnimator2);
                }
            });
            valueAnimatorOfInt.setInterpolator(CubicBezierInterpolator.DEFAULT);
            valueAnimatorOfInt.setDuration(200L);
            this.animator = valueAnimatorOfInt;
            valueAnimatorOfInt.start();
            return;
        }
        this.currentPx = iInsetFor;
        applier.apply(iInsetFor);
    }

    public static void m4920$r8$lambda$KfrOuEFUlBLg4raSGcYPQEdYY(RichBlockInset richBlockInset, Applier applier, ValueAnimator valueAnimator) {
        richBlockInset.getClass();
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        richBlockInset.currentPx = iIntValue;
        applier.apply(iIntValue);
    }
}
