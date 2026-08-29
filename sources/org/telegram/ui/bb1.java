package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class bb1 implements Runnable {
    public final int f36758a;
    public final qc1 f36759b;

    public bb1(qc1 qc1Var, int i10) {
        this.f36758a = i10;
        this.f36759b = qc1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f36758a;
        float f9 = 0.0f;
        qc1 qc1Var = this.f36759b;
        switch (i11) {
            case 0:
                qc1Var.V = false;
                int i12 = qc1Var.S;
                int i13 = qc1Var.T;
                org.telegram.ui.ActionBar.e6 e6Var = qc1Var.f41669s;
                int i14 = qc1Var.f41657n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        e6Var.f22904c = i12;
                        org.telegram.ui.ActionBar.g6.n1(false, false);
                    } else if (i13 == 1) {
                        e6Var.d = i12;
                        org.telegram.ui.ActionBar.g6.n1(true, true);
                        qc1Var.f41664q0.f1();
                        qc1Var.R.setHasChanges(qc1Var.T0(qc1Var.f41657n));
                        qc1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        e6Var.f22909j = i12;
                    } else if (i13 == 1) {
                        int B0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Od);
                        if (i12 == 0 && B0 != 0) {
                            e6Var.f22910k = 4294967296L;
                        } else {
                            e6Var.f22910k = i12;
                        }
                    } else if (i13 == 2) {
                        int B02 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                        if (i12 == 0 && B02 != 0) {
                            e6Var.f22911l = 4294967296L;
                        } else {
                            e6Var.f22911l = i12;
                        }
                    } else if (i13 == 3) {
                        int B03 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                        if (i12 == 0 && B03 != 0) {
                            e6Var.f22912m = 4294967296L;
                        } else {
                            e6Var.f22912m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.g6.n1(true, false);
                    qc1Var.R.setHasChanges(qc1Var.T0(qc1Var.f41657n));
                    qc1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        e6Var.f22905e = i12;
                    } else if (i13 == 1) {
                        e6Var.f22906f = i12;
                    } else if (i13 == 2) {
                        int i15 = e6Var.f22907g;
                        e6Var.f22907g = i12;
                        if (i15 != 0 && i12 == 0) {
                            qc1Var.f41667r0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            qc1Var.f41667r0.o(0);
                            qc1Var.e1();
                        }
                    } else {
                        e6Var.h = i12;
                    }
                    int i16 = qc1Var.T;
                    if (i16 >= 0) {
                        qc1Var.G0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.g6.n1(true, true);
                    qc1Var.f41664q0.f1();
                    qc1Var.R.setHasChanges(qc1Var.T0(qc1Var.f41657n));
                    qc1Var.m1(true);
                }
                int size = qc1Var.f41638e0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) qc1Var.f41638e0.get(i17);
                    i6Var.d(qc1Var.getThemedColor(i6Var.f23536f), false, false);
                }
                qc1Var.f41651j0.f1();
                qc1Var.f41664q0.f1();
                cg.i0 i0Var = qc1Var.W;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                qc1Var.T = -1;
                return;
            case 1:
                qc1Var.presentFragment(t91.d0(qc1Var.getMessagesController().getChat(Long.valueOf(-qc1Var.F1)), true));
                return;
            case 2:
                qc1Var.l1.j1(false);
                boolean a2 = qc1Var.f41623a.a();
                org.telegram.ui.Components.xi0 xi0Var = qc1Var.J1;
                if (a2) {
                    i10 = xi0Var.f34737e[0];
                } else {
                    i10 = 0;
                }
                xi0Var.N(i10);
                org.telegram.ui.Components.xi0 xi0Var2 = qc1Var.J1;
                if (xi0Var2 != null) {
                    xi0Var2.start();
                }
                qc1Var.b1(false);
                qc1Var.V0();
                qc1Var.i1();
                if (qc1Var.f41638e0 != null) {
                    for (int i18 = 0; i18 < qc1Var.f41638e0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.i6) qc1Var.f41638e0.get(i18)).d(qc1Var.getThemedColor(((org.telegram.ui.ActionBar.i6) qc1Var.f41638e0.get(i18)).f23536f), false, false);
                    }
                }
                if (qc1Var.I1) {
                    hc1 hc1Var = qc1Var.l1;
                    if (hc1Var != null && hc1Var.a()) {
                        qc1Var.N1.setVisibility(0);
                        qc1Var.N1.a(qc1Var.f41652j1);
                    } else {
                        qc1Var.N1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = qc1Var.L1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        qc1Var.L1.cancel();
                    }
                    float f10 = qc1Var.f41654k1;
                    if (qc1Var.l1.a()) {
                        f9 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
                    qc1Var.L1 = ofFloat;
                    ofFloat.addUpdateListener(new w01(qc1Var, 13));
                    qc1Var.L1.addListener(new tb1(qc1Var, 5));
                    qc1Var.L1.setDuration(250L);
                    qc1Var.L1.setInterpolator(org.telegram.ui.Components.jr.f29800f);
                    qc1Var.L1.start();
                    return;
                }
                return;
            default:
                if (qc1Var.getParentActivity() != null && qc1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(7, qc1Var.getParentActivity(), null, true);
                    g40Var.setAlpha(0.0f);
                    g40Var.setVisibility(4);
                    g40Var.setShowingDuration(4000L);
                    qc1Var.f41645g0.addView(g40Var, i7.f6.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (qc1Var.l1.a()) {
                        g40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        g40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    g40Var.d();
                    g40Var.f(qc1Var.K1, true);
                    g40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
