package org.telegram.ui;

import android.animation.ValueAnimator;
public final class b41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31960a;
    public final e41 f31961b;

    public b41(e41 e41Var, int i10) {
        this.f31960a = i10;
        this.f31961b = e41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31960a) {
            case 0:
                e41 e41Var = this.f31961b;
                e41Var.getClass();
                e41Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e41Var.g();
                return;
            case 1:
                e41 e41Var2 = this.f31961b;
                e41Var2.getClass();
                e41Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e41Var2.g();
                return;
            default:
                e41 e41Var3 = this.f31961b;
                e41Var3.getClass();
                e41Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e41Var3.g();
                return;
        }
    }
}
