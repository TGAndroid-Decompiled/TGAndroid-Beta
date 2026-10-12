package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class iq implements org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f37189a;
    public final tq f37190b;

    public iq(tq tqVar, int i10) {
        this.f37189a = i10;
        this.f37190b = tqVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f37189a) {
            case 0:
                this.f37190b.r0(true);
                return;
            case 1:
                tq tqVar = this.f37190b;
                tqVar.t0(true);
                lq lqVar = new lq(tqVar, 0);
                if (!tqVar.K && !tqVar.L) {
                    tqVar.getMessagesController().addUserToChat(tqVar.f40464w.f19216id, tqVar.v, 0, tqVar.Y0, tqVar, true, lqVar, new iq(tqVar, 3));
                    return;
                }
                MessagesController messagesController = tqVar.getMessagesController();
                long j10 = tqVar.f40464w.f19216id;
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
                tq tqVar2 = this.f37190b;
                tqVar2.getClass();
                tqVar2.presentFragment(new oh1(6, null));
                return;
            case 4:
                this.f37190b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                tq tqVar3 = this.f37190b;
                m4.z0 z0Var = new m4.z0(22, tqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f32882b0 = z0Var;
                tqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j10) {
        tq.U(this.f37190b, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f37189a) {
            case 2:
                this.f37190b.t0(false);
                return true;
            case 3:
                this.f37190b.t0(false);
                return true;
            default:
                return tq.W(this.f37190b, tL_error);
        }
    }
}
