package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class af implements Runnable {
    public final int f45619a;
    public final bn f45620b;

    public af(bn bnVar, int i7) {
        this.f45619a = i7;
        this.f45620b = bnVar;
    }

    @Override
    public final void run() {
        int i7 = this.f45619a;
        bn bnVar = this.f45620b;
        switch (i7) {
            case 0:
                bnVar.P7(true);
                return;
            case 1:
                bnVar.P7(true);
                return;
            case 2:
                org.telegram.messenger.g0.d0(bnVar.A0, new fi.e(11));
                kl klVar = bnVar.D0;
                if (klVar != null) {
                    klVar.O(true);
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.d0(bnVar.A0, new fi.e(10));
                kl klVar2 = bnVar.D0;
                if (klVar2 != null) {
                    klVar2.O(false);
                    return;
                }
                return;
            case 4:
                bnVar.P7(false);
                ug.y0 y0Var = new ug.y0((org.telegram.ui.ActionBar.g2) bnVar, 24, true);
                y0Var.f30204p0 = false;
                y0Var.I0 = new ke(bnVar, 7);
                y0Var.show();
                return;
            case 5:
                bnVar.cd();
                return;
            case 6:
                bn.A0(bnVar);
                return;
            case 7:
                if (bnVar.getUserConfig().q()) {
                    bnVar.f46171qc = null;
                    bnVar.zd(true);
                    org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                    bnVar.getMessagesController().p0(true);
                    return;
                }
                bnVar.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) bnVar, 3, true));
                return;
            case 8:
                rj rjVar = bnVar.f45950a0;
                if (rjVar != null) {
                    rjVar.O0(true);
                    return;
                }
                return;
            case 9:
                bnVar.Na = null;
                bnVar.Ma = -1;
                View view = bnVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = bnVar.M6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.Message message = ((org.telegram.messenger.gj) arrayList.get(i10)).f24213k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                bnVar.D6 = 0;
                bnVar.getMessagesController().v3(bnVar.f46103l6, bnVar.d());
                bnVar.E6 = true;
                bnVar.rc(false);
                org.telegram.ui.ActionBar.g1 g1Var = bnVar.f46041g9;
                if (g1Var != null) {
                    g1Var.dismiss();
                    return;
                }
                return;
            case 11:
                ArrayList arrayList2 = bnVar.M6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((org.telegram.messenger.gj) arrayList2.get(i11)).h5();
                }
                bnVar.A1 = 0;
                bnVar.jd(true);
                bnVar.getMessagesController().A3(bnVar.f46103l6, bnVar.d());
                org.telegram.ui.ActionBar.g1 g1Var2 = bnVar.f46041g9;
                if (g1Var2 != null) {
                    g1Var2.dismiss();
                    return;
                }
                return;
            case 12:
                ArrayList arrayList3 = bnVar.M6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    TLRPC.Message message2 = ((org.telegram.messenger.gj) arrayList3.get(i12)).f24213k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                bnVar.B1 = 0;
                bnVar.id(true);
                bnVar.getMessagesController().z3(bnVar.f46103l6, bnVar.d());
                org.telegram.ui.ActionBar.g1 g1Var3 = bnVar.f46041g9;
                if (g1Var3 != null) {
                    g1Var3.dismiss();
                    return;
                }
                return;
            case 13:
                bn.Z(bnVar);
                return;
            case 14:
                bn.D1(bnVar);
                return;
            case 15:
                bnVar.x8(false, true, 0.0f);
                return;
            case 16:
                bnVar.Ic(true);
                bnVar.yd(true);
                org.telegram.ui.Components.lc.z(bnVar, 4, 0, bnVar.Ba).j();
                return;
            case 17:
                org.telegram.messenger.g0.E2(bnVar.Y0);
                return;
            case 18:
                bnVar.f45950a0.i1();
                return;
            case 19:
                bnVar.Q4 = null;
                bnVar.M9();
                bnVar.O9();
                return;
            case 20:
                org.telegram.ui.Components.lc.b0(bnVar).I(2131623982, org.telegram.messenger.hd.N0(2131753287, null), org.telegram.messenger.hd.N0(2131753288, null)).j();
                return;
            case 21:
                bnVar.Pc(false);
                return;
            case 22:
                bnVar.Lb = null;
                return;
            case 23:
                bnVar.L9 = false;
                bnVar.D9(true);
                return;
            case 24:
                bnVar.I7 = null;
                org.telegram.ui.Components.h50 h50Var = bnVar.f46162q3;
                if (h50Var != null) {
                    org.telegram.ui.Components.e50 cameraContainer = h50Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(bnVar.f46162q3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(bnVar.f46162q3.getPaint(), org.telegram.ui.Components.r6.f39095b, 0), ObjectAnimator.ofFloat(bnVar.f46162q3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new ei(bnVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 25:
                bnVar.h7();
                return;
            case 26:
                rj rjVar2 = bnVar.f45950a0;
                if (rjVar2 != null && bnVar.f46097kd != null) {
                    if (rjVar2.S0()) {
                        bnVar.f45950a0.K0(false);
                        org.telegram.messenger.g0.I3(bnVar.f46097kd.f57465a);
                        ((te.a) bnVar.f46097kd.f57466b.f12653b).a(false, true);
                        return;
                    }
                    bnVar.f45950a0.x1(false, false, false);
                    bnVar.f45950a0.W1();
                    ((te.a) bnVar.f46097kd.f57466b.f12653b).a(true, true);
                    return;
                }
                return;
            case 27:
                bnVar.Va();
                return;
            case 28:
                uj ujVar = bnVar.J8;
                if (ujVar != null && ujVar.getParent() != null) {
                    bnVar.A0.g1();
                    bnVar.L8.setDrawingReady(false);
                    bnVar.J8.setTag(null);
                    bnVar.f46111m1.removeView(bnVar.J8);
                    return;
                }
                return;
            default:
                bnVar.B9();
                bnVar.gd(0, true);
                return;
        }
    }
}
