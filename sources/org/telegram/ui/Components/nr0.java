package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class nr0 extends FrameLayout {
    public View f29126a;
    public org.telegram.ui.ActionBar.h5 f29127b;
    public org.telegram.ui.ActionBar.h5 f29128c;
    public ci.bb d;
    public int f29129e;
    public AnimatorSet f29130f;
    public Paint h;
    public RectF f29131n;

    public final void a(int i10) {
        float measuredWidth;
        if (this.f29129e == i10) {
            return;
        }
        this.f29129e = i10;
        AnimatorSet animatorSet = this.f29130f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f29130f = animatorSet2;
        ci.bb bbVar = this.d;
        if (this.f29129e == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = bbVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(bbVar, View.TRANSLATION_X, measuredWidth));
        this.f29130f.setDuration(180L);
        this.f29130f.setInterpolator(is.f27452g);
        this.f29130f.addListener(new wd0(this, 13));
        this.f29130f.start();
        ((ar0) this).f24564r.a1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f29128c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f29127b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        ci.bb bbVar = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) bbVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f29130f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.f29129e == 0) {
            f7 = 0.0f;
        } else {
            f7 = layoutParams2.width;
        }
        bbVar.setTranslationX(f7);
        super.onMeasure(i10, i11);
    }
}
