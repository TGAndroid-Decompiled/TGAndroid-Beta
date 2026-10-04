package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ay implements ValueAnimator.AnimatorUpdateListener {
    public int f34935a;
    public final float f34936b;
    public final float f34937c;
    public final uy d;

    public ay(uy uyVar, float f7, boolean z10, float f10) {
        this.d = uyVar;
        this.f34936b = f7;
        this.f34937c = f10;
        this.f34935a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f34936b, this.f34937c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f34935a;
        this.f34935a = lerp;
        uy uyVar = this.d;
        uyVar.f41392e0[0].f40983a.scrollBy(0, i10);
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
