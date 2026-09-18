package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class di1 implements Runnable {
    public final int f33135a;
    public final ti1 f33136b;

    public di1(ti1 ti1Var, int i10) {
        this.f33135a = i10;
        this.f33136b = ti1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f33135a) {
            case 0:
                this.f33136b.f37799u0.b();
                return;
            case 1:
                this.f33136b.f37799u0.b();
                return;
            case 2:
                this.f33136b.f37799u0.b();
                return;
            case 3:
                this.f33136b.f37799u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.u1 u1Var = this.f33136b.Z;
                u1Var.f29263c0 = false;
                u1Var.invalidate();
                return;
            case 5:
                ti1 ti1Var = this.f33136b;
                ti1Var.f37793q0 = ti1Var.f37792p0;
                ti1Var.H();
                return;
            case 6:
                this.f33136b.B();
                return;
            case 7:
                int[] iArr = new int[2];
                ti1 ti1Var2 = this.f33136b;
                ti1Var2.f37772e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                ti1Var2.e.getLocationOnScreen(iArr);
                ti1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ti1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ti1Var2.h.getLocationOnScreen(iArr);
                ti1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ti1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ti1Var2.f37774f.getLocationOnScreen(iArr);
                ti1Var2.f37774f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ti1Var2.f37774f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ti1Var2.f37789n.getLocationOnScreen(iArr);
                ti1Var2.f37789n.setTranslationX((((ti1Var2.f37772e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                ti1Var2.f37789n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ti1Var2.f37789n.setAlpha(1.0f);
                ti1Var2.e.setAlpha(1.0f);
                ti1Var2.h.setAlpha(1.0f);
                ti1Var2.f37774f.setAlpha(1.0f);
                long j3 = 200;
                ti1Var2.f37789n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ti1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ti1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ti1Var2.f37774f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f33136b.f37799u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    ti1 ti1Var3 = this.f33136b;
                    ti1Var3.O0.setTranslationY(ti1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    ti1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f33136b.f37799u0.b();
                return;
            case 11:
                ti1 ti1Var4 = this.f33136b;
                ti1Var4.f37799u0.setAlpha(1.0f);
                ti1Var4.f37799u0.invalidate();
                ValueAnimator k10 = ti1Var4.k(true);
                ti1Var4.H.setAlpha(0.0f);
                ti1Var4.I.setAlpha(0.0f);
                ti1Var4.N.setAlpha(0.0f);
                ti1Var4.X.setAlpha(0.0f);
                ti1Var4.f37783j0.setAlpha(0.0f);
                ti1Var4.f37779h0.setAlpha(0.0f);
                ti1Var4.f37781i0.setAlpha(0.0f);
                ti1Var4.K.setAlpha(0.0f);
                ti1Var4.M0.setAlpha(0.0f);
                ti1Var4.Y.f29261b0 = true;
                AndroidUtilities.runOnUIThread(new qb1(16, ti1Var4, k10), 32L);
                return;
            case 12:
                ti1 ti1Var5 = this.f33136b;
                ti1Var5.R0 = false;
                org.telegram.ui.Components.voip.d3 d3Var = ti1Var5.N0;
                if (d3Var != null && d3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ti1Var5.f37807z0 && ti1Var5.f37804x0 && !ti1Var5.C0 && !z10) {
                    ti1Var5.K0 = System.currentTimeMillis();
                    ti1Var5.A(false);
                    ti1Var5.f37793q0 = ti1Var5.f37792p0;
                    ti1Var5.H();
                    return;
                }
                return;
            default:
                ti1 ti1Var6 = this.f33136b;
                if (ti1Var6.f37792p0 == 3) {
                    ti1Var6.f37805y.b(true, false);
                    org.telegram.ui.Components.voip.c3 c3Var = ti1Var6.v;
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
