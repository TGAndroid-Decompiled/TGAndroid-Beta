package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class hq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k5 f24715a;
    public org.telegram.ui.ActionBar.k5 f24716b;
    public ci.eb f24717c;
    public int d;
    public AnimatorSet e;
    public Paint f24718f;
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
        ci.eb ebVar = this.f24717c;
        if (this.d == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = ebVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ebVar, View.TRANSLATION_X, measuredWidth));
        this.e.setDuration(180L);
        this.e.setInterpolator(qr.f27381g);
        this.e.addListener(new jd0(this, 12));
        this.e.start();
        ((up0) this).f28461n.Z0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f24716b.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24715a.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        ci.eb ebVar = this.f24717c;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ebVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.d == 0) {
            f7 = 0.0f;
        } else {
            f7 = layoutParams2.width;
        }
        ebVar.setTranslationX(f7);
        super.onMeasure(i10, i11);
    }
}
