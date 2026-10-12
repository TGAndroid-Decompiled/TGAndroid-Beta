package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class rr0 extends FrameLayout {
    public View f30224a;
    public org.telegram.ui.ActionBar.h5 f30225b;
    public org.telegram.ui.ActionBar.h5 f30226c;
    public ci.bb d;
    public int f30227e;
    public AnimatorSet f30228f;
    public Paint h;
    public RectF f30229n;

    public final void a(int i10) {
        float measuredWidth;
        if (this.f30227e == i10) {
            return;
        }
        this.f30227e = i10;
        AnimatorSet animatorSet = this.f30228f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f30228f = animatorSet2;
        ci.bb bbVar = this.d;
        if (this.f30227e == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = bbVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(bbVar, View.TRANSLATION_X, measuredWidth));
        this.f30228f.setDuration(180L);
        this.f30228f.setInterpolator(js.f27635g);
        this.f30228f.addListener(new zd0(this, 13));
        this.f30228f.start();
        ((er0) this).f25780r.a1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f30226c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f30225b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        ci.bb bbVar = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) bbVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f30228f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.f30227e == 0) {
            f7 = 0.0f;
        } else {
            f7 = layoutParams2.width;
        }
        bbVar.setTranslationX(f7);
        super.onMeasure(i10, i11);
    }
}
