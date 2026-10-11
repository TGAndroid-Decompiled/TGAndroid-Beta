package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class av implements ValueAnimator.AnimatorUpdateListener {
    public final float f36211a;
    public final int f36212b;
    public final int f36213c;
    public final Activity d;
    public final bv f36214e;

    public av(bv bvVar, float f7, int i10, int i11, Activity activity) {
        this.f36214e = bvVar;
        this.f36211a = f7;
        this.f36212b = i10;
        this.f36213c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f36211a) / 150.0f));
        dv dvVar = this.f36214e.f36496c;
        dvVar.f37143n = i0.a.d(max, this.f36212b, this.f36213c);
        int i10 = dvVar.f37143n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(dvVar.f37143n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
