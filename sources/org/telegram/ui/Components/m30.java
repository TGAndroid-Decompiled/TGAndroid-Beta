package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class m30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28657a;
    public final q30 f28658b;

    public m30(q30 q30Var, int i10) {
        this.f28657a = i10;
        this.f28658b = q30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28657a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q30 q30Var = this.f28658b;
                q30Var.f30020r.x = (int) floatValue;
                q30Var.h();
                o30 o30Var = q30Var.f30011a;
                if (o30Var.getParent() != null) {
                    q30Var.f30019n.updateViewLayout(o30Var, q30Var.f30020r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q30 q30Var2 = this.f28658b;
                q30Var2.f30020r.y = (int) floatValue2;
                o30 o30Var2 = q30Var2.f30011a;
                if (o30Var2.getParent() != null) {
                    q30Var2.f30019n.updateViewLayout(o30Var2, q30Var2.f30020r);
                    return;
                }
                return;
        }
    }
}
