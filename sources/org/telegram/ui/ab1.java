package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class ab1 implements Runnable {
    public final int f36448a;
    public final oc1 f36449b;

    public ab1(oc1 oc1Var, int i9) {
        this.f36448a = i9;
        this.f36449b = oc1Var;
    }

    @Override
    public final void run() {
        int i9;
        int i10 = this.f36448a;
        float f10 = 0.0f;
        oc1 oc1Var = this.f36449b;
        switch (i10) {
            case 0:
                oc1Var.V = false;
                int i11 = oc1Var.S;
                int i12 = oc1Var.T;
                org.telegram.ui.ActionBar.d6 d6Var = oc1Var.f41102s;
                int i13 = oc1Var.f41090n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        d6Var.f22868c = i11;
                        org.telegram.ui.ActionBar.f6.n1(false, false);
                    } else if (i12 == 1) {
                        d6Var.d = i11;
                        org.telegram.ui.ActionBar.f6.n1(true, true);
                        oc1Var.f41097q0.f1();
                        oc1Var.R.setHasChanges(oc1Var.T0(oc1Var.f41090n));
                        oc1Var.m1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        d6Var.f22873j = i11;
                    } else if (i12 == 1) {
                        int B0 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Od);
                        if (i11 == 0 && B0 != 0) {
                            d6Var.f22874k = 4294967296L;
                        } else {
                            d6Var.f22874k = i11;
                        }
                    } else if (i12 == 2) {
                        int B02 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Pd);
                        if (i11 == 0 && B02 != 0) {
                            d6Var.f22875l = 4294967296L;
                        } else {
                            d6Var.f22875l = i11;
                        }
                    } else if (i12 == 3) {
                        int B03 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Qd);
                        if (i11 == 0 && B03 != 0) {
                            d6Var.f22876m = 4294967296L;
                        } else {
                            d6Var.f22876m = i11;
                        }
                    }
                    org.telegram.ui.ActionBar.f6.n1(true, false);
                    oc1Var.R.setHasChanges(oc1Var.T0(oc1Var.f41090n));
                    oc1Var.m1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        d6Var.f22869e = i11;
                    } else if (i12 == 1) {
                        d6Var.f22870f = i11;
                    } else if (i12 == 2) {
                        int i14 = d6Var.f22871g;
                        d6Var.f22871g = i11;
                        if (i14 != 0 && i11 == 0) {
                            oc1Var.f41100r0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            oc1Var.f41100r0.o(0);
                            oc1Var.e1();
                        }
                    } else {
                        d6Var.h = i11;
                    }
                    int i15 = oc1Var.T;
                    if (i15 >= 0) {
                        oc1Var.G0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.f6.n1(true, true);
                    oc1Var.f41097q0.f1();
                    oc1Var.R.setHasChanges(oc1Var.T0(oc1Var.f41090n));
                    oc1Var.m1(true);
                }
                int size = oc1Var.f41071e0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) oc1Var.f41071e0.get(i16);
                    h6Var.d(oc1Var.getThemedColor(h6Var.f23498f), false, false);
                }
                oc1Var.f41084j0.f1();
                oc1Var.f41097q0.f1();
                kh.h6 h6Var2 = oc1Var.W;
                if (h6Var2 != null) {
                    h6Var2.invalidate();
                }
                oc1Var.T = -1;
                return;
            case 1:
                oc1Var.presentFragment(s91.c0(oc1Var.getMessagesController().getChat(Long.valueOf(-oc1Var.F1)), true));
                return;
            case 2:
                oc1Var.l1.m1(false);
                boolean a2 = oc1Var.f41056a.a();
                org.telegram.ui.Components.mi0 mi0Var = oc1Var.J1;
                if (a2) {
                    i9 = mi0Var.f30847e[0];
                } else {
                    i9 = 0;
                }
                mi0Var.N(i9);
                org.telegram.ui.Components.mi0 mi0Var2 = oc1Var.J1;
                if (mi0Var2 != null) {
                    mi0Var2.start();
                }
                oc1Var.b1(false);
                oc1Var.V0();
                oc1Var.i1();
                if (oc1Var.f41071e0 != null) {
                    for (int i17 = 0; i17 < oc1Var.f41071e0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.h6) oc1Var.f41071e0.get(i17)).d(oc1Var.getThemedColor(((org.telegram.ui.ActionBar.h6) oc1Var.f41071e0.get(i17)).f23498f), false, false);
                    }
                }
                if (oc1Var.I1) {
                    fc1 fc1Var = oc1Var.l1;
                    if (fc1Var != null && fc1Var.a()) {
                        oc1Var.N1.setVisibility(0);
                        oc1Var.N1.a(oc1Var.f41085j1);
                    } else {
                        oc1Var.N1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = oc1Var.L1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        oc1Var.L1.cancel();
                    }
                    float f11 = oc1Var.f41087k1;
                    if (oc1Var.l1.a()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    oc1Var.L1 = ofFloat;
                    ofFloat.addUpdateListener(new v01(oc1Var, 13));
                    oc1Var.L1.addListener(new sb1(oc1Var, 5));
                    oc1Var.L1.setDuration(250L);
                    oc1Var.L1.setInterpolator(org.telegram.ui.Components.gr.f28844f);
                    oc1Var.L1.start();
                    return;
                }
                return;
            default:
                if (oc1Var.getParentActivity() != null && oc1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(7, oc1Var.getParentActivity(), null, true);
                    s30Var.setAlpha(0.0f);
                    s30Var.setVisibility(4);
                    s30Var.setShowingDuration(4000L);
                    oc1Var.f41078g0.addView(s30Var, g7.e6.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (oc1Var.l1.a()) {
                        s30Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        s30Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    s30Var.d();
                    s30Var.f(oc1Var.K1, true);
                    s30Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
