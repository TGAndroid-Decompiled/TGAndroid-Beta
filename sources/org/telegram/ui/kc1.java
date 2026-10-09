package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class kc1 implements Runnable {
    public final int f39220a;
    public final xd1 f39221b;

    public kc1(xd1 xd1Var, int i10) {
        this.f39220a = i10;
        this.f39221b = xd1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f39220a;
        float f7 = 0.0f;
        xd1 xd1Var = this.f39221b;
        switch (i11) {
            case 0:
                xd1Var.Z = false;
                int i12 = xd1Var.W;
                int i13 = xd1Var.X;
                org.telegram.ui.ActionBar.g6 g6Var = xd1Var.f43985s;
                int i14 = xd1Var.f43973n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        g6Var.f20655c = i12;
                        org.telegram.ui.ActionBar.i6.o1(false, false);
                    } else if (i13 == 1) {
                        g6Var.d = i12;
                        org.telegram.ui.ActionBar.i6.o1(true, true);
                        xd1Var.f43990u0.f1();
                        xd1Var.V.setHasChanges(xd1Var.T0(xd1Var.f43973n));
                        xd1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        g6Var.f20660j = i12;
                    } else if (i13 == 1) {
                        int C0 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Od);
                        if (i12 == 0 && C0 != 0) {
                            g6Var.f20661k = 4294967296L;
                        } else {
                            g6Var.f20661k = i12;
                        }
                    } else if (i13 == 2) {
                        int C02 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Pd);
                        if (i12 == 0 && C02 != 0) {
                            g6Var.f20662l = 4294967296L;
                        } else {
                            g6Var.f20662l = i12;
                        }
                    } else if (i13 == 3) {
                        int C03 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Qd);
                        if (i12 == 0 && C03 != 0) {
                            g6Var.f20663m = 4294967296L;
                        } else {
                            g6Var.f20663m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.i6.o1(true, false);
                    xd1Var.V.setHasChanges(xd1Var.T0(xd1Var.f43973n));
                    xd1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        g6Var.f20656e = i12;
                    } else if (i13 == 1) {
                        g6Var.f20657f = i12;
                    } else if (i13 == 2) {
                        int i15 = g6Var.f20658g;
                        g6Var.f20658g = i12;
                        if (i15 != 0 && i12 == 0) {
                            xd1Var.f43992v0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            xd1Var.f43992v0.o(0);
                            xd1Var.e1();
                        }
                    } else {
                        g6Var.h = i12;
                    }
                    int i16 = xd1Var.X;
                    if (i16 >= 0) {
                        xd1Var.K0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.i6.o1(true, true);
                    xd1Var.f43990u0.f1();
                    xd1Var.V.setHasChanges(xd1Var.T0(xd1Var.f43973n));
                    xd1Var.m1(true);
                }
                int size = xd1Var.f43963i0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) xd1Var.f43963i0.get(i17);
                    k6Var.e(xd1Var.getThemedColor(k6Var.f21345f), false, false);
                }
                xd1Var.f43974n0.f1();
                xd1Var.f43990u0.f1();
                ci.r6 r6Var = xd1Var.f43936a0;
                if (r6Var != null) {
                    r6Var.invalidate();
                }
                xd1Var.X = -1;
                return;
            case 1:
                xd1Var.presentFragment(bb1.d0(xd1Var.getMessagesController().getChat(Long.valueOf(-xd1Var.J1)), true));
                return;
            case 2:
                xd1Var.f43979p1.l1(false);
                boolean a2 = xd1Var.f43935a.a();
                org.telegram.ui.Components.ck0 ck0Var = xd1Var.N1;
                if (a2) {
                    i10 = ck0Var.f25401e[0];
                } else {
                    i10 = 0;
                }
                ck0Var.P(i10);
                org.telegram.ui.Components.ck0 ck0Var2 = xd1Var.N1;
                if (ck0Var2 != null) {
                    ck0Var2.start();
                }
                xd1Var.b1(false);
                xd1Var.V0();
                xd1Var.i1();
                if (xd1Var.f43963i0 != null) {
                    for (int i18 = 0; i18 < xd1Var.f43963i0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.k6) xd1Var.f43963i0.get(i18)).e(xd1Var.getThemedColor(((org.telegram.ui.ActionBar.k6) xd1Var.f43963i0.get(i18)).f21345f), false, false);
                    }
                }
                if (xd1Var.M1) {
                    od1 od1Var = xd1Var.f43979p1;
                    if (od1Var != null && od1Var.a()) {
                        xd1Var.R1.setVisibility(0);
                        xd1Var.R1.a(xd1Var.f43975n1);
                    } else {
                        xd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = xd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        xd1Var.P1.cancel();
                    }
                    float f10 = xd1Var.f43977o1;
                    if (xd1Var.f43979p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    xd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new y11(xd1Var, 13));
                    xd1Var.P1.addListener(new bd1(xd1Var, 5));
                    xd1Var.P1.setDuration(250L);
                    xd1Var.P1.setInterpolator(org.telegram.ui.Components.hs.f27118f);
                    xd1Var.P1.start();
                    return;
                }
                return;
            default:
                if (xd1Var.getParentActivity() != null && xd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.z40 z40Var = new org.telegram.ui.Components.z40(7, xd1Var.getParentActivity(), null, true);
                    z40Var.setAlpha(0.0f);
                    z40Var.setVisibility(4);
                    z40Var.setShowingDuration(4000L);
                    xd1Var.f43969k0.addView(z40Var, w7.x5.a(-2.0f, 4.0f, 0.0f, 4.0f, 0.0f, -2, 51));
                    if (xd1Var.f43979p1.a()) {
                        z40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        z40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    z40Var.d();
                    z40Var.f(xd1Var.O1, true);
                    z40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
