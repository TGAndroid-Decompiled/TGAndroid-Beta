package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class kq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k5 f26365a;
    public org.telegram.ui.ActionBar.k5 f26366b;
    public eg.h0 f26367c;
    public int d;
    public AnimatorSet e;
    public Paint f26368f;
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
        eg.h0 h0Var = this.f26367c;
        if (this.d == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = h0Var.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(h0Var, View.TRANSLATION_X, measuredWidth));
        this.e.setDuration(180L);
        this.e.setInterpolator(nr.f27347g);
        this.e.addListener(new nd0(this, 11));
        this.e.start();
        ((xp0) this).f30708n.Z0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f26366b.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26365a.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        eg.h0 h0Var = this.f26367c;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) h0Var.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.e;
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
