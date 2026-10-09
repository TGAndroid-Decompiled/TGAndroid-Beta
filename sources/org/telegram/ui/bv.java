package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class bv implements ValueAnimator.AnimatorUpdateListener {
    public final float f36433a;
    public final int f36434b;
    public final int f36435c;
    public final Activity d;
    public final cv f36436e;

    public bv(cv cvVar, float f7, int i10, int i11, Activity activity) {
        this.f36436e = cvVar;
        this.f36433a = f7;
        this.f36434b = i10;
        this.f36435c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f36433a) / 150.0f));
        ev evVar = this.f36436e.f36741c;
        evVar.f37350n = i0.a.d(max, this.f36434b, this.f36435c);
        int i10 = evVar.f37350n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(evVar.f37350n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
