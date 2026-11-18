package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class af implements Runnable {
    public final int f45582a;
    public final bn f45583b;

    public af(bn bnVar, int i7) {
        this.f45582a = i7;
        this.f45583b = bnVar;
    }

    @Override
    public final void run() {
        int i7 = this.f45582a;
        bn bnVar = this.f45583b;
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
                ug.z0 z0Var = new ug.z0((org.telegram.ui.ActionBar.h2) bnVar, 24, true);
                z0Var.f30220p0 = false;
                z0Var.I0 = new ke(bnVar, 7);
                z0Var.show();
                return;
            case 5:
                bnVar.cd();
                return;
            case 6:
                bn.A0(bnVar);
                return;
            case 7:
                if (bnVar.getUserConfig().q()) {
                    bnVar.f46153qc = null;
                    bnVar.zd(true);
                    org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.gd.M0(2131754486, null)).j();
                    bnVar.getMessagesController().p0(true);
                    return;
                }
                bnVar.showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) bnVar, 3, true));
                return;
            case 8:
                rj rjVar = bnVar.f45932a0;
                if (rjVar != null) {
                    rjVar.K0(true);
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
                    TLRPC.Message message = ((org.telegram.messenger.fj) arrayList.get(i10)).f23968k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                bnVar.D6 = 0;
                bnVar.getMessagesController().v3(bnVar.f46085l6, bnVar.d());
                bnVar.E6 = true;
                bnVar.rc(false);
                org.telegram.ui.ActionBar.h1 h1Var = bnVar.f46023g9;
                if (h1Var != null) {
                    h1Var.dismiss();
                    return;
                }
                return;
            case 11:
                ArrayList arrayList2 = bnVar.M6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((org.telegram.messenger.fj) arrayList2.get(i11)).h5();
                }
                bnVar.A1 = 0;
                bnVar.jd(true);
                bnVar.getMessagesController().A3(bnVar.f46085l6, bnVar.d());
                org.telegram.ui.ActionBar.h1 h1Var2 = bnVar.f46023g9;
                if (h1Var2 != null) {
                    h1Var2.dismiss();
                    return;
                }
                return;
            case 12:
                ArrayList arrayList3 = bnVar.M6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    TLRPC.Message message2 = ((org.telegram.messenger.fj) arrayList3.get(i12)).f23968k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                bnVar.B1 = 0;
                bnVar.id(true);
                bnVar.getMessagesController().z3(bnVar.f46085l6, bnVar.d());
                org.telegram.ui.ActionBar.h1 h1Var3 = bnVar.f46023g9;
                if (h1Var3 != null) {
                    h1Var3.dismiss();
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
                bnVar.f45932a0.e1();
                return;
            case 19:
                bnVar.Q4 = null;
                bnVar.M9();
                bnVar.O9();
                return;
            case 20:
                org.telegram.ui.Components.lc.b0(bnVar).I(2131623982, org.telegram.messenger.gd.M0(2131753288, null), org.telegram.messenger.gd.M0(2131753289, null)).j();
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
                org.telegram.ui.Components.e50 e50Var = bnVar.f46144q3;
                if (e50Var != null) {
                    org.telegram.ui.Components.b50 cameraContainer = e50Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(bnVar.f46144q3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(bnVar.f46144q3.getPaint(), org.telegram.ui.Components.q6.f38712b, 0), ObjectAnimator.ofFloat(bnVar.f46144q3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new ei(bnVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 25:
                bnVar.h7();
                return;
            case 26:
                rj rjVar2 = bnVar.f45932a0;
                if (rjVar2 != null && bnVar.f46079kd != null) {
                    if (rjVar2.O0()) {
                        bnVar.f45932a0.G0(false);
                        org.telegram.messenger.g0.I3(bnVar.f46079kd.f57422a);
                        ((te.a) bnVar.f46079kd.f57423b.f12614b).a(false, true);
                        return;
                    }
                    bnVar.f45932a0.t1(false, false, false);
                    bnVar.f45932a0.S1();
                    ((te.a) bnVar.f46079kd.f57423b.f12614b).a(true, true);
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
                    bnVar.f46093m1.removeView(bnVar.J8);
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
