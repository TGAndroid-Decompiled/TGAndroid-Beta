package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ay implements ValueAnimator.AnimatorUpdateListener {
    public int f34936a;
    public final float f34937b;
    public final float f34938c;
    public final uy d;

    public ay(uy uyVar, float f7, boolean z10, float f10) {
        this.d = uyVar;
        this.f34937b = f7;
        this.f34938c = f10;
        this.f34936a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f34937b, this.f34938c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f34936a;
        this.f34936a = lerp;
        uy uyVar = this.d;
        uyVar.f41393e0[0].f40984a.scrollBy(0, i10);
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
