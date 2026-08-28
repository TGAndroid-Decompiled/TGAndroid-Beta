package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class qp0 extends FrameLayout {
    public org.telegram.ui.ActionBar.h5 f32004a;
    public org.telegram.ui.ActionBar.h5 f32005b;
    public fh.l2 f32006c;
    public int d;
    public AnimatorSet f32007e;
    public Paint f32008f;
    public RectF h;

    public final void a(int i9) {
        float measuredWidth;
        if (this.d == i9) {
            return;
        }
        this.d = i9;
        AnimatorSet animatorSet = this.f32007e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32007e = animatorSet2;
        fh.l2 l2Var = this.f32006c;
        if (this.d == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = l2Var.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(l2Var, View.TRANSLATION_X, measuredWidth));
        this.f32007e.setDuration(180L);
        this.f32007e.setInterpolator(gr.f28845g);
        this.f32007e.addListener(new r60(this, 18));
        this.f32007e.start();
        ((dp0) this).f27784n.Z0();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        int size = (View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f32005b.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32004a.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        fh.l2 l2Var = this.f32006c;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) l2Var.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f32007e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.d == 0) {
            f10 = 0.0f;
        } else {
            f10 = layoutParams2.width;
        }
        l2Var.setTranslationX(f10);
        super.onMeasure(i9, i10);
    }
}
