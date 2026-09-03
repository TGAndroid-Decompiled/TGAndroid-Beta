package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class cv implements ValueAnimator.AnimatorUpdateListener {
    public final float f33222a;
    public final int f33223b;
    public final int f33224c;
    public final Activity d;
    public final dv e;

    public cv(dv dvVar, float f10, int i10, int i11, Activity activity) {
        this.e = dvVar;
        this.f33222a = f10;
        this.f33223b = i10;
        this.f33224c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f33222a) / 150.0f));
        ev evVar = this.e.f33536c;
        evVar.f33862n = i0.a.d(max, this.f33223b, this.f33224c);
        int i10 = evVar.f33862n;
        Activity activity = this.d;
        boolean z4 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(evVar.f33862n) >= 0.721f) {
            z4 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z4);
    }
}
