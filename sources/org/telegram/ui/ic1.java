package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class ic1 implements Runnable {
    public final int f34608a;
    public final vd1 f34609b;

    public ic1(vd1 vd1Var, int i10) {
        this.f34608a = i10;
        this.f34609b = vd1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f34608a;
        float f7 = 0.0f;
        vd1 vd1Var = this.f34609b;
        switch (i11) {
            case 0:
                vd1Var.Z = false;
                int i12 = vd1Var.W;
                int i13 = vd1Var.X;
                org.telegram.ui.ActionBar.g6 g6Var = vd1Var.f38562s;
                int i14 = vd1Var.f38550n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        g6Var.f18694c = i12;
                        org.telegram.ui.ActionBar.i6.n1(false, false);
                    } else if (i13 == 1) {
                        g6Var.d = i12;
                        org.telegram.ui.ActionBar.i6.n1(true, true);
                        vd1Var.f38567u0.f1();
                        vd1Var.V.setHasChanges(vd1Var.T0(vd1Var.f38550n));
                        vd1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        g6Var.f18698j = i12;
                    } else if (i13 == 1) {
                        int B0 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Od);
                        if (i12 == 0 && B0 != 0) {
                            g6Var.f18699k = 4294967296L;
                        } else {
                            g6Var.f18699k = i12;
                        }
                    } else if (i13 == 2) {
                        int B02 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Pd);
                        if (i12 == 0 && B02 != 0) {
                            g6Var.f18700l = 4294967296L;
                        } else {
                            g6Var.f18700l = i12;
                        }
                    } else if (i13 == 3) {
                        int B03 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Qd);
                        if (i12 == 0 && B03 != 0) {
                            g6Var.f18701m = 4294967296L;
                        } else {
                            g6Var.f18701m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.i6.n1(true, false);
                    vd1Var.V.setHasChanges(vd1Var.T0(vd1Var.f38550n));
                    vd1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        g6Var.e = i12;
                    } else if (i13 == 1) {
                        g6Var.f18695f = i12;
                    } else if (i13 == 2) {
                        int i15 = g6Var.f18696g;
                        g6Var.f18696g = i12;
                        if (i15 != 0 && i12 == 0) {
                            vd1Var.f38569v0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            vd1Var.f38569v0.o(0);
                            vd1Var.e1();
                        }
                    } else {
                        g6Var.h = i12;
                    }
                    int i16 = vd1Var.X;
                    if (i16 >= 0) {
                        vd1Var.K0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.i6.n1(true, true);
                    vd1Var.f38567u0.f1();
                    vd1Var.V.setHasChanges(vd1Var.T0(vd1Var.f38550n));
                    vd1Var.m1(true);
                }
                int size = vd1Var.f38540i0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) vd1Var.f38540i0.get(i17);
                    k6Var.d(vd1Var.getThemedColor(k6Var.f19356f), false, false);
                }
                vd1Var.f38551n0.f1();
                vd1Var.f38567u0.f1();
                ci.s6 s6Var = vd1Var.f38514a0;
                if (s6Var != null) {
                    s6Var.invalidate();
                }
                vd1Var.X = -1;
                return;
            case 1:
                vd1Var.presentFragment(ya1.d0(vd1Var.getMessagesController().getChat(Long.valueOf(-vd1Var.J1)), true));
                return;
            case 2:
                vd1Var.f38556p1.o1(false);
                boolean a2 = vd1Var.f38513a.a();
                org.telegram.ui.Components.xi0 xi0Var = vd1Var.N1;
                if (a2) {
                    i10 = xi0Var.e[0];
                } else {
                    i10 = 0;
                }
                xi0Var.P(i10);
                org.telegram.ui.Components.xi0 xi0Var2 = vd1Var.N1;
                if (xi0Var2 != null) {
                    xi0Var2.start();
                }
                vd1Var.b1(false);
                vd1Var.V0();
                vd1Var.i1();
                if (vd1Var.f38540i0 != null) {
                    for (int i18 = 0; i18 < vd1Var.f38540i0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.k6) vd1Var.f38540i0.get(i18)).d(vd1Var.getThemedColor(((org.telegram.ui.ActionBar.k6) vd1Var.f38540i0.get(i18)).f19356f), false, false);
                    }
                }
                if (vd1Var.M1) {
                    md1 md1Var = vd1Var.f38556p1;
                    if (md1Var != null && md1Var.a()) {
                        vd1Var.R1.setVisibility(0);
                        vd1Var.R1.a(vd1Var.f38552n1);
                    } else {
                        vd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = vd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        vd1Var.P1.cancel();
                    }
                    float f10 = vd1Var.f38554o1;
                    if (vd1Var.f38556p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    vd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new z11(vd1Var, 13));
                    vd1Var.P1.addListener(new zc1(vd1Var, 5));
                    vd1Var.P1.setDuration(250L);
                    vd1Var.P1.setInterpolator(org.telegram.ui.Components.qr.f27423f);
                    vd1Var.P1.start();
                    return;
                }
                return;
            default:
                if (vd1Var.getParentActivity() != null && vd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(7, vd1Var.getParentActivity(), null, true);
                    i40Var.setAlpha(0.0f);
                    i40Var.setVisibility(4);
                    i40Var.setShowingDuration(4000L);
                    vd1Var.f38546k0.addView(i40Var, w7.x5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (vd1Var.f38556p1.a()) {
                        i40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        i40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    i40Var.d();
                    i40Var.f(vd1Var.O1, true);
                    i40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
