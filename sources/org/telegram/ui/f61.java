package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
public final class f61 implements Runnable {
    public final int f47018a;
    public final t71 f47019b;

    public f61(t71 t71Var, int i7) {
        this.f47018a = i7;
        this.f47019b = t71Var;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f47018a;
        float f10 = 0.0f;
        t71 t71Var = this.f47019b;
        switch (i10) {
            case 0:
                t71Var.f51413b0 = false;
                int i11 = t71Var.Y;
                int i12 = t71Var.Z;
                org.telegram.ui.ActionBar.g6 g6Var = t71Var.f51468w;
                int i13 = t71Var.f51448n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        g6Var.f28604c = i11;
                        org.telegram.ui.ActionBar.j6.t1(false, false);
                    } else if (i12 == 1) {
                        g6Var.d = i11;
                        org.telegram.ui.ActionBar.j6.t1(true, true);
                        t71Var.f51469w0.g1();
                        t71Var.X.setHasChanges(t71Var.Y0(t71Var.f51448n));
                        t71Var.r1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        g6Var.f28609j = i11;
                    } else if (i12 == 1) {
                        int E0 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.Fe);
                        if (i11 == 0 && E0 != 0) {
                            g6Var.f28610k = 4294967296L;
                        } else {
                            g6Var.f28610k = i11;
                        }
                    } else if (i12 == 2) {
                        int E02 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.Ge);
                        if (i11 == 0 && E02 != 0) {
                            g6Var.f28611l = 4294967296L;
                        } else {
                            g6Var.f28611l = i11;
                        }
                    } else if (i12 == 3) {
                        int E03 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.He);
                        if (i11 == 0 && E03 != 0) {
                            g6Var.f28612m = 4294967296L;
                        } else {
                            g6Var.f28612m = i11;
                        }
                    }
                    org.telegram.ui.ActionBar.j6.t1(true, false);
                    t71Var.X.setHasChanges(t71Var.Y0(t71Var.f51448n));
                    t71Var.r1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        g6Var.f28605e = i11;
                    } else if (i12 == 1) {
                        g6Var.f28606f = i11;
                    } else if (i12 == 2) {
                        int i14 = g6Var.f28607g;
                        g6Var.f28607g = i11;
                        if (i14 != 0 && i11 == 0) {
                            t71Var.f51472x0.s(0);
                        } else if (i14 == 0 && i11 != 0) {
                            t71Var.f51472x0.i(0);
                            t71Var.j1();
                        }
                    } else {
                        g6Var.h = i11;
                    }
                    int i15 = t71Var.Z;
                    if (i15 >= 0) {
                        t71Var.M0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.j6.t1(true, true);
                    t71Var.f51469w0.g1();
                    t71Var.X.setHasChanges(t71Var.Y0(t71Var.f51448n));
                    t71Var.r1(true);
                }
                int size = t71Var.f51442k0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) t71Var.f51442k0.get(i16);
                    s6Var.e(t71Var.getThemedColor(s6Var.f29600e), false, false);
                }
                t71Var.f51452p0.g1();
                t71Var.f51469w0.g1();
                hi.n5 n5Var = t71Var.f51417c0;
                if (n5Var != null) {
                    n5Var.invalidate();
                }
                t71Var.Z = -1;
                return;
            case 1:
                t71Var.presentFragment(z41.g0(t71Var.getMessagesController().M0(Long.valueOf(-t71Var.L1)), true));
                return;
            case 2:
                t71Var.f51458r1.m1(false);
                boolean a10 = t71Var.f51408a.a();
                org.telegram.ui.Components.ch0 ch0Var = t71Var.P1;
                if (a10) {
                    i7 = ch0Var.f33577e[0];
                } else {
                    i7 = 0;
                }
                ch0Var.P(i7);
                org.telegram.ui.Components.ch0 ch0Var2 = t71Var.P1;
                if (ch0Var2 != null) {
                    ch0Var2.start();
                }
                t71Var.g1(false);
                t71Var.a1();
                t71Var.n1();
                if (t71Var.f51442k0 != null) {
                    for (int i17 = 0; i17 < t71Var.f51442k0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.s6) t71Var.f51442k0.get(i17)).e(t71Var.getThemedColor(((org.telegram.ui.ActionBar.s6) t71Var.f51442k0.get(i17)).f29600e), false, false);
                    }
                }
                if (t71Var.O1) {
                    l71 l71Var = t71Var.f51458r1;
                    if (l71Var != null && l71Var.a()) {
                        t71Var.T1.setVisibility(0);
                        t71Var.T1.a(t71Var.f51453p1);
                    } else {
                        t71Var.T1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = t71Var.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        t71Var.R1.cancel();
                    }
                    float f11 = t71Var.f51455q1;
                    if (t71Var.f51458r1.a()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    t71Var.R1 = ofFloat;
                    ofFloat.addUpdateListener(new ez0(t71Var, 9));
                    t71Var.R1.addListener(new x61(t71Var, 5));
                    t71Var.R1.setDuration(250L);
                    t71Var.R1.setInterpolator(org.telegram.ui.Components.er.f34420f);
                    t71Var.R1.start();
                    return;
                }
                return;
            default:
                if (t71Var.getParentActivity() != null && t71Var.getParentActivity() != null) {
                    int i18 = org.telegram.messenger.gz.f23929a;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                    int i19 = org.telegram.messenger.gz.S + 1;
                    org.telegram.messenger.gz.S = i19;
                    edit.putInt("dayNightWallpaperSwitchHint", i19);
                    edit.apply();
                    org.telegram.ui.Components.b30 b30Var = new org.telegram.ui.Components.b30(7, t71Var.getParentActivity(), null, true);
                    b30Var.setAlpha(0.0f);
                    b30Var.setVisibility(4);
                    b30Var.setShowingDuration(4000L);
                    t71Var.m0.addView(b30Var, c8.ja.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (t71Var.f51458r1.a()) {
                        b30Var.setText(org.telegram.messenger.hd.M0(2131746878, null));
                    } else {
                        b30Var.setText(org.telegram.messenger.hd.M0(2131746877, null));
                    }
                    b30Var.b();
                    b30Var.c(t71Var.Q1);
                    b30Var.setExtraTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    return;
                }
                return;
        }
    }
}
