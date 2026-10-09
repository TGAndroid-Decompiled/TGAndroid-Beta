package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class fi1 implements Runnable {
    public final int f37617a;
    public final wi1 f37618b;

    public fi1(wi1 wi1Var, int i10) {
        this.f37617a = i10;
        this.f37618b = wi1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f37617a) {
            case 0:
                this.f37618b.f43663u0.b();
                return;
            case 1:
                this.f37618b.f43663u0.b();
                return;
            case 2:
                this.f37618b.f43663u0.b();
                return;
            case 3:
                this.f37618b.f43663u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.u1 u1Var = this.f37618b.Z;
                u1Var.f32295c0 = false;
                u1Var.invalidate();
                return;
            case 5:
                wi1 wi1Var = this.f37618b;
                wi1Var.f43657q0 = wi1Var.f43656p0;
                wi1Var.G();
                return;
            case 6:
                this.f37618b.A();
                return;
            case 7:
                int[] iArr = new int[2];
                wi1 wi1Var2 = this.f37618b;
                wi1Var2.f43636e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                wi1Var2.f43635e.getLocationOnScreen(iArr);
                wi1Var2.f43635e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                wi1Var2.f43635e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                wi1Var2.h.getLocationOnScreen(iArr);
                wi1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                wi1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                wi1Var2.f43638f.getLocationOnScreen(iArr);
                wi1Var2.f43638f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                wi1Var2.f43638f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                wi1Var2.f43653n.getLocationOnScreen(iArr);
                wi1Var2.f43653n.setTranslationX((((wi1Var2.f43636e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                wi1Var2.f43653n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                wi1Var2.f43653n.setAlpha(1.0f);
                wi1Var2.f43635e.setAlpha(1.0f);
                wi1Var2.h.setAlpha(1.0f);
                wi1Var2.f43638f.setAlpha(1.0f);
                long j3 = 200;
                wi1Var2.f43653n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                wi1Var2.f43635e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                wi1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                wi1Var2.f43638f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f37618b.f43663u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    wi1 wi1Var3 = this.f37618b;
                    wi1Var3.O0.setTranslationY(wi1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    wi1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f37618b.f43663u0.b();
                return;
            case 11:
                wi1 wi1Var4 = this.f37618b;
                wi1Var4.f43663u0.setAlpha(1.0f);
                wi1Var4.f43663u0.invalidate();
                ValueAnimator j10 = wi1Var4.j(true);
                wi1Var4.H.setAlpha(0.0f);
                wi1Var4.I.setAlpha(0.0f);
                wi1Var4.N.setAlpha(0.0f);
                wi1Var4.X.setAlpha(0.0f);
                wi1Var4.f43647j0.setAlpha(0.0f);
                wi1Var4.f43643h0.setAlpha(0.0f);
                wi1Var4.f43645i0.setAlpha(0.0f);
                wi1Var4.K.setAlpha(0.0f);
                wi1Var4.M0.setAlpha(0.0f);
                wi1Var4.Y.f32293b0 = true;
                AndroidUtilities.runOnUIThread(new ii1(0, wi1Var4, j10), 32L);
                return;
            case 12:
                wi1 wi1Var5 = this.f37618b;
                wi1Var5.R0 = false;
                org.telegram.ui.Components.voip.d3 d3Var = wi1Var5.N0;
                if (d3Var != null && d3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (wi1Var5.f43671z0 && wi1Var5.f43668x0 && !wi1Var5.C0 && !z10) {
                    wi1Var5.K0 = System.currentTimeMillis();
                    wi1Var5.z(false);
                    wi1Var5.f43657q0 = wi1Var5.f43656p0;
                    wi1Var5.G();
                    return;
                }
                return;
            default:
                wi1 wi1Var6 = this.f37618b;
                if (wi1Var6.f43656p0 == 3) {
                    wi1Var6.f43669y.b(true, false);
                    org.telegram.ui.Components.voip.c3 c3Var = wi1Var6.v;
                    if (!c3Var.R) {
                        c3Var.R = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
