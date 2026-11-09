package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ae implements Runnable {
    public final int f43676a;
    public final cn f43677b;

    public ae(cn cnVar, int i7) {
        this.f43676a = i7;
        this.f43677b = cnVar;
    }

    @Override
    public final void run() {
        sj sjVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.Components.ah0[] ah0VarArr;
        int i7 = this.f43676a;
        TLRPC.ChatTheme chatTheme = null;
        cn cnVar = this.f43677b;
        switch (i7) {
            case 0:
                cnVar.f44398b6 = null;
                if (cnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar.getParentActivity(), cnVar.f44709za);
                    boolean T = org.telegram.messenger.t3.T(cnVar.f44432e);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    if (T && !cnVar.f44432e.megagroup) {
                        u1Var.T = org.telegram.messenger.id.M0(2131749085, null);
                        u1Var.R = org.telegram.messenger.id.M0(2131749084, null);
                    } else {
                        u1Var.T = org.telegram.messenger.id.M0(2131749083, null);
                        u1Var.R = org.telegram.messenger.id.M0(2131749082, null);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131749081, null), new fe(cnVar, 2));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new fe(cnVar, 3));
                    cnVar.showDialog(u1Var);
                    return;
                }
                return;
            case 1:
                cnVar.n7();
                return;
            case 2:
                cn.m0(cnVar);
                return;
            case 3:
                org.telegram.messenger.g0.E2(cnVar.Y0);
                return;
            case 4:
                cnVar.Qa(null, cnVar.G8);
                cnVar.G8 = null;
                return;
            case 5:
                if (!org.telegram.ui.ActionBar.f2.hasSheets(cnVar) && (sjVar = cnVar.Z) != null) {
                    sjVar.setFieldFocused(true);
                    cnVar.Z.H0();
                    return;
                }
                return;
            case 6:
                cnVar.Cd();
                cnVar.L9();
                org.telegram.messenger.g0.d0(cnVar.f44700z0, new ne(cnVar, 5));
                cnVar.J7();
                kj kjVar = cnVar.f44526l3;
                if (kjVar != null) {
                    kjVar.setTranslationX(cnVar.m9() / 2.0f);
                }
                ij ijVar = cnVar.f44538m3;
                if (ijVar != null) {
                    ijVar.setTranslationX(cnVar.m9() / 2.0f);
                }
                FrameLayout frameLayout = cnVar.f44434e1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(cnVar.m9() / 2.0f);
                }
                cnVar.h7();
                cnVar.I7();
                return;
            case 7:
                w81 f02 = w81.f0(-cnVar.f44504j6, 0L);
                f02.D = cnVar;
                cnVar.presentFragment(f02);
                return;
            case 8:
                cnVar.Hc(true);
                return;
            case 9:
                cnVar.f44676x1.d(true);
                return;
            case 10:
                cnVar.resumeDelayedFragmentAnimation();
                zj zjVar = cnVar.f44608ra;
                org.telegram.messenger.g0.r(zjVar);
                zjVar.run();
                cnVar.getNotificationCenter().o();
                return;
            case 11:
                cnVar.getNotificationCenter().j(cnVar.f44387aa);
                return;
            case 12:
                int childCount = cnVar.f44700z0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = cnVar.f44700z0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var2.getMessageObject().D == 4) {
                            q1Var2.G1();
                        }
                    }
                }
                return;
            case 13:
                cnVar.dc = true;
                cnVar.ed(true);
                return;
            case 14:
                jk jkVar = cnVar.f44710zb;
                if (jkVar != null) {
                    jkVar.requestLayout();
                    return;
                }
                return;
            case 15:
                cn.U0(cnVar);
                return;
            case 16:
                TLRPC.UserFull userFull = cnVar.f44592q8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                cnVar.Nb(chatTheme);
                return;
            case 17:
                cn.r0(cnVar);
                return;
            case 18:
                cnVar.f44400b8 = Integer.MAX_VALUE;
                cnVar.f44427d8 = false;
                cnVar.f44441e8 = 0L;
                cnVar.f44455f8 = null;
                cnVar.f44467g8 = null;
                cnVar.f44480h8 = null;
                cnVar.f44493i8 = -1;
                cnVar.f44414c8 = false;
                cnVar.Fd(false);
                cnVar.f44520k8 = null;
                return;
            case 19:
                ae aeVar = new ae(cnVar, 10);
                if (org.telegram.utils.twidget.n0.z()) {
                    aeVar.run();
                    return;
                }
                org.telegram.ui.Components.et etVar = new org.telegram.ui.Components.et(aeVar, 26);
                org.telegram.utils.twidget.n0.h.add(etVar);
                org.telegram.messenger.g0.i3(etVar, 150L);
                return;
            case 20:
                cnVar.bc(false, true);
                return;
            case 21:
                cn.e0(cnVar);
                return;
            case 22:
                cnVar.o7();
                return;
            case 23:
                cnVar.Z.H0();
                return;
            case 24:
                cn cnVar2 = this.f43677b;
                int i11 = cnVar2.Sb;
                if (i11 != 0) {
                    cnVar2.l(i11, cnVar2.Tb, cnVar2.Ub, cnVar2.Vb, cnVar2.Wb, cnVar2.Xb);
                    cnVar2.Sb = 0;
                    return;
                }
                return;
            case 25:
                if (!cnVar.f44703z3 && cnVar.f44700z0 != null && cnVar.getParentActivity() != null && cnVar.fragmentView != null) {
                    org.telegram.ui.Components.zo zoVar = cnVar.J2;
                    if (zoVar == null || !zoVar.V) {
                        if (zoVar == null) {
                            ql qlVar = cnVar.l1;
                            int indexOfChild = qlVar.indexOfChild(cnVar.T);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.zo zoVar2 = new org.telegram.ui.Components.zo(cnVar.getParentActivity());
                                cnVar.J2 = zoVar2;
                                zoVar2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                cnVar.J2.l(cnVar.K);
                                qlVar.addView(cnVar.J2, indexOfChild + 1, c8.ha.e(-1, 150, 55));
                            } else {
                                return;
                            }
                        }
                        int childCount2 = cnVar.f44700z0.getChildCount();
                        for (int i12 = 0; i12 < childCount2; i12++) {
                            View childAt2 = cnVar.f44700z0.getChildAt(i12);
                            if ((childAt2 instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt2).getMessageObject()) != null && messageObject.P3() && messageObject.q4()) {
                                org.telegram.ui.Components.zo zoVar3 = cnVar.J2;
                                int[] iArr = (int[]) zoVar3.Y0;
                                if (zoVar3.getParent() instanceof View) {
                                    q1Var.getLocationInWindow(iArr);
                                    int i13 = iArr[0];
                                    int i14 = iArr[1];
                                    ((View) zoVar3.getParent()).getLocationInWindow(iArr);
                                    float f10 = i14 - iArr[1];
                                    if (f10 > org.telegram.messenger.g0.L(80.0f)) {
                                        for (org.telegram.ui.Components.ah0 ah0Var : (org.telegram.ui.Components.ah0[]) zoVar3.X0) {
                                            ah0Var.N(0, false, false);
                                            ah0Var.start();
                                        }
                                        zoVar3.x(org.telegram.messenger.g0.L(5.0f) + q1Var.getChecksX() + (i13 - iArr[0]), f10 + q1Var.getChecksY() + org.telegram.messenger.g0.L(6.0f), true);
                                        cnVar.getMessagesController().k4(0L, "NEWCOMER_TICKS");
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
                cn.G0(cnVar);
                return;
            case 27:
                sj sjVar2 = cnVar.Z;
                if (sjVar2 != null && cnVar.Qb != 5) {
                    sjVar2.H0();
                    return;
                }
                return;
            case 28:
                org.telegram.messenger.g0.d0(cnVar.f44700z0, new di.e(11));
                ll llVar = cnVar.C0;
                if (llVar != null) {
                    llVar.O(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.zn znVar = ((org.telegram.ui.Components.zn[]) cnVar.f44392b0.f3761b)[0];
                org.telegram.ui.ActionBar.l5 l5Var = znVar.d;
                org.telegram.ui.ActionBar.l5 l5Var2 = znVar.f41026e;
                cnVar.T1 = !cnVar.T1;
                l5Var.setPivotX(0.0f);
                l5Var2.setPivotX(0.0f);
                if (cnVar.T1) {
                    l5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    l5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    l5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    l5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                org.telegram.messenger.g0.i3(cnVar.U1, 6000L);
                return;
        }
    }
}
