package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class cq implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f32806a;
    public final nq f32807b;

    public cq(nq nqVar, int i10) {
        this.f32806a = i10;
        this.f32807b = nqVar;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f32806a) {
            case 0:
                this.f32807b.r0(true);
                return;
            case 1:
                nq nqVar = this.f32807b;
                nqVar.t0(true);
                fq fqVar = new fq(nqVar, 0);
                if (!nqVar.K && !nqVar.L) {
                    nqVar.getMessagesController().addUserToChat(nqVar.f36107w.f18328id, nqVar.v, 0, nqVar.Y0, nqVar, true, fqVar, new cq(nqVar, 3));
                    return;
                }
                MessagesController messagesController = nqVar.getMessagesController();
                long j3 = nqVar.f36107w.f18328id;
                TLRPC.User user = nqVar.v;
                if (nqVar.K) {
                    o02 = nqVar.M;
                } else {
                    o02 = nq.o0(false);
                }
                messagesController.setUserAdminRole(j3, user, o02, nqVar.S, false, nqVar, nqVar.Z0, nqVar.K, nqVar.Y0, fqVar, new cq(nqVar, 2));
                return;
            case 2:
            case 3:
            default:
                nq nqVar2 = this.f32807b;
                nqVar2.getClass();
                nqVar2.presentFragment(new ih1(6, null));
                return;
            case 4:
                this.f32807b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                nq nqVar3 = this.f32807b;
                l4 l4Var = new l4(17, nqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f31875b0 = l4Var;
                nqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j3) {
        nq.U(this.f32807b, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f32806a) {
            case 2:
                this.f32807b.t0(false);
                return true;
            case 3:
                this.f32807b.t0(false);
                return true;
            default:
                return nq.W(this.f32807b, tL_error);
        }
    }
}
