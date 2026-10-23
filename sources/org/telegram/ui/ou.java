package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ou implements ValueAnimator.AnimatorUpdateListener {
    public final float f39985a;
    public final int f39986b;
    public final int f39987c;
    public final Activity d;
    public final pu e;

    public ou(pu puVar, float f7, int i10, int i11, Activity activity) {
        this.e = puVar;
        this.f39985a = f7;
        this.f39986b = i10;
        this.f39987c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f39985a) / 150.0f));
        ru ruVar = this.e.f40304c;
        ruVar.f41289n = i0.a.f(max, this.f39986b, this.f39987c);
        int i10 = ruVar.f41289n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(ruVar.f41289n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
