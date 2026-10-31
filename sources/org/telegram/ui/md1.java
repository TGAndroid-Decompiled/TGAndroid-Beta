package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.animation.LinearInterpolator;
public final class md1 implements Runnable {
    public final int f39651a;
    public final be1 f39652b;

    public md1(be1 be1Var, int i10) {
        this.f39651a = i10;
        this.f39652b = be1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f39651a) {
            case 0:
                this.f39652b.f36234u0.b();
                return;
            case 1:
                this.f39652b.f36234u0.b();
                return;
            case 2:
                this.f39652b.f36234u0.b();
                return;
            case 3:
                this.f39652b.f36234u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.b1 b1Var = this.f39652b.Z;
                b1Var.f31327c0 = false;
                b1Var.invalidate();
                return;
            case 5:
                be1 be1Var = this.f39652b;
                be1Var.f36228q0 = be1Var.f36227p0;
                be1Var.G();
                return;
            case 6:
                this.f39652b.A();
                return;
            case 7:
                int[] iArr = new int[2];
                be1 be1Var2 = this.f39652b;
                be1Var2.f36207e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                be1Var2.e.getLocationOnScreen(iArr);
                be1Var2.e.setTranslationX(org.telegram.messenger.i0.L(42.0f) + (i10 - iArr[0]));
                be1Var2.e.setTranslationY(org.telegram.messenger.i0.L(44.0f) + (i11 - iArr[1]));
                be1Var2.h.getLocationOnScreen(iArr);
                be1Var2.h.setTranslationX(org.telegram.messenger.i0.L(42.0f) + (i10 - iArr[0]));
                be1Var2.h.setTranslationY(org.telegram.messenger.i0.L(44.0f) + (i11 - iArr[1]));
                be1Var2.f36209f.getLocationOnScreen(iArr);
                be1Var2.f36209f.setTranslationX(org.telegram.messenger.i0.L(42.0f) + (i10 - iArr[0]));
                be1Var2.f36209f.setTranslationY(org.telegram.messenger.i0.L(44.0f) + (i11 - iArr[1]));
                be1Var2.f36224n.getLocationOnScreen(iArr);
                be1Var2.f36224n.setTranslationX((((be1Var2.f36207e0.getWidth() + i10) - iArr[0]) - org.telegram.messenger.i0.L(49.0f)) - org.telegram.messenger.i0.L(60.0f));
                be1Var2.f36224n.setTranslationY(org.telegram.messenger.i0.L(44.0f) + (i11 - iArr[1]));
                be1Var2.f36224n.setAlpha(1.0f);
                be1Var2.e.setAlpha(1.0f);
                be1Var2.h.setAlpha(1.0f);
                be1Var2.f36209f.setAlpha(1.0f);
                long j10 = 200;
                be1Var2.f36224n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                be1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                be1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                be1Var2.f36209f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                return;
            case 8:
                this.f39652b.f36234u0.b();
                return;
            case 9:
                int i12 = org.telegram.messenger.tz.f18146f1;
                if (i12 < 2) {
                    org.telegram.messenger.tz.f18146f1 = i12 + 1;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.tz.f18146f1);
                    edit.apply();
                    be1 be1Var3 = this.f39652b;
                    be1Var3.O0.setTranslationY(be1Var3.N.getY() + org.telegram.messenger.i0.L(36.0f));
                    be1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f39652b.f36234u0.b();
                return;
            case 11:
                be1 be1Var4 = this.f39652b;
                be1Var4.f36234u0.setAlpha(1.0f);
                be1Var4.f36234u0.invalidate();
                ValueAnimator b10 = be1Var4.b(true);
                be1Var4.H.setAlpha(0.0f);
                be1Var4.I.setAlpha(0.0f);
                be1Var4.N.setAlpha(0.0f);
                be1Var4.X.setAlpha(0.0f);
                be1Var4.f36218j0.setAlpha(0.0f);
                be1Var4.f36214h0.setAlpha(0.0f);
                be1Var4.f36216i0.setAlpha(0.0f);
                be1Var4.K.setAlpha(0.0f);
                be1Var4.M0.setAlpha(0.0f);
                be1Var4.Y.f31325b0 = true;
                org.telegram.messenger.i0.h3(new t11(22, be1Var4, b10), 32L);
                return;
            case 12:
                be1 be1Var5 = this.f39652b;
                be1Var5.R0 = false;
                org.telegram.ui.Components.voip.k2 k2Var = be1Var5.N0;
                if (k2Var != null && k2Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (be1Var5.f36242z0 && be1Var5.f36239x0 && !be1Var5.C0 && !z10) {
                    be1Var5.K0 = System.currentTimeMillis();
                    be1Var5.z(false);
                    be1Var5.f36228q0 = be1Var5.f36227p0;
                    be1Var5.G();
                    return;
                }
                return;
            default:
                be1 be1Var6 = this.f39652b;
                if (be1Var6.f36227p0 == 3) {
                    be1Var6.D.b(true, false);
                    org.telegram.ui.Components.voip.j2 j2Var = be1Var6.f36236w;
                    if (!j2Var.R) {
                        j2Var.R = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
