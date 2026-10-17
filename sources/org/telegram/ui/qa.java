package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class qa implements ValueAnimator.AnimatorUpdateListener {
    public final int f40344a;
    public final ra f40345b;

    public qa(ra raVar, int i10) {
        this.f40344a = i10;
        this.f40345b = raVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40344a) {
            case 0:
                ra raVar = this.f40345b;
                raVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                raVar.f40676n = floatValue;
                raVar.f40675f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                raVar.d.setAlpha(raVar.f40676n);
                return;
            default:
                ra raVar2 = this.f40345b;
                raVar2.getClass();
                raVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.h6.f21391z6;
                org.telegram.ui.ActionBar.d6 d6Var = raVar2.f40673b;
                int f7 = i0.b.f(raVar2.E, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21169n6, d6Var));
                raVar2.e.b(f7);
                raVar2.f40675f.setTextColor(f7);
                return;
        }
    }
}
