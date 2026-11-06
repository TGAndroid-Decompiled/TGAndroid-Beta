package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.animation.LinearInterpolator;
public final class qb1 implements Runnable {
    public final int f49186a;
    public final ec1 f49187b;

    public qb1(ec1 ec1Var, int i7) {
        this.f49186a = i7;
        this.f49187b = ec1Var;
    }

    @Override
    public final void run() {
        boolean z9;
        switch (this.f49186a) {
            case 0:
                this.f49187b.f45308t0.b();
                return;
            case 1:
                this.f49187b.f45308t0.b();
                return;
            case 2:
                this.f49187b.f45308t0.b();
                return;
            case 3:
                this.f49187b.f45308t0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.n1 n1Var = this.f49187b.Z;
                n1Var.f39365c0 = false;
                n1Var.invalidate();
                return;
            case 5:
                ec1 ec1Var = this.f49187b;
                ec1Var.f45302p0 = ec1Var.f45301o0;
                ec1Var.y();
                return;
            case 6:
                this.f49187b.s();
                return;
            case 7:
                int[] iArr = new int[2];
                ec1 ec1Var2 = this.f49187b;
                ec1Var2.f45283e0.getLocationOnScreen(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                ec1Var2.f45282e.getLocationOnScreen(iArr);
                ec1Var2.f45282e.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                ec1Var2.f45282e.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ec1Var2.h.getLocationOnScreen(iArr);
                ec1Var2.h.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                ec1Var2.h.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ec1Var2.f45285f.getLocationOnScreen(iArr);
                ec1Var2.f45285f.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                ec1Var2.f45285f.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ec1Var2.f45299n.getLocationOnScreen(iArr);
                ec1Var2.f45299n.setTranslationX((((ec1Var2.f45283e0.getWidth() + i7) - iArr[0]) - org.telegram.messenger.g0.L(49.0f)) - org.telegram.messenger.g0.L(60.0f));
                ec1Var2.f45299n.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ec1Var2.f45299n.setAlpha(1.0f);
                ec1Var2.f45282e.setAlpha(1.0f);
                ec1Var2.h.setAlpha(1.0f);
                ec1Var2.f45285f.setAlpha(1.0f);
                long j3 = 200;
                ec1Var2.f45299n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ec1Var2.f45282e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ec1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ec1Var2.f45285f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f49187b.f45308t0.b();
                return;
            case 9:
                int i11 = org.telegram.messenger.iz.f23380f1;
                if (i11 < 2) {
                    org.telegram.messenger.iz.f23380f1 = i11 + 1;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.iz.f23380f1);
                    edit.apply();
                    ec1 ec1Var3 = this.f49187b;
                    ec1Var3.N0.setTranslationY(ec1Var3.N.getY() + org.telegram.messenger.g0.L(36.0f));
                    ec1Var3.N0.w();
                    return;
                }
                return;
            case 10:
                this.f49187b.f45308t0.b();
                return;
            case 11:
                ec1 ec1Var4 = this.f49187b;
                ec1Var4.f45308t0.setAlpha(1.0f);
                ec1Var4.f45308t0.invalidate();
                ValueAnimator b10 = ec1Var4.b(true);
                ec1Var4.H.setAlpha(0.0f);
                ec1Var4.I.setAlpha(0.0f);
                ec1Var4.N.setAlpha(0.0f);
                ec1Var4.X.setAlpha(0.0f);
                ec1Var4.f45292i0.setAlpha(0.0f);
                ec1Var4.f45288g0.setAlpha(0.0f);
                ec1Var4.f45290h0.setAlpha(0.0f);
                ec1Var4.K.setAlpha(0.0f);
                ec1Var4.L0.setAlpha(0.0f);
                ec1Var4.Y.f39363b0 = true;
                org.telegram.messenger.g0.i3(new by0(29, ec1Var4, b10), 32L);
                return;
            case 12:
                ec1 ec1Var5 = this.f49187b;
                ec1Var5.Q0 = false;
                org.telegram.ui.Components.zo zoVar = ec1Var5.M0;
                if (zoVar != null && zoVar.V) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (ec1Var5.f45316y0 && ec1Var5.f45312w0 && !ec1Var5.B0 && !z9) {
                    ec1Var5.J0 = System.currentTimeMillis();
                    ec1Var5.r(false);
                    ec1Var5.f45302p0 = ec1Var5.f45301o0;
                    ec1Var5.y();
                    return;
                }
                return;
            case 13:
                ec1 ec1Var6 = this.f49187b;
                if (ec1Var6.f45301o0 == 3) {
                    ec1Var6.D.b(true, false);
                    org.telegram.ui.Components.voip.u2 u2Var = ec1Var6.f45311w;
                    if (!u2Var.R) {
                        u2Var.R = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                ec1 ec1Var7 = this.f49187b;
                if (!ec1Var7.F0 && !ec1Var7.D0) {
                    ec1Var7.g();
                    return;
                }
                return;
        }
    }
}
