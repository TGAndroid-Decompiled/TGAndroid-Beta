package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
public final class pt implements ValueAnimator.AnimatorUpdateListener {
    public final float f48662a;
    public final int f48663b;
    public final int f48664c;
    public final Activity d;
    public final org.telegram.ui.Components.vd f48665e;

    public pt(org.telegram.ui.Components.vd vdVar, float f10, int i3, int i10, Activity activity) {
        this.f48665e = vdVar;
        this.f48662a = f10;
        this.f48663b = i3;
        this.f48664c = i10;
        this.d = activity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.f48662a) / 150.0f));
        rt rtVar = (rt) this.f48665e.d;
        rtVar.f49278n = i0.a.f(max, this.f48663b, this.f48664c);
        int i3 = rtVar.f49278n;
        Activity activity = this.d;
        boolean z10 = false;
        org.telegram.messenger.g0.t3(activity, i3, false);
        if (org.telegram.messenger.g0.B(rtVar.f49278n) >= 0.721f) {
            z10 = true;
        }
        org.telegram.messenger.g0.m3(activity, z10);
    }
}
