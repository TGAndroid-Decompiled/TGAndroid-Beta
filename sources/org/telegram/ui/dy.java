package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dy implements ValueAnimator.AnimatorUpdateListener {
    public int f33190a;
    public final float f33191b;
    public final float f33192c;
    public final uy d;

    public dy(uy uyVar, float f7, boolean z10, float f10) {
        this.d = uyVar;
        this.f33191b = f7;
        this.f33192c = f10;
        this.f33190a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f33191b, this.f33192c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f33190a;
        this.f33190a = lerp;
        uy uyVar = this.d;
        uyVar.f38277e0[0].f37905a.scrollBy(0, i10);
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
