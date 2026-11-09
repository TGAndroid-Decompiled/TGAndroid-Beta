package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
public final class j61 implements Runnable {
    public final int f46846a;
    public final w71 f46847b;

    public j61(w71 w71Var, int i7) {
        this.f46846a = i7;
        this.f46847b = w71Var;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f46846a;
        float f10 = 0.0f;
        w71 w71Var = this.f46847b;
        switch (i10) {
            case 0:
                w71Var.f50903a0 = false;
                int i11 = w71Var.X;
                int i12 = w71Var.Y;
                org.telegram.ui.ActionBar.i6 i6Var = w71Var.f50961w;
                int i13 = w71Var.f50941n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        i6Var.f27573c = i11;
                        org.telegram.ui.ActionBar.l6.t1(false, false);
                    } else if (i12 == 1) {
                        i6Var.d = i11;
                        org.telegram.ui.ActionBar.l6.t1(true, true);
                        w71Var.f50959v0.g1();
                        w71Var.W.setHasChanges(w71Var.Y0(w71Var.f50941n));
                        w71Var.r1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        i6Var.f27578j = i11;
                    } else if (i12 == 1) {
                        int E0 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.Ce);
                        if (i11 == 0 && E0 != 0) {
                            i6Var.f27579k = 4294967296L;
                        } else {
                            i6Var.f27579k = i11;
                        }
                    } else if (i12 == 2) {
                        int E02 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.De);
                        if (i11 == 0 && E02 != 0) {
                            i6Var.f27580l = 4294967296L;
                        } else {
                            i6Var.f27580l = i11;
                        }
                    } else if (i12 == 3) {
                        int E03 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.Ee);
                        if (i11 == 0 && E03 != 0) {
                            i6Var.f27581m = 4294967296L;
                        } else {
                            i6Var.f27581m = i11;
                        }
                    }
                    org.telegram.ui.ActionBar.l6.t1(true, false);
                    w71Var.W.setHasChanges(w71Var.Y0(w71Var.f50941n));
                    w71Var.r1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        i6Var.f27574e = i11;
                    } else if (i12 == 1) {
                        i6Var.f27575f = i11;
                    } else if (i12 == 2) {
                        int i14 = i6Var.f27576g;
                        i6Var.f27576g = i11;
                        if (i14 != 0 && i11 == 0) {
                            w71Var.f50962w0.s(0);
                        } else if (i14 == 0 && i11 != 0) {
                            w71Var.f50962w0.i(0);
                            w71Var.j1();
                        }
                    } else {
                        i6Var.h = i11;
                    }
                    int i15 = w71Var.Y;
                    if (i15 >= 0) {
                        w71Var.L0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.l6.t1(true, true);
                    w71Var.f50959v0.g1();
                    w71Var.W.setHasChanges(w71Var.Y0(w71Var.f50941n));
                    w71Var.r1(true);
                }
                int size = w71Var.f50933j0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) w71Var.f50933j0.get(i16);
                    u6Var.e(w71Var.getThemedColor(u6Var.f28603e), false, false);
                }
                w71Var.f50943o0.g1();
                w71Var.f50959v0.g1();
                fi.p5 p5Var = w71Var.f50907b0;
                if (p5Var != null) {
                    p5Var.invalidate();
                }
                w71Var.Y = -1;
                return;
            case 1:
                w71Var.presentFragment(d51.g0(w71Var.getMessagesController().M0(Long.valueOf(-w71Var.K1)), true));
                return;
            case 2:
                w71Var.f50948q1.t1(false);
                boolean a10 = w71Var.f50902a.a();
                org.telegram.ui.Components.ah0 ah0Var = w71Var.O1;
                if (a10) {
                    i7 = ah0Var.f31826e[0];
                } else {
                    i7 = 0;
                }
                ah0Var.P(i7);
                org.telegram.ui.Components.ah0 ah0Var2 = w71Var.O1;
                if (ah0Var2 != null) {
                    ah0Var2.start();
                }
                w71Var.g1(false);
                w71Var.a1();
                w71Var.n1();
                if (w71Var.f50933j0 != null) {
                    for (int i17 = 0; i17 < w71Var.f50933j0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.u6) w71Var.f50933j0.get(i17)).e(w71Var.getThemedColor(((org.telegram.ui.ActionBar.u6) w71Var.f50933j0.get(i17)).f28603e), false, false);
                    }
                }
                if (w71Var.N1) {
                    o71 o71Var = w71Var.f50948q1;
                    if (o71Var != null && o71Var.a()) {
                        w71Var.S1.setVisibility(0);
                        w71Var.S1.a(w71Var.f50944o1);
                    } else {
                        w71Var.S1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = w71Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        w71Var.Q1.cancel();
                    }
                    float f11 = w71Var.f50946p1;
                    if (w71Var.f50948q1.a()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    w71Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new jz0(w71Var, 9));
                    w71Var.Q1.addListener(new b71(w71Var, 5));
                    w71Var.Q1.setDuration(250L);
                    w71Var.Q1.setInterpolator(org.telegram.ui.Components.xq.f40458f);
                    w71Var.Q1.start();
                    return;
                }
                return;
            default:
                if (w71Var.getParentActivity() != null && w71Var.getParentActivity() != null) {
                    int i18 = org.telegram.messenger.iz.f23385a;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    int i19 = org.telegram.messenger.iz.S + 1;
                    org.telegram.messenger.iz.S = i19;
                    edit.putInt("dayNightWallpaperSwitchHint", i19);
                    edit.apply();
                    org.telegram.ui.Components.z20 z20Var = new org.telegram.ui.Components.z20(7, w71Var.getParentActivity(), null, true);
                    z20Var.setAlpha(0.0f);
                    z20Var.setVisibility(4);
                    z20Var.setShowingDuration(4000L);
                    w71Var.f50939l0.addView(z20Var, c8.ha.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (w71Var.f50948q1.a()) {
                        z20Var.setText(org.telegram.messenger.id.M0(2131746878, null));
                    } else {
                        z20Var.setText(org.telegram.messenger.id.M0(2131746877, null));
                    }
                    z20Var.b();
                    z20Var.c(w71Var.P1);
                    z20Var.setExtraTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    return;
                }
                return;
        }
    }
}
