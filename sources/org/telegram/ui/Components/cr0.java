package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class cr0 extends FrameLayout {
    public View f25355a;
    public org.telegram.ui.ActionBar.j5 f25356b;
    public org.telegram.ui.ActionBar.j5 f25357c;
    public ai.ic d;
    public int e;
    public AnimatorSet f25358f;
    public Paint h;
    public RectF f25359n;

    public final void a(int i10) {
        float measuredWidth;
        if (this.e == i10) {
            return;
        }
        this.e = i10;
        AnimatorSet animatorSet = this.f25358f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f25358f = animatorSet2;
        ai.ic icVar = this.d;
        if (this.e == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = icVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(icVar, View.TRANSLATION_X, measuredWidth));
        this.f25358f.setDuration(180L);
        this.f25358f.setInterpolator(bs.f25031g);
        this.f25358f.addListener(new c80(this, 18));
        this.f25358f.start();
        ((pq0) this).f29398r.a1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f25357c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25356b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        ai.ic icVar = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) icVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f25358f;
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
