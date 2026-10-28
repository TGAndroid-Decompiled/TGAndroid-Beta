package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class hb1 implements Runnable {
    public final int f39847a;
    public final vc1 f39848b;

    public hb1(vc1 vc1Var, int i10) {
        this.f39847a = i10;
        this.f39848b = vc1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f39847a;
        float f7 = 0.0f;
        vc1 vc1Var = this.f39848b;
        switch (i11) {
            case 0:
                vc1Var.f44247a0 = false;
                int i12 = vc1Var.X;
                int i13 = vc1Var.Y;
                org.telegram.ui.ActionBar.w6 w6Var = vc1Var.v;
                int i14 = vc1Var.f44284n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        w6Var.f23218c = i12;
                        org.telegram.ui.ActionBar.y6.q1(false, false);
                    } else if (i13 == 1) {
                        w6Var.d = i12;
                        org.telegram.ui.ActionBar.y6.q1(true, true);
                        vc1Var.f44303v0.g1();
                        vc1Var.W.setHasChanges(vc1Var.U0(vc1Var.f44284n));
                        vc1Var.n1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        w6Var.f23222j = i12;
                    } else if (i13 == 1) {
                        int D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Od);
                        if (i12 == 0 && D0 != 0) {
                            w6Var.f23223k = 4294967296L;
                        } else {
                            w6Var.f23223k = i12;
                        }
                    } else if (i13 == 2) {
                        int D02 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Pd);
                        if (i12 == 0 && D02 != 0) {
                            w6Var.f23224l = 4294967296L;
                        } else {
                            w6Var.f23224l = i12;
                        }
                    } else if (i13 == 3) {
                        int D03 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Qd);
                        if (i12 == 0 && D03 != 0) {
                            w6Var.f23225m = 4294967296L;
                        } else {
                            w6Var.f23225m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.y6.q1(true, false);
                    vc1Var.W.setHasChanges(vc1Var.U0(vc1Var.f44284n));
                    vc1Var.n1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        w6Var.e = i12;
                    } else if (i13 == 1) {
                        w6Var.f23219f = i12;
                    } else if (i13 == 2) {
                        int i15 = w6Var.f23220g;
                        w6Var.f23220g = i12;
                        if (i15 != 0 && i12 == 0) {
                            vc1Var.f44306w0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            vc1Var.f44306w0.o(0);
                            vc1Var.f1();
                        }
                    } else {
                        w6Var.h = i12;
                    }
                    int i16 = vc1Var.Y;
                    if (i16 >= 0) {
                        vc1Var.L0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.y6.q1(true, true);
                    vc1Var.f44303v0.g1();
                    vc1Var.W.setHasChanges(vc1Var.U0(vc1Var.f44284n));
                    vc1Var.n1(true);
                }
                int size = vc1Var.f44276j0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.h7 h7Var = (org.telegram.ui.ActionBar.h7) vc1Var.f44276j0.get(i17);
                    h7Var.e(vc1Var.getThemedColor(h7Var.e), false, false);
                }
                vc1Var.f44287o0.g1();
                vc1Var.f44303v0.g1();
                fi.f6 f6Var = vc1Var.f44250b0;
                if (f6Var != null) {
                    f6Var.invalidate();
                }
                vc1Var.Y = -1;
                return;
            case 1:
                vc1Var.presentFragment(y91.c0(vc1Var.getMessagesController().getChat(Long.valueOf(-vc1Var.K1)), true));
                return;
            case 2:
                vc1Var.f44292q1.j1(false);
                boolean a2 = vc1Var.f44246a.a();
                org.telegram.ui.Components.yj0 yj0Var = vc1Var.O1;
                if (a2) {
                    i10 = yj0Var.e[0];
                } else {
                    i10 = 0;
                }
                yj0Var.P(i10);
                org.telegram.ui.Components.yj0 yj0Var2 = vc1Var.O1;
                if (yj0Var2 != null) {
                    yj0Var2.start();
                }
                vc1Var.c1(false);
                vc1Var.W0();
                vc1Var.j1();
                if (vc1Var.f44276j0 != null) {
                    for (int i18 = 0; i18 < vc1Var.f44276j0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.h7) vc1Var.f44276j0.get(i18)).e(vc1Var.getThemedColor(((org.telegram.ui.ActionBar.h7) vc1Var.f44276j0.get(i18)).e), false, false);
                    }
                }
                if (vc1Var.N1) {
                    mc1 mc1Var = vc1Var.f44292q1;
                    if (mc1Var != null && mc1Var.a()) {
                        vc1Var.S1.setVisibility(0);
                        vc1Var.S1.a(vc1Var.f44288o1);
                    } else {
                        vc1Var.S1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = vc1Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        vc1Var.Q1.cancel();
                    }
                    float f10 = vc1Var.f44290p1;
                    if (vc1Var.f44292q1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    vc1Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new x11(vc1Var, 10));
                    vc1Var.Q1.addListener(new yb1(vc1Var, 5));
                    vc1Var.Q1.setDuration(250L);
                    vc1Var.Q1.setInterpolator(org.telegram.ui.Components.ds.f27530f);
                    vc1Var.Q1.start();
                    return;
                }
                return;
            default:
                if (vc1Var.getParentActivity() != null && vc1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(7, vc1Var.getParentActivity(), null, true);
                    t40Var.setAlpha(0.0f);
                    t40Var.setVisibility(4);
                    t40Var.setShowingDuration(4000L);
                    vc1Var.f44282l0.addView(t40Var, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (vc1Var.f44292q1.a()) {
                        t40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        t40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    t40Var.d();
                    t40Var.f(vc1Var.P1, true);
                    t40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
