package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ka implements ValueAnimator.AnimatorUpdateListener {
    public final int f38729a;
    public final la f38730b;

    public ka(la laVar, int i10) {
        this.f38729a = i10;
        this.f38730b = laVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38729a) {
            case 0:
                la laVar = this.f38730b;
                laVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                laVar.f39129n = floatValue;
                laVar.f39128f.setTranslationX(floatValue * org.telegram.messenger.i0.L(16.0f));
                laVar.d.setAlpha(laVar.f39129n);
                return;
            default:
                la laVar2 = this.f38730b;
                laVar2.getClass();
                laVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.t6.f21330z6;
                org.telegram.ui.ActionBar.p6 p6Var = laVar2.f39126b;
                int f7 = i0.b.f(laVar2.E, org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21115n6, p6Var));
                laVar2.e.b(f7);
                laVar2.f39128f.setTextColor(f7);
                return;
        }
    }
}
