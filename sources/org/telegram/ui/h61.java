package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
public final class h61 implements Runnable {
    public final int f48438a;
    public final v71 f48439b;

    public h61(v71 v71Var, int i7) {
        this.f48438a = i7;
        this.f48439b = v71Var;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f48438a;
        float f10 = 0.0f;
        v71 v71Var = this.f48439b;
        switch (i10) {
            case 0:
                v71Var.f52850b0 = false;
                int i11 = v71Var.Y;
                int i12 = v71Var.Z;
                org.telegram.ui.ActionBar.k6 k6Var = v71Var.f52905w;
                int i13 = v71Var.f52885n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        k6Var.f29226c = i11;
                        org.telegram.ui.ActionBar.n6.t1(false, false);
                    } else if (i12 == 1) {
                        k6Var.d = i11;
                        org.telegram.ui.ActionBar.n6.t1(true, true);
                        v71Var.f52906w0.g1();
                        v71Var.X.setHasChanges(v71Var.Y0(v71Var.f52885n));
                        v71Var.r1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        k6Var.f29231j = i11;
                    } else if (i12 == 1) {
                        int E0 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Fe);
                        if (i11 == 0 && E0 != 0) {
                            k6Var.f29232k = 4294967296L;
                        } else {
                            k6Var.f29232k = i11;
                        }
                    } else if (i12 == 2) {
                        int E02 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Ge);
                        if (i11 == 0 && E02 != 0) {
                            k6Var.f29233l = 4294967296L;
                        } else {
                            k6Var.f29233l = i11;
                        }
                    } else if (i12 == 3) {
                        int E03 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.He);
                        if (i11 == 0 && E03 != 0) {
                            k6Var.f29234m = 4294967296L;
                        } else {
                            k6Var.f29234m = i11;
                        }
                    }
                    org.telegram.ui.ActionBar.n6.t1(true, false);
                    v71Var.X.setHasChanges(v71Var.Y0(v71Var.f52885n));
                    v71Var.r1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        k6Var.f29227e = i11;
                    } else if (i12 == 1) {
                        k6Var.f29228f = i11;
                    } else if (i12 == 2) {
                        int i14 = k6Var.f29229g;
                        k6Var.f29229g = i11;
                        if (i14 != 0 && i11 == 0) {
                            v71Var.f52909x0.s(0);
                        } else if (i14 == 0 && i11 != 0) {
                            v71Var.f52909x0.i(0);
                            v71Var.j1();
                        }
                    } else {
                        k6Var.h = i11;
                    }
                    int i15 = v71Var.Z;
                    if (i15 >= 0) {
                        v71Var.M0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.n6.t1(true, true);
                    v71Var.f52906w0.g1();
                    v71Var.X.setHasChanges(v71Var.Y0(v71Var.f52885n));
                    v71Var.r1(true);
                }
                int size = v71Var.f52879k0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) v71Var.f52879k0.get(i16);
                    w6Var.e(v71Var.getThemedColor(w6Var.f30281e), false, false);
                }
                v71Var.f52889p0.g1();
                v71Var.f52906w0.g1();
                hi.w5 w5Var = v71Var.f52854c0;
                if (w5Var != null) {
                    w5Var.invalidate();
                }
                v71Var.Z = -1;
                return;
            case 1:
                v71Var.presentFragment(b51.g0(v71Var.getMessagesController().O0(Long.valueOf(-v71Var.L1)), true));
                return;
            case 2:
                v71Var.f52895r1.b1(false);
                boolean b10 = v71Var.f52845a.b();
                org.telegram.ui.Components.nh0 nh0Var = v71Var.P1;
                if (b10) {
                    i7 = nh0Var.f37805e[0];
                } else {
                    i7 = 0;
                }
                nh0Var.P(i7);
                org.telegram.ui.Components.nh0 nh0Var2 = v71Var.P1;
                if (nh0Var2 != null) {
                    nh0Var2.start();
                }
                v71Var.g1(false);
                v71Var.a1();
                v71Var.n1();
                if (v71Var.f52879k0 != null) {
                    for (int i17 = 0; i17 < v71Var.f52879k0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.w6) v71Var.f52879k0.get(i17)).e(v71Var.getThemedColor(((org.telegram.ui.ActionBar.w6) v71Var.f52879k0.get(i17)).f30281e), false, false);
                    }
                }
                if (v71Var.O1) {
                    n71 n71Var = v71Var.f52895r1;
                    if (n71Var != null && n71Var.b()) {
                        v71Var.T1.setVisibility(0);
                        v71Var.T1.a(v71Var.f52890p1);
                    } else {
                        v71Var.T1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = v71Var.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        v71Var.R1.cancel();
                    }
                    float f11 = v71Var.f52892q1;
                    if (v71Var.f52895r1.b()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    v71Var.R1 = ofFloat;
                    ofFloat.addUpdateListener(new hz0(v71Var, 9));
                    v71Var.R1.addListener(new z61(v71Var, 5));
                    v71Var.R1.setDuration(250L);
                    v71Var.R1.setInterpolator(org.telegram.ui.Components.kr.f36858f);
                    v71Var.R1.start();
                    return;
                }
                return;
            default:
                if (v71Var.getParentActivity() != null && v71Var.getParentActivity() != null) {
                    int i18 = org.telegram.messenger.bz.f23270a;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                    int i19 = org.telegram.messenger.bz.S + 1;
                    org.telegram.messenger.bz.S = i19;
                    edit.putInt("dayNightWallpaperSwitchHint", i19);
                    edit.apply();
                    org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(7, v71Var.getParentActivity(), null, true);
                    j30Var.setAlpha(0.0f);
                    j30Var.setVisibility(4);
                    j30Var.setShowingDuration(4000L);
                    v71Var.m0.addView(j30Var, c8.na.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (v71Var.f52895r1.b()) {
                        j30Var.setText(org.telegram.messenger.gd.N0(2131746684, null));
                    } else {
                        j30Var.setText(org.telegram.messenger.gd.N0(2131746683, null));
                    }
                    j30Var.b();
                    j30Var.c(v71Var.Q1);
                    j30Var.setExtraTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    return;
                }
                return;
        }
    }
}
