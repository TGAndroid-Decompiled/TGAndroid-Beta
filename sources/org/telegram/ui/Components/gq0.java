package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class gq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.i5 f24392a;
    public org.telegram.ui.ActionBar.i5 f24393b;
    public ci.bb f24394c;
    public int d;
    public AnimatorSet e;
    public Paint f24395f;
    public RectF h;

    public final void a(int i10) {
        float measuredWidth;
        if (this.d == i10) {
            return;
        }
        this.d = i10;
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        ci.bb bbVar = this.f24394c;
        if (this.d == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = bbVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(bbVar, View.TRANSLATION_X, measuredWidth));
        this.e.setDuration(180L);
        this.e.setInterpolator(rr.f27702g);
        this.e.addListener(new jd0(this, 12));
        this.e.start();
        ((tp0) this).f28289n.Z0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f24393b.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24392a.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        ci.bb bbVar = this.f24394c;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) bbVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.d == 0) {
            f7 = 0.0f;
        } else {
            f7 = layoutParams2.width;
        }
        bbVar.setTranslationX(f7);
        super.onMeasure(i10, i11);
    }
}
