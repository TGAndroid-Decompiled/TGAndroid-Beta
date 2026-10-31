package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class lg implements Runnable {
    public final int f39231a;
    public final un f39232b;

    public lg(un unVar, int i10) {
        this.f39231a = i10;
        this.f39232b = unVar;
    }

    @Override
    public final void run() {
        mk mkVar;
        View sendButton;
        View sendButton2;
        boolean z10;
        boolean z11;
        vh.p2 p2Var;
        int i10 = this.f39231a;
        boolean z12 = true;
        un unVar = this.f39232b;
        switch (i10) {
            case 0:
                mk mkVar2 = unVar.Z;
                if (mkVar2 != null && unVar.Yc != null) {
                    if (mkVar2.q0()) {
                        unVar.Z.i0(false);
                        org.telegram.messenger.i0.J3(unVar.Yc.f8523a);
                        ((fe.b) unVar.Yc.f8524b.f8521b).a(false, true);
                        return;
                    }
                    unVar.Z.T0(false, false, false);
                    unVar.Z.q1();
                    ((fe.b) unVar.Yc.f8524b.f8521b).a(true, true);
                    return;
                }
                return;
            case 1:
                if (unVar.getParentActivity() != null && unVar.fragmentView != null && (mkVar = unVar.Z) != null && (sendButton = mkVar.getSendButton()) != null && unVar.Z.getEditField() != null && unVar.Z.getEditField().getText().length() >= 5) {
                    int i11 = org.telegram.messenger.tz.f18131a;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                    org.telegram.messenger.tz.L = System.currentTimeMillis();
                    int i12 = org.telegram.messenger.tz.K + 1;
                    org.telegram.messenger.tz.K = i12;
                    edit.putInt("scheduledOrNoSoundHintShows", i12);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", org.telegram.messenger.tz.L);
                    edit.apply();
                    if (unVar.f42431u2 == null) {
                        ij ijVar = new ij(4, 0, unVar.getParentActivity(), unVar.f42477xa, false);
                        unVar.f42431u2 = ijVar;
                        ijVar.a();
                        unVar.f42431u2.setAlpha(0.0f);
                        unVar.f42431u2.setVisibility(4);
                        unVar.f42431u2.setText(org.telegram.messenger.cd.L0(2131745864, null));
                        unVar.l1.addView(unVar.f42431u2, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    unVar.f42431u2.f(sendButton, true);
                    unVar.f42443v2 = true;
                    return;
                }
                return;
            case 2:
                unVar.Ia();
                return;
            case 3:
                unVar.p9();
                unVar.Sc(0, true);
                return;
            case 4:
                unVar.o8(false, true, 0.0f);
                return;
            case 5:
                if (unVar.getParentActivity() != null && unVar.fragmentView != null && unVar.Z != null && unVar.Ya == null && unVar.getMessagesController().M1(unVar.a()) <= 0 && (sendButton2 = unVar.Z.getSendButton()) != null && unVar.Z.getEditField() != null && unVar.Z.getEditField().getText().length() != 0) {
                    int i13 = org.telegram.messenger.tz.f18131a;
                    SharedPreferences.Editor edit2 = org.telegram.messenger.vp.d1().edit();
                    org.telegram.messenger.tz.N = System.currentTimeMillis();
                    int i14 = org.telegram.messenger.tz.M + 1;
                    org.telegram.messenger.tz.M = i14;
                    edit2.putInt("scheduledHintShows", i14);
                    edit2.putLong("scheduledHintSeenAt", org.telegram.messenger.tz.N);
                    edit2.apply();
                    if (unVar.f42456w2 == null) {
                        org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(4, unVar.getParentActivity(), unVar.f42477xa, false);
                        unVar.f42456w2 = q30Var;
                        q30Var.a();
                        unVar.f42456w2.setAlpha(0.0f);
                        unVar.f42456w2.setVisibility(4);
                        unVar.f42456w2.setText(org.telegram.messenger.cd.L0(2131745866, null));
                        unVar.l1.addView(unVar.f42456w2, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    unVar.f42456w2.f(sendButton2, true);
                    unVar.f42469x2 = true;
                    return;
                }
                return;
            case 6:
                unVar.W5 = null;
                unVar.s8();
                return;
            case 7:
                unVar.W5 = null;
                unVar.s8();
                return;
            case 8:
                ArrayList arrayList = unVar.K6;
                unVar.f42218cc = System.currentTimeMillis();
                if (unVar.f42492z0 != null && unVar.C0 != null) {
                    int i15 = Integer.MAX_VALUE;
                    int i16 = Integer.MIN_VALUE;
                    for (int i17 = 0; i17 < unVar.f42492z0.getChildCount(); i17++) {
                        View childAt = unVar.f42492z0.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                            if (q1Var.getCurrentMessagesGroup() != null) {
                                for (int i18 = 0; i18 < q1Var.getCurrentMessagesGroup().d.size(); i18++) {
                                    int f12 = ((org.telegram.messenger.jj) q1Var.getCurrentMessagesGroup().d.get(i18)).f1();
                                    i15 = Math.min(i15, f12);
                                    i16 = Math.max(i16, f12);
                                }
                            } else if (q1Var.getMessageObject() != null) {
                                int f13 = q1Var.getMessageObject().f1();
                                i15 = Math.min(i15, f13);
                                i16 = Math.max(i16, f13);
                            }
                        }
                    }
                    if (i15 <= i16) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i19 = 0; i19 < arrayList.size(); i19++) {
                            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i19);
                            org.telegram.messenger.ej ejVar = (org.telegram.messenger.ej) unVar.N6.f(jjVar.d1());
                            if (ejVar != null) {
                                ArrayList arrayList3 = ejVar.d;
                                if (!arrayList2.contains(Long.valueOf(ejVar.f15394a))) {
                                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                                        org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList3.get(i20);
                                        if (jjVar2 != null) {
                                            int f14 = jjVar2.f1();
                                            org.telegram.messenger.t10 t10Var = unVar.getMessagesController().f18910t7;
                                            if (f14 >= i15 - 7 && f14 <= i16 + 7) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            t10Var.h(jjVar2, z11, false);
                                        }
                                    }
                                    arrayList2.add(Long.valueOf(ejVar.f15394a));
                                }
                            } else {
                                int f15 = jjVar.f1();
                                org.telegram.messenger.t10 t10Var2 = unVar.getMessagesController().f18910t7;
                                if (f15 >= i15 - 7 && f15 <= i16 + 7) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                t10Var2.h(jjVar, z10, false);
                            }
                        }
                    }
                }
                if (unVar.X4 > 0 && unVar.V4 != null) {
                    unVar.getMessagesController().f18910t7.h((org.telegram.messenger.jj) unVar.V4.get(Integer.valueOf(unVar.X4)), true, false);
                }
                unVar.qd();
                return;
            case 9:
                unVar.o8(false, true, 0.0f);
                return;
            case 10:
                unVar.ia();
                return;
            case 11:
                un.i1(unVar);
                return;
            case 12:
                unVar.o8(false, true, 0.0f);
                return;
            case 13:
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, unVar.getParentActivity(), unVar.f42477xa);
                unVar.Kb = x1Var;
                x1Var.setOnShowListener(new lf(unVar, 1));
                unVar.Kb.setOnCancelListener(unVar.Fa);
                unVar.Kb.r(500L);
                return;
            case 14:
                org.telegram.messenger.i0.E2(unVar.Z0);
                return;
            case 15:
                unVar.I7(true);
                org.telegram.messenger.m5.n(null, 2131743995, org.telegram.ui.Components.cc.a0(unVar), 2131623981, 36);
                return;
            case 16:
                unVar.V6();
                return;
            case 17:
                unVar.C0.M.clear();
                fm fmVar = unVar.C0;
                fmVar.L = false;
                fmVar.O(true);
                unVar.ic(false);
                return;
            case 18:
                unVar.f42178a = (unVar.f42178a + 1) % 3;
                return;
            case 19:
                unVar.f42191b = !unVar.f42191b;
                return;
            case 20:
                unVar.C0.M.clear();
                fm fmVar2 = unVar.C0;
                fmVar2.L = false;
                fmVar2.O(true);
                unVar.ic(false);
                return;
            case 21:
                unVar.Ra = false;
                unVar.Oc();
                return;
            case 22:
                unVar.Dc = 0;
                unVar.Ec = false;
                unVar.f42492z0.g1();
                return;
            case 23:
                unVar.A9();
                unVar.C9();
                unVar.z7();
                unVar.B7();
                return;
            case 24:
                unVar.Sc(0, (unVar.f42250f6 == 0 || SystemClock.elapsedRealtime() < unVar.f42250f6 + 150) ? false : false);
                return;
            case 25:
                pk pkVar = unVar.f42247f3;
                if ((pkVar == null || pkVar.getVisibility() != 0) && (p2Var = unVar.K1) != null) {
                    p2Var.u();
                    return;
                }
                return;
            case 26:
                unVar.s7();
                return;
            case 27:
                unVar.i7(false);
                return;
            case 28:
                FrameLayout.LayoutParams e = w7.b6.e(-1, -2, 87);
                e.bottomMargin = unVar.Z.getMeasuredHeight();
                unVar.l1.addView(unVar.M1, e);
                unVar.M1.setTranslationY(-org.telegram.messenger.i0.f16021n);
                unVar.M1.m(0.0f, unVar.Z.getEmojiButton().getX() + org.telegram.messenger.i0.L(22.0f));
                unVar.M1.u();
                return;
            default:
                int i21 = un.f42169ad;
                unVar.h7();
                return;
        }
    }
}
