package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class bv implements ValueAnimator.AnimatorUpdateListener {
    public final float f36435a;
    public final int f36436b;
    public final int f36437c;
    public final Activity d;
    public final cv f36438e;

    public bv(cv cvVar, float f7, int i10, int i11, Activity activity) {
        this.f36438e = cvVar;
        this.f36435a = f7;
        this.f36436b = i10;
        this.f36437c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f36435a) / 150.0f));
        ev evVar = this.f36438e.f36743c;
        evVar.f37352n = i0.a.d(max, this.f36436b, this.f36437c);
        int i10 = evVar.f37352n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(evVar.f37352n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
