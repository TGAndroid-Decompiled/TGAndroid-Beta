package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class iq implements org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f36853a;
    public final tq f36854b;

    public iq(tq tqVar, int i10) {
        this.f36853a = i10;
        this.f36854b = tqVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f36853a) {
            case 0:
                this.f36854b.r0(true);
                return;
            case 1:
                tq tqVar = this.f36854b;
                tqVar.t0(true);
                lq lqVar = new lq(tqVar, 0);
                if (!tqVar.K && !tqVar.L) {
                    tqVar.getMessagesController().addUserToChat(tqVar.f40192w.f18916id, tqVar.v, 0, tqVar.Y0, tqVar, true, lqVar, new iq(tqVar, 3));
                    return;
                }
                MessagesController messagesController = tqVar.getMessagesController();
                long j10 = tqVar.f40192w.f18916id;
                TLRPC.User user = tqVar.v;
                if (tqVar.K) {
                    o02 = tqVar.M;
                } else {
                    o02 = tq.o0(false);
                }
                messagesController.setUserAdminRole(j10, user, o02, tqVar.S, false, tqVar, tqVar.Z0, tqVar.K, tqVar.Y0, lqVar, new iq(tqVar, 2));
                return;
            case 2:
            case 3:
            default:
                tq tqVar2 = this.f36854b;
                tqVar2.getClass();
                tqVar2.presentFragment(new oh1(6, null));
                return;
            case 4:
                this.f36854b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                tq tqVar3 = this.f36854b;
                m4.y0 y0Var = new m4.y0(21, tqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f32584b0 = y0Var;
                tqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j10) {
        tq.U(this.f36854b, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f36853a) {
            case 2:
                this.f36854b.t0(false);
                return true;
            case 3:
                this.f36854b.t0(false);
                return true;
            default:
                return tq.W(this.f36854b, tL_error);
        }
    }
}
