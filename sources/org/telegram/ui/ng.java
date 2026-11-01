package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class ng implements Runnable {
    public final int f39897a;
    public final un f39898b;

    public ng(un unVar, int i10) {
        this.f39897a = i10;
        this.f39898b = unVar;
    }

    @Override
    public final void run() {
        View sendButton;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.b1 b1Var;
        vh.p2 p2Var;
        int i10 = this.f39897a;
        boolean z12 = true;
        un unVar = this.f39898b;
        switch (i10) {
            case 0:
                unVar.Na();
                return;
            case 1:
                unVar.u9();
                unVar.Xc(0, true);
                return;
            case 2:
                if (unVar.getParentActivity() != null && unVar.fragmentView != null && unVar.Z != null && unVar.Ya == null && unVar.getMessagesController().M1(unVar.a()) <= 0 && (sendButton = unVar.Z.getSendButton()) != null && unVar.Z.getEditField() != null && unVar.Z.getEditField().getText().length() != 0) {
                    int i11 = org.telegram.messenger.uz.f18500a;
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                    org.telegram.messenger.uz.N = System.currentTimeMillis();
                    int i12 = org.telegram.messenger.uz.M + 1;
                    org.telegram.messenger.uz.M = i12;
                    edit.putInt("scheduledHintShows", i12);
                    edit.putLong("scheduledHintSeenAt", org.telegram.messenger.uz.N);
                    edit.apply();
                    if (unVar.f42267w2 == null) {
                        org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(4, unVar.getParentActivity(), unVar.f42288xa, false);
                        unVar.f42267w2 = q30Var;
                        q30Var.a();
                        unVar.f42267w2.setAlpha(0.0f);
                        unVar.f42267w2.setVisibility(4);
                        unVar.f42267w2.setText(org.telegram.messenger.dd.L0(2131745866, null));
                        unVar.l1.addView(unVar.f42267w2, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    unVar.f42267w2.f(sendButton, true);
                    unVar.f42280x2 = true;
                    return;
                }
                return;
            case 3:
                unVar.s8(false, true, 0.0f);
                return;
            case 4:
                ArrayList arrayList = unVar.K6;
                unVar.f42042dc = System.currentTimeMillis();
                if (unVar.f42303z0 != null && unVar.C0 != null) {
                    int i13 = Integer.MAX_VALUE;
                    int i14 = Integer.MIN_VALUE;
                    for (int i15 = 0; i15 < unVar.f42303z0.getChildCount(); i15++) {
                        View childAt = unVar.f42303z0.getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                            if (q1Var.getCurrentMessagesGroup() != null) {
                                for (int i16 = 0; i16 < q1Var.getCurrentMessagesGroup().d.size(); i16++) {
                                    int f12 = ((org.telegram.messenger.kj) q1Var.getCurrentMessagesGroup().d.get(i16)).f1();
                                    i13 = Math.min(i13, f12);
                                    i14 = Math.max(i14, f12);
                                }
                            } else if (q1Var.getMessageObject() != null) {
                                int f13 = q1Var.getMessageObject().f1();
                                i13 = Math.min(i13, f13);
                                i14 = Math.max(i14, f13);
                            }
                        }
                    }
                    if (i13 <= i14) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i17);
                            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) unVar.N6.f(kjVar.d1());
                            if (fjVar != null) {
                                ArrayList arrayList3 = fjVar.d;
                                if (!arrayList2.contains(Long.valueOf(fjVar.f15735a))) {
                                    for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                                        org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList3.get(i18);
                                        if (kjVar2 != null) {
                                            int f14 = kjVar2.f1();
                                            org.telegram.messenger.u10 u10Var = unVar.getMessagesController().f19253t7;
                                            if (f14 >= i13 - 7 && f14 <= i14 + 7) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            u10Var.h(kjVar2, z11, false);
                                        }
                                    }
                                    arrayList2.add(Long.valueOf(fjVar.f15735a));
                                }
                            } else {
                                int f15 = kjVar.f1();
                                org.telegram.messenger.u10 u10Var2 = unVar.getMessagesController().f19253t7;
                                if (f15 >= i13 - 7 && f15 <= i14 + 7) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                u10Var2.h(kjVar, z10, false);
                            }
                        }
                    }
                }
                if (unVar.X4 > 0 && unVar.V4 != null) {
                    unVar.getMessagesController().f19253t7.h((org.telegram.messenger.kj) unVar.V4.get(Integer.valueOf(unVar.X4)), true, false);
                }
                unVar.vd();
                return;
            case 5:
                unVar.s8(false, true, 0.0f);
                return;
            case 6:
                un.g1(unVar);
                return;
            case 7:
                unVar.na();
                return;
            case 8:
                unVar.s8(false, true, 0.0f);
                return;
            case 9:
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, unVar.getParentActivity(), unVar.f42288xa);
                unVar.Lb = x1Var;
                x1Var.setOnShowListener(new kf(unVar, 1));
                unVar.Lb.setOnCancelListener(unVar.Fa);
                unVar.Lb.r(500L);
                return;
            case 10:
                unVar.s8(false, true, 0.0f);
                return;
            case 11:
                org.telegram.ui.ActionBar.b1[] b1VarArr = unVar.f42076g9;
                if (b1VarArr != null && b1VarArr.length > 0 && (b1Var = b1VarArr[0]) != null) {
                    b1Var.requestFocus();
                    unVar.f42076g9[0].performAccessibilityAction(64, null);
                    unVar.f42076g9[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 12:
                org.telegram.messenger.i0.E2(unVar.Z0);
                return;
            case 13:
                unVar.s8(false, true, 0.0f);
                return;
            case 14:
                unVar.Z6();
                return;
            case 15:
                unVar.M7(true);
                org.telegram.messenger.m5.n(null, 2131743995, org.telegram.ui.Components.cc.a0(unVar), 2131623981, 36);
                return;
            case 16:
                unVar.C0.M.clear();
                fm fmVar = unVar.C0;
                fmVar.L = false;
                fmVar.O(true);
                unVar.nc(false);
                return;
            case 17:
                unVar.f41988a = (unVar.f41988a + 1) % 3;
                return;
            case 18:
                unVar.f42002b = !unVar.f42002b;
                return;
            case 19:
                unVar.C0.M.clear();
                fm fmVar2 = unVar.C0;
                fmVar2.L = false;
                fmVar2.O(true);
                unVar.nc(false);
                return;
            case 20:
                unVar.Ra = false;
                unVar.Tc();
                return;
            case 21:
                unVar.Ec = 0;
                unVar.Fc = false;
                unVar.f42303z0.g1();
                return;
            case 22:
                unVar.F9();
                unVar.H9();
                unVar.D7();
                unVar.F7();
                return;
            case 23:
                unVar.Xc(0, (unVar.f42061f6 == 0 || SystemClock.elapsedRealtime() < unVar.f42061f6 + 150) ? false : false);
                return;
            case 24:
                pk pkVar = unVar.f42058f3;
                if ((pkVar == null || pkVar.getVisibility() != 0) && (p2Var = unVar.K1) != null) {
                    p2Var.u();
                    return;
                }
                return;
            case 25:
                unVar.w7();
                return;
            case 26:
                unVar.m7(false);
                return;
            case 27:
                FrameLayout.LayoutParams e = w7.b6.e(-1, -2, 87);
                e.bottomMargin = unVar.Z.getMeasuredHeight();
                unVar.l1.addView(unVar.M1, e);
                unVar.M1.setTranslationY(-org.telegram.messenger.i0.f16167n);
                unVar.M1.m(0.0f, unVar.Z.getEmojiButton().getX() + org.telegram.messenger.i0.L(22.0f));
                unVar.M1.u();
                return;
            case 28:
                int i19 = un.f41979bd;
                unVar.l7();
                return;
            default:
                int i20 = un.f41979bd;
                unVar.l7();
                return;
        }
    }
}
