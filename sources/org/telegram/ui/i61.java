package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
public final class i61 implements Runnable {
    public final int f46577a;
    public final v71 f46578b;

    public i61(v71 v71Var, int i7) {
        this.f46577a = i7;
        this.f46578b = v71Var;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f46577a;
        float f10 = 0.0f;
        v71 v71Var = this.f46578b;
        switch (i10) {
            case 0:
                v71Var.f50521a0 = false;
                int i11 = v71Var.X;
                int i12 = v71Var.Y;
                org.telegram.ui.ActionBar.h6 h6Var = v71Var.f50579w;
                int i13 = v71Var.f50559n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        h6Var.f27521c = i11;
                        org.telegram.ui.ActionBar.k6.t1(false, false);
                    } else if (i12 == 1) {
                        h6Var.d = i11;
                        org.telegram.ui.ActionBar.k6.t1(true, true);
                        v71Var.f50577v0.g1();
                        v71Var.W.setHasChanges(v71Var.Y0(v71Var.f50559n));
                        v71Var.r1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        h6Var.f27526j = i11;
                    } else if (i12 == 1) {
                        int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                        if (i11 == 0 && E0 != 0) {
                            h6Var.f27527k = 4294967296L;
                        } else {
                            h6Var.f27527k = i11;
                        }
                    } else if (i12 == 2) {
                        int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                        if (i11 == 0 && E02 != 0) {
                            h6Var.f27528l = 4294967296L;
                        } else {
                            h6Var.f27528l = i11;
                        }
                    } else if (i12 == 3) {
                        int E03 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                        if (i11 == 0 && E03 != 0) {
                            h6Var.f27529m = 4294967296L;
                        } else {
                            h6Var.f27529m = i11;
                        }
                    }
                    org.telegram.ui.ActionBar.k6.t1(true, false);
                    v71Var.W.setHasChanges(v71Var.Y0(v71Var.f50559n));
                    v71Var.r1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        h6Var.f27522e = i11;
                    } else if (i12 == 1) {
                        h6Var.f27523f = i11;
                    } else if (i12 == 2) {
                        int i14 = h6Var.f27524g;
                        h6Var.f27524g = i11;
                        if (i14 != 0 && i11 == 0) {
                            v71Var.f50580w0.s(0);
                        } else if (i14 == 0 && i11 != 0) {
                            v71Var.f50580w0.i(0);
                            v71Var.j1();
                        }
                    } else {
                        h6Var.h = i11;
                    }
                    int i15 = v71Var.Y;
                    if (i15 >= 0) {
                        v71Var.L0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.k6.t1(true, true);
                    v71Var.f50577v0.g1();
                    v71Var.W.setHasChanges(v71Var.Y0(v71Var.f50559n));
                    v71Var.r1(true);
                }
                int size = v71Var.f50551j0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) v71Var.f50551j0.get(i16);
                    t6Var.e(v71Var.getThemedColor(t6Var.f28538e), false, false);
                }
                v71Var.f50561o0.g1();
                v71Var.f50577v0.g1();
                fi.p5 p5Var = v71Var.f50525b0;
                if (p5Var != null) {
                    p5Var.invalidate();
                }
                v71Var.Y = -1;
                return;
            case 1:
                v71Var.presentFragment(c51.g0(v71Var.getMessagesController().M0(Long.valueOf(-v71Var.K1)), true));
                return;
            case 2:
                v71Var.f50566q1.t1(false);
                boolean a10 = v71Var.f50520a.a();
                org.telegram.ui.Components.zg0 zg0Var = v71Var.O1;
                if (a10) {
                    i7 = zg0Var.f40995e[0];
                } else {
                    i7 = 0;
                }
                zg0Var.P(i7);
                org.telegram.ui.Components.zg0 zg0Var2 = v71Var.O1;
                if (zg0Var2 != null) {
                    zg0Var2.start();
                }
                v71Var.g1(false);
                v71Var.a1();
                v71Var.n1();
                if (v71Var.f50551j0 != null) {
                    for (int i17 = 0; i17 < v71Var.f50551j0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.t6) v71Var.f50551j0.get(i17)).e(v71Var.getThemedColor(((org.telegram.ui.ActionBar.t6) v71Var.f50551j0.get(i17)).f28538e), false, false);
                    }
                }
                if (v71Var.N1) {
                    n71 n71Var = v71Var.f50566q1;
                    if (n71Var != null && n71Var.a()) {
                        v71Var.S1.setVisibility(0);
                        v71Var.S1.a(v71Var.f50562o1);
                    } else {
                        v71Var.S1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = v71Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        v71Var.Q1.cancel();
                    }
                    float f11 = v71Var.f50564p1;
                    if (v71Var.f50566q1.a()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    v71Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new gz0(v71Var, 9));
                    v71Var.Q1.addListener(new a71(v71Var, 5));
                    v71Var.Q1.setDuration(250L);
                    v71Var.Q1.setInterpolator(org.telegram.ui.Components.xq.f40366f);
                    v71Var.Q1.start();
                    return;
                }
                return;
            default:
                if (v71Var.getParentActivity() != null && v71Var.getParentActivity() != null) {
                    int i18 = org.telegram.messenger.iz.f23385a;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    int i19 = org.telegram.messenger.iz.S + 1;
                    org.telegram.messenger.iz.S = i19;
                    edit.putInt("dayNightWallpaperSwitchHint", i19);
                    edit.apply();
                    org.telegram.ui.Components.y20 y20Var = new org.telegram.ui.Components.y20(7, v71Var.getParentActivity(), null, true);
                    y20Var.setAlpha(0.0f);
                    y20Var.setVisibility(4);
                    y20Var.setShowingDuration(4000L);
                    v71Var.f50557l0.addView(y20Var, c8.ha.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (v71Var.f50566q1.a()) {
                        y20Var.setText(org.telegram.messenger.id.M0(2131746879, null));
                    } else {
                        y20Var.setText(org.telegram.messenger.id.M0(2131746878, null));
                    }
                    y20Var.b();
                    y20Var.c(v71Var.P1);
                    y20Var.setExtraTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    return;
                }
                return;
        }
    }
}
