package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class hv implements ValueAnimator.AnimatorUpdateListener {
    public final float f36961a;
    public final int f36962b;
    public final int f36963c;
    public final Activity d;
    public final iv e;

    public hv(iv ivVar, float f7, int i10, int i11, Activity activity) {
        this.e = ivVar;
        this.f36961a = f7;
        this.f36962b = i10;
        this.f36963c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f36961a) / 150.0f));
        kv kvVar = this.e.f37207c;
        kvVar.f37747n = i0.a.d(max, this.f36962b, this.f36963c);
        int i10 = kvVar.f37747n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(kvVar.f37747n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
