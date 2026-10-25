package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ou implements ValueAnimator.AnimatorUpdateListener {
    public final float f42287a;
    public final int f42288b;
    public final int f42289c;
    public final Activity d;
    public final pu e;

    public ou(pu puVar, float f7, int i10, int i11, Activity activity) {
        this.e = puVar;
        this.f42287a = f7;
        this.f42288b = i10;
        this.f42289c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f42287a) / 150.0f));
        ru ruVar = this.e.f42658c;
        ruVar.f43291n = i0.a.f(max, this.f42288b, this.f42289c);
        int i10 = ruVar.f43291n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(ruVar.f43291n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
