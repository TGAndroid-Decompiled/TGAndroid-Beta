package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class cb1 implements Runnable {
    public final int f36291a;
    public final pc1 f36292b;

    public cb1(pc1 pc1Var, int i10) {
        this.f36291a = i10;
        this.f36292b = pc1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f36291a;
        float f7 = 0.0f;
        pc1 pc1Var = this.f36292b;
        switch (i11) {
            case 0:
                pc1Var.f40443a0 = false;
                int i12 = pc1Var.X;
                int i13 = pc1Var.Y;
                org.telegram.ui.ActionBar.i6 i6Var = pc1Var.v;
                int i14 = pc1Var.f40480n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        i6Var.f20967c = i12;
                        org.telegram.ui.ActionBar.k6.q1(false, false);
                    } else if (i13 == 1) {
                        i6Var.d = i12;
                        org.telegram.ui.ActionBar.k6.q1(true, true);
                        pc1Var.f40499v0.g1();
                        pc1Var.W.setHasChanges(pc1Var.T0(pc1Var.f40480n));
                        pc1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        i6Var.f20971j = i12;
                    } else if (i13 == 1) {
                        int D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Od);
                        if (i12 == 0 && D0 != 0) {
                            i6Var.f20972k = 4294967296L;
                        } else {
                            i6Var.f20972k = i12;
                        }
                    } else if (i13 == 2) {
                        int D02 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Pd);
                        if (i12 == 0 && D02 != 0) {
                            i6Var.f20973l = 4294967296L;
                        } else {
                            i6Var.f20973l = i12;
                        }
                    } else if (i13 == 3) {
                        int D03 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Qd);
                        if (i12 == 0 && D03 != 0) {
                            i6Var.f20974m = 4294967296L;
                        } else {
                            i6Var.f20974m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.k6.q1(true, false);
                    pc1Var.W.setHasChanges(pc1Var.T0(pc1Var.f40480n));
                    pc1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        i6Var.e = i12;
                    } else if (i13 == 1) {
                        i6Var.f20968f = i12;
                    } else if (i13 == 2) {
                        int i15 = i6Var.f20969g;
                        i6Var.f20969g = i12;
                        if (i15 != 0 && i12 == 0) {
                            pc1Var.f40502w0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            pc1Var.f40502w0.o(0);
                            pc1Var.e1();
                        }
                    } else {
                        i6Var.h = i12;
                    }
                    int i16 = pc1Var.Y;
                    if (i16 >= 0) {
                        pc1Var.L0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.k6.q1(true, true);
                    pc1Var.f40499v0.g1();
                    pc1Var.W.setHasChanges(pc1Var.T0(pc1Var.f40480n));
                    pc1Var.m1(true);
                }
                int size = pc1Var.f40472j0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) pc1Var.f40472j0.get(i17);
                    t6Var.e(pc1Var.getThemedColor(t6Var.e), false, false);
                }
                pc1Var.f40483o0.g1();
                pc1Var.f40499v0.g1();
                ei.g6 g6Var = pc1Var.f40446b0;
                if (g6Var != null) {
                    g6Var.invalidate();
                }
                pc1Var.Y = -1;
                return;
            case 1:
                pc1Var.presentFragment(t91.d0(pc1Var.getMessagesController().getChat(Long.valueOf(-pc1Var.K1)), true));
                return;
            case 2:
                pc1Var.f40488q1.c1(false);
                boolean a2 = pc1Var.f40442a.a();
                org.telegram.ui.Components.xj0 xj0Var = pc1Var.O1;
                if (a2) {
                    i10 = xj0Var.e[0];
                } else {
                    i10 = 0;
                }
                xj0Var.P(i10);
                org.telegram.ui.Components.xj0 xj0Var2 = pc1Var.O1;
                if (xj0Var2 != null) {
                    xj0Var2.start();
                }
                pc1Var.b1(false);
                pc1Var.V0();
                pc1Var.i1();
                if (pc1Var.f40472j0 != null) {
                    for (int i18 = 0; i18 < pc1Var.f40472j0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.t6) pc1Var.f40472j0.get(i18)).e(pc1Var.getThemedColor(((org.telegram.ui.ActionBar.t6) pc1Var.f40472j0.get(i18)).e), false, false);
                    }
                }
                if (pc1Var.N1) {
                    gc1 gc1Var = pc1Var.f40488q1;
                    if (gc1Var != null && gc1Var.a()) {
                        pc1Var.S1.setVisibility(0);
                        pc1Var.S1.a(pc1Var.f40484o1);
                    } else {
                        pc1Var.S1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = pc1Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        pc1Var.Q1.cancel();
                    }
                    float f10 = pc1Var.f40486p1;
                    if (pc1Var.f40488q1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    pc1Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new f11(pc1Var, 11));
                    pc1Var.Q1.addListener(new tb1(pc1Var, 5));
                    pc1Var.Q1.setDuration(250L);
                    pc1Var.Q1.setInterpolator(org.telegram.ui.Components.zr.f33337f);
                    pc1Var.Q1.start();
                    return;
                }
                return;
            default:
                if (pc1Var.getParentActivity() != null && pc1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.p40 p40Var = new org.telegram.ui.Components.p40(7, pc1Var.getParentActivity(), null, true);
                    p40Var.setAlpha(0.0f);
                    p40Var.setVisibility(4);
                    p40Var.setShowingDuration(4000L);
                    pc1Var.f40478l0.addView(p40Var, w7.z5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (pc1Var.f40488q1.a()) {
                        p40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        p40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    p40Var.d();
                    p40Var.f(pc1Var.P1, true);
                    p40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
