package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ay implements ValueAnimator.AnimatorUpdateListener {
    public int f34941a;
    public final float f34942b;
    public final float f34943c;
    public final uy d;

    public ay(uy uyVar, float f7, boolean z10, float f10) {
        this.d = uyVar;
        this.f34942b = f7;
        this.f34943c = f10;
        this.f34941a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f34942b, this.f34943c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f34941a;
        this.f34941a = lerp;
        uy uyVar = this.d;
        uyVar.f41400e0[0].f40990a.scrollBy(0, i10);
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
