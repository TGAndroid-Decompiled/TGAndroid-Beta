package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class ms0 extends yh.p2 {
    public final wv0 V;

    public ms0(int i10, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var, wv0 wv0Var) {
        super(i10, j10, context, o2Var, g6Var);
        this.V = wv0Var;
    }

    @Override
    public final void p(boolean z10) {
        float f7;
        float f10;
        wv0 wv0Var = this.V;
        TextView textView = wv0Var.f32397q0;
        textView.setVisibility(0);
        ViewPropertyAnimator animate = textView.animate();
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f7);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.4f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (!z10) {
            f11 = 0.4f;
        }
        scaleX.scaleY(f11).withEndAction(new z50(4, this, z10)).start();
        wv0Var.u1(true);
    }
}
