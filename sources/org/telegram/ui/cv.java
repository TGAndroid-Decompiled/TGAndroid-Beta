package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class cv implements ValueAnimator.AnimatorUpdateListener {
    public final float f35561a;
    public final int f35562b;
    public final int f35563c;
    public final Activity d;
    public final dv f35564e;

    public cv(dv dvVar, float f7, int i10, int i11, Activity activity) {
        this.f35564e = dvVar;
        this.f35561a = f7;
        this.f35562b = i10;
        this.f35563c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f35561a) / 150.0f));
        fv fvVar = this.f35564e.f35847c;
        fvVar.f36407n = i0.a.d(max, this.f35562b, this.f35563c);
        int i10 = fvVar.f36407n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(fvVar.f36407n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
