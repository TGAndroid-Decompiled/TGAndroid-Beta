package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dy implements ValueAnimator.AnimatorUpdateListener {
    public int f35910a;
    public final float f35911b;
    public final float f35912c;
    public final uy d;

    public dy(uy uyVar, float f7, boolean z10, float f10) {
        this.d = uyVar;
        this.f35911b = f7;
        this.f35912c = f10;
        this.f35910a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f35911b, this.f35912c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f35910a;
        this.f35910a = lerp;
        uy uyVar = this.d;
        uyVar.f41286e0[0].f40885a.scrollBy(0, i10);
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
