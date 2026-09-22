package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class dv implements ValueAnimator.AnimatorUpdateListener {
    public final float f33160a;
    public final int f33161b;
    public final int f33162c;
    public final Activity d;
    public final ev e;

    public dv(ev evVar, float f7, int i10, int i11, Activity activity) {
        this.e = evVar;
        this.f33160a = f7;
        this.f33161b = i10;
        this.f33162c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f33160a) / 150.0f));
        gv gvVar = this.e.f33433c;
        gvVar.f34003n = i0.a.d(max, this.f33161b, this.f33162c);
        int i10 = gvVar.f34003n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(gvVar.f34003n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
