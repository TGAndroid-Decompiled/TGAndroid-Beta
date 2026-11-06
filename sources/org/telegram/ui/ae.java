package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ae implements Runnable {
    public final int f43630a;
    public final an f43631b;

    public ae(an anVar, int i7) {
        this.f43630a = i7;
        this.f43631b = anVar;
    }

    @Override
    public final void run() {
        qj qjVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.Components.zg0[] zg0VarArr;
        int i7 = this.f43630a;
        TLRPC.ChatTheme chatTheme = null;
        an anVar = this.f43631b;
        switch (i7) {
            case 0:
                anVar.f43738b6 = null;
                if (anVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.f44023xa);
                    boolean T = org.telegram.messenger.t3.T(anVar.f43772e);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                    if (T && !anVar.f43772e.megagroup) {
                        u1Var.T = org.telegram.messenger.hd.M0(2131749084, null);
                        u1Var.R = org.telegram.messenger.hd.M0(2131749083, null);
                    } else {
                        u1Var.T = org.telegram.messenger.hd.M0(2131749082, null);
                        u1Var.R = org.telegram.messenger.hd.M0(2131749081, null);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749080, null), new fe(anVar, 2));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new fe(anVar, 3));
                    anVar.showDialog(u1Var);
                    return;
                }
                return;
            case 1:
                anVar.m7();
                return;
            case 2:
                an.l0(anVar);
                return;
            case 3:
                org.telegram.messenger.g0.E2(anVar.Y0);
                return;
            case 4:
                anVar.Oa(null, anVar.G8);
                anVar.G8 = null;
                return;
            case 5:
                if (!org.telegram.ui.ActionBar.f2.hasSheets(anVar) && (qjVar = anVar.Z) != null) {
                    qjVar.setFieldFocused(true);
                    anVar.Z.H0();
                    return;
                }
                return;
            case 6:
                anVar.zd();
                anVar.K9();
                org.telegram.messenger.g0.d0(anVar.f44038z0, new ne(anVar, 5));
                anVar.I7();
                ij ijVar = anVar.f43864l3;
                if (ijVar != null) {
                    ijVar.setTranslationX(anVar.l9() / 2.0f);
                }
                gj gjVar = anVar.f43876m3;
                if (gjVar != null) {
                    gjVar.setTranslationX(anVar.l9() / 2.0f);
                }
                FrameLayout frameLayout = anVar.f43774e1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(anVar.l9() / 2.0f);
                }
                anVar.g7();
                anVar.H7();
                return;
            case 7:
                u81 f02 = u81.f0(-anVar.f43843j6, 0L);
                f02.D = anVar;
                anVar.presentFragment(f02);
                return;
            case 8:
                anVar.Ec(true);
                return;
            case 9:
                anVar.f44014x1.d(true);
                return;
            case 10:
                anVar.resumeDelayedFragmentAnimation();
                xj xjVar = anVar.f43919pa;
                org.telegram.messenger.g0.r(xjVar);
                xjVar.run();
                anVar.getNotificationCenter().o();
                return;
            case 11:
                anVar.getNotificationCenter().j(anVar.Y9);
                return;
            case 12:
                int childCount = anVar.f44038z0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = anVar.f44038z0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var2.getMessageObject().D == 4) {
                            q1Var2.G1();
                        }
                    }
                }
                return;
            case 13:
                anVar.f43744bc = true;
                anVar.bd(true);
                return;
            case 14:
                hk hkVar = anVar.f44024xb;
                if (hkVar != null) {
                    hkVar.requestLayout();
                    return;
                }
                return;
            case 15:
                an.S0(anVar);
                return;
            case 16:
                TLRPC.UserFull userFull = anVar.f43930q8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                anVar.Kb(chatTheme);
                return;
            case 17:
                an.p0(anVar);
                return;
            case 18:
                anVar.f43740b8 = Integer.MAX_VALUE;
                anVar.f43767d8 = false;
                anVar.f43781e8 = 0L;
                anVar.f43795f8 = null;
                anVar.f43807g8 = null;
                anVar.f43820h8 = null;
                anVar.f43833i8 = -1;
                anVar.f43754c8 = false;
                anVar.Cd(false);
                anVar.f43858k8 = null;
                return;
            case 19:
                ae aeVar = new ae(anVar, 10);
                if (org.telegram.utils.twidget.p.x()) {
                    aeVar.run();
                    return;
                }
                org.telegram.ui.Components.dt dtVar = new org.telegram.ui.Components.dt(aeVar, 26);
                org.telegram.utils.twidget.p.h.add(dtVar);
                org.telegram.messenger.g0.i3(dtVar, 150L);
                return;
            case 20:
                anVar.Yb(false, true);
                return;
            case 21:
                an.d0(anVar);
                return;
            case 22:
                anVar.n7();
                return;
            case 23:
                anVar.Z.H0();
                return;
            case 24:
                an anVar2 = this.f43631b;
                int i11 = anVar2.Qb;
                if (i11 != 0) {
                    anVar2.l(i11, anVar2.Rb, anVar2.Sb, anVar2.Tb, anVar2.Ub, anVar2.Vb);
                    anVar2.Qb = 0;
                    return;
                }
                return;
            case 25:
                if (!anVar.f44041z3 && anVar.f44038z0 != null && anVar.getParentActivity() != null && anVar.fragmentView != null) {
                    org.telegram.ui.Components.zo zoVar = anVar.J2;
                    if (zoVar == null || !zoVar.V) {
                        if (zoVar == null) {
                            ol olVar = anVar.l1;
                            int indexOfChild = olVar.indexOfChild(anVar.T);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.zo zoVar2 = new org.telegram.ui.Components.zo(anVar.getParentActivity());
                                anVar.J2 = zoVar2;
                                zoVar2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                anVar.J2.l(anVar.K);
                                olVar.addView(anVar.J2, indexOfChild + 1, c8.ha.e(-1, 150, 55));
                            } else {
                                return;
                            }
                        }
                        int childCount2 = anVar.f44038z0.getChildCount();
                        for (int i12 = 0; i12 < childCount2; i12++) {
                            View childAt2 = anVar.f44038z0.getChildAt(i12);
                            if ((childAt2 instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt2).getMessageObject()) != null && messageObject.Q3() && messageObject.r4()) {
                                org.telegram.ui.Components.zo zoVar3 = anVar.J2;
                                int[] iArr = (int[]) zoVar3.Y0;
                                if (zoVar3.getParent() instanceof View) {
                                    q1Var.getLocationInWindow(iArr);
                                    int i13 = iArr[0];
                                    int i14 = iArr[1];
                                    ((View) zoVar3.getParent()).getLocationInWindow(iArr);
                                    float f10 = i14 - iArr[1];
                                    if (f10 > org.telegram.messenger.g0.L(80.0f)) {
                                        for (org.telegram.ui.Components.zg0 zg0Var : (org.telegram.ui.Components.zg0[]) zoVar3.X0) {
                                            zg0Var.N(0, false, false);
                                            zg0Var.start();
                                        }
                                        zoVar3.x(org.telegram.messenger.g0.L(5.0f) + q1Var.getChecksX() + (i13 - iArr[0]), f10 + q1Var.getChecksY() + org.telegram.messenger.g0.L(6.0f), true);
                                        anVar.getMessagesController().k4(0L, "NEWCOMER_TICKS");
                                        return;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                an.C0(anVar);
                return;
            case 27:
                qj qjVar2 = anVar.Z;
                if (qjVar2 != null && anVar.Ob != 5) {
                    qjVar2.H0();
                    return;
                }
                return;
            case 28:
                org.telegram.messenger.g0.d0(anVar.f44038z0, new di.e(11));
                jl jlVar = anVar.C0;
                if (jlVar != null) {
                    jlVar.O(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.zn znVar = ((org.telegram.ui.Components.zn[]) anVar.f43732b0.f3761b)[0];
                org.telegram.ui.ActionBar.k5 k5Var = znVar.d;
                org.telegram.ui.ActionBar.k5 k5Var2 = znVar.f41058e;
                anVar.T1 = !anVar.T1;
                k5Var.setPivotX(0.0f);
                k5Var2.setPivotX(0.0f);
                if (anVar.T1) {
                    k5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    k5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    k5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    k5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                org.telegram.messenger.g0.i3(anVar.U1, 6000L);
                return;
        }
    }
}
