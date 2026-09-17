package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ev implements ValueAnimator.AnimatorUpdateListener {
    public final float f33477a;
    public final int f33478b;
    public final int f33479c;
    public final Activity d;
    public final fv e;

    public ev(fv fvVar, float f7, int i10, int i11, Activity activity) {
        this.e = fvVar;
        this.f33477a = f7;
        this.f33478b = i10;
        this.f33479c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f33477a) / 150.0f));
        hv hvVar = this.e.f33762c;
        hvVar.f34357n = i0.a.d(max, this.f33478b, this.f33479c);
        int i10 = hvVar.f34357n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(hvVar.f34357n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
