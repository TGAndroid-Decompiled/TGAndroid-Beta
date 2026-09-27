package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class pa implements ValueAnimator.AnimatorUpdateListener {
    public final int f36359a;
    public final qa f36360b;

    public pa(qa qaVar, int i10) {
        this.f36359a = i10;
        this.f36360b = qaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36359a) {
            case 0:
                qa qaVar = this.f36360b;
                qaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qaVar.f36663n = floatValue;
                qaVar.f36662f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                qaVar.d.setAlpha(qaVar.f36663n);
                return;
            default:
                qa qaVar2 = this.f36360b;
                qaVar2.getClass();
                qaVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.i6.f19461z6;
                org.telegram.ui.ActionBar.e6 e6Var = qaVar2.f36660b;
                int d = i0.a.d(qaVar2.E, org.telegram.ui.ActionBar.i6.v0(i10, e6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19242n6, e6Var));
                qaVar2.e.b(d);
                qaVar2.f36662f.setTextColor(d);
                return;
        }
    }
}
