package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class cv implements ValueAnimator.AnimatorUpdateListener {
    public final float f35553a;
    public final int f35554b;
    public final int f35555c;
    public final Activity d;
    public final dv f35556e;

    public cv(dv dvVar, float f7, int i10, int i11, Activity activity) {
        this.f35556e = dvVar;
        this.f35553a = f7;
        this.f35554b = i10;
        this.f35555c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f35553a) / 150.0f));
        fv fvVar = this.f35556e.f35886c;
        fvVar.f36415n = i0.a.d(max, this.f35554b, this.f35555c);
        int i10 = fvVar.f36415n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(fvVar.f36415n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
