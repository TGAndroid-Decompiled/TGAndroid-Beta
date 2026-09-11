package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class dv implements ValueAnimator.AnimatorUpdateListener {
    public final float f35870a;
    public final int f35871b;
    public final int f35872c;
    public final Activity d;
    public final ev f35873e;

    public dv(ev evVar, float f7, int i10, int i11, Activity activity) {
        this.f35873e = evVar;
        this.f35870a = f7;
        this.f35871b = i10;
        this.f35872c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f35870a) / 150.0f));
        gv gvVar = this.f35873e.f36185c;
        gvVar.f36796n = i0.a.d(max, this.f35871b, this.f35872c);
        int i10 = gvVar.f36796n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(gvVar.f36796n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
