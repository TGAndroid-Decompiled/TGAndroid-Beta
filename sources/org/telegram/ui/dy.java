package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dy implements ValueAnimator.AnimatorUpdateListener {
    public int f35884a;
    public final float f35885b;
    public final float f35886c;
    public final uy d;

    public dy(uy uyVar, float f7, boolean z10, float f10) {
        this.d = uyVar;
        this.f35885b = f7;
        this.f35886c = f10;
        this.f35884a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f35885b, this.f35886c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f35884a;
        this.f35884a = lerp;
        uy uyVar = this.d;
        uyVar.f41260e0[0].f40859a.scrollBy(0, i10);
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
