package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class cv implements ValueAnimator.AnimatorUpdateListener {
    public final float f35556a;
    public final int f35557b;
    public final int f35558c;
    public final Activity d;
    public final dv f35559e;

    public cv(dv dvVar, float f7, int i10, int i11, Activity activity) {
        this.f35559e = dvVar;
        this.f35556a = f7;
        this.f35557b = i10;
        this.f35558c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f35556a) / 150.0f));
        fv fvVar = this.f35559e.f35842c;
        fvVar.f36402n = i0.a.d(max, this.f35557b, this.f35558c);
        int i10 = fvVar.f36402n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(fvVar.f36402n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
