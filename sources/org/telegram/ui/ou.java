package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ou implements ValueAnimator.AnimatorUpdateListener {
    public final float f42290a;
    public final int f42291b;
    public final int f42292c;
    public final Activity d;
    public final pu e;

    public ou(pu puVar, float f7, int i10, int i11, Activity activity) {
        this.e = puVar;
        this.f42290a = f7;
        this.f42291b = i10;
        this.f42292c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f42290a) / 150.0f));
        ru ruVar = this.e.f42661c;
        ruVar.f43294n = i0.a.f(max, this.f42291b, this.f42292c);
        int i10 = ruVar.f43294n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(ruVar.f43294n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
