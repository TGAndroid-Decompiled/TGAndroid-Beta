package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ev implements ValueAnimator.AnimatorUpdateListener {
    public final float f37553a;
    public final int f37554b;
    public final int f37555c;
    public final Activity d;
    public final fv f37556e;

    public ev(fv fvVar, float f7, int i10, int i11, Activity activity) {
        this.f37556e = fvVar;
        this.f37553a = f7;
        this.f37554b = i10;
        this.f37555c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f37553a) / 150.0f));
        hv hvVar = this.f37556e.f37854c;
        hvVar.f38544n = i0.a.d(max, this.f37554b, this.f37555c);
        int i10 = hvVar.f38544n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(hvVar.f38544n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
