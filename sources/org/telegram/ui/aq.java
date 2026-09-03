package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class aq implements org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f32623a;
    public final lq f32624b;

    public aq(lq lqVar, int i10) {
        this.f32623a = i10;
        this.f32624b = lqVar;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f32623a) {
            case 0:
                this.f32624b.r0(true);
                return;
            case 1:
                lq lqVar = this.f32624b;
                lqVar.t0(true);
                dq dqVar = new dq(lqVar, 0);
                if (!lqVar.H && !lqVar.I) {
                    lqVar.getMessagesController().addUserToChat(lqVar.f35891w.f19159id, lqVar.v, 0, lqVar.V0, lqVar, true, dqVar, new aq(lqVar, 3));
                    return;
                }
                MessagesController messagesController = lqVar.getMessagesController();
                long j10 = lqVar.f35891w.f19159id;
                TLRPC.User user = lqVar.v;
                if (lqVar.H) {
                    o02 = lqVar.J;
                } else {
                    o02 = lq.o0(false);
                }
                messagesController.setUserAdminRole(j10, user, o02, lqVar.P, false, lqVar, lqVar.W0, lqVar.H, lqVar.V0, dqVar, new aq(lqVar, 2));
                return;
            case 2:
            case 3:
            default:
                lq lqVar2 = this.f32624b;
                lqVar2.getClass();
                lqVar2.presentFragment(new wg1(6, null));
                return;
            case 4:
                this.f32624b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                lq lqVar3 = this.f32624b;
                mg.w wVar = new mg.w(25, lqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.W = 0;
                twoStepVerificationActivity.Y = wVar;
                lqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j10) {
        lq.U(this.f32624b, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f32623a) {
            case 2:
                this.f32624b.t0(false);
                return true;
            case 3:
                this.f32624b.t0(false);
                return true;
            default:
                return lq.W(this.f32624b, tL_error);
        }
    }
}
