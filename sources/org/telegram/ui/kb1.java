package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.animation.LinearInterpolator;
public final class kb1 implements Runnable {
    public final int f46893a;
    public final zb1 f46894b;

    public kb1(zb1 zb1Var, int i3) {
        this.f46893a = i3;
        this.f46894b = zb1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f46893a) {
            case 0:
                this.f46894b.f52644v0.b();
                return;
            case 1:
                this.f46894b.f52644v0.b();
                return;
            case 2:
                this.f46894b.f52644v0.b();
                return;
            case 3:
                this.f46894b.f52644v0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.c1 c1Var = this.f46894b.f52605a0;
                c1Var.f39256d0 = false;
                c1Var.invalidate();
                return;
            case 5:
                zb1 zb1Var = this.f46894b;
                zb1Var.f52639r0 = zb1Var.f52637q0;
                zb1Var.G();
                return;
            case 6:
                this.f46894b.A();
                return;
            case 7:
                int[] iArr = new int[2];
                zb1 zb1Var2 = this.f46894b;
                zb1Var2.f52619f0.getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int i10 = iArr[1];
                zb1Var2.f52615e.getLocationOnScreen(iArr);
                zb1Var2.f52615e.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i3 - iArr[0]));
                zb1Var2.f52615e.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                zb1Var2.h.getLocationOnScreen(iArr);
                zb1Var2.h.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i3 - iArr[0]));
                zb1Var2.h.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                zb1Var2.f52618f.getLocationOnScreen(iArr);
                zb1Var2.f52618f.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i3 - iArr[0]));
                zb1Var2.f52618f.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                zb1Var2.f52632n.getLocationOnScreen(iArr);
                zb1Var2.f52632n.setTranslationX((((zb1Var2.f52619f0.getWidth() + i3) - iArr[0]) - org.telegram.messenger.g0.L(49.0f)) - org.telegram.messenger.g0.L(60.0f));
                zb1Var2.f52632n.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                zb1Var2.f52632n.setAlpha(1.0f);
                zb1Var2.f52615e.setAlpha(1.0f);
                zb1Var2.h.setAlpha(1.0f);
                zb1Var2.f52618f.setAlpha(1.0f);
                long j10 = 200;
                zb1Var2.f52632n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                zb1Var2.f52615e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                zb1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                zb1Var2.f52618f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                return;
            case 8:
                this.f46894b.f52644v0.b();
                return;
            case 9:
                int i11 = org.telegram.messenger.az.f21628f1;
                if (i11 < 2) {
                    org.telegram.messenger.az.f21628f1 = i11 + 1;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.az.f21628f1);
                    edit.apply();
                    zb1 zb1Var3 = this.f46894b;
                    zb1Var3.P0.setTranslationY(zb1Var3.O.getY() + org.telegram.messenger.g0.L(36.0f));
                    zb1Var3.P0.w();
                    return;
                }
                return;
            case 10:
                this.f46894b.f52644v0.b();
                return;
            case 11:
                zb1 zb1Var4 = this.f46894b;
                zb1Var4.f52644v0.setAlpha(1.0f);
                zb1Var4.f52644v0.invalidate();
                ValueAnimator b10 = zb1Var4.b(true);
                zb1Var4.I.setAlpha(0.0f);
                zb1Var4.J.setAlpha(0.0f);
                zb1Var4.O.setAlpha(0.0f);
                zb1Var4.Y.setAlpha(0.0f);
                zb1Var4.f52629k0.setAlpha(0.0f);
                zb1Var4.f52625i0.setAlpha(0.0f);
                zb1Var4.f52627j0.setAlpha(0.0f);
                zb1Var4.L.setAlpha(0.0f);
                zb1Var4.N0.setAlpha(0.0f);
                zb1Var4.Z.f39255c0 = true;
                org.telegram.messenger.g0.i3(new ma1(4, zb1Var4, b10), 32L);
                return;
            case 12:
                zb1 zb1Var5 = this.f46894b;
                zb1Var5.S0 = false;
                org.telegram.ui.Components.zo zoVar = zb1Var5.O0;
                if (zoVar != null && zoVar.W) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (zb1Var5.A0 && zb1Var5.f52650y0 && !zb1Var5.D0 && !z10) {
                    zb1Var5.L0 = System.currentTimeMillis();
                    zb1Var5.z(false);
                    zb1Var5.f52639r0 = zb1Var5.f52637q0;
                    zb1Var5.G();
                    return;
                }
                return;
            default:
                zb1 zb1Var6 = this.f46894b;
                if (zb1Var6.f52637q0 == 3) {
                    zb1Var6.E.b(true, false);
                    org.telegram.ui.Components.voip.j2 j2Var = zb1Var6.f52645w;
                    if (!j2Var.S) {
                        j2Var.S = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
