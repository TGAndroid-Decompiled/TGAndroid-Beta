package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class dr0 extends FrameLayout {
    public View f25622a;
    public org.telegram.ui.ActionBar.j5 f25623b;
    public org.telegram.ui.ActionBar.j5 f25624c;
    public ai.ic d;
    public int e;
    public AnimatorSet f25625f;
    public Paint h;
    public RectF f25626n;

    public final void a(int i10) {
        float measuredWidth;
        if (this.e == i10) {
            return;
        }
        this.e = i10;
        AnimatorSet animatorSet = this.f25625f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f25625f = animatorSet2;
        ai.ic icVar = this.d;
        if (this.e == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = icVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(icVar, View.TRANSLATION_X, measuredWidth));
        this.f25625f.setDuration(180L);
        this.f25625f.setInterpolator(bs.f25013g);
        this.f25625f.addListener(new c80(this, 18));
        this.f25625f.start();
        ((qq0) this).f29679r.b1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f25624c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25623b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        ai.ic icVar = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) icVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f25625f;
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
