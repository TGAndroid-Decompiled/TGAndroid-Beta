package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hy implements ValueAnimator.AnimatorUpdateListener {
    public int f36665a;
    public final float f36666b;
    public final float f36667c;
    public final yy d;

    public hy(yy yyVar, float f7, boolean z10, float f10) {
        this.d = yyVar;
        this.f36666b = f7;
        this.f36667c = f10;
        this.f36665a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f36666b, this.f36667c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f36665a;
        this.f36665a = lerp;
        yy yyVar = this.d;
        yyVar.f42004e0[0].f41679a.scrollBy(0, i10);
        View view = yyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
