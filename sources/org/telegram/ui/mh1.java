package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class mh1 implements Runnable {
    public final int f39158a;
    public final ci1 f39159b;

    public mh1(ci1 ci1Var, int i10) {
        this.f39158a = i10;
        this.f39159b = ci1Var;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f39158a) {
            case 0:
                this.f39159b.f35851r0.b();
                return;
            case 1:
                this.f39159b.f35851r0.b();
                return;
            case 2:
                this.f39159b.f35851r0.b();
                return;
            case 3:
                this.f39159b.f35851r0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.t1 t1Var = this.f39159b.W;
                t1Var.W = false;
                t1Var.invalidate();
                return;
            case 5:
                ci1 ci1Var = this.f39159b;
                ci1Var.f35846n0 = ci1Var.m0;
                ci1Var.H();
                return;
            case 6:
                this.f39159b.B();
                return;
            case 7:
                int[] iArr = new int[2];
                ci1 ci1Var2 = this.f39159b;
                ci1Var2.f35822b0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                ci1Var2.f35829e.getLocationOnScreen(iArr);
                ci1Var2.f35829e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ci1Var2.f35829e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ci1Var2.h.getLocationOnScreen(iArr);
                ci1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ci1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ci1Var2.f35832f.getLocationOnScreen(iArr);
                ci1Var2.f35832f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ci1Var2.f35832f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ci1Var2.f35845n.getLocationOnScreen(iArr);
                ci1Var2.f35845n.setTranslationX((((ci1Var2.f35822b0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                ci1Var2.f35845n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ci1Var2.f35845n.setAlpha(1.0f);
                ci1Var2.f35829e.setAlpha(1.0f);
                ci1Var2.h.setAlpha(1.0f);
                ci1Var2.f35832f.setAlpha(1.0f);
                long j10 = 200;
                ci1Var2.f35845n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ci1Var2.f35829e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ci1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ci1Var2.f35832f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                return;
            case 8:
                this.f39159b.f35851r0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    ci1 ci1Var3 = this.f39159b;
                    ci1Var3.L0.setTranslationY(ci1Var3.K.getY() + AndroidUtilities.dp(36.0f));
                    ci1Var3.L0.v();
                    return;
                }
                return;
            case 10:
                this.f39159b.f35851r0.b();
                return;
            case 11:
                ci1 ci1Var4 = this.f39159b;
                ci1Var4.f35851r0.setAlpha(1.0f);
                ci1Var4.f35851r0.invalidate();
                ValueAnimator k10 = ci1Var4.k(true);
                ci1Var4.E.setAlpha(0.0f);
                ci1Var4.F.setAlpha(0.0f);
                ci1Var4.K.setAlpha(0.0f);
                ci1Var4.U.setAlpha(0.0f);
                ci1Var4.f35835g0.setAlpha(0.0f);
                ci1Var4.f35830e0.setAlpha(0.0f);
                ci1Var4.f35833f0.setAlpha(0.0f);
                ci1Var4.H.setAlpha(0.0f);
                ci1Var4.J0.setAlpha(0.0f);
                ci1Var4.V.V = true;
                AndroidUtilities.runOnUIThread(new mg1(3, ci1Var4, k10), 32L);
                return;
            case 12:
                ci1 ci1Var5 = this.f39159b;
                ci1Var5.O0 = false;
                org.telegram.ui.Components.voip.e3 e3Var = ci1Var5.K0;
                if (e3Var != null && e3Var.S) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ci1Var5.f35858w0 && ci1Var5.f35855u0 && !ci1Var5.f35863z0 && !z4) {
                    ci1Var5.H0 = System.currentTimeMillis();
                    ci1Var5.A(false);
                    ci1Var5.f35846n0 = ci1Var5.m0;
                    ci1Var5.H();
                    return;
                }
                return;
            default:
                ci1 ci1Var6 = this.f39159b;
                if (ci1Var6.m0 == 3) {
                    ci1Var6.f35861y.b(true, false);
                    org.telegram.ui.Components.voip.d3 d3Var = ci1Var6.v;
                    if (!d3Var.O) {
                        d3Var.O = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
