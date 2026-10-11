package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class jc1 implements Runnable {
    public final int f39018a;
    public final wd1 f39019b;

    public jc1(wd1 wd1Var, int i10) {
        this.f39018a = i10;
        this.f39019b = wd1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f39018a;
        float f7 = 0.0f;
        wd1 wd1Var = this.f39019b;
        switch (i11) {
            case 0:
                wd1Var.Z = false;
                int i12 = wd1Var.W;
                int i13 = wd1Var.X;
                org.telegram.ui.ActionBar.f6 f6Var = wd1Var.f43409s;
                int i14 = wd1Var.f43397n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        f6Var.f20644c = i12;
                        org.telegram.ui.ActionBar.h6.o1(false, false);
                    } else if (i13 == 1) {
                        f6Var.d = i12;
                        org.telegram.ui.ActionBar.h6.o1(true, true);
                        wd1Var.f43414u0.f1();
                        wd1Var.V.setHasChanges(wd1Var.T0(wd1Var.f43397n));
                        wd1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        f6Var.f20649j = i12;
                    } else if (i13 == 1) {
                        int C0 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Od);
                        if (i12 == 0 && C0 != 0) {
                            f6Var.f20650k = 4294967296L;
                        } else {
                            f6Var.f20650k = i12;
                        }
                    } else if (i13 == 2) {
                        int C02 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Pd);
                        if (i12 == 0 && C02 != 0) {
                            f6Var.f20651l = 4294967296L;
                        } else {
                            f6Var.f20651l = i12;
                        }
                    } else if (i13 == 3) {
                        int C03 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Qd);
                        if (i12 == 0 && C03 != 0) {
                            f6Var.f20652m = 4294967296L;
                        } else {
                            f6Var.f20652m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.h6.o1(true, false);
                    wd1Var.V.setHasChanges(wd1Var.T0(wd1Var.f43397n));
                    wd1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        f6Var.f20645e = i12;
                    } else if (i13 == 1) {
                        f6Var.f20646f = i12;
                    } else if (i13 == 2) {
                        int i15 = f6Var.f20647g;
                        f6Var.f20647g = i12;
                        if (i15 != 0 && i12 == 0) {
                            wd1Var.f43416v0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            wd1Var.f43416v0.o(0);
                            wd1Var.e1();
                        }
                    } else {
                        f6Var.h = i12;
                    }
                    int i16 = wd1Var.X;
                    if (i16 >= 0) {
                        wd1Var.K0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.h6.o1(true, true);
                    wd1Var.f43414u0.f1();
                    wd1Var.V.setHasChanges(wd1Var.T0(wd1Var.f43397n));
                    wd1Var.m1(true);
                }
                int size = wd1Var.f43387i0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) wd1Var.f43387i0.get(i17);
                    j6Var.e(wd1Var.getThemedColor(j6Var.f21283f), false, false);
                }
                wd1Var.f43398n0.f1();
                wd1Var.f43414u0.f1();
                ci.r6 r6Var = wd1Var.f43360a0;
                if (r6Var != null) {
                    r6Var.invalidate();
                }
                wd1Var.X = -1;
                return;
            case 1:
                wd1Var.presentFragment(ab1.d0(wd1Var.getMessagesController().getChat(Long.valueOf(-wd1Var.J1)), true));
                return;
            case 2:
                wd1Var.f43403p1.l1(false);
                boolean a2 = wd1Var.f43359a.a();
                org.telegram.ui.Components.dk0 dk0Var = wd1Var.N1;
                if (a2) {
                    i10 = dk0Var.f25810e[0];
                } else {
                    i10 = 0;
                }
                dk0Var.P(i10);
                org.telegram.ui.Components.dk0 dk0Var2 = wd1Var.N1;
                if (dk0Var2 != null) {
                    dk0Var2.start();
                }
                wd1Var.b1(false);
                wd1Var.V0();
                wd1Var.i1();
                if (wd1Var.f43387i0 != null) {
                    for (int i18 = 0; i18 < wd1Var.f43387i0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.j6) wd1Var.f43387i0.get(i18)).e(wd1Var.getThemedColor(((org.telegram.ui.ActionBar.j6) wd1Var.f43387i0.get(i18)).f21283f), false, false);
                    }
                }
                if (wd1Var.M1) {
                    nd1 nd1Var = wd1Var.f43403p1;
                    if (nd1Var != null && nd1Var.a()) {
                        wd1Var.R1.setVisibility(0);
                        wd1Var.R1.a(wd1Var.f43399n1);
                    } else {
                        wd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = wd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        wd1Var.P1.cancel();
                    }
                    float f10 = wd1Var.f43401o1;
                    if (wd1Var.f43403p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    wd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new x11(wd1Var, 13));
                    wd1Var.P1.addListener(new ad1(wd1Var, 5));
                    wd1Var.P1.setDuration(250L);
                    wd1Var.P1.setInterpolator(org.telegram.ui.Components.is.f27500f);
                    wd1Var.P1.start();
                    return;
                }
                return;
            default:
                if (wd1Var.getParentActivity() != null && wd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.a50 a50Var = new org.telegram.ui.Components.a50(7, wd1Var.getParentActivity(), null, true);
                    a50Var.setAlpha(0.0f);
                    a50Var.setVisibility(4);
                    a50Var.setShowingDuration(4000L);
                    wd1Var.f43393k0.addView(a50Var, w7.x5.a(-2.0f, 4.0f, 0.0f, 4.0f, 0.0f, -2, 51));
                    if (wd1Var.f43403p1.a()) {
                        a50Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        a50Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    a50Var.d();
                    a50Var.f(wd1Var.O1, true);
                    a50Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
