package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class cv implements ValueAnimator.AnimatorUpdateListener {
    public final float f32862a;
    public final int f32863b;
    public final int f32864c;
    public final Activity d;
    public final dv e;

    public cv(dv dvVar, float f7, int i10, int i11, Activity activity) {
        this.e = dvVar;
        this.f32862a = f7;
        this.f32863b = i10;
        this.f32864c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f32862a) / 150.0f));
        fv fvVar = this.e.f33133c;
        fvVar.f33677n = i0.a.d(max, this.f32863b, this.f32864c);
        int i10 = fvVar.f33677n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(fvVar.f33677n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
