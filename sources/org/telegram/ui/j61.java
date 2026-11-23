package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
public final class j61 implements Runnable {
    public final int f48916a;
    public final x71 f48917b;

    public j61(x71 x71Var, int i7) {
        this.f48916a = i7;
        this.f48917b = x71Var;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f48916a;
        float f10 = 0.0f;
        x71 x71Var = this.f48917b;
        switch (i10) {
            case 0:
                x71Var.f53642b0 = false;
                int i11 = x71Var.Y;
                int i12 = x71Var.Z;
                org.telegram.ui.ActionBar.j6 j6Var = x71Var.f53697w;
                int i13 = x71Var.f53677n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        j6Var.f29064c = i11;
                        org.telegram.ui.ActionBar.m6.t1(false, false);
                    } else if (i12 == 1) {
                        j6Var.d = i11;
                        org.telegram.ui.ActionBar.m6.t1(true, true);
                        x71Var.f53698w0.g1();
                        x71Var.X.setHasChanges(x71Var.Y0(x71Var.f53677n));
                        x71Var.r1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        j6Var.f29069j = i11;
                    } else if (i12 == 1) {
                        int E0 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Fe);
                        if (i11 == 0 && E0 != 0) {
                            j6Var.f29070k = 4294967296L;
                        } else {
                            j6Var.f29070k = i11;
                        }
                    } else if (i12 == 2) {
                        int E02 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ge);
                        if (i11 == 0 && E02 != 0) {
                            j6Var.f29071l = 4294967296L;
                        } else {
                            j6Var.f29071l = i11;
                        }
                    } else if (i12 == 3) {
                        int E03 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.He);
                        if (i11 == 0 && E03 != 0) {
                            j6Var.f29072m = 4294967296L;
                        } else {
                            j6Var.f29072m = i11;
                        }
                    }
                    org.telegram.ui.ActionBar.m6.t1(true, false);
                    x71Var.X.setHasChanges(x71Var.Y0(x71Var.f53677n));
                    x71Var.r1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        j6Var.f29065e = i11;
                    } else if (i12 == 1) {
                        j6Var.f29066f = i11;
                    } else if (i12 == 2) {
                        int i14 = j6Var.f29067g;
                        j6Var.f29067g = i11;
                        if (i14 != 0 && i11 == 0) {
                            x71Var.f53701x0.s(0);
                        } else if (i14 == 0 && i11 != 0) {
                            x71Var.f53701x0.i(0);
                            x71Var.j1();
                        }
                    } else {
                        j6Var.h = i11;
                    }
                    int i15 = x71Var.Z;
                    if (i15 >= 0) {
                        x71Var.M0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.m6.t1(true, true);
                    x71Var.f53698w0.g1();
                    x71Var.X.setHasChanges(x71Var.Y0(x71Var.f53677n));
                    x71Var.r1(true);
                }
                int size = x71Var.f53671k0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.v6 v6Var = (org.telegram.ui.ActionBar.v6) x71Var.f53671k0.get(i16);
                    v6Var.e(x71Var.getThemedColor(v6Var.f30107e), false, false);
                }
                x71Var.f53681p0.g1();
                x71Var.f53698w0.g1();
                hi.m5 m5Var = x71Var.f53646c0;
                if (m5Var != null) {
                    m5Var.invalidate();
                }
                x71Var.Z = -1;
                return;
            case 1:
                x71Var.presentFragment(c51.g0(x71Var.getMessagesController().O0(Long.valueOf(-x71Var.L1)), true));
                return;
            case 2:
                x71Var.f53687r1.l1(false);
                boolean d = x71Var.f53637a.d();
                org.telegram.ui.Components.oh0 oh0Var = x71Var.P1;
                if (d) {
                    i7 = oh0Var.f38179e[0];
                } else {
                    i7 = 0;
                }
                oh0Var.P(i7);
                org.telegram.ui.Components.oh0 oh0Var2 = x71Var.P1;
                if (oh0Var2 != null) {
                    oh0Var2.start();
                }
                x71Var.g1(false);
                x71Var.a1();
                x71Var.n1();
                if (x71Var.f53671k0 != null) {
                    for (int i17 = 0; i17 < x71Var.f53671k0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.v6) x71Var.f53671k0.get(i17)).e(x71Var.getThemedColor(((org.telegram.ui.ActionBar.v6) x71Var.f53671k0.get(i17)).f30107e), false, false);
                    }
                }
                if (x71Var.O1) {
                    p71 p71Var = x71Var.f53687r1;
                    if (p71Var != null && p71Var.d()) {
                        x71Var.T1.setVisibility(0);
                        x71Var.T1.a(x71Var.f53682p1);
                    } else {
                        x71Var.T1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = x71Var.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        x71Var.R1.cancel();
                    }
                    float f11 = x71Var.f53684q1;
                    if (x71Var.f53687r1.d()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    x71Var.R1 = ofFloat;
                    ofFloat.addUpdateListener(new iz0(x71Var, 9));
                    x71Var.R1.addListener(new b71(x71Var, 5));
                    x71Var.R1.setDuration(250L);
                    x71Var.R1.setInterpolator(org.telegram.ui.Components.nr.f37917f);
                    x71Var.R1.start();
                    return;
                }
                return;
            default:
                if (x71Var.getParentActivity() != null && x71Var.getParentActivity() != null) {
                    int i18 = org.telegram.messenger.cz.f23354a;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
                    int i19 = org.telegram.messenger.cz.S + 1;
                    org.telegram.messenger.cz.S = i19;
                    edit.putInt("dayNightWallpaperSwitchHint", i19);
                    edit.apply();
                    org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(7, x71Var.getParentActivity(), null, true);
                    m30Var.setAlpha(0.0f);
                    m30Var.setVisibility(4);
                    m30Var.setShowingDuration(4000L);
                    x71Var.m0.addView(m30Var, c8.na.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (x71Var.f53687r1.d()) {
                        m30Var.setText(org.telegram.messenger.hd.N0(2131746684, null));
                    } else {
                        m30Var.setText(org.telegram.messenger.hd.N0(2131746683, null));
                    }
                    m30Var.b();
                    m30Var.c(x71Var.Q1);
                    m30Var.setExtraTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    return;
                }
                return;
        }
    }
}
