package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class ja implements ValueAnimator.AnimatorUpdateListener {

    public final int f39313a;

    public final ka f39314b;

    public ja(ka kaVar, int i10) {
        this.f39313a = i10;
        this.f39314b = kaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39313a) {
            case 0:
                ka kaVar = this.f39314b;
                kaVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kaVar.f39674n = fFloatValue;
                kaVar.f39673f.setTranslationX(fFloatValue * AndroidUtilities.dp(16.0f));
                kaVar.d.setAlpha(kaVar.f39674n);
                break;
            default:
                ka kaVar2 = this.f39314b;
                kaVar2.getClass();
                kaVar2.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.g6.f23441z6;
                org.telegram.ui.ActionBar.c6 c6Var = kaVar2.f39670b;
                int iD = i0.b.d(kaVar2.A, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23234n6, c6Var));
                kaVar2.f39672e.b(iD);
                kaVar2.f39673f.setTextColor(iD);
                break;
        }
    }
}
