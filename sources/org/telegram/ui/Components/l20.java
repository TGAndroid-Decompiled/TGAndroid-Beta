package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class l20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35570a;
    public final n20 f35571b;

    public l20(n20 n20Var, int i3) {
        this.f35570a = i3;
        this.f35571b = n20Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.xm xmVar;
        ci.j1 j1Var;
        switch (this.f35570a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n20 n20Var = this.f35571b;
                n20Var.f36346x = floatValue;
                n20Var.f36340e.setTranslationY(floatValue * org.telegram.messenger.g0.L(48.0f));
                n20Var.f36340e.setPadding(0, 0, 0, (int) (n20Var.f36346x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n20 n20Var2 = this.f35571b;
                n20Var2.F = floatValue2;
                n20Var2.f36342n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, floatValue2));
                n20Var2.f36342n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, n20Var2.F));
                org.telegram.ui.ij ijVar = n20Var2.f36341f;
                if (ijVar != null && (xmVar = ijVar.f52363a) != null && (j1Var = xmVar.f51241a4) != null) {
                    j1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, n20Var2.F));
                    n20Var2.f36341f.f52363a.f51241a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, n20Var2.F));
                }
                n20Var2.h.setAlpha(n20Var2.F);
                return;
        }
    }
}
