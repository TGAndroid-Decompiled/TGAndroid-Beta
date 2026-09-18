package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class dv implements ValueAnimator.AnimatorUpdateListener {
    public final float f33089a;
    public final int f33090b;
    public final int f33091c;
    public final Activity d;
    public final ev e;

    public dv(ev evVar, float f7, int i10, int i11, Activity activity) {
        this.e = evVar;
        this.f33089a = f7;
        this.f33090b = i10;
        this.f33091c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f33089a) / 150.0f));
        gv gvVar = this.e.f33364c;
        gvVar.f33951n = i0.a.d(max, this.f33090b, this.f33091c);
        int i10 = gvVar.f33951n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(gvVar.f33951n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
