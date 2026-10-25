package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class fb1 implements Runnable {
    public final int f39330a;
    public final tc1 f39331b;

    public fb1(tc1 tc1Var, int i10) {
        this.f39330a = i10;
        this.f39331b = tc1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f39330a;
        float f7 = 0.0f;
        tc1 tc1Var = this.f39331b;
        switch (i11) {
            case 0:
                tc1Var.f43734a0 = false;
                int i12 = tc1Var.X;
                int i13 = tc1Var.Y;
                org.telegram.ui.ActionBar.w6 w6Var = tc1Var.v;
                int i14 = tc1Var.f43771n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        w6Var.f23215c = i12;
                        org.telegram.ui.ActionBar.y6.q1(false, false);
                    } else if (i13 == 1) {
                        w6Var.d = i12;
                        org.telegram.ui.ActionBar.y6.q1(true, true);
                        tc1Var.f43790v0.g1();
                        tc1Var.W.setHasChanges(tc1Var.U0(tc1Var.f43771n));
                        tc1Var.n1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        w6Var.f23219j = i12;
                    } else if (i13 == 1) {
                        int D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Od);
                        if (i12 == 0 && D0 != 0) {
                            w6Var.f23220k = 4294967296L;
                        } else {
                            w6Var.f23220k = i12;
                        }
                    } else if (i13 == 2) {
                        int D02 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Pd);
                        if (i12 == 0 && D02 != 0) {
                            w6Var.f23221l = 4294967296L;
                        } else {
                            w6Var.f23221l = i12;
                        }
                    } else if (i13 == 3) {
                        int D03 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Qd);
                        if (i12 == 0 && D03 != 0) {
                            w6Var.f23222m = 4294967296L;
                        } else {
                            w6Var.f23222m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.y6.q1(true, false);
                    tc1Var.W.setHasChanges(tc1Var.U0(tc1Var.f43771n));
                    tc1Var.n1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        w6Var.e = i12;
                    } else if (i13 == 1) {
                        w6Var.f23216f = i12;
                    } else if (i13 == 2) {
                        int i15 = w6Var.f23217g;
                        w6Var.f23217g = i12;
                        if (i15 != 0 && i12 == 0) {
                            tc1Var.f43793w0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            tc1Var.f43793w0.o(0);
                            tc1Var.f1();
                        }
                    } else {
                        w6Var.h = i12;
                    }
                    int i16 = tc1Var.Y;
                    if (i16 >= 0) {
                        tc1Var.L0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.y6.q1(true, true);
                    tc1Var.f43790v0.g1();
                    tc1Var.W.setHasChanges(tc1Var.U0(tc1Var.f43771n));
                    tc1Var.n1(true);
                }
                int size = tc1Var.f43763j0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.h7 h7Var = (org.telegram.ui.ActionBar.h7) tc1Var.f43763j0.get(i17);
                    h7Var.e(tc1Var.getThemedColor(h7Var.e), false, false);
                }
                tc1Var.f43774o0.g1();
                tc1Var.f43790v0.g1();
                fi.f6 f6Var = tc1Var.f43737b0;
                if (f6Var != null) {
                    f6Var.invalidate();
                }
                tc1Var.Y = -1;
                return;
            case 1:
                tc1Var.presentFragment(w91.c0(tc1Var.getMessagesController().getChat(Long.valueOf(-tc1Var.K1)), true));
                return;
            case 2:
                tc1Var.f43779q1.j1(false);
                boolean a2 = tc1Var.f43733a.a();
                org.telegram.ui.Components.xj0 xj0Var = tc1Var.O1;
                if (a2) {
                    i10 = xj0Var.e[0];
                } else {
                    i10 = 0;
                }
                xj0Var.P(i10);
                org.telegram.ui.Components.xj0 xj0Var2 = tc1Var.O1;
                if (xj0Var2 != null) {
                    xj0Var2.start();
                }
                tc1Var.c1(false);
                tc1Var.W0();
                tc1Var.j1();
                if (tc1Var.f43763j0 != null) {
                    for (int i18 = 0; i18 < tc1Var.f43763j0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.h7) tc1Var.f43763j0.get(i18)).e(tc1Var.getThemedColor(((org.telegram.ui.ActionBar.h7) tc1Var.f43763j0.get(i18)).e), false, false);
                    }
                }
                if (tc1Var.N1) {
                    kc1 kc1Var = tc1Var.f43779q1;
                    if (kc1Var != null && kc1Var.a()) {
                        tc1Var.S1.setVisibility(0);
                        tc1Var.S1.a(tc1Var.f43775o1);
                    } else {
                        tc1Var.S1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = tc1Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        tc1Var.Q1.cancel();
                    }
                    float f10 = tc1Var.f43777p1;
                    if (tc1Var.f43779q1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    tc1Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new v11(tc1Var, 10));
                    tc1Var.Q1.addListener(new wb1(tc1Var, 5));
                    tc1Var.Q1.setDuration(250L);
                    tc1Var.Q1.setInterpolator(org.telegram.ui.Components.ds.f27584f);
                    tc1Var.Q1.start();
                    return;
                }
                return;
            default:
                if (tc1Var.getParentActivity() != null && tc1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(7, tc1Var.getParentActivity(), null, true);
                    t40Var.setAlpha(0.0f);
                    t40Var.setVisibility(4);
                    t40Var.setShowingDuration(4000L);
                    tc1Var.f43769l0.addView(t40Var, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (tc1Var.f43779q1.a()) {
                        t40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        t40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    t40Var.d();
                    t40Var.f(tc1Var.P1, true);
                    t40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
