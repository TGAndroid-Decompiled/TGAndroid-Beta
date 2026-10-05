package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class ar0 extends FrameLayout {
    public org.telegram.ui.ActionBar.i5 f24716a;
    public org.telegram.ui.ActionBar.i5 f24717b;
    public ci.ab f24718c;
    public int d;
    public AnimatorSet f24719e;
    public Paint f24720f;
    public RectF h;

    public final void a(int i10) {
        float measuredWidth;
        if (this.d == i10) {
            return;
        }
        this.d = i10;
        AnimatorSet animatorSet = this.f24719e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24719e = animatorSet2;
        ci.ab abVar = this.f24718c;
        if (this.d == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = abVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(abVar, View.TRANSLATION_X, measuredWidth));
        this.f24719e.setDuration(180L);
        this.f24719e.setInterpolator(tr.f31216g);
        this.f24719e.addListener(new hd0(this, 13));
        this.f24719e.start();
        ((nq0) this).f29137n.W0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f24717b.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24716a.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        ci.ab abVar = this.f24718c;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) abVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f24719e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.d == 0) {
            f7 = 0.0f;
        } else {
            f7 = layoutParams2.width;
        }
        abVar.setTranslationX(f7);
        super.onMeasure(i10, i11);
    }
}
