package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dy implements ValueAnimator.AnimatorUpdateListener {
    public int f35883a;
    public final float f35884b;
    public final float f35885c;
    public final uy d;

    public dy(uy uyVar, float f7, boolean z10, float f10) {
        this.d = uyVar;
        this.f35884b = f7;
        this.f35885c = f10;
        this.f35883a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f35884b, this.f35885c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f35883a;
        this.f35883a = lerp;
        uy uyVar = this.d;
        uyVar.f41259e0[0].f40858a.scrollBy(0, i10);
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
