package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class av implements ValueAnimator.AnimatorUpdateListener {
    public final float f36177a;
    public final int f36178b;
    public final int f36179c;
    public final Activity d;
    public final bv f36180e;

    public av(bv bvVar, float f7, int i10, int i11, Activity activity) {
        this.f36180e = bvVar;
        this.f36177a = f7;
        this.f36178b = i10;
        this.f36179c = i11;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f36177a) / 150.0f));
        dv dvVar = this.f36180e.f36462c;
        dvVar.f37109n = i0.a.d(max, this.f36178b, this.f36179c);
        int i10 = dvVar.f37109n;
        Activity activity = this.d;
        boolean z10 = false;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        if (AndroidUtilities.computePerceivedBrightness(dvVar.f37109n) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(activity, z10);
    }
}
