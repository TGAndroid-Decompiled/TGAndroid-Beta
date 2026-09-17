package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ma implements ValueAnimator.AnimatorUpdateListener {
    public final int f38601a;
    public final na f38602b;

    public ma(na naVar, int i10) {
        this.f38601a = i10;
        this.f38602b = naVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38601a) {
            case 0:
                na naVar = this.f38602b;
                naVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f38888n = floatValue;
                naVar.f38887f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                naVar.d.setAlpha(naVar.f38888n);
                return;
            default:
                na naVar2 = this.f38602b;
                naVar2.getClass();
                naVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.j6.f21062z6;
                org.telegram.ui.ActionBar.f6 f6Var = naVar2.f38884b;
                int d = i0.a.d(naVar2.E, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20847n6, f6Var));
                naVar2.f38886e.b(d);
                naVar2.f38887f.setTextColor(d);
                return;
        }
    }
}
