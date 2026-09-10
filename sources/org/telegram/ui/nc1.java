package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class nc1 implements Runnable {
    public final int f35216a;
    public final ae1 f35217b;

    public nc1(ae1 ae1Var, int i10) {
        this.f35216a = i10;
        this.f35217b = ae1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f35216a;
        float f7 = 0.0f;
        ae1 ae1Var = this.f35217b;
        switch (i11) {
            case 0:
                ae1Var.Z = false;
                int i12 = ae1Var.W;
                int i13 = ae1Var.X;
                org.telegram.ui.ActionBar.h6 h6Var = ae1Var.f30963s;
                int i14 = ae1Var.f30951n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        h6Var.f17794c = i12;
                        org.telegram.ui.ActionBar.j6.n1(false, false);
                    } else if (i13 == 1) {
                        h6Var.d = i12;
                        org.telegram.ui.ActionBar.j6.n1(true, true);
                        ae1Var.f30968u0.e1();
                        ae1Var.V.setHasChanges(ae1Var.T0(ae1Var.f30951n));
                        ae1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        h6Var.f17798j = i12;
                    } else if (i13 == 1) {
                        int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                        if (i12 == 0 && B0 != 0) {
                            h6Var.f17799k = 4294967296L;
                        } else {
                            h6Var.f17799k = i12;
                        }
                    } else if (i13 == 2) {
                        int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                        if (i12 == 0 && B02 != 0) {
                            h6Var.f17800l = 4294967296L;
                        } else {
                            h6Var.f17800l = i12;
                        }
                    } else if (i13 == 3) {
                        int B03 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                        if (i12 == 0 && B03 != 0) {
                            h6Var.f17801m = 4294967296L;
                        } else {
                            h6Var.f17801m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, false);
                    ae1Var.V.setHasChanges(ae1Var.T0(ae1Var.f30951n));
                    ae1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        h6Var.e = i12;
                    } else if (i13 == 1) {
                        h6Var.f17795f = i12;
                    } else if (i13 == 2) {
                        int i15 = h6Var.f17796g;
                        h6Var.f17796g = i12;
                        if (i15 != 0 && i12 == 0) {
                            ae1Var.f30970v0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            ae1Var.f30970v0.o(0);
                            ae1Var.e1();
                        }
                    } else {
                        h6Var.h = i12;
                    }
                    int i16 = ae1Var.X;
                    if (i16 >= 0) {
                        ae1Var.K0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, true);
                    ae1Var.f30968u0.e1();
                    ae1Var.V.setHasChanges(ae1Var.T0(ae1Var.f30951n));
                    ae1Var.m1(true);
                }
                int size = ae1Var.f30941i0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) ae1Var.f30941i0.get(i17);
                    l6Var.d(ae1Var.getThemedColor(l6Var.f18457f), false, false);
                }
                ae1Var.f30952n0.e1();
                ae1Var.f30968u0.e1();
                bi.s7 s7Var = ae1Var.f30915a0;
                if (s7Var != null) {
                    s7Var.invalidate();
                }
                ae1Var.X = -1;
                return;
            case 1:
                ae1Var.presentFragment(fb1.d0(ae1Var.getMessagesController().getChat(Long.valueOf(-ae1Var.J1)), true));
                return;
            case 2:
                ae1Var.f30957p1.n1(false);
                boolean a2 = ae1Var.f30914a.a();
                org.telegram.ui.Components.hj0 hj0Var = ae1Var.N1;
                if (a2) {
                    i10 = hj0Var.e[0];
                } else {
                    i10 = 0;
                }
                hj0Var.P(i10);
                org.telegram.ui.Components.hj0 hj0Var2 = ae1Var.N1;
                if (hj0Var2 != null) {
                    hj0Var2.start();
                }
                ae1Var.b1(false);
                ae1Var.V0();
                ae1Var.i1();
                if (ae1Var.f30941i0 != null) {
                    for (int i18 = 0; i18 < ae1Var.f30941i0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.l6) ae1Var.f30941i0.get(i18)).d(ae1Var.getThemedColor(((org.telegram.ui.ActionBar.l6) ae1Var.f30941i0.get(i18)).f18457f), false, false);
                    }
                }
                if (ae1Var.M1) {
                    rd1 rd1Var = ae1Var.f30957p1;
                    if (rd1Var != null && rd1Var.a()) {
                        ae1Var.R1.setVisibility(0);
                        ae1Var.R1.a(ae1Var.f30953n1);
                    } else {
                        ae1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = ae1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ae1Var.P1.cancel();
                    }
                    float f10 = ae1Var.f30955o1;
                    if (ae1Var.f30957p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    ae1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new f21(ae1Var, 13));
                    ae1Var.P1.addListener(new ed1(ae1Var, 5));
                    ae1Var.P1.setDuration(250L);
                    ae1Var.P1.setInterpolator(org.telegram.ui.Components.wr.f28819f);
                    ae1Var.P1.start();
                    return;
                }
                return;
            default:
                if (ae1Var.getParentActivity() != null && ae1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(7, ae1Var.getParentActivity(), null, true);
                    s40Var.setAlpha(0.0f);
                    s40Var.setVisibility(4);
                    s40Var.setShowingDuration(4000L);
                    ae1Var.f30947k0.addView(s40Var, w7.a6.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (ae1Var.f30957p1.a()) {
                        s40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        s40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    s40Var.d();
                    s40Var.f(ae1Var.O1, true);
                    s40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
