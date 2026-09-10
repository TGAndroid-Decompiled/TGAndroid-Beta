package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class gq implements org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f33159a;
    public final rq f33160b;

    public gq(rq rqVar, int i10) {
        this.f33159a = i10;
        this.f33160b = rqVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f33159a) {
            case 0:
                this.f33160b.r0(true);
                return;
            case 1:
                rq rqVar = this.f33160b;
                rqVar.t0(true);
                jq jqVar = new jq(rqVar, 0);
                if (!rqVar.K && !rqVar.L) {
                    rqVar.getMessagesController().addUserToChat(rqVar.f36437w.f17195id, rqVar.v, 0, rqVar.Y0, rqVar, true, jqVar, new gq(rqVar, 3));
                    return;
                }
                MessagesController messagesController = rqVar.getMessagesController();
                long j3 = rqVar.f36437w.f17195id;
                TLRPC.User user = rqVar.v;
                if (rqVar.K) {
                    o02 = rqVar.M;
                } else {
                    o02 = rq.o0(false);
                }
                messagesController.setUserAdminRole(j3, user, o02, rqVar.S, false, rqVar, rqVar.Z0, rqVar.K, rqVar.Y0, jqVar, new gq(rqVar, 2));
                return;
            case 2:
            case 3:
            default:
                rq rqVar2 = this.f33160b;
                rqVar2.getClass();
                rqVar2.presentFragment(new mh1(6, null));
                return;
            case 4:
                this.f33160b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                rq rqVar3 = this.f33160b;
                oe oeVar = new oe(12, rqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f30703b0 = oeVar;
                rqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j3) {
        rq.U(this.f33160b, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f33159a) {
            case 2:
                this.f33160b.t0(false);
                return true;
            case 3:
                this.f33160b.t0(false);
                return true;
            default:
                return rq.W(this.f33160b, tL_error);
        }
    }
}
