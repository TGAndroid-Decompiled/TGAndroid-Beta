package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dy implements ValueAnimator.AnimatorUpdateListener {
    public int f33159a;
    public final float f33160b;
    public final float f33161c;
    public final uy d;

    public dy(uy uyVar, float f7, boolean z10, float f10) {
        this.d = uyVar;
        this.f33160b = f7;
        this.f33161c = f10;
        this.f33159a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f33160b, this.f33161c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f33159a;
        this.f33159a = lerp;
        uy uyVar = this.d;
        uyVar.f38207e0[0].f37803a.scrollBy(0, i10);
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
