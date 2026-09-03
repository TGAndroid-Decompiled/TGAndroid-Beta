package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class kq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.l5 f28482a;
    public org.telegram.ui.ActionBar.l5 f28483b;
    public fg.h0 f28484c;
    public int d;
    public AnimatorSet f28485e;
    public Paint f28486f;
    public RectF h;

    public final void a(int i10) {
        float measuredWidth;
        if (this.d == i10) {
            return;
        }
        this.d = i10;
        AnimatorSet animatorSet = this.f28485e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f28485e = animatorSet2;
        fg.h0 h0Var = this.f28484c;
        if (this.d == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = h0Var.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(h0Var, View.TRANSLATION_X, measuredWidth));
        this.f28485e.setDuration(180L);
        this.f28485e.setInterpolator(pr.f30169g);
        this.f28485e.addListener(new pd0(this, 11));
        this.f28485e.start();
        ((xp0) this).f33148n.Z0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f28483b.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28482a.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        fg.h0 h0Var = this.f28484c;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) h0Var.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f28485e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.d == 0) {
            f10 = 0.0f;
        } else {
            f10 = layoutParams2.width;
        }
        h0Var.setTranslationX(f10);
        super.onMeasure(i10, i11);
    }
}
