package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class lr0 extends FrameLayout {
    public View f30277a;
    public org.telegram.ui.ActionBar.b6 f30278b;
    public org.telegram.ui.ActionBar.b6 f30279c;
    public bi.cc d;
    public int e;
    public AnimatorSet f30280f;
    public Paint h;
    public RectF f30281n;

    public final void a(int i10) {
        float measuredWidth;
        if (this.e == i10) {
            return;
        }
        this.e = i10;
        AnimatorSet animatorSet = this.f30280f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f30280f = animatorSet2;
        bi.cc ccVar = this.d;
        if (this.e == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = ccVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ccVar, View.TRANSLATION_X, measuredWidth));
        this.f30280f.setDuration(180L);
        this.f30280f.setInterpolator(ds.f27587g);
        this.f30280f.addListener(new i10(this, 20));
        this.f30280f.start();
        ((yq0) this).f35129r.c1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f30279c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f30278b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        bi.cc ccVar = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ccVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f30280f;
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
