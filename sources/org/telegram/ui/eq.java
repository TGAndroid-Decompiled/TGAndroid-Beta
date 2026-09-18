package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class eq implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f33458a;
    public final pq f33459b;

    public eq(pq pqVar, int i10) {
        this.f33458a = i10;
        this.f33459b = pqVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f33458a) {
            case 0:
                this.f33459b.r0(true);
                return;
            case 1:
                pq pqVar = this.f33459b;
                pqVar.t0(true);
                hq hqVar = new hq(pqVar, 0);
                if (!pqVar.K && !pqVar.L) {
                    pqVar.getMessagesController().addUserToChat(pqVar.f36711w.f18121id, pqVar.v, 0, pqVar.Y0, pqVar, true, hqVar, new eq(pqVar, 3));
                    return;
                }
                MessagesController messagesController = pqVar.getMessagesController();
                long j3 = pqVar.f36711w.f18121id;
                TLRPC.User user = pqVar.v;
                if (pqVar.K) {
                    o02 = pqVar.M;
                } else {
                    o02 = pq.o0(false);
                }
                messagesController.setUserAdminRole(j3, user, o02, pqVar.S, false, pqVar, pqVar.Z0, pqVar.K, pqVar.Y0, hqVar, new eq(pqVar, 2));
                return;
            case 2:
            case 3:
            default:
                pq pqVar2 = this.f33459b;
                pqVar2.getClass();
                pqVar2.presentFragment(new ih1(6, null));
                return;
            case 4:
                this.f33459b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                pq pqVar3 = this.f33459b;
                x5 x5Var = new x5(16, pqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f31608b0 = x5Var;
                pqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j3) {
        pq.U(this.f33459b, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f33458a) {
            case 2:
                this.f33459b.t0(false);
                return true;
            case 3:
                this.f33459b.t0(false);
                return true;
            default:
                return pq.W(this.f33459b, tL_error);
        }
    }
}
