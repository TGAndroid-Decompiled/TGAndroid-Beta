package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class bq implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f35169a;
    public final mq f35170b;

    public bq(mq mqVar, int i10) {
        this.f35169a = i10;
        this.f35170b = mqVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f35169a) {
            case 0:
                this.f35170b.r0(true);
                return;
            case 1:
                mq mqVar = this.f35170b;
                mqVar.t0(true);
                eq eqVar = new eq(mqVar, 0);
                if (!mqVar.K && !mqVar.L) {
                    mqVar.getMessagesController().addUserToChat(mqVar.f38737w.f20038id, mqVar.v, 0, mqVar.Y0, mqVar, true, eqVar, new bq(mqVar, 3));
                    return;
                }
                MessagesController messagesController = mqVar.getMessagesController();
                long j3 = mqVar.f38737w.f20038id;
                TLRPC.User user = mqVar.v;
                if (mqVar.K) {
                    o02 = mqVar.M;
                } else {
                    o02 = mq.o0(false);
                }
                messagesController.setUserAdminRole(j3, user, o02, mqVar.S, false, mqVar, mqVar.Z0, mqVar.K, mqVar.Y0, eqVar, new bq(mqVar, 2));
                return;
            case 2:
            case 3:
            default:
                mq mqVar2 = this.f35170b;
                mqVar2.getClass();
                mqVar2.presentFragment(new bh1(6, null));
                return;
            case 4:
                this.f35170b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                mq mqVar3 = this.f35170b;
                o oVar = new o(20, mqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f34564b0 = oVar;
                mqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j3) {
        mq.S(this.f35170b, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f35169a) {
            case 2:
                this.f35170b.t0(false);
                return true;
            case 3:
                this.f35170b.t0(false);
                return true;
            default:
                return mq.U(this.f35170b, tL_error);
        }
    }
}
