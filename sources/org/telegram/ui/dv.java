package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class dv implements ValueAnimator.AnimatorUpdateListener {
    public final float f35871a;
    public final int f35872b;
    public final int f35873c;
    public final Activity d;
    public final ev f35874e;

    public dv(ev evVar, float f7, int i10, int i11, Activity activity) {
        this.f35874e = evVar;
        this.f35871a = f7;
        this.f35872b = i10;
        this.f35873c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f35871a) / 150.0f));
        gv gvVar = this.f35874e.f36186c;
        gvVar.f36797n = i0.a.d(max, this.f35872b, this.f35873c);
        int i10 = gvVar.f36797n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(gvVar.f36797n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
