package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
public final class i61 implements Runnable {
    public final int f46570a;
    public final u71 f46571b;

    public i61(u71 u71Var, int i7) {
        this.f46570a = i7;
        this.f46571b = u71Var;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f46570a;
        float f10 = 0.0f;
        u71 u71Var = this.f46571b;
        switch (i10) {
            case 0:
                u71Var.f50245a0 = false;
                int i11 = u71Var.X;
                int i12 = u71Var.Y;
                org.telegram.ui.ActionBar.h6 h6Var = u71Var.f50303w;
                int i13 = u71Var.f50283n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        h6Var.f27517c = i11;
                        org.telegram.ui.ActionBar.k6.t1(false, false);
                    } else if (i12 == 1) {
                        h6Var.d = i11;
                        org.telegram.ui.ActionBar.k6.t1(true, true);
                        u71Var.f50301v0.g1();
                        u71Var.W.setHasChanges(u71Var.Y0(u71Var.f50283n));
                        u71Var.r1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        h6Var.f27522j = i11;
                    } else if (i12 == 1) {
                        int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                        if (i11 == 0 && E0 != 0) {
                            h6Var.f27523k = 4294967296L;
                        } else {
                            h6Var.f27523k = i11;
                        }
                    } else if (i12 == 2) {
                        int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                        if (i11 == 0 && E02 != 0) {
                            h6Var.f27524l = 4294967296L;
                        } else {
                            h6Var.f27524l = i11;
                        }
                    } else if (i12 == 3) {
                        int E03 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                        if (i11 == 0 && E03 != 0) {
                            h6Var.f27525m = 4294967296L;
                        } else {
                            h6Var.f27525m = i11;
                        }
                    }
                    org.telegram.ui.ActionBar.k6.t1(true, false);
                    u71Var.W.setHasChanges(u71Var.Y0(u71Var.f50283n));
                    u71Var.r1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        h6Var.f27518e = i11;
                    } else if (i12 == 1) {
                        h6Var.f27519f = i11;
                    } else if (i12 == 2) {
                        int i14 = h6Var.f27520g;
                        h6Var.f27520g = i11;
                        if (i14 != 0 && i11 == 0) {
                            u71Var.f50304w0.s(0);
                        } else if (i14 == 0 && i11 != 0) {
                            u71Var.f50304w0.i(0);
                            u71Var.j1();
                        }
                    } else {
                        h6Var.h = i11;
                    }
                    int i15 = u71Var.Y;
                    if (i15 >= 0) {
                        u71Var.L0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.k6.t1(true, true);
                    u71Var.f50301v0.g1();
                    u71Var.W.setHasChanges(u71Var.Y0(u71Var.f50283n));
                    u71Var.r1(true);
                }
                int size = u71Var.f50275j0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) u71Var.f50275j0.get(i16);
                    t6Var.e(u71Var.getThemedColor(t6Var.f28534e), false, false);
                }
                u71Var.f50285o0.g1();
                u71Var.f50301v0.g1();
                fi.p5 p5Var = u71Var.f50249b0;
                if (p5Var != null) {
                    p5Var.invalidate();
                }
                u71Var.Y = -1;
                return;
            case 1:
                u71Var.presentFragment(c51.g0(u71Var.getMessagesController().M0(Long.valueOf(-u71Var.K1)), true));
                return;
            case 2:
                u71Var.f50290q1.t1(false);
                boolean a10 = u71Var.f50244a.a();
                org.telegram.ui.Components.zg0 zg0Var = u71Var.O1;
                if (a10) {
                    i7 = zg0Var.f40931e[0];
                } else {
                    i7 = 0;
                }
                zg0Var.P(i7);
                org.telegram.ui.Components.zg0 zg0Var2 = u71Var.O1;
                if (zg0Var2 != null) {
                    zg0Var2.start();
                }
                u71Var.g1(false);
                u71Var.a1();
                u71Var.n1();
                if (u71Var.f50275j0 != null) {
                    for (int i17 = 0; i17 < u71Var.f50275j0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.t6) u71Var.f50275j0.get(i17)).e(u71Var.getThemedColor(((org.telegram.ui.ActionBar.t6) u71Var.f50275j0.get(i17)).f28534e), false, false);
                    }
                }
                if (u71Var.N1) {
                    m71 m71Var = u71Var.f50290q1;
                    if (m71Var != null && m71Var.a()) {
                        u71Var.S1.setVisibility(0);
                        u71Var.S1.a(u71Var.f50286o1);
                    } else {
                        u71Var.S1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = u71Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        u71Var.Q1.cancel();
                    }
                    float f11 = u71Var.f50288p1;
                    if (u71Var.f50290q1.a()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    u71Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new gz0(u71Var, 9));
                    u71Var.Q1.addListener(new z61(u71Var, 5));
                    u71Var.Q1.setDuration(250L);
                    u71Var.Q1.setInterpolator(org.telegram.ui.Components.xq.f40310f);
                    u71Var.Q1.start();
                    return;
                }
                return;
            default:
                if (u71Var.getParentActivity() != null && u71Var.getParentActivity() != null) {
                    int i18 = org.telegram.messenger.iz.f23357a;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    int i19 = org.telegram.messenger.iz.S + 1;
                    org.telegram.messenger.iz.S = i19;
                    edit.putInt("dayNightWallpaperSwitchHint", i19);
                    edit.apply();
                    org.telegram.ui.Components.y20 y20Var = new org.telegram.ui.Components.y20(7, u71Var.getParentActivity(), null, true);
                    y20Var.setAlpha(0.0f);
                    y20Var.setVisibility(4);
                    y20Var.setShowingDuration(4000L);
                    u71Var.f50281l0.addView(y20Var, c8.ha.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (u71Var.f50290q1.a()) {
                        y20Var.setText(org.telegram.messenger.hd.M0(2131746877, null));
                    } else {
                        y20Var.setText(org.telegram.messenger.hd.M0(2131746876, null));
                    }
                    y20Var.b();
                    y20Var.c(u71Var.P1);
                    y20Var.setExtraTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    return;
                }
                return;
        }
    }
}
