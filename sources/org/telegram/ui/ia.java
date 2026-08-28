package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ia implements ValueAnimator.AnimatorUpdateListener {
    public final int f39090a;
    public final ja f39091b;

    public ia(ja jaVar, int i9) {
        this.f39090a = i9;
        this.f39091b = jaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39090a) {
            case 0:
                ja jaVar = this.f39091b;
                jaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jaVar.f39419n = floatValue;
                jaVar.f39418f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                jaVar.d.setAlpha(jaVar.f39419n);
                return;
            default:
                ja jaVar2 = this.f39091b;
                jaVar2.getClass();
                jaVar2.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i9 = org.telegram.ui.ActionBar.f6.f23386z6;
                org.telegram.ui.ActionBar.b6 b6Var = jaVar2.f39415b;
                int d = i0.a.d(jaVar2.A, org.telegram.ui.ActionBar.f6.v0(i9, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23179n6, b6Var));
                jaVar2.f39417e.b(d);
                jaVar2.f39418f.setTextColor(d);
                return;
        }
    }
}
