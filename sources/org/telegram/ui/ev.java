package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ev implements ValueAnimator.AnimatorUpdateListener {
    public final float f32613a;
    public final int f32614b;
    public final int f32615c;
    public final Activity d;
    public final fv e;

    public ev(fv fvVar, float f7, int i10, int i11, Activity activity) {
        this.e = fvVar;
        this.f32613a = f7;
        this.f32614b = i10;
        this.f32615c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f32613a) / 150.0f));
        hv hvVar = this.e.f32923c;
        hvVar.f33467n = i0.a.d(max, this.f32614b, this.f32615c);
        int i10 = hvVar.f33467n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(hvVar.f33467n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
