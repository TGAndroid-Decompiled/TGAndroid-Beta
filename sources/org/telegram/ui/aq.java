package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class aq implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f31858a;
    public final lq f31859b;

    public aq(lq lqVar, int i10) {
        this.f31858a = i10;
        this.f31859b = lqVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f31858a) {
            case 0:
                this.f31859b.r0(true);
                return;
            case 1:
                lq lqVar = this.f31859b;
                lqVar.t0(true);
                dq dqVar = new dq(lqVar, 0);
                if (!lqVar.K && !lqVar.L) {
                    lqVar.getMessagesController().addUserToChat(lqVar.f35071w.f18083id, lqVar.v, 0, lqVar.Y0, lqVar, true, dqVar, new aq(lqVar, 3));
                    return;
                }
                MessagesController messagesController = lqVar.getMessagesController();
                long j3 = lqVar.f35071w.f18083id;
                TLRPC.User user = lqVar.v;
                if (lqVar.K) {
                    o02 = lqVar.M;
                } else {
                    o02 = lq.o0(false);
                }
                messagesController.setUserAdminRole(j3, user, o02, lqVar.S, false, lqVar, lqVar.Z0, lqVar.K, lqVar.Y0, dqVar, new aq(lqVar, 2));
                return;
            case 2:
            case 3:
            default:
                lq lqVar2 = this.f31859b;
                lqVar2.getClass();
                lqVar2.presentFragment(new zg1(6, null));
                return;
            case 4:
                this.f31859b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                lq lqVar3 = this.f31859b;
                u uVar = new u(18, lqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f31562b0 = uVar;
                lqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j3) {
        lq.U(this.f31859b, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f31858a) {
            case 2:
                this.f31859b.t0(false);
                return true;
            case 3:
                this.f31859b.t0(false);
                return true;
            default:
                return lq.W(this.f31859b, tL_error);
        }
    }
}
