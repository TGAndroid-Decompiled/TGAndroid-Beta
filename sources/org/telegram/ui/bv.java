package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class bv implements ValueAnimator.AnimatorUpdateListener {
    public final float f35594a;
    public final int f35595b;
    public final int f35596c;
    public final Activity d;
    public final cv f35597e;

    public bv(cv cvVar, float f10, int i10, int i11, Activity activity) {
        this.f35597e = cvVar;
        this.f35594a = f10;
        this.f35595b = i10;
        this.f35596c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f35594a) / 150.0f));
        dv dvVar = this.f35597e.f35917c;
        dvVar.f36314n = i0.a.d(max, this.f35595b, this.f35596c);
        int i10 = dvVar.f36314n;
        Activity activity = this.d;
        boolean z4 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(dvVar.f36314n) >= 0.721f) {
            z4 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z4);
    }
}
