package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26608a;
    public final j30 f26609b;

    public h30(j30 j30Var, int i10) {
        this.f26608a = i10;
        this.f26609b = j30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.vn vnVar;
        ag.b1 b1Var;
        switch (this.f26608a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j30 j30Var = this.f26609b;
                j30Var.f27217x = floatValue;
                j30Var.e.setTranslationY(floatValue * org.telegram.messenger.i0.L(48.0f));
                j30Var.e.setPadding(0, 0, 0, (int) (j30Var.f27217x * org.telegram.messenger.i0.L(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j30 j30Var2 = this.f26609b;
                j30Var2.E = floatValue2;
                j30Var2.f27213n.setScaleX(org.telegram.messenger.i0.T1(0.95f, 1.0f, floatValue2));
                j30Var2.f27213n.setScaleY(org.telegram.messenger.i0.T1(0.95f, 1.0f, j30Var2.E));
                org.telegram.ui.ik ikVar = j30Var2.f27212f;
                if (ikVar != null && (vnVar = ikVar.f43336a) != null && (b1Var = vnVar.Z3) != null) {
                    b1Var.setScaleX(org.telegram.messenger.i0.T1(1.0f, 0.95f, j30Var2.E));
                    j30Var2.f27212f.f43336a.Z3.setScaleY(org.telegram.messenger.i0.T1(1.0f, 0.95f, j30Var2.E));
                }
                j30Var2.h.setAlpha(j30Var2.E);
                return;
        }
    }
}
