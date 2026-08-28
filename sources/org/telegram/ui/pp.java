package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class pp implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f41571a;
    public final bq f41572b;

    public pp(bq bqVar, int i9) {
        this.f41571a = i9;
        this.f41572b = bqVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        TLRPC.TL_chatAdminRights n02;
        switch (this.f41571a) {
            case 0:
                this.f41572b.q0(true);
                return;
            case 1:
                bq bqVar = this.f41572b;
                bqVar.s0(true);
                sp spVar = new sp(bqVar, 0);
                if (!bqVar.G && !bqVar.H) {
                    bqVar.getMessagesController().addUserToChat(bqVar.f36948w.f22380id, bqVar.v, 0, bqVar.U0, bqVar, true, spVar, new pp(bqVar, 3));
                    return;
                }
                MessagesController messagesController = bqVar.getMessagesController();
                long j10 = bqVar.f36948w.f22380id;
                TLRPC.User user = bqVar.v;
                if (bqVar.G) {
                    n02 = bqVar.I;
                } else {
                    n02 = bq.n0(false);
                }
                messagesController.setUserAdminRole(j10, user, n02, bqVar.O, false, bqVar, bqVar.V0, bqVar.G, bqVar.U0, spVar, new pp(bqVar, 2));
                return;
            case 2:
            case 3:
            default:
                bq bqVar2 = this.f41572b;
                bqVar2.getClass();
                bqVar2.presentFragment(new ag1(6, null));
                return;
            case 4:
                this.f41572b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                bq bqVar3 = this.f41572b;
                ih.v3 v3Var = new ih.v3(26, bqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.V = 0;
                twoStepVerificationActivity.X = v3Var;
                bqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j10) {
        bq.T(this.f41572b, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f41571a) {
            case 2:
                this.f41572b.s0(false);
                return true;
            case 3:
                this.f41572b.s0(false);
                return true;
            default:
                return bq.V(this.f41572b, tL_error);
        }
    }
}
