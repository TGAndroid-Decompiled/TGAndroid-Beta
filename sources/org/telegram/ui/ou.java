package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ou implements ValueAnimator.AnimatorUpdateListener {
    public final float f39981a;
    public final int f39982b;
    public final int f39983c;
    public final Activity d;
    public final pu e;

    public ou(pu puVar, float f7, int i10, int i11, Activity activity) {
        this.e = puVar;
        this.f39981a = f7;
        this.f39982b = i10;
        this.f39983c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f39981a) / 150.0f));
        ru ruVar = this.e.f40300c;
        ruVar.f41285n = i0.a.f(max, this.f39982b, this.f39983c);
        int i10 = ruVar.f41285n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(ruVar.f41285n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
