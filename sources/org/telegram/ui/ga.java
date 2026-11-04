package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ga implements ValueAnimator.AnimatorUpdateListener {
    public final int f45610a;
    public final ha f45611b;

    public ga(ha haVar, int i3) {
        this.f45610a = i3;
        this.f45611b = haVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45610a) {
            case 0:
                ha haVar = this.f45611b;
                haVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                haVar.f45874n = floatValue;
                haVar.f45873f.setTranslationX(floatValue * org.telegram.messenger.g0.L(16.0f));
                haVar.d.setAlpha(haVar.f45874n);
                return;
            default:
                ha haVar2 = this.f45611b;
                haVar2.getClass();
                haVar2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i3 = org.telegram.ui.ActionBar.k6.f28290z6;
                org.telegram.ui.ActionBar.e6 e6Var = haVar2.f45870b;
                int f10 = i0.a.f(haVar2.F, org.telegram.ui.ActionBar.k6.w0(i3, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28062n6, e6Var));
                haVar2.f45872e.b(f10);
                haVar2.f45873f.setTextColor(f10);
                return;
        }
    }
}
