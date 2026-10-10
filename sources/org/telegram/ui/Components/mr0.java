package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class mr0 extends FrameLayout {
    public View f28877a;
    public org.telegram.ui.ActionBar.j5 f28878b;
    public org.telegram.ui.ActionBar.j5 f28879c;
    public ci.bb d;
    public int f28880e;
    public AnimatorSet f28881f;
    public Paint h;
    public RectF f28882n;

    public final void a(int i10) {
        float measuredWidth;
        if (this.f28880e == i10) {
            return;
        }
        this.f28880e = i10;
        AnimatorSet animatorSet = this.f28881f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f28881f = animatorSet2;
        ci.bb bbVar = this.d;
        if (this.f28880e == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = bbVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(bbVar, View.TRANSLATION_X, measuredWidth));
        this.f28881f.setDuration(180L);
        this.f28881f.setInterpolator(is.f27444g);
        this.f28881f.addListener(new wd0(this, 13));
        this.f28881f.start();
        ((zq0) this).f33653r.a1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f28879c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28878b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        ci.bb bbVar = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) bbVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f28881f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.f28880e == 0) {
            f7 = 0.0f;
        } else {
            f7 = layoutParams2.width;
        }
        bbVar.setTranslationX(f7);
        super.onMeasure(i10, i11);
    }
}
