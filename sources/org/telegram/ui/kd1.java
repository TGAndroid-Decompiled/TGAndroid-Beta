package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.animation.LinearInterpolator;
public final class kd1 implements Runnable {
    public final int f38851a;
    public final zd1 f38852b;

    public kd1(zd1 zd1Var, int i10) {
        this.f38851a = i10;
        this.f38852b = zd1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38851a) {
            case 0:
                this.f38852b.f43973u0.b();
                return;
            case 1:
                this.f38852b.f43973u0.b();
                return;
            case 2:
                this.f38852b.f43973u0.b();
                return;
            case 3:
                this.f38852b.f43973u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.c1 c1Var = this.f38852b.Z;
                c1Var.f31407c0 = false;
                c1Var.invalidate();
                return;
            case 5:
                zd1 zd1Var = this.f38852b;
                zd1Var.f43967q0 = zd1Var.f43966p0;
                zd1Var.G();
                return;
            case 6:
                this.f38852b.A();
                return;
            case 7:
                int[] iArr = new int[2];
                zd1 zd1Var2 = this.f38852b;
                zd1Var2.f43946e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                zd1Var2.e.getLocationOnScreen(iArr);
                zd1Var2.e.setTranslationX(org.telegram.messenger.i0.L(42.0f) + (i10 - iArr[0]));
                zd1Var2.e.setTranslationY(org.telegram.messenger.i0.L(44.0f) + (i11 - iArr[1]));
                zd1Var2.h.getLocationOnScreen(iArr);
                zd1Var2.h.setTranslationX(org.telegram.messenger.i0.L(42.0f) + (i10 - iArr[0]));
                zd1Var2.h.setTranslationY(org.telegram.messenger.i0.L(44.0f) + (i11 - iArr[1]));
                zd1Var2.f43948f.getLocationOnScreen(iArr);
                zd1Var2.f43948f.setTranslationX(org.telegram.messenger.i0.L(42.0f) + (i10 - iArr[0]));
                zd1Var2.f43948f.setTranslationY(org.telegram.messenger.i0.L(44.0f) + (i11 - iArr[1]));
                zd1Var2.f43963n.getLocationOnScreen(iArr);
                zd1Var2.f43963n.setTranslationX((((zd1Var2.f43946e0.getWidth() + i10) - iArr[0]) - org.telegram.messenger.i0.L(49.0f)) - org.telegram.messenger.i0.L(60.0f));
                zd1Var2.f43963n.setTranslationY(org.telegram.messenger.i0.L(44.0f) + (i11 - iArr[1]));
                zd1Var2.f43963n.setAlpha(1.0f);
                zd1Var2.e.setAlpha(1.0f);
                zd1Var2.h.setAlpha(1.0f);
                zd1Var2.f43948f.setAlpha(1.0f);
                long j10 = 200;
                zd1Var2.f43963n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                zd1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                zd1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                zd1Var2.f43948f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                return;
            case 8:
                this.f38852b.f43973u0.b();
                return;
            case 9:
                int i12 = org.telegram.messenger.uz.f18515f1;
                if (i12 < 2) {
                    org.telegram.messenger.uz.f18515f1 = i12 + 1;
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.uz.f18515f1);
                    edit.apply();
                    zd1 zd1Var3 = this.f38852b;
                    zd1Var3.O0.setTranslationY(zd1Var3.N.getY() + org.telegram.messenger.i0.L(36.0f));
                    zd1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f38852b.f43973u0.b();
                return;
            case 11:
                zd1 zd1Var4 = this.f38852b;
                zd1Var4.f43973u0.setAlpha(1.0f);
                zd1Var4.f43973u0.invalidate();
                ValueAnimator b10 = zd1Var4.b(true);
                zd1Var4.H.setAlpha(0.0f);
                zd1Var4.I.setAlpha(0.0f);
                zd1Var4.N.setAlpha(0.0f);
                zd1Var4.X.setAlpha(0.0f);
                zd1Var4.f43957j0.setAlpha(0.0f);
                zd1Var4.f43953h0.setAlpha(0.0f);
                zd1Var4.f43955i0.setAlpha(0.0f);
                zd1Var4.K.setAlpha(0.0f);
                zd1Var4.M0.setAlpha(0.0f);
                zd1Var4.Y.f31405b0 = true;
                org.telegram.messenger.i0.h3(new y01(23, zd1Var4, b10), 32L);
                return;
            case 12:
                zd1 zd1Var5 = this.f38852b;
                zd1Var5.R0 = false;
                org.telegram.ui.Components.voip.l2 l2Var = zd1Var5.N0;
                if (l2Var != null && l2Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (zd1Var5.f43981z0 && zd1Var5.f43978x0 && !zd1Var5.C0 && !z10) {
                    zd1Var5.K0 = System.currentTimeMillis();
                    zd1Var5.z(false);
                    zd1Var5.f43967q0 = zd1Var5.f43966p0;
                    zd1Var5.G();
                    return;
                }
                return;
            default:
                zd1 zd1Var6 = this.f38852b;
                if (zd1Var6.f43966p0 == 3) {
                    zd1Var6.D.b(true, false);
                    org.telegram.ui.Components.voip.k2 k2Var = zd1Var6.f43975w;
                    if (!k2Var.R) {
                        k2Var.R = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
