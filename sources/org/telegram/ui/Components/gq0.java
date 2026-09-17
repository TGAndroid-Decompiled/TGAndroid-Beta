package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class gq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.j5 f26514a;
    public org.telegram.ui.ActionBar.j5 f26515b;
    public di.eb f26516c;
    public int d;
    public AnimatorSet f26517e;
    public Paint f26518f;
    public RectF h;

    public final void a(int i10) {
        float measuredWidth;
        if (this.d == i10) {
            return;
        }
        this.d = i10;
        AnimatorSet animatorSet = this.f26517e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26517e = animatorSet2;
        di.eb ebVar = this.f26516c;
        if (this.d == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = ebVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ebVar, View.TRANSLATION_X, measuredWidth));
        this.f26517e.setDuration(180L);
        this.f26517e.setInterpolator(pr.f29495g);
        this.f26517e.addListener(new r80(this, 15));
        this.f26517e.start();
        ((tp0) this).f30702n.Z0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f26515b.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26514a.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        di.eb ebVar = this.f26516c;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ebVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f26517e;
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
