package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lx implements ValueAnimator.AnimatorUpdateListener {
    public int f40240a;
    public final float f40241b;
    public final float f40242c;
    public final dy d;

    public lx(dy dyVar, float f10, boolean z10, float f11) {
        this.d = dyVar;
        this.f40241b = f10;
        this.f40242c = f11;
        this.f40240a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f40241b, this.f40242c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i9 = lerp - this.f40240a;
        this.f40240a = lerp;
        dy dyVar = this.d;
        dyVar.f37629a0[0].f37350a.scrollBy(0, i9);
        View view = dyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
