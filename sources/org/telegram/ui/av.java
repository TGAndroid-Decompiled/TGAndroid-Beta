package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class av implements ValueAnimator.AnimatorUpdateListener {
    public final float f32154a;
    public final int f32155b;
    public final int f32156c;
    public final Activity d;
    public final bv e;

    public av(bv bvVar, float f7, int i10, int i11, Activity activity) {
        this.e = bvVar;
        this.f32154a = f7;
        this.f32155b = i10;
        this.f32156c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f32154a) / 150.0f));
        dv dvVar = this.e.f32444c;
        dvVar.f33043n = i0.a.d(max, this.f32155b, this.f32156c);
        int i10 = dvVar.f33043n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(dvVar.f33043n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
