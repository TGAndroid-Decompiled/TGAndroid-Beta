package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class dv implements ValueAnimator.AnimatorUpdateListener {
    public final float f35897a;
    public final int f35898b;
    public final int f35899c;
    public final Activity d;
    public final ev f35900e;

    public dv(ev evVar, float f7, int i10, int i11, Activity activity) {
        this.f35900e = evVar;
        this.f35897a = f7;
        this.f35898b = i10;
        this.f35899c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f35897a) / 150.0f));
        gv gvVar = this.f35900e.f36212c;
        gvVar.f36823n = i0.a.d(max, this.f35898b, this.f35899c);
        int i10 = gvVar.f36823n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(gvVar.f36823n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
