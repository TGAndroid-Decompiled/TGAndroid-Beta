package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class fq implements org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f37823a;
    public final qq f37824b;

    public fq(qq qqVar, int i10) {
        this.f37823a = i10;
        this.f37824b = qqVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f37823a) {
            case 0:
                this.f37824b.r0(true);
                return;
            case 1:
                qq qqVar = this.f37824b;
                qqVar.t0(true);
                iq iqVar = new iq(qqVar, 0);
                if (!qqVar.K && !qqVar.L) {
                    qqVar.getMessagesController().addUserToChat(qqVar.f41415w.f19802id, qqVar.v, 0, qqVar.Y0, qqVar, true, iqVar, new fq(qqVar, 3));
                    return;
                }
                MessagesController messagesController = qqVar.getMessagesController();
                long j3 = qqVar.f41415w.f19802id;
                TLRPC.User user = qqVar.v;
                if (qqVar.K) {
                    o02 = qqVar.M;
                } else {
                    o02 = qq.o0(false);
                }
                messagesController.setUserAdminRole(j3, user, o02, qqVar.S, false, qqVar, qqVar.Z0, qqVar.K, qqVar.Y0, iqVar, new fq(qqVar, 2));
                return;
            case 2:
            case 3:
            default:
                qq qqVar2 = this.f37824b;
                qqVar2.getClass();
                qqVar2.presentFragment(new kh1(6, null));
                return;
            case 4:
                this.f37824b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                qq qqVar3 = this.f37824b;
                o oVar = new o(19, qqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f34410b0 = oVar;
                qqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j3) {
        qq.U(this.f37824b, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f37823a) {
            case 2:
                this.f37824b.t0(false);
                return true;
            case 3:
                this.f37824b.t0(false);
                return true;
            default:
                return qq.W(this.f37824b, tL_error);
        }
    }
}
