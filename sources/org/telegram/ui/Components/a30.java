package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class a30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33347a;
    public final c30 f33348b;

    public a30(c30 c30Var, int i7) {
        this.f33347a = i7;
        this.f33348b = c30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.cn cnVar;
        di.b1 b1Var;
        switch (this.f33347a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c30 c30Var = this.f33348b;
                c30Var.f33917x = floatValue;
                c30Var.f33911e.setTranslationY(floatValue * org.telegram.messenger.g0.L(48.0f));
                c30Var.f33911e.setPadding(0, 0, 0, (int) (c30Var.f33917x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c30 c30Var2 = this.f33348b;
                c30Var2.F = floatValue2;
                c30Var2.f33913n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, floatValue2));
                c30Var2.f33913n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, c30Var2.F));
                org.telegram.ui.nj njVar = c30Var2.f33912f;
                if (njVar != null && (cnVar = njVar.f47191a) != null && (b1Var = cnVar.f46122a4) != null) {
                    b1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, c30Var2.F));
                    c30Var2.f33912f.f47191a.f46122a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, c30Var2.F));
                }
                c30Var2.h.setAlpha(c30Var2.F);
                return;
        }
    }
}
