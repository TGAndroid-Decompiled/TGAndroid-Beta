package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class pa implements ValueAnimator.AnimatorUpdateListener {
    public final int f42413a;
    public final qa f42414b;

    public pa(qa qaVar, int i10) {
        this.f42413a = i10;
        this.f42414b = qaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42413a) {
            case 0:
                qa qaVar = this.f42414b;
                qaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qaVar.f42788n = floatValue;
                qaVar.f42787f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                qaVar.d.setAlpha(qaVar.f42788n);
                return;
            default:
                qa qaVar2 = this.f42414b;
                qaVar2.getClass();
                qaVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.y6.f23767z6;
                org.telegram.ui.ActionBar.u6 u6Var = qaVar2.f42785b;
                int f7 = i0.a.f(qaVar2.E, org.telegram.ui.ActionBar.y6.w0(i10, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23540n6, u6Var));
                qaVar2.e.b(f7);
                qaVar2.f42787f.setTextColor(f7);
                return;
        }
    }
}
