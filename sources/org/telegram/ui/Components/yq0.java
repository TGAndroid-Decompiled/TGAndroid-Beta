package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class yq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.i5 f33240a;
    public org.telegram.ui.ActionBar.i5 f33241b;
    public ci.ab f33242c;
    public int d;
    public AnimatorSet f33243e;
    public Paint f33244f;
    public RectF h;

    public final void a(int i10) {
        float measuredWidth;
        if (this.d == i10) {
            return;
        }
        this.d = i10;
        AnimatorSet animatorSet = this.f33243e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33243e = animatorSet2;
        ci.ab abVar = this.f33242c;
        if (this.d == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = abVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(abVar, View.TRANSLATION_X, measuredWidth));
        this.f33243e.setDuration(180L);
        this.f33243e.setInterpolator(tr.f31148g);
        this.f33243e.addListener(new hd0(this, 13));
        this.f33243e.start();
        ((lq0) this).f28411n.W0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f33241b.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f33240a.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        ci.ab abVar = this.f33242c;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) abVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f33243e;
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
