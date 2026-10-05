package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class cc1 implements Runnable {
    public final int f35396a;
    public final pd1 f35397b;

    public cc1(pd1 pd1Var, int i10) {
        this.f35396a = i10;
        this.f35397b = pd1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f35396a;
        float f7 = 0.0f;
        pd1 pd1Var = this.f35397b;
        switch (i11) {
            case 0:
                pd1Var.Z = false;
                int i12 = pd1Var.W;
                int i13 = pd1Var.X;
                org.telegram.ui.ActionBar.f6 f6Var = pd1Var.f39537s;
                int i14 = pd1Var.f39525n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        f6Var.f20622c = i12;
                        org.telegram.ui.ActionBar.i6.n1(false, false);
                    } else if (i13 == 1) {
                        f6Var.d = i12;
                        org.telegram.ui.ActionBar.i6.n1(true, true);
                        pd1Var.f39542u0.g1();
                        pd1Var.V.setHasChanges(pd1Var.T0(pd1Var.f39525n));
                        pd1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        f6Var.f20627j = i12;
                    } else if (i13 == 1) {
                        int B0 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Od);
                        if (i12 == 0 && B0 != 0) {
                            f6Var.f20628k = 4294967296L;
                        } else {
                            f6Var.f20628k = i12;
                        }
                    } else if (i13 == 2) {
                        int B02 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Pd);
                        if (i12 == 0 && B02 != 0) {
                            f6Var.f20629l = 4294967296L;
                        } else {
                            f6Var.f20629l = i12;
                        }
                    } else if (i13 == 3) {
                        int B03 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Qd);
                        if (i12 == 0 && B03 != 0) {
                            f6Var.f20630m = 4294967296L;
                        } else {
                            f6Var.f20630m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.i6.n1(true, false);
                    pd1Var.V.setHasChanges(pd1Var.T0(pd1Var.f39525n));
                    pd1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        f6Var.f20623e = i12;
                    } else if (i13 == 1) {
                        f6Var.f20624f = i12;
                    } else if (i13 == 2) {
                        int i15 = f6Var.f20625g;
                        f6Var.f20625g = i12;
                        if (i15 != 0 && i12 == 0) {
                            pd1Var.f39544v0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            pd1Var.f39544v0.o(0);
                            pd1Var.e1();
                        }
                    } else {
                        f6Var.h = i12;
                    }
                    int i16 = pd1Var.X;
                    if (i16 >= 0) {
                        pd1Var.K0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.i6.n1(true, true);
                    pd1Var.f39542u0.g1();
                    pd1Var.V.setHasChanges(pd1Var.T0(pd1Var.f39525n));
                    pd1Var.m1(true);
                }
                int size = pd1Var.f39515i0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) pd1Var.f39515i0.get(i17);
                    k6Var.e(pd1Var.getThemedColor(k6Var.f21346f), false, false);
                }
                pd1Var.f39526n0.g1();
                pd1Var.f39542u0.g1();
                ci.r6 r6Var = pd1Var.f39488a0;
                if (r6Var != null) {
                    r6Var.invalidate();
                }
                pd1Var.X = -1;
                return;
            case 1:
                pd1Var.presentFragment(ta1.b0(pd1Var.getMessagesController().getChat(Long.valueOf(-pd1Var.J1)), true));
                return;
            case 2:
                pd1Var.f39531p1.q1(false);
                boolean a2 = pd1Var.f39487a.a();
                org.telegram.ui.Components.kj0 kj0Var = pd1Var.N1;
                if (a2) {
                    i10 = kj0Var.f28216e[0];
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
                if (pd1Var.f39515i0 != null) {
                    for (int i18 = 0; i18 < pd1Var.f39515i0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.k6) pd1Var.f39515i0.get(i18)).e(pd1Var.getThemedColor(((org.telegram.ui.ActionBar.k6) pd1Var.f39515i0.get(i18)).f21346f), false, false);
                    }
                }
                if (pd1Var.M1) {
                    gd1 gd1Var = pd1Var.f39531p1;
                    if (gd1Var != null && gd1Var.a()) {
                        pd1Var.R1.setVisibility(0);
                        pd1Var.R1.a(pd1Var.f39527n1);
                    } else {
                        pd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = pd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        pd1Var.P1.cancel();
                    }
                    float f10 = pd1Var.f39529o1;
                    if (pd1Var.f39531p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    pd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new b21(pd1Var, 12));
                    pd1Var.P1.addListener(new tc1(pd1Var, 5));
                    pd1Var.P1.setDuration(250L);
                    pd1Var.P1.setInterpolator(org.telegram.ui.Components.tr.f31215f);
                    pd1Var.P1.start();
                    return;
                }
                return;
            default:
                if (pd1Var.getParentActivity() != null && pd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(7, pd1Var.getParentActivity(), null, true);
                    m40Var.setAlpha(0.0f);
                    m40Var.setVisibility(4);
                    m40Var.setShowingDuration(4000L);
                    pd1Var.f39521k0.addView(m40Var, w7.z5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (pd1Var.f39531p1.a()) {
                        m40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        m40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    m40Var.d();
                    m40Var.f(pd1Var.O1, true);
                    m40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
