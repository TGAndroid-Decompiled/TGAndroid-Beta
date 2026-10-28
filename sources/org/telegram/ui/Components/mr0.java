package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class mr0 extends FrameLayout {
    public View f30610a;
    public org.telegram.ui.ActionBar.b6 f30611b;
    public org.telegram.ui.ActionBar.b6 f30612c;
    public bi.cc d;
    public int e;
    public AnimatorSet f30613f;
    public Paint h;
    public RectF f30614n;

    public final void a(int i10) {
        float measuredWidth;
        if (this.e == i10) {
            return;
        }
        this.e = i10;
        AnimatorSet animatorSet = this.f30613f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f30613f = animatorSet2;
        bi.cc ccVar = this.d;
        if (this.e == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = ccVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ccVar, View.TRANSLATION_X, measuredWidth));
        this.f30613f.setDuration(180L);
        this.f30613f.setInterpolator(ds.f27531g);
        this.f30613f.addListener(new i10(this, 20));
        this.f30613f.start();
        ((zq0) this).f35429r.c1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f30612c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f30611b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        bi.cc ccVar = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ccVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f30613f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.e == 0) {
            f7 = 0.0f;
        } else {
            f7 = layoutParams2.width;
        }
        ccVar.setTranslationX(f7);
        super.onMeasure(i10, i11);
    }
}
