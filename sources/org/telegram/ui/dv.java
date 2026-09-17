package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class dv implements ValueAnimator.AnimatorUpdateListener {
    public final float f35898a;
    public final int f35899b;
    public final int f35900c;
    public final Activity d;
    public final ev f35901e;

    public dv(ev evVar, float f7, int i10, int i11, Activity activity) {
        this.f35901e = evVar;
        this.f35898a = f7;
        this.f35899b = i10;
        this.f35900c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f35898a) / 150.0f));
        gv gvVar = this.f35901e.f36213c;
        gvVar.f36824n = i0.a.d(max, this.f35899b, this.f35900c);
        int i10 = gvVar.f36824n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(gvVar.f36824n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
