package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class gr0 extends FrameLayout {
    public View f26778a;
    public org.telegram.ui.ActionBar.n5 f26779b;
    public org.telegram.ui.ActionBar.n5 f26780c;
    public ai.jc d;
    public int e;
    public AnimatorSet f26781f;
    public Paint h;
    public RectF f26782n;

    public final void a(int i10) {
        float measuredWidth;
        if (this.e == i10) {
            return;
        }
        this.e = i10;
        AnimatorSet animatorSet = this.f26781f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26781f = animatorSet2;
        ai.jc jcVar = this.d;
        if (this.e == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = jcVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(jcVar, View.TRANSLATION_X, measuredWidth));
        this.f26781f.setDuration(180L);
        this.f26781f.setInterpolator(zr.f33338g);
        this.f26781f.addListener(new g60(this, 19));
        this.f26781f.start();
        ((tq0) this).f30876r.f1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f26780c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26779b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        ai.jc jcVar = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) jcVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f26781f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.e == 0) {
            f7 = 0.0f;
        } else {
            f7 = layoutParams2.width;
        }
        jcVar.setTranslationX(f7);
        super.onMeasure(i10, i11);
    }
}
