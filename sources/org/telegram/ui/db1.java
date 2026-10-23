package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class db1 implements Runnable {
    public final int f36587a;
    public final qc1 f36588b;

    public db1(qc1 qc1Var, int i10) {
        this.f36587a = i10;
        this.f36588b = qc1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f36587a;
        float f7 = 0.0f;
        qc1 qc1Var = this.f36588b;
        switch (i11) {
            case 0:
                qc1Var.f40714a0 = false;
                int i12 = qc1Var.X;
                int i13 = qc1Var.Y;
                org.telegram.ui.ActionBar.i6 i6Var = qc1Var.v;
                int i14 = qc1Var.f40751n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        i6Var.f20966c = i12;
                        org.telegram.ui.ActionBar.k6.q1(false, false);
                    } else if (i13 == 1) {
                        i6Var.d = i12;
                        org.telegram.ui.ActionBar.k6.q1(true, true);
                        qc1Var.f40770v0.g1();
                        qc1Var.W.setHasChanges(qc1Var.T0(qc1Var.f40751n));
                        qc1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        i6Var.f20970j = i12;
                    } else if (i13 == 1) {
                        int D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Od);
                        if (i12 == 0 && D0 != 0) {
                            i6Var.f20971k = 4294967296L;
                        } else {
                            i6Var.f20971k = i12;
                        }
                    } else if (i13 == 2) {
                        int D02 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Pd);
                        if (i12 == 0 && D02 != 0) {
                            i6Var.f20972l = 4294967296L;
                        } else {
                            i6Var.f20972l = i12;
                        }
                    } else if (i13 == 3) {
                        int D03 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Qd);
                        if (i12 == 0 && D03 != 0) {
                            i6Var.f20973m = 4294967296L;
                        } else {
                            i6Var.f20973m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.k6.q1(true, false);
                    qc1Var.W.setHasChanges(qc1Var.T0(qc1Var.f40751n));
                    qc1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        i6Var.e = i12;
                    } else if (i13 == 1) {
                        i6Var.f20967f = i12;
                    } else if (i13 == 2) {
                        int i15 = i6Var.f20968g;
                        i6Var.f20968g = i12;
                        if (i15 != 0 && i12 == 0) {
                            qc1Var.f40773w0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            qc1Var.f40773w0.o(0);
                            qc1Var.e1();
                        }
                    } else {
                        i6Var.h = i12;
                    }
                    int i16 = qc1Var.Y;
                    if (i16 >= 0) {
                        qc1Var.L0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.k6.q1(true, true);
                    qc1Var.f40770v0.g1();
                    qc1Var.W.setHasChanges(qc1Var.T0(qc1Var.f40751n));
                    qc1Var.m1(true);
                }
                int size = qc1Var.f40743j0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) qc1Var.f40743j0.get(i17);
                    t6Var.e(qc1Var.getThemedColor(t6Var.e), false, false);
                }
                qc1Var.f40754o0.g1();
                qc1Var.f40770v0.g1();
                ei.g6 g6Var = qc1Var.f40717b0;
                if (g6Var != null) {
                    g6Var.invalidate();
                }
                qc1Var.Y = -1;
                return;
            case 1:
                qc1Var.presentFragment(u91.d0(qc1Var.getMessagesController().getChat(Long.valueOf(-qc1Var.K1)), true));
                return;
            case 2:
                qc1Var.f40759q1.c1(false);
                boolean a2 = qc1Var.f40713a.a();
                org.telegram.ui.Components.yj0 yj0Var = qc1Var.O1;
                if (a2) {
                    i10 = yj0Var.e[0];
                } else {
                    i10 = 0;
                }
                yj0Var.P(i10);
                org.telegram.ui.Components.yj0 yj0Var2 = qc1Var.O1;
                if (yj0Var2 != null) {
                    yj0Var2.start();
                }
                qc1Var.b1(false);
                qc1Var.V0();
                qc1Var.i1();
                if (qc1Var.f40743j0 != null) {
                    for (int i18 = 0; i18 < qc1Var.f40743j0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.t6) qc1Var.f40743j0.get(i18)).e(qc1Var.getThemedColor(((org.telegram.ui.ActionBar.t6) qc1Var.f40743j0.get(i18)).e), false, false);
                    }
                }
                if (qc1Var.N1) {
                    hc1 hc1Var = qc1Var.f40759q1;
                    if (hc1Var != null && hc1Var.a()) {
                        qc1Var.S1.setVisibility(0);
                        qc1Var.S1.a(qc1Var.f40755o1);
                    } else {
                        qc1Var.S1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = qc1Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        qc1Var.Q1.cancel();
                    }
                    float f10 = qc1Var.f40757p1;
                    if (qc1Var.f40759q1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    qc1Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new g11(qc1Var, 11));
                    qc1Var.Q1.addListener(new ub1(qc1Var, 5));
                    qc1Var.Q1.setDuration(250L);
                    qc1Var.Q1.setInterpolator(org.telegram.ui.Components.bs.f25133f);
                    qc1Var.Q1.start();
                    return;
                }
                return;
            default:
                if (qc1Var.getParentActivity() != null && qc1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(7, qc1Var.getParentActivity(), null, true);
                    r40Var.setAlpha(0.0f);
                    r40Var.setVisibility(4);
                    r40Var.setShowingDuration(4000L);
                    qc1Var.f40749l0.addView(r40Var, w7.z5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (qc1Var.f40759q1.a()) {
                        r40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        r40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    r40Var.d();
                    r40Var.f(qc1Var.P1, true);
                    r40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
