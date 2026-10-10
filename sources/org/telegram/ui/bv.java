package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class bv implements ValueAnimator.AnimatorUpdateListener {
    public final float f36479a;
    public final int f36480b;
    public final int f36481c;
    public final Activity d;
    public final cv f36482e;

    public bv(cv cvVar, float f7, int i10, int i11, Activity activity) {
        this.f36482e = cvVar;
        this.f36479a = f7;
        this.f36480b = i10;
        this.f36481c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f36479a) / 150.0f));
        ev evVar = this.f36482e.f36787c;
        evVar.f37396n = i0.a.d(max, this.f36480b, this.f36481c);
        int i10 = evVar.f37396n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(evVar.f37396n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
