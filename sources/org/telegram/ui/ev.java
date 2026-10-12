package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ev implements ValueAnimator.AnimatorUpdateListener {
    public final float f37557a;
    public final int f37558b;
    public final int f37559c;
    public final Activity d;
    public final fv f37560e;

    public ev(fv fvVar, float f7, int i10, int i11, Activity activity) {
        this.f37560e = fvVar;
        this.f37557a = f7;
        this.f37558b = i10;
        this.f37559c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f37557a) / 150.0f));
        hv hvVar = this.f37560e.f37852c;
        hvVar.f38547n = i0.a.d(max, this.f37558b, this.f37559c);
        int i10 = hvVar.f38547n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(hvVar.f38547n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
