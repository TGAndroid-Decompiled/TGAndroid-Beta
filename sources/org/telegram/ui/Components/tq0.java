package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class tq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.j5 f28425a;
    public org.telegram.ui.ActionBar.j5 f28426b;
    public ci.eb f28427c;
    public int d;
    public AnimatorSet e;
    public Paint f28428f;
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
        ci.eb ebVar = this.f28427c;
        if (this.d == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = ebVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ebVar, View.TRANSLATION_X, measuredWidth));
        this.e.setDuration(180L);
        this.e.setInterpolator(qr.f27643g);
        this.e.addListener(new dd0(this, 13));
        this.e.start();
        ((gq0) this).f24438n.Z0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f28426b.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28425a.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        ci.eb ebVar = this.f28427c;
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
