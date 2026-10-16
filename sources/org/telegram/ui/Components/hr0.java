package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class hr0 extends FrameLayout {
    public View f25387a;
    public org.telegram.ui.ActionBar.h5 f25388b;
    public org.telegram.ui.ActionBar.h5 f25389c;
    public di.ab d;
    public int e;
    public AnimatorSet f25390f;
    public Paint h;
    public RectF f25391n;

    public final void a(int i10) {
        float measuredWidth;
        if (this.e == i10) {
            return;
        }
        this.e = i10;
        AnimatorSet animatorSet = this.f25390f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f25390f = animatorSet2;
        di.ab abVar = this.d;
        if (this.e == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = abVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(abVar, View.TRANSLATION_X, measuredWidth));
        this.f25390f.setDuration(180L);
        this.f25390f.setInterpolator(es.f24466g);
        this.f25390f.addListener(new k90(this, 16));
        this.f25390f.start();
        ((uq0) this).f29421r.a1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f25389c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25388b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        di.ab abVar = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) abVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f25390f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.e == 0) {
            f7 = 0.0f;
        } else {
            f7 = layoutParams2.width;
        }
        abVar.setTranslationX(f7);
        super.onMeasure(i10, i11);
    }
}
