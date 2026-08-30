package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class av implements ValueAnimator.AnimatorUpdateListener {
    public final float f32707a;
    public final int f32708b;
    public final int f32709c;
    public final Activity d;
    public final bv e;

    public av(bv bvVar, float f10, int i10, int i11, Activity activity) {
        this.e = bvVar;
        this.f32707a = f10;
        this.f32708b = i10;
        this.f32709c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f32707a) / 150.0f));
        cv cvVar = this.e.f33036c;
        cvVar.f33435n = i0.a.d(max, this.f32708b, this.f32709c);
        int i10 = cvVar.f33435n;
        Activity activity = this.d;
        boolean z4 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(cvVar.f33435n) >= 0.721f) {
            z4 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z4);
    }
}
