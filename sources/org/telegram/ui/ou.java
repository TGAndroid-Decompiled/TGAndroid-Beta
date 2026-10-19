package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ou implements ValueAnimator.AnimatorUpdateListener {
    public final float f39975a;
    public final int f39976b;
    public final int f39977c;
    public final Activity d;
    public final pu e;

    public ou(pu puVar, float f7, int i10, int i11, Activity activity) {
        this.e = puVar;
        this.f39975a = f7;
        this.f39976b = i10;
        this.f39977c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f39975a) / 150.0f));
        ru ruVar = this.e.f40294c;
        ruVar.f41279n = i0.a.f(max, this.f39976b, this.f39977c);
        int i10 = ruVar.f41279n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(ruVar.f41279n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
