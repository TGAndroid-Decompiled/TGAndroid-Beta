package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class ox implements ValueAnimator.AnimatorUpdateListener {

    public int f41202a;

    public final float f41203b;

    public final float f41204c;
    public final gy d;

    public ox(gy gyVar, float f10, boolean z10, float f11) {
        this.d = gyVar;
        this.f41203b = f10;
        this.f41204c = f11;
        this.f41202a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int iLerp = (int) AndroidUtilities.lerp(this.f41203b, this.f41204c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = iLerp - this.f41202a;
        this.f41202a = iLerp;
        gy gyVar = this.d;
        gyVar.f38498a0[0].f38225a.scrollBy(0, i10);
        View view = gyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
