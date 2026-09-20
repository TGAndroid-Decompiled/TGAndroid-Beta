package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class kc1 implements Runnable {
    public final int f35091a;
    public final xd1 f35092b;

    public kc1(xd1 xd1Var, int i10) {
        this.f35091a = i10;
        this.f35092b = xd1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f35091a;
        float f7 = 0.0f;
        xd1 xd1Var = this.f35092b;
        switch (i11) {
            case 0:
                xd1Var.Z = false;
                int i12 = xd1Var.W;
                int i13 = xd1Var.X;
                org.telegram.ui.ActionBar.h6 h6Var = xd1Var.f39519s;
                int i14 = xd1Var.f39507n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        h6Var.f18929c = i12;
                        org.telegram.ui.ActionBar.j6.n1(false, false);
                    } else if (i13 == 1) {
                        h6Var.d = i12;
                        org.telegram.ui.ActionBar.j6.n1(true, true);
                        xd1Var.f39524u0.g1();
                        xd1Var.V.setHasChanges(xd1Var.T0(xd1Var.f39507n));
                        xd1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        h6Var.f18933j = i12;
                    } else if (i13 == 1) {
                        int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                        if (i12 == 0 && B0 != 0) {
                            h6Var.f18934k = 4294967296L;
                        } else {
                            h6Var.f18934k = i12;
                        }
                    } else if (i13 == 2) {
                        int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                        if (i12 == 0 && B02 != 0) {
                            h6Var.f18935l = 4294967296L;
                        } else {
                            h6Var.f18935l = i12;
                        }
                    } else if (i13 == 3) {
                        int B03 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                        if (i12 == 0 && B03 != 0) {
                            h6Var.f18936m = 4294967296L;
                        } else {
                            h6Var.f18936m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, false);
                    xd1Var.V.setHasChanges(xd1Var.T0(xd1Var.f39507n));
                    xd1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        h6Var.e = i12;
                    } else if (i13 == 1) {
                        h6Var.f18930f = i12;
                    } else if (i13 == 2) {
                        int i15 = h6Var.f18931g;
                        h6Var.f18931g = i12;
                        if (i15 != 0 && i12 == 0) {
                            xd1Var.f39526v0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            xd1Var.f39526v0.o(0);
                            xd1Var.e1();
                        }
                    } else {
                        h6Var.h = i12;
                    }
                    int i16 = xd1Var.X;
                    if (i16 >= 0) {
                        xd1Var.K0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, true);
                    xd1Var.f39524u0.g1();
                    xd1Var.V.setHasChanges(xd1Var.T0(xd1Var.f39507n));
                    xd1Var.m1(true);
                }
                int size = xd1Var.f39497i0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) xd1Var.f39497i0.get(i17);
                    l6Var.d(xd1Var.getThemedColor(l6Var.f19609f), false, false);
                }
                xd1Var.f39508n0.g1();
                xd1Var.f39524u0.g1();
                ci.s6 s6Var = xd1Var.f39471a0;
                if (s6Var != null) {
                    s6Var.invalidate();
                }
                xd1Var.X = -1;
                return;
            case 1:
                xd1Var.presentFragment(bb1.d0(xd1Var.getMessagesController().getChat(Long.valueOf(-xd1Var.J1)), true));
                return;
            case 2:
                xd1Var.f39513p1.o1(false);
                boolean a2 = xd1Var.f39470a.a();
                org.telegram.ui.Components.hj0 hj0Var = xd1Var.N1;
                if (a2) {
                    i10 = hj0Var.e[0];
                } else {
                    i10 = 0;
                }
                hj0Var.P(i10);
                org.telegram.ui.Components.hj0 hj0Var2 = xd1Var.N1;
                if (hj0Var2 != null) {
                    hj0Var2.start();
                }
                xd1Var.b1(false);
                xd1Var.V0();
                xd1Var.i1();
                if (xd1Var.f39497i0 != null) {
                    for (int i18 = 0; i18 < xd1Var.f39497i0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.l6) xd1Var.f39497i0.get(i18)).d(xd1Var.getThemedColor(((org.telegram.ui.ActionBar.l6) xd1Var.f39497i0.get(i18)).f19609f), false, false);
                    }
                }
                if (xd1Var.M1) {
                    od1 od1Var = xd1Var.f39513p1;
                    if (od1Var != null && od1Var.a()) {
                        xd1Var.R1.setVisibility(0);
                        xd1Var.R1.a(xd1Var.f39509n1);
                    } else {
                        xd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = xd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        xd1Var.P1.cancel();
                    }
                    float f10 = xd1Var.f39511o1;
                    if (xd1Var.f39513p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    xd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new i21(xd1Var, 12));
                    xd1Var.P1.addListener(new bd1(xd1Var, 5));
                    xd1Var.P1.setDuration(250L);
                    xd1Var.P1.setInterpolator(org.telegram.ui.Components.qr.f27642f);
                    xd1Var.P1.start();
                    return;
                }
                return;
            default:
                if (xd1Var.getParentActivity() != null && xd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(7, xd1Var.getParentActivity(), null, true);
                    i40Var.setAlpha(0.0f);
                    i40Var.setVisibility(4);
                    i40Var.setShowingDuration(4000L);
                    xd1Var.f39503k0.addView(i40Var, w7.y5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (xd1Var.f39513p1.a()) {
                        i40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        i40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    i40Var.d();
                    i40Var.f(xd1Var.O1, true);
                    i40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
