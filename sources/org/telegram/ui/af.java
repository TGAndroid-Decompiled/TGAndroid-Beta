package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class af implements Runnable {
    public final int f43610a;
    public final an f43611b;

    public af(an anVar, int i7) {
        this.f43610a = i7;
        this.f43611b = anVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.z0 z0Var;
        int i7 = this.f43610a;
        an anVar = this.f43611b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.d0(anVar.f44013z0, new di.e(10));
                jl jlVar = anVar.C0;
                if (jlVar != null) {
                    jlVar.O(false);
                    return;
                }
                return;
            case 1:
                anVar.O7(true);
                return;
            case 2:
                anVar.O7(true);
                return;
            case 3:
                anVar.Yc();
                return;
            case 4:
                anVar.O7(false);
                ug.w0 w0Var = new ug.w0((org.telegram.ui.ActionBar.f2) anVar, 24, true);
                w0Var.f28638o0 = false;
                w0Var.H0 = new ee(anVar, 2);
                w0Var.show();
                return;
            case 5:
                an.x0(anVar);
                return;
            case 6:
                if (anVar.getUserConfig().q()) {
                    anVar.f43858mc = null;
                    anVar.vd(true);
                    org.telegram.ui.Components.hc.a0(anVar).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                    anVar.getMessagesController().o0(true);
                    return;
                }
                anVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) anVar, 3, true));
                return;
            case 7:
                qj qjVar = anVar.Z;
                if (qjVar != null) {
                    qjVar.o0(true);
                    return;
                }
                return;
            case 8:
                an.Z(anVar);
                return;
            case 9:
                anVar.Ja = null;
                anVar.Ia = -1;
                View view = anVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 10:
                anVar.Lc(false);
                return;
            case 11:
                ArrayList arrayList = anVar.K6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.Message message = ((org.telegram.messenger.ij) arrayList.get(i10)).f23237k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                anVar.B6 = 0;
                anVar.getMessagesController().o3(anVar.f43818j6, anVar.b());
                anVar.C6 = true;
                anVar.nc(false);
                org.telegram.ui.ActionBar.g1 g1Var = anVar.f43757e9;
                if (g1Var != null) {
                    g1Var.dismiss();
                    return;
                }
                return;
            case 12:
                ArrayList arrayList2 = anVar.K6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((org.telegram.messenger.ij) arrayList2.get(i11)).i5();
                }
                anVar.f44014z1 = 0;
                anVar.fd(true);
                anVar.getMessagesController().t3(anVar.f43818j6, anVar.b());
                org.telegram.ui.ActionBar.g1 g1Var2 = anVar.f43757e9;
                if (g1Var2 != null) {
                    g1Var2.dismiss();
                    return;
                }
                return;
            case 13:
                ArrayList arrayList3 = anVar.K6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    TLRPC.Message message2 = ((org.telegram.messenger.ij) arrayList3.get(i12)).f23237k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                anVar.A1 = 0;
                anVar.ed(true);
                anVar.getMessagesController().s3(anVar.f43818j6, anVar.b());
                org.telegram.ui.ActionBar.g1 g1Var3 = anVar.f43757e9;
                if (g1Var3 != null) {
                    g1Var3.dismiss();
                    return;
                }
                return;
            case 14:
                an.z1(anVar);
                return;
            case 15:
                anVar.Z.H0();
                return;
            case 16:
                anVar.Ec(true);
                anVar.ud(true);
                org.telegram.ui.Components.hc.z(anVar, 4, 0, anVar.f43998xa).j();
                return;
            case 17:
                org.telegram.ui.Components.hc.a0(anVar).I(2131623981, org.telegram.messenger.hd.M0(2131753290, null), org.telegram.messenger.hd.M0(2131753291, null)).j();
                return;
            case 18:
                anVar.finishFragment();
                return;
            case 19:
                anVar.v8(false, true, 0.0f);
                return;
            case 20:
                org.telegram.messenger.g0.E2(anVar.X0);
                return;
            case 21:
                anVar.O4 = null;
                anVar.K9();
                anVar.M9();
                return;
            case 22:
                anVar.v8(false, true, 0.0f);
                return;
            case 23:
                anVar.Hb = null;
                return;
            case 24:
                anVar.g7();
                return;
            case 25:
                anVar.H9 = false;
                anVar.B9(true);
                return;
            case 26:
                anVar.G7 = null;
                org.telegram.ui.Components.t40 t40Var = anVar.f43887p3;
                if (t40Var != null) {
                    org.telegram.ui.Components.q40 cameraContainer = t40Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(anVar.f43887p3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(anVar.f43887p3.getPaint(), org.telegram.ui.Components.m6.f35936b, 0), ObjectAnimator.ofFloat(anVar.f43887p3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new ei(anVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 27:
                org.telegram.ui.ActionBar.z0[] z0VarArr = anVar.f43783g9;
                if (z0VarArr != null && z0VarArr.length > 0 && (z0Var = z0VarArr[0]) != null) {
                    z0Var.requestFocus();
                    anVar.f43783g9[0].performAccessibilityAction(64, null);
                    anVar.f43783g9[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 28:
                tj tjVar = anVar.H8;
                if (tjVar != null && tjVar.getParent() != null) {
                    anVar.f44013z0.g1();
                    anVar.J8.setDrawingReady(false);
                    anVar.H8.setTag(null);
                    anVar.l1.removeView(anVar.H8);
                    return;
                }
                return;
            default:
                anVar.v8(false, true, 0.0f);
                return;
        }
    }
}
