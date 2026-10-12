package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class qa implements ValueAnimator.AnimatorUpdateListener {
    public final int f41231a;
    public final ra f41232b;

    public qa(ra raVar, int i10) {
        this.f41231a = i10;
        this.f41232b = raVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41231a) {
            case 0:
                ra raVar = this.f41232b;
                raVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                raVar.f41583n = floatValue;
                raVar.f41582f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                raVar.d.setAlpha(raVar.f41583n);
                return;
            default:
                ra raVar2 = this.f41232b;
                raVar2.getClass();
                raVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.h6.f20963z6;
                org.telegram.ui.ActionBar.c6 c6Var = raVar2.f41579b;
                int d = i0.a.d(raVar2.E, org.telegram.ui.ActionBar.h6.w0(i10, c6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20744n6, c6Var));
                raVar2.f41581e.b(d);
                raVar2.f41582f.setTextColor(d);
                return;
        }
    }
}
