package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class c41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27073a;
    public final e41 f27074b;

    public c41(e41 e41Var, int i10) {
        this.f27073a = i10;
        this.f27074b = e41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27073a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e41 e41Var = this.f27074b;
                e41Var.U = floatValue;
                e41Var.h();
                e41Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                e41 e41Var2 = this.f27074b;
                e41Var2.L = max;
                e41Var2.h.invalidate();
                return;
        }
    }
}
