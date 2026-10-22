package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class er0 extends FrameLayout {
    public View f25957a;
    public org.telegram.ui.ActionBar.j5 f25958b;
    public org.telegram.ui.ActionBar.j5 f25959c;
    public ai.ic d;
    public int e;
    public AnimatorSet f25960f;
    public Paint h;
    public RectF f25961n;

    public final void a(int i10) {
        float measuredWidth;
        if (this.e == i10) {
            return;
        }
        this.e = i10;
        AnimatorSet animatorSet = this.f25960f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f25960f = animatorSet2;
        ai.ic icVar = this.d;
        if (this.e == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = icVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(icVar, View.TRANSLATION_X, measuredWidth));
        this.f25960f.setDuration(180L);
        this.f25960f.setInterpolator(bs.f25025g);
        this.f25960f.addListener(new c80(this, 18));
        this.f25960f.start();
        ((rq0) this).f29995r.b1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f25959c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25958b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        ai.ic icVar = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) icVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f25960f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.e == 0) {
            f7 = 0.0f;
        } else {
            f7 = layoutParams2.width;
        }
        icVar.setTranslationX(f7);
        super.onMeasure(i10, i11);
    }
}
