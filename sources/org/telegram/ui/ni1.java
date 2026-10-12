package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ni1 implements Runnable {
    public final int f38727a;
    public final dj1 f38728b;

    public ni1(dj1 dj1Var, int i10) {
        this.f38727a = i10;
        this.f38728b = dj1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38727a) {
            case 0:
                this.f38728b.f35312u0.b();
                return;
            case 1:
                this.f38728b.f35312u0.b();
                return;
            case 2:
                this.f38728b.f35312u0.b();
                return;
            case 3:
                this.f38728b.f35312u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.s1 s1Var = this.f38728b.Z;
                s1Var.f30454c0 = false;
                s1Var.invalidate();
                return;
            case 5:
                dj1 dj1Var = this.f38728b;
                dj1Var.f35306q0 = dj1Var.f35305p0;
                dj1Var.G();
                return;
            case 6:
                this.f38728b.A();
                return;
            case 7:
                int[] iArr = new int[2];
                dj1 dj1Var2 = this.f38728b;
                dj1Var2.f35285e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                dj1Var2.e.getLocationOnScreen(iArr);
                dj1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                dj1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                dj1Var2.h.getLocationOnScreen(iArr);
                dj1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                dj1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                dj1Var2.f35287f.getLocationOnScreen(iArr);
                dj1Var2.f35287f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                dj1Var2.f35287f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                dj1Var2.f35302n.getLocationOnScreen(iArr);
                dj1Var2.f35302n.setTranslationX((((dj1Var2.f35285e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                dj1Var2.f35302n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                dj1Var2.f35302n.setAlpha(1.0f);
                dj1Var2.e.setAlpha(1.0f);
                dj1Var2.h.setAlpha(1.0f);
                dj1Var2.f35287f.setAlpha(1.0f);
                long j10 = 200;
                dj1Var2.f35302n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                dj1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                dj1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                dj1Var2.f35287f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                return;
            case 8:
                this.f38728b.f35312u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    dj1 dj1Var3 = this.f38728b;
                    dj1Var3.O0.setTranslationY(dj1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    dj1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f38728b.f35312u0.b();
                return;
            case 11:
                dj1 dj1Var4 = this.f38728b;
                dj1Var4.f35312u0.setAlpha(1.0f);
                dj1Var4.f35312u0.invalidate();
                ValueAnimator j11 = dj1Var4.j(true);
                dj1Var4.H.setAlpha(0.0f);
                dj1Var4.I.setAlpha(0.0f);
                dj1Var4.N.setAlpha(0.0f);
                dj1Var4.X.setAlpha(0.0f);
                dj1Var4.f35296j0.setAlpha(0.0f);
                dj1Var4.f35292h0.setAlpha(0.0f);
                dj1Var4.f35294i0.setAlpha(0.0f);
                dj1Var4.K.setAlpha(0.0f);
                dj1Var4.M0.setAlpha(0.0f);
                dj1Var4.Y.f30452b0 = true;
                AndroidUtilities.runOnUIThread(new je1(11, dj1Var4, j11), 32L);
                return;
            case 12:
                dj1 dj1Var5 = this.f38728b;
                dj1Var5.R0 = false;
                org.telegram.ui.Components.voip.c3 c3Var = dj1Var5.N0;
                if (c3Var != null && c3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (dj1Var5.f35320z0 && dj1Var5.f35317x0 && !dj1Var5.C0 && !z10) {
                    dj1Var5.K0 = System.currentTimeMillis();
                    dj1Var5.z(false);
                    dj1Var5.f35306q0 = dj1Var5.f35305p0;
                    dj1Var5.G();
                    return;
                }
                return;
            default:
                dj1 dj1Var6 = this.f38728b;
                if (dj1Var6.f35305p0 == 3) {
                    dj1Var6.f35318y.b(true, false);
                    org.telegram.ui.Components.voip.b3 b3Var = dj1Var6.v;
                    if (!b3Var.R) {
                        b3Var.R = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
