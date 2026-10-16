package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class hv implements ValueAnimator.AnimatorUpdateListener {
    public final float f36656a;
    public final int f36657b;
    public final int f36658c;
    public final Activity d;
    public final iv e;

    public hv(iv ivVar, float f7, int i10, int i11, Activity activity) {
        this.e = ivVar;
        this.f36656a = f7;
        this.f36657b = i10;
        this.f36658c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f36656a) / 150.0f));
        kv kvVar = this.e.f36873c;
        kvVar.f37531n = i0.a.d(max, this.f36657b, this.f36658c);
        int i10 = kvVar.f37531n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(kvVar.f37531n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
