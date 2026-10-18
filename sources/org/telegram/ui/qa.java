package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class qa implements ValueAnimator.AnimatorUpdateListener {
    public final int f40308a;
    public final ra f40309b;

    public qa(ra raVar, int i10) {
        this.f40308a = i10;
        this.f40309b = raVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40308a) {
            case 0:
                ra raVar = this.f40309b;
                raVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                raVar.f40667n = floatValue;
                raVar.f40666f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                raVar.d.setAlpha(raVar.f40667n);
                return;
            default:
                ra raVar2 = this.f40309b;
                raVar2.getClass();
                raVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.h6.f21391z6;
                org.telegram.ui.ActionBar.d6 d6Var = raVar2.f40664b;
                int f7 = i0.a.f(raVar2.E, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21169n6, d6Var));
                raVar2.e.b(f7);
                raVar2.f40666f.setTextColor(f7);
                return;
        }
    }
}
