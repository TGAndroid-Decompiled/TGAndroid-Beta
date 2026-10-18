package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class qa implements ValueAnimator.AnimatorUpdateListener {
    public final int f40350a;
    public final ra f40351b;

    public qa(ra raVar, int i10) {
        this.f40350a = i10;
        this.f40351b = raVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40350a) {
            case 0:
                ra raVar = this.f40351b;
                raVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                raVar.f40701n = floatValue;
                raVar.f40700f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                raVar.d.setAlpha(raVar.f40701n);
                return;
            default:
                ra raVar2 = this.f40351b;
                raVar2.getClass();
                raVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.h6.f21398z6;
                org.telegram.ui.ActionBar.d6 d6Var = raVar2.f40698b;
                int f7 = i0.a.f(raVar2.E, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21176n6, d6Var));
                raVar2.e.b(f7);
                raVar2.f40700f.setTextColor(f7);
                return;
        }
    }
}
