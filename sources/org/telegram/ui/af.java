package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class af implements Runnable {
    public final int f43680a;
    public final cn f43681b;

    public af(cn cnVar, int i7) {
        this.f43680a = i7;
        this.f43681b = cnVar;
    }

    @Override
    public final void run() {
        int i7 = this.f43680a;
        cn cnVar = this.f43681b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.d0(cnVar.f44700z0, new di.e(10));
                ll llVar = cnVar.C0;
                if (llVar != null) {
                    llVar.O(false);
                    return;
                }
                return;
            case 1:
                cnVar.P7(true);
                return;
            case 2:
                cnVar.P7(true);
                return;
            case 3:
                cnVar.bd();
                return;
            case 4:
                cnVar.P7(false);
                ug.w0 w0Var = new ug.w0((org.telegram.ui.ActionBar.f2) cnVar, 24, true);
                w0Var.f28647o0 = false;
                w0Var.H0 = new ee(cnVar, 7);
                w0Var.show();
                return;
            case 5:
                cn.A0(cnVar);
                return;
            case 6:
                if (cnVar.getUserConfig().q()) {
                    cnVar.f44570oc = null;
                    cnVar.yd(true);
                    org.telegram.ui.Components.hc.a0(cnVar).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                    cnVar.getMessagesController().o0(true);
                    return;
                }
                cnVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) cnVar, 3, true));
                return;
            case 7:
                sj sjVar = cnVar.Z;
                if (sjVar != null) {
                    sjVar.o0(true);
                    return;
                }
                return;
            case 8:
                cn.Z(cnVar);
                return;
            case 9:
                cnVar.La = null;
                cnVar.Ka = -1;
                View view = cnVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = cnVar.K6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.Message message = ((org.telegram.messenger.ij) arrayList.get(i10)).f23262k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                cnVar.B6 = 0;
                cnVar.getMessagesController().o3(cnVar.f44504j6, cnVar.b());
                cnVar.C6 = true;
                cnVar.qc(false);
                org.telegram.ui.ActionBar.g1 g1Var = cnVar.f44442e9;
                if (g1Var != null) {
                    g1Var.dismiss();
                    return;
                }
                return;
            case 11:
                ArrayList arrayList2 = cnVar.K6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((org.telegram.messenger.ij) arrayList2.get(i11)).h5();
                }
                cnVar.f44701z1 = 0;
                cnVar.id(true);
                cnVar.getMessagesController().t3(cnVar.f44504j6, cnVar.b());
                org.telegram.ui.ActionBar.g1 g1Var2 = cnVar.f44442e9;
                if (g1Var2 != null) {
                    g1Var2.dismiss();
                    return;
                }
                return;
            case 12:
                ArrayList arrayList3 = cnVar.K6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    TLRPC.Message message2 = ((org.telegram.messenger.ij) arrayList3.get(i12)).f23262k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                cnVar.A1 = 0;
                cnVar.hd(true);
                cnVar.getMessagesController().s3(cnVar.f44504j6, cnVar.b());
                org.telegram.ui.ActionBar.g1 g1Var3 = cnVar.f44442e9;
                if (g1Var3 != null) {
                    g1Var3.dismiss();
                    return;
                }
                return;
            case 13:
                cn.D1(cnVar);
                return;
            case 14:
                cnVar.w8(false, true, 0.0f);
                return;
            case 15:
                cnVar.Z.H0();
                return;
            case 16:
                cnVar.Hc(true);
                cnVar.xd(true);
                org.telegram.ui.Components.hc.z(cnVar, 4, 0, cnVar.f44709za).j();
                return;
            case 17:
                org.telegram.ui.Components.hc.a0(cnVar).I(2131623981, org.telegram.messenger.id.M0(2131753290, null), org.telegram.messenger.id.M0(2131753291, null)).j();
                return;
            case 18:
                cnVar.finishFragment();
                return;
            case 19:
                org.telegram.messenger.g0.E2(cnVar.X0);
                return;
            case 20:
                cnVar.O4 = null;
                cnVar.L9();
                cnVar.N9();
                return;
            case 21:
                cnVar.Oc(false);
                return;
            case 22:
                cnVar.h7();
                return;
            case 23:
                cnVar.Jb = null;
                return;
            case 24:
                cnVar.J9 = false;
                cnVar.C9(true);
                return;
            case 25:
                cnVar.G7 = null;
                org.telegram.ui.Components.u40 u40Var = cnVar.f44574p3;
                if (u40Var != null) {
                    org.telegram.ui.Components.r40 cameraContainer = u40Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(cnVar.f44574p3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(cnVar.f44574p3.getPaint(), org.telegram.ui.Components.m6.f35965b, 0), ObjectAnimator.ofFloat(cnVar.f44574p3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new gi(cnVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 26:
                vj vjVar = cnVar.H8;
                if (vjVar != null && vjVar.getParent() != null) {
                    cnVar.f44700z0.g1();
                    cnVar.J8.setDrawingReady(false);
                    cnVar.H8.setTag(null);
                    cnVar.l1.removeView(cnVar.H8);
                    return;
                }
                return;
            case 27:
                sj sjVar2 = cnVar.Z;
                if (sjVar2 != null && cnVar.f44498id != null) {
                    if (sjVar2.s0()) {
                        cnVar.Z.k0(false);
                        org.telegram.messenger.g0.K3(cnVar.f44498id.f55295a);
                        ((te.a) cnVar.f44498id.f55296b.f8835b).a(false, true);
                        return;
                    }
                    cnVar.Z.V0(false, false, false);
                    cnVar.Z.s1();
                    ((te.a) cnVar.f44498id.f55296b.f8835b).a(true, true);
                    return;
                }
                return;
            case 28:
                cnVar.Ua();
                return;
            default:
                cnVar.A9();
                cnVar.fd(0, true);
                return;
        }
    }
}
