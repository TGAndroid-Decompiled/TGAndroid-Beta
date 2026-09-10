package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class rq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.l5 f26739a;
    public org.telegram.ui.ActionBar.l5 f26740b;
    public bi.nc f26741c;
    public int d;
    public AnimatorSet e;
    public Paint f26742f;
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
        bi.nc ncVar = this.f26741c;
        if (this.d == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = ncVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ncVar, View.TRANSLATION_X, measuredWidth));
        this.e.setDuration(180L);
        this.e.setInterpolator(wr.f28820g);
        this.e.addListener(new zn0(this, 2));
        this.e.start();
        ((eq0) this).f22743n.Z0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f26740b.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26739a.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        bi.nc ncVar = this.f26741c;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ncVar.getLayoutParams();
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
        ncVar.setTranslationX(f7);
        super.onMeasure(i10, i11);
    }
}
