package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class bv implements ValueAnimator.AnimatorUpdateListener {
    public final float f35602a;
    public final int f35603b;
    public final int f35604c;
    public final Activity d;
    public final cv f35605e;

    public bv(cv cvVar, float f10, int i10, int i11, Activity activity) {
        this.f35605e = cvVar;
        this.f35602a = f10;
        this.f35603b = i10;
        this.f35604c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f35602a) / 150.0f));
        dv dvVar = this.f35605e.f35862c;
        dvVar.f36266n = i0.a.d(max, this.f35603b, this.f35604c);
        int i10 = dvVar.f36266n;
        Activity activity = this.d;
        boolean z4 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(dvVar.f36266n) >= 0.721f) {
            z4 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z4);
    }
}
