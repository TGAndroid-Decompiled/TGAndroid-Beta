package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class cq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.h5 f27552a;
    public org.telegram.ui.ActionBar.h5 f27553b;
    public cg.h0 f27554c;
    public int d;
    public AnimatorSet f27555e;
    public Paint f27556f;
    public RectF h;

    public final void a(int i10) {
        float measuredWidth;
        if (this.d == i10) {
            return;
        }
        this.d = i10;
        AnimatorSet animatorSet = this.f27555e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f27555e = animatorSet2;
        cg.h0 h0Var = this.f27554c;
        if (this.d == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = h0Var.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(h0Var, View.TRANSLATION_X, measuredWidth));
        this.f27555e.setDuration(180L);
        this.f27555e.setInterpolator(jr.f29801g);
        this.f27555e.addListener(new zz(this, 20));
        this.f27555e.start();
        ((op0) this).f31447n.Z0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f27553b.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f27552a.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        cg.h0 h0Var = this.f27554c;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) h0Var.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f27555e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.d == 0) {
            f9 = 0.0f;
        } else {
            f9 = layoutParams2.width;
        }
        h0Var.setTranslationX(f9);
        super.onMeasure(i10, i11);
    }
}
