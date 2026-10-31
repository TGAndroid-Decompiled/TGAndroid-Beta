package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mf implements Runnable {
    public final int f39696a;
    public final un f39697b;

    public mf(un unVar, int i10) {
        this.f39696a = i10;
        this.f39697b = unVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.b1 b1Var;
        int i10 = this.f39696a;
        un unVar = this.f39697b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.io ioVar = ((org.telegram.ui.Components.io[]) unVar.f42192b0.f10084b)[0];
                org.telegram.ui.ActionBar.u5 u5Var = ioVar.d;
                org.telegram.ui.ActionBar.u5 u5Var2 = ioVar.e;
                unVar.T1 = !unVar.T1;
                u5Var.setPivotX(0.0f);
                u5Var2.setPivotX(0.0f);
                if (unVar.T1) {
                    u5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    u5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    u5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    u5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                org.telegram.messenger.i0.h3(unVar.U1, 6000L);
                return;
            case 1:
                org.telegram.messenger.i0.d0(unVar.f42492z0, new ag.z0(10));
                fm fmVar = unVar.C0;
                if (fmVar != null) {
                    fmVar.O(false);
                    return;
                }
                return;
            case 2:
                unVar.I7(true);
                return;
            case 3:
                unVar.I7(true);
                return;
            case 4:
                unVar.Oc();
                return;
            case 5:
                unVar.I7(false);
                kg.i1 i1Var = new kg.i1((org.telegram.ui.ActionBar.k2) unVar, 24, true);
                i1Var.f21608o0 = false;
                i1Var.H0 = new qe(unVar, 7);
                i1Var.show();
                return;
            case 6:
                un.u1(unVar);
                return;
            case 7:
                if (unVar.getUserConfig().q()) {
                    unVar.f42278hc = null;
                    unVar.ld(true);
                    org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                    unVar.getMessagesController().o0(true);
                    return;
                }
                unVar.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) unVar, 3, true));
                return;
            case 8:
                mk mkVar = unVar.Z;
                if (mkVar != null) {
                    mkVar.m0(true);
                    return;
                }
                return;
            case 9:
                un.D0(unVar);
                return;
            case 10:
                unVar.Ja = null;
                unVar.Ia = -1;
                View view = unVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 11:
                ArrayList arrayList = unVar.K6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.Message message = ((org.telegram.messenger.jj) arrayList.get(i11)).f16337k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                unVar.B6 = 0;
                unVar.getMessagesController().l3(unVar.f42297j6, unVar.b());
                unVar.C6 = true;
                unVar.dc(false);
                org.telegram.ui.ActionBar.k1 k1Var = unVar.f42240e9;
                if (k1Var != null) {
                    k1Var.dismiss();
                    return;
                }
                return;
            case 12:
                ArrayList arrayList2 = unVar.K6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((org.telegram.messenger.jj) arrayList2.get(i12)).h5();
                }
                unVar.f42493z1 = 0;
                unVar.Vc(true);
                unVar.getMessagesController().q3(unVar.f42297j6, unVar.b());
                org.telegram.ui.ActionBar.k1 k1Var2 = unVar.f42240e9;
                if (k1Var2 != null) {
                    k1Var2.dismiss();
                    return;
                }
                return;
            case 13:
                ArrayList arrayList3 = unVar.K6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    TLRPC.Message message2 = ((org.telegram.messenger.jj) arrayList3.get(i13)).f16337k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                unVar.A1 = 0;
                unVar.Uc(true);
                unVar.getMessagesController().p3(unVar.f42297j6, unVar.b());
                org.telegram.ui.ActionBar.k1 k1Var3 = unVar.f42240e9;
                if (k1Var3 != null) {
                    k1Var3.dismiss();
                    return;
                }
                return;
            case 14:
                un.O0(unVar);
                return;
            case 15:
                unVar.Z.F0();
                return;
            case 16:
                unVar.uc(true);
                unVar.kd(true);
                org.telegram.ui.Components.cc.z(unVar, 4, 0, unVar.f42477xa).j();
                return;
            case 17:
                unVar.o8(false, true, 0.0f);
                return;
            case 18:
                org.telegram.messenger.i0.E2(unVar.X0);
                return;
            case 19:
                org.telegram.ui.Components.cc.a0(unVar).I(2131623981, org.telegram.messenger.cd.L0(2131753290, null), org.telegram.messenger.cd.L0(2131753291, null)).j();
                return;
            case 20:
                unVar.finishFragment();
                return;
            case 21:
                unVar.Bc(false);
                return;
            case 22:
                unVar.o8(false, true, 0.0f);
                return;
            case 23:
                unVar.O4 = null;
                unVar.A9();
                unVar.C9();
                return;
            case 24:
                unVar.H9 = false;
                unVar.r9(true);
                return;
            case 25:
                org.telegram.ui.ActionBar.b1[] b1VarArr = unVar.f42265g9;
                if (b1VarArr != null && b1VarArr.length > 0 && (b1Var = b1VarArr[0]) != null) {
                    b1Var.requestFocus();
                    unVar.f42265g9[0].performAccessibilityAction(64, null);
                    unVar.f42265g9[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 26:
                unVar.G7 = null;
                org.telegram.ui.Components.j50 j50Var = unVar.f42370p3;
                if (j50Var != null) {
                    org.telegram.ui.Components.g50 cameraContainer = j50Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(unVar.f42370p3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(unVar.f42370p3.getPaint(), org.telegram.ui.Components.i6.f26888b, 0), ObjectAnimator.ofFloat(unVar.f42370p3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new bi(unVar, 1));
                    animatorSet.start();
                    return;
                }
                return;
            case 27:
                unVar.a7();
                return;
            case 28:
                pk pkVar = unVar.H8;
                if (pkVar != null && pkVar.getParent() != null) {
                    unVar.f42492z0.g1();
                    unVar.J8.setDrawingReady(false);
                    unVar.H8.setTag(null);
                    unVar.l1.removeView(unVar.H8);
                    return;
                }
                return;
            default:
                unVar.o8(false, true, 0.0f);
                return;
        }
    }
}
