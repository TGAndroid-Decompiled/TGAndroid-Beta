package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class cq implements org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f36802a;
    public final nq f36803b;

    public cq(nq nqVar, int i10) {
        this.f36802a = i10;
        this.f36803b = nqVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f36802a) {
            case 0:
                this.f36803b.r0(true);
                return;
            case 1:
                nq nqVar = this.f36803b;
                nqVar.t0(true);
                fq fqVar = new fq(nqVar, 0);
                if (!nqVar.K && !nqVar.L) {
                    nqVar.getMessagesController().addUserToChat(nqVar.f40338w.f20032id, nqVar.v, 0, nqVar.Y0, nqVar, true, fqVar, new cq(nqVar, 3));
                    return;
                }
                MessagesController messagesController = nqVar.getMessagesController();
                long j3 = nqVar.f40338w.f20032id;
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
                nq nqVar2 = this.f36803b;
                nqVar2.getClass();
                nqVar2.presentFragment(new hh1(6, null));
                return;
            case 4:
                this.f36803b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                nq nqVar3 = this.f36803b;
                m4.v0 v0Var = new m4.v0(20, nqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f34601b0 = v0Var;
                nqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j3) {
        nq.U(this.f36803b, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f36802a) {
            case 2:
                this.f36803b.t0(false);
                return true;
            case 3:
                this.f36803b.t0(false);
                return true;
            default:
                return nq.W(this.f36803b, tL_error);
        }
    }
}
