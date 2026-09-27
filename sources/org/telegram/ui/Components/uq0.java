package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class uq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.j5 f28929a;
    public org.telegram.ui.ActionBar.j5 f28930b;
    public ci.ab f28931c;
    public int d;
    public AnimatorSet e;
    public Paint f28932f;
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
        ci.ab abVar = this.f28931c;
        if (this.d == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = abVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(abVar, View.TRANSLATION_X, measuredWidth));
        this.e.setDuration(180L);
        this.e.setInterpolator(sr.f28360g);
        this.e.addListener(new fd0(this, 13));
        this.e.start();
        ((hq0) this).f24882n.W0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f28930b.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28929a.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        ci.ab abVar = this.f28931c;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) abVar.getLayoutParams();
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
        abVar.setTranslationX(f7);
        super.onMeasure(i10, i11);
    }
}
