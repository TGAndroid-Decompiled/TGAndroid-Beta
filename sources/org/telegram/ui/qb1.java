package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.animation.LinearInterpolator;
public final class qb1 implements Runnable {
    public final int f50541a;
    public final ec1 f50542b;

    public qb1(ec1 ec1Var, int i7) {
        this.f50541a = i7;
        this.f50542b = ec1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f50541a) {
            case 0:
                this.f50542b.f46709u0.b();
                return;
            case 1:
                this.f50542b.f46709u0.b();
                return;
            case 2:
                this.f50542b.f46709u0.b();
                return;
            case 3:
                this.f50542b.f46709u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.r1 r1Var = this.f50542b.f46672a0;
                r1Var.f40903d0 = false;
                r1Var.invalidate();
                return;
            case 5:
                ec1 ec1Var = this.f50542b;
                ec1Var.f46703q0 = ec1Var.f46702p0;
                ec1Var.y();
                return;
            case 6:
                this.f50542b.s();
                return;
            case 7:
                int[] iArr = new int[2];
                ec1 ec1Var2 = this.f50542b;
                ec1Var2.f46686f0.getLocationOnScreen(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                ec1Var2.f46682e.getLocationOnScreen(iArr);
                ec1Var2.f46682e.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                ec1Var2.f46682e.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ec1Var2.h.getLocationOnScreen(iArr);
                ec1Var2.h.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                ec1Var2.h.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ec1Var2.f46685f.getLocationOnScreen(iArr);
                ec1Var2.f46685f.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                ec1Var2.f46685f.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ec1Var2.f46699n.getLocationOnScreen(iArr);
                ec1Var2.f46699n.setTranslationX((((ec1Var2.f46686f0.getWidth() + i7) - iArr[0]) - org.telegram.messenger.g0.L(49.0f)) - org.telegram.messenger.g0.L(60.0f));
                ec1Var2.f46699n.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ec1Var2.f46699n.setAlpha(1.0f);
                ec1Var2.f46682e.setAlpha(1.0f);
                ec1Var2.h.setAlpha(1.0f);
                ec1Var2.f46685f.setAlpha(1.0f);
                long j3 = 200;
                ec1Var2.f46699n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ec1Var2.f46682e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ec1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ec1Var2.f46685f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f50542b.f46709u0.b();
                return;
            case 9:
                int i11 = org.telegram.messenger.gz.f23948f1;
                if (i11 < 2) {
                    org.telegram.messenger.gz.f23948f1 = i11 + 1;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.gz.f23948f1);
                    edit.apply();
                    ec1 ec1Var3 = this.f50542b;
                    ec1Var3.O0.setTranslationY(ec1Var3.O.getY() + org.telegram.messenger.g0.L(36.0f));
                    ec1Var3.O0.w();
                    return;
                }
                return;
            case 10:
                this.f50542b.f46709u0.b();
                return;
            case 11:
                ec1 ec1Var4 = this.f50542b;
                ec1Var4.f46709u0.setAlpha(1.0f);
                ec1Var4.f46709u0.invalidate();
                ValueAnimator b10 = ec1Var4.b(true);
                ec1Var4.I.setAlpha(0.0f);
                ec1Var4.J.setAlpha(0.0f);
                ec1Var4.O.setAlpha(0.0f);
                ec1Var4.Y.setAlpha(0.0f);
                ec1Var4.f46694j0.setAlpha(0.0f);
                ec1Var4.f46690h0.setAlpha(0.0f);
                ec1Var4.f46692i0.setAlpha(0.0f);
                ec1Var4.L.setAlpha(0.0f);
                ec1Var4.M0.setAlpha(0.0f);
                ec1Var4.Z.f40902c0 = true;
                org.telegram.messenger.g0.i3(new fy0(26, ec1Var4, b10), 32L);
                return;
            case 12:
                ec1 ec1Var5 = this.f50542b;
                ec1Var5.R0 = false;
                org.telegram.ui.Components.ip ipVar = ec1Var5.N0;
                if (ipVar != null && ipVar.W) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ec1Var5.f46717z0 && ec1Var5.f46714x0 && !ec1Var5.C0 && !z10) {
                    ec1Var5.K0 = System.currentTimeMillis();
                    ec1Var5.r(false);
                    ec1Var5.f46703q0 = ec1Var5.f46702p0;
                    ec1Var5.y();
                    return;
                }
                return;
            case 13:
                ec1 ec1Var6 = this.f50542b;
                if (ec1Var6.f46702p0 == 3) {
                    ec1Var6.E.b(true, false);
                    org.telegram.ui.Components.voip.y2 y2Var = ec1Var6.f46711w;
                    if (!y2Var.S) {
                        y2Var.S = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                ec1 ec1Var7 = this.f50542b;
                if (!ec1Var7.G0 && !ec1Var7.E0) {
                    ec1Var7.g();
                    return;
                }
                return;
        }
    }
}
