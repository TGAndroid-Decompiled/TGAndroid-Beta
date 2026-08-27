package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public abstract class rp0 extends FrameLayout {

    public org.telegram.ui.ActionBar.h5 f32248a;

    public org.telegram.ui.ActionBar.h5 f32249b;

    public ag.s0 f32250c;
    public int d;

    public AnimatorSet f32251e;

    public Paint f32252f;
    public RectF h;

    public final void a(int i10) {
        if (this.d == i10) {
            return;
        }
        this.d = i10;
        AnimatorSet animatorSet = this.f32251e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32251e = animatorSet2;
        ag.s0 s0Var = this.f32250c;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(s0Var, (Property<ag.s0, Float>) View.TRANSLATION_X, this.d == 0 ? 0.0f : s0Var.getMeasuredWidth()));
        this.f32251e.setDuration(180L);
        this.f32251e.setInterpolator(er.f28123g);
        this.f32251e.addListener(new sz(this, 20));
        this.f32251e.start();
        ((dp0) this).f27819n.Z0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f32249b.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32248a.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        ag.s0 s0Var = this.f32250c;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) s0Var.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f32251e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        s0Var.setTranslationX(this.d == 0 ? 0.0f : layoutParams2.width);
        super.onMeasure(i10, i11);
    }
}
