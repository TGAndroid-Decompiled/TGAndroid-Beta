package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class cv implements ValueAnimator.AnimatorUpdateListener {
    public final float f32872a;
    public final int f32873b;
    public final int f32874c;
    public final Activity d;
    public final dv e;

    public cv(dv dvVar, float f7, int i10, int i11, Activity activity) {
        this.e = dvVar;
        this.f32872a = f7;
        this.f32873b = i10;
        this.f32874c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f32872a) / 150.0f));
        fv fvVar = this.e.f33095c;
        fvVar.f33695n = i0.a.d(max, this.f32873b, this.f32874c);
        int i10 = fvVar.f33695n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(fvVar.f33695n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
