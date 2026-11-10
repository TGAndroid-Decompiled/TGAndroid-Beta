package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
public final class k61 implements Runnable {
    public final int f47180a;
    public final x71 f47181b;

    public k61(x71 x71Var, int i7) {
        this.f47180a = i7;
        this.f47181b = x71Var;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f47180a;
        float f10 = 0.0f;
        x71 x71Var = this.f47181b;
        switch (i10) {
            case 0:
                x71Var.f51562a0 = false;
                int i11 = x71Var.X;
                int i12 = x71Var.Y;
                org.telegram.ui.ActionBar.j6 j6Var = x71Var.f51620w;
                int i13 = x71Var.f51600n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        j6Var.f27611c = i11;
                        org.telegram.ui.ActionBar.m6.t1(false, false);
                    } else if (i12 == 1) {
                        j6Var.d = i11;
                        org.telegram.ui.ActionBar.m6.t1(true, true);
                        x71Var.f51618v0.g1();
                        x71Var.W.setHasChanges(x71Var.Y0(x71Var.f51600n));
                        x71Var.r1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        j6Var.f27616j = i11;
                    } else if (i12 == 1) {
                        int E0 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ce);
                        if (i11 == 0 && E0 != 0) {
                            j6Var.f27617k = 4294967296L;
                        } else {
                            j6Var.f27617k = i11;
                        }
                    } else if (i12 == 2) {
                        int E02 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.De);
                        if (i11 == 0 && E02 != 0) {
                            j6Var.f27618l = 4294967296L;
                        } else {
                            j6Var.f27618l = i11;
                        }
                    } else if (i12 == 3) {
                        int E03 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ee);
                        if (i11 == 0 && E03 != 0) {
                            j6Var.f27619m = 4294967296L;
                        } else {
                            j6Var.f27619m = i11;
                        }
                    }
                    org.telegram.ui.ActionBar.m6.t1(true, false);
                    x71Var.W.setHasChanges(x71Var.Y0(x71Var.f51600n));
                    x71Var.r1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        j6Var.f27612e = i11;
                    } else if (i12 == 1) {
                        j6Var.f27613f = i11;
                    } else if (i12 == 2) {
                        int i14 = j6Var.f27614g;
                        j6Var.f27614g = i11;
                        if (i14 != 0 && i11 == 0) {
                            x71Var.f51621w0.s(0);
                        } else if (i14 == 0 && i11 != 0) {
                            x71Var.f51621w0.i(0);
                            x71Var.j1();
                        }
                    } else {
                        j6Var.h = i11;
                    }
                    int i15 = x71Var.Y;
                    if (i15 >= 0) {
                        x71Var.L0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.m6.t1(true, true);
                    x71Var.f51618v0.g1();
                    x71Var.W.setHasChanges(x71Var.Y0(x71Var.f51600n));
                    x71Var.r1(true);
                }
                int size = x71Var.f51592j0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.v6 v6Var = (org.telegram.ui.ActionBar.v6) x71Var.f51592j0.get(i16);
                    v6Var.e(x71Var.getThemedColor(v6Var.f28631e), false, false);
                }
                x71Var.f51602o0.g1();
                x71Var.f51618v0.g1();
                fi.p5 p5Var = x71Var.f51566b0;
                if (p5Var != null) {
                    p5Var.invalidate();
                }
                x71Var.Y = -1;
                return;
            case 1:
                x71Var.presentFragment(e51.g0(x71Var.getMessagesController().M0(Long.valueOf(-x71Var.K1)), true));
                return;
            case 2:
                x71Var.f51607q1.t1(false);
                boolean a10 = x71Var.f51561a.a();
                org.telegram.ui.Components.zg0 zg0Var = x71Var.O1;
                if (a10) {
                    i7 = zg0Var.f40968e[0];
                } else {
                    i7 = 0;
                }
                zg0Var.P(i7);
                org.telegram.ui.Components.zg0 zg0Var2 = x71Var.O1;
                if (zg0Var2 != null) {
                    zg0Var2.start();
                }
                x71Var.g1(false);
                x71Var.a1();
                x71Var.n1();
                if (x71Var.f51592j0 != null) {
                    for (int i17 = 0; i17 < x71Var.f51592j0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.v6) x71Var.f51592j0.get(i17)).e(x71Var.getThemedColor(((org.telegram.ui.ActionBar.v6) x71Var.f51592j0.get(i17)).f28631e), false, false);
                    }
                }
                if (x71Var.N1) {
                    p71 p71Var = x71Var.f51607q1;
                    if (p71Var != null && p71Var.a()) {
                        x71Var.S1.setVisibility(0);
                        x71Var.S1.a(x71Var.f51603o1);
                    } else {
                        x71Var.S1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = x71Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        x71Var.Q1.cancel();
                    }
                    float f11 = x71Var.f51605p1;
                    if (x71Var.f51607q1.a()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    x71Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new kz0(x71Var, 9));
                    x71Var.Q1.addListener(new c71(x71Var, 5));
                    x71Var.Q1.setDuration(250L);
                    x71Var.Q1.setInterpolator(org.telegram.ui.Components.wq.f40046f);
                    x71Var.Q1.start();
                    return;
                }
                return;
            default:
                if (x71Var.getParentActivity() != null && x71Var.getParentActivity() != null) {
                    int i18 = org.telegram.messenger.iz.f23389a;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    int i19 = org.telegram.messenger.iz.S + 1;
                    org.telegram.messenger.iz.S = i19;
                    edit.putInt("dayNightWallpaperSwitchHint", i19);
                    edit.apply();
                    org.telegram.ui.Components.y20 y20Var = new org.telegram.ui.Components.y20(7, x71Var.getParentActivity(), null, true);
                    y20Var.setAlpha(0.0f);
                    y20Var.setVisibility(4);
                    y20Var.setShowingDuration(4000L);
                    x71Var.f51598l0.addView(y20Var, c8.ha.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (x71Var.f51607q1.a()) {
                        y20Var.setText(org.telegram.messenger.id.M0(2131746878, null));
                    } else {
                        y20Var.setText(org.telegram.messenger.id.M0(2131746877, null));
                    }
                    y20Var.b();
                    y20Var.c(x71Var.P1);
                    y20Var.setExtraTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    return;
                }
                return;
        }
    }
}
