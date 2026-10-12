package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class pc1 implements Runnable {
    public final int f39192a;
    public final ce1 f39193b;

    public pc1(ce1 ce1Var, int i10) {
        this.f39192a = i10;
        this.f39193b = ce1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f39192a;
        float f7 = 0.0f;
        ce1 ce1Var = this.f39193b;
        switch (i11) {
            case 0:
                ce1Var.Z = false;
                int i12 = ce1Var.W;
                int i13 = ce1Var.X;
                org.telegram.ui.ActionBar.e6 e6Var = ce1Var.f34902s;
                int i14 = ce1Var.f34890n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        e6Var.f19747c = i12;
                        org.telegram.ui.ActionBar.g6.o1(false, false);
                    } else if (i13 == 1) {
                        e6Var.d = i12;
                        org.telegram.ui.ActionBar.g6.o1(true, true);
                        ce1Var.f34907u0.f1();
                        ce1Var.V.setHasChanges(ce1Var.T0(ce1Var.f34890n));
                        ce1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        e6Var.f19751j = i12;
                    } else if (i13 == 1) {
                        int C0 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Od);
                        if (i12 == 0 && C0 != 0) {
                            e6Var.f19752k = 4294967296L;
                        } else {
                            e6Var.f19752k = i12;
                        }
                    } else if (i13 == 2) {
                        int C02 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Pd);
                        if (i12 == 0 && C02 != 0) {
                            e6Var.f19753l = 4294967296L;
                        } else {
                            e6Var.f19753l = i12;
                        }
                    } else if (i13 == 3) {
                        int C03 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Qd);
                        if (i12 == 0 && C03 != 0) {
                            e6Var.f19754m = 4294967296L;
                        } else {
                            e6Var.f19754m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.g6.o1(true, false);
                    ce1Var.V.setHasChanges(ce1Var.T0(ce1Var.f34890n));
                    ce1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        e6Var.e = i12;
                    } else if (i13 == 1) {
                        e6Var.f19748f = i12;
                    } else if (i13 == 2) {
                        int i15 = e6Var.f19749g;
                        e6Var.f19749g = i12;
                        if (i15 != 0 && i12 == 0) {
                            ce1Var.f34909v0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            ce1Var.f34909v0.o(0);
                            ce1Var.e1();
                        }
                    } else {
                        e6Var.h = i12;
                    }
                    int i16 = ce1Var.X;
                    if (i16 >= 0) {
                        ce1Var.K0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.g6.o1(true, true);
                    ce1Var.f34907u0.f1();
                    ce1Var.V.setHasChanges(ce1Var.T0(ce1Var.f34890n));
                    ce1Var.m1(true);
                }
                int size = ce1Var.f34880i0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) ce1Var.f34880i0.get(i17);
                    i6Var.e(ce1Var.getThemedColor(i6Var.f20375f), false, false);
                }
                ce1Var.f34891n0.f1();
                ce1Var.f34907u0.f1();
                di.p6 p6Var = ce1Var.f34854a0;
                if (p6Var != null) {
                    p6Var.invalidate();
                }
                ce1Var.X = -1;
                return;
            case 1:
                ce1Var.presentFragment(hb1.d0(ce1Var.getMessagesController().getChat(Long.valueOf(-ce1Var.J1)), true));
                return;
            case 2:
                ce1Var.f34896p1.o1(false);
                boolean a2 = ce1Var.f34853a.a();
                org.telegram.ui.Components.yj0 yj0Var = ce1Var.N1;
                if (a2) {
                    i10 = yj0Var.e[0];
                } else {
                    i10 = 0;
                }
                yj0Var.P(i10);
                org.telegram.ui.Components.yj0 yj0Var2 = ce1Var.N1;
                if (yj0Var2 != null) {
                    yj0Var2.start();
                }
                ce1Var.b1(false);
                ce1Var.V0();
                ce1Var.i1();
                if (ce1Var.f34880i0 != null) {
                    for (int i18 = 0; i18 < ce1Var.f34880i0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.i6) ce1Var.f34880i0.get(i18)).e(ce1Var.getThemedColor(((org.telegram.ui.ActionBar.i6) ce1Var.f34880i0.get(i18)).f20375f), false, false);
                    }
                }
                if (ce1Var.M1) {
                    td1 td1Var = ce1Var.f34896p1;
                    if (td1Var != null && td1Var.a()) {
                        ce1Var.R1.setVisibility(0);
                        ce1Var.R1.a(ce1Var.f34892n1);
                    } else {
                        ce1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = ce1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ce1Var.P1.cancel();
                    }
                    float f10 = ce1Var.f34894o1;
                    if (ce1Var.f34896p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    ce1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new f21(ce1Var, 13));
                    ce1Var.P1.addListener(new gd1(ce1Var, 5));
                    ce1Var.P1.setDuration(250L);
                    ce1Var.P1.setInterpolator(org.telegram.ui.Components.es.f24771f);
                    ce1Var.P1.start();
                    return;
                }
                return;
            default:
                if (ce1Var.getParentActivity() != null && ce1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(7, ce1Var.getParentActivity(), null, true);
                    v40Var.setAlpha(0.0f);
                    v40Var.setVisibility(4);
                    v40Var.setShowingDuration(4000L);
                    ce1Var.f34886k0.addView(v40Var, w7.a6.a(-2.0f, 4.0f, 0.0f, 4.0f, 0.0f, -2, 51));
                    if (ce1Var.f34896p1.a()) {
                        v40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        v40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    v40Var.d();
                    v40Var.f(ce1Var.O1, true);
                    v40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
