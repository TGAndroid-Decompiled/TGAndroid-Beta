package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class bc1 implements Runnable {
    public final int f32334a;
    public final pd1 f32335b;

    public bc1(pd1 pd1Var, int i10) {
        this.f32334a = i10;
        this.f32335b = pd1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f32334a;
        float f7 = 0.0f;
        pd1 pd1Var = this.f32335b;
        switch (i11) {
            case 0:
                pd1Var.Z = false;
                int i12 = pd1Var.W;
                int i13 = pd1Var.X;
                org.telegram.ui.ActionBar.g6 g6Var = pd1Var.f36439s;
                int i14 = pd1Var.f36427n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        g6Var.f18908c = i12;
                        org.telegram.ui.ActionBar.i6.n1(false, false);
                    } else if (i13 == 1) {
                        g6Var.d = i12;
                        org.telegram.ui.ActionBar.i6.n1(true, true);
                        pd1Var.f36444u0.g1();
                        pd1Var.V.setHasChanges(pd1Var.T0(pd1Var.f36427n));
                        pd1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        g6Var.f18912j = i12;
                    } else if (i13 == 1) {
                        int B0 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Od);
                        if (i12 == 0 && B0 != 0) {
                            g6Var.f18913k = 4294967296L;
                        } else {
                            g6Var.f18913k = i12;
                        }
                    } else if (i13 == 2) {
                        int B02 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Pd);
                        if (i12 == 0 && B02 != 0) {
                            g6Var.f18914l = 4294967296L;
                        } else {
                            g6Var.f18914l = i12;
                        }
                    } else if (i13 == 3) {
                        int B03 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Qd);
                        if (i12 == 0 && B03 != 0) {
                            g6Var.f18915m = 4294967296L;
                        } else {
                            g6Var.f18915m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.i6.n1(true, false);
                    pd1Var.V.setHasChanges(pd1Var.T0(pd1Var.f36427n));
                    pd1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        g6Var.e = i12;
                    } else if (i13 == 1) {
                        g6Var.f18909f = i12;
                    } else if (i13 == 2) {
                        int i15 = g6Var.f18910g;
                        g6Var.f18910g = i12;
                        if (i15 != 0 && i12 == 0) {
                            pd1Var.f36446v0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            pd1Var.f36446v0.o(0);
                            pd1Var.e1();
                        }
                    } else {
                        g6Var.h = i12;
                    }
                    int i16 = pd1Var.X;
                    if (i16 >= 0) {
                        pd1Var.K0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.i6.n1(true, true);
                    pd1Var.f36444u0.g1();
                    pd1Var.V.setHasChanges(pd1Var.T0(pd1Var.f36427n));
                    pd1Var.m1(true);
                }
                int size = pd1Var.f36417i0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) pd1Var.f36417i0.get(i17);
                    k6Var.e(pd1Var.getThemedColor(k6Var.f19532f), false, false);
                }
                pd1Var.f36428n0.g1();
                pd1Var.f36444u0.g1();
                ci.r6 r6Var = pd1Var.f36391a0;
                if (r6Var != null) {
                    r6Var.invalidate();
                }
                pd1Var.X = -1;
                return;
            case 1:
                pd1Var.presentFragment(ra1.b0(pd1Var.getMessagesController().getChat(Long.valueOf(-pd1Var.J1)), true));
                return;
            case 2:
                pd1Var.f36433p1.o1(false);
                boolean a2 = pd1Var.f36390a.a();
                org.telegram.ui.Components.kj0 kj0Var = pd1Var.N1;
                if (a2) {
                    i10 = kj0Var.e[0];
                } else {
                    i10 = 0;
                }
                kj0Var.P(i10);
                org.telegram.ui.Components.kj0 kj0Var2 = pd1Var.N1;
                if (kj0Var2 != null) {
                    kj0Var2.start();
                }
                pd1Var.b1(false);
                pd1Var.V0();
                pd1Var.i1();
                if (pd1Var.f36417i0 != null) {
                    for (int i18 = 0; i18 < pd1Var.f36417i0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.k6) pd1Var.f36417i0.get(i18)).e(pd1Var.getThemedColor(((org.telegram.ui.ActionBar.k6) pd1Var.f36417i0.get(i18)).f19532f), false, false);
                    }
                }
                if (pd1Var.M1) {
                    gd1 gd1Var = pd1Var.f36433p1;
                    if (gd1Var != null && gd1Var.a()) {
                        pd1Var.R1.setVisibility(0);
                        pd1Var.R1.a(pd1Var.f36429n1);
                    } else {
                        pd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = pd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        pd1Var.P1.cancel();
                    }
                    float f10 = pd1Var.f36431o1;
                    if (pd1Var.f36433p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    pd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new b21(pd1Var, 12));
                    pd1Var.P1.addListener(new tc1(pd1Var, 5));
                    pd1Var.P1.setDuration(250L);
                    pd1Var.P1.setInterpolator(org.telegram.ui.Components.sr.f28359f);
                    pd1Var.P1.start();
                    return;
                }
                return;
            default:
                if (pd1Var.getParentActivity() != null && pd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(7, pd1Var.getParentActivity(), null, true);
                    l40Var.setAlpha(0.0f);
                    l40Var.setVisibility(4);
                    l40Var.setShowingDuration(4000L);
                    pd1Var.f36423k0.addView(l40Var, w7.y5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (pd1Var.f36433p1.a()) {
                        l40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        l40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    l40Var.d();
                    l40Var.f(pd1Var.O1, true);
                    l40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
