package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class cv implements ValueAnimator.AnimatorUpdateListener {
    public final float f35555a;
    public final int f35556b;
    public final int f35557c;
    public final Activity d;
    public final dv f35558e;

    public cv(dv dvVar, float f7, int i10, int i11, Activity activity) {
        this.f35558e = dvVar;
        this.f35555a = f7;
        this.f35556b = i10;
        this.f35557c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f35555a) / 150.0f));
        fv fvVar = this.f35558e.f35841c;
        fvVar.f36401n = i0.a.d(max, this.f35556b, this.f35557c);
        int i10 = fvVar.f36401n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(fvVar.f36401n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
