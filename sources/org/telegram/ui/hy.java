package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hy implements ValueAnimator.AnimatorUpdateListener {
    public int f36979a;
    public final float f36980b;
    public final float f36981c;
    public final yy d;

    public hy(yy yyVar, float f7, boolean z10, float f10) {
        this.d = yyVar;
        this.f36980b = f7;
        this.f36981c = f10;
        this.f36979a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f36980b, this.f36981c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f36979a;
        this.f36979a = lerp;
        yy yyVar = this.d;
        yyVar.f42325e0[0].f41980a.scrollBy(0, i10);
        View view = yyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
