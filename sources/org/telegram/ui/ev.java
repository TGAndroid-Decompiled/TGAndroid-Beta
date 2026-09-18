package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ev implements ValueAnimator.AnimatorUpdateListener {
    public final float f33481a;
    public final int f33482b;
    public final int f33483c;
    public final Activity d;
    public final fv e;

    public ev(fv fvVar, float f7, int i10, int i11, Activity activity) {
        this.e = fvVar;
        this.f33481a = f7;
        this.f33482b = i10;
        this.f33483c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f33481a) / 150.0f));
        hv hvVar = this.e.f33766c;
        hvVar.f34362n = i0.a.d(max, this.f33482b, this.f33483c);
        int i10 = hvVar.f34362n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(hvVar.f34362n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
