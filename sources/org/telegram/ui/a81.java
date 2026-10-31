package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
public final class a81 implements Runnable {
    public final int f35585a;
    public final m91 f35586b;

    public a81(m91 m91Var, int i10) {
        this.f35585a = i10;
        this.f35586b = m91Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f35585a;
        float f7 = 0.0f;
        m91 m91Var = this.f35586b;
        switch (i11) {
            case 0:
                m91Var.f39538a0 = false;
                int i12 = m91Var.X;
                int i13 = m91Var.Y;
                org.telegram.ui.ActionBar.r6 r6Var = m91Var.f39596w;
                int i14 = m91Var.f39575n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        r6Var.f20732c = i12;
                        org.telegram.ui.ActionBar.t6.t1(false, false);
                    } else if (i13 == 1) {
                        r6Var.d = i12;
                        org.telegram.ui.ActionBar.t6.t1(true, true);
                        m91Var.f39594v0.g1();
                        m91Var.W.setHasChanges(m91Var.X0(m91Var.f39575n));
                        m91Var.q1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        r6Var.f20736j = i12;
                    } else if (i13 == 1) {
                        int E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ce);
                        if (i12 == 0 && E0 != 0) {
                            r6Var.f20737k = 4294967296L;
                        } else {
                            r6Var.f20737k = i12;
                        }
                    } else if (i13 == 2) {
                        int E02 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.De);
                        if (i12 == 0 && E02 != 0) {
                            r6Var.f20738l = 4294967296L;
                        } else {
                            r6Var.f20738l = i12;
                        }
                    } else if (i13 == 3) {
                        int E03 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ee);
                        if (i12 == 0 && E03 != 0) {
                            r6Var.f20739m = 4294967296L;
                        } else {
                            r6Var.f20739m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.t6.t1(true, false);
                    m91Var.W.setHasChanges(m91Var.X0(m91Var.f39575n));
                    m91Var.q1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        r6Var.e = i12;
                    } else if (i13 == 1) {
                        r6Var.f20733f = i12;
                    } else if (i13 == 2) {
                        int i15 = r6Var.f20734g;
                        r6Var.f20734g = i12;
                        if (i15 != 0 && i12 == 0) {
                            m91Var.f39597w0.s(0);
                        } else if (i15 == 0 && i12 != 0) {
                            m91Var.f39597w0.i(0);
                            m91Var.i1();
                        }
                    } else {
                        r6Var.h = i12;
                    }
                    int i16 = m91Var.Y;
                    if (i16 >= 0) {
                        m91Var.L0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.t6.t1(true, true);
                    m91Var.f39594v0.g1();
                    m91Var.W.setHasChanges(m91Var.X0(m91Var.f39575n));
                    m91Var.q1(true);
                }
                int size = m91Var.f39567j0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.c7 c7Var = (org.telegram.ui.ActionBar.c7) m91Var.f39567j0.get(i17);
                    c7Var.e(m91Var.getThemedColor(c7Var.e), false, false);
                }
                m91Var.f39578o0.g1();
                m91Var.f39594v0.g1();
                kg.f0 f0Var = m91Var.f39541b0;
                if (f0Var != null) {
                    f0Var.invalidate();
                }
                m91Var.Y = -1;
                return;
            case 1:
                m91Var.presentFragment(u61.f0(m91Var.getMessagesController().L0(Long.valueOf(-m91Var.K1)), true));
                return;
            case 2:
                m91Var.f39583q1.M1(false);
                boolean a2 = m91Var.f39537a.a();
                org.telegram.ui.Components.bi0 bi0Var = m91Var.O1;
                if (a2) {
                    i10 = bi0Var.e[0];
                } else {
                    i10 = 0;
                }
                bi0Var.P(i10);
                org.telegram.ui.Components.bi0 bi0Var2 = m91Var.O1;
                if (bi0Var2 != null) {
                    bi0Var2.start();
                }
                m91Var.f1(false);
                m91Var.Z0();
                m91Var.m1();
                if (m91Var.f39567j0 != null) {
                    for (int i18 = 0; i18 < m91Var.f39567j0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.c7) m91Var.f39567j0.get(i18)).e(m91Var.getThemedColor(((org.telegram.ui.ActionBar.c7) m91Var.f39567j0.get(i18)).e), false, false);
                    }
                }
                if (m91Var.N1) {
                    e91 e91Var = m91Var.f39583q1;
                    if (e91Var != null && e91Var.a()) {
                        m91Var.S1.setVisibility(0);
                        m91Var.S1.a(m91Var.f39579o1);
                    } else {
                        m91Var.S1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = m91Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        m91Var.Q1.cancel();
                    }
                    float f10 = m91Var.f39581p1;
                    if (m91Var.f39583q1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    m91Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new u01(m91Var, 9));
                    m91Var.Q1.addListener(new r81(m91Var, 5));
                    m91Var.Q1.setDuration(250L);
                    m91Var.Q1.setInterpolator(org.telegram.ui.Components.gr.f26495f);
                    m91Var.Q1.start();
                    return;
                }
                return;
            default:
                if (m91Var.getParentActivity() != null && m91Var.getParentActivity() != null) {
                    int i19 = org.telegram.messenger.tz.f18131a;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                    int i20 = org.telegram.messenger.tz.S + 1;
                    org.telegram.messenger.tz.S = i20;
                    edit.putInt("dayNightWallpaperSwitchHint", i20);
                    edit.apply();
                    org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(7, m91Var.getParentActivity(), null, true);
                    q30Var.setAlpha(0.0f);
                    q30Var.setVisibility(4);
                    q30Var.setShowingDuration(4000L);
                    m91Var.f39573l0.addView(q30Var, w7.b6.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (m91Var.f39583q1.a()) {
                        q30Var.setText(org.telegram.messenger.cd.L0(2131746893, null));
                    } else {
                        q30Var.setText(org.telegram.messenger.cd.L0(2131746892, null));
                    }
                    q30Var.d();
                    q30Var.f(m91Var.P1, true);
                    q30Var.setExtraTranslationY(-org.telegram.messenger.i0.L(14.0f));
                    return;
                }
                return;
        }
    }
}
