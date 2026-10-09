package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class lr0 extends FrameLayout {
    public View f28573a;
    public org.telegram.ui.ActionBar.j5 f28574b;
    public org.telegram.ui.ActionBar.j5 f28575c;
    public ci.bb d;
    public int f28576e;
    public AnimatorSet f28577f;
    public Paint h;
    public RectF f28578n;

    public final void a(int i10) {
        float measuredWidth;
        if (this.f28576e == i10) {
            return;
        }
        this.f28576e = i10;
        AnimatorSet animatorSet = this.f28577f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f28577f = animatorSet2;
        ci.bb bbVar = this.d;
        if (this.f28576e == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = bbVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(bbVar, View.TRANSLATION_X, measuredWidth));
        this.f28577f.setDuration(180L);
        this.f28577f.setInterpolator(hs.f27119g);
        this.f28577f.addListener(new vd0(this, 13));
        this.f28577f.start();
        ((yq0) this).f33330r.a1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f28575c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28574b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        ci.bb bbVar = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) bbVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f28577f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.f28576e == 0) {
            f7 = 0.0f;
        } else {
            f7 = layoutParams2.width;
        }
        bbVar.setTranslationX(f7);
        super.onMeasure(i10, i11);
    }
}
