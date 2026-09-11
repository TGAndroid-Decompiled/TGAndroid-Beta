package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class fq implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f36445a;
    public final qq f36446b;

    public fq(qq qqVar, int i10) {
        this.f36445a = i10;
        this.f36446b = qqVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f36445a) {
            case 0:
                this.f36446b.r0(true);
                return;
            case 1:
                qq qqVar = this.f36446b;
                qqVar.t0(true);
                iq iqVar = new iq(qqVar, 0);
                if (!qqVar.K && !qqVar.L) {
                    qqVar.getMessagesController().addUserToChat(qqVar.f39965w.f19869id, qqVar.v, 0, qqVar.Y0, qqVar, true, iqVar, new fq(qqVar, 3));
                    return;
                }
                MessagesController messagesController = qqVar.getMessagesController();
                long j3 = qqVar.f39965w.f19869id;
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
                qq qqVar2 = this.f36446b;
                qqVar2.getClass();
                qqVar2.presentFragment(new hh1(6, null));
                return;
            case 4:
                this.f36446b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                qq qqVar3 = this.f36446b;
                m4 m4Var = new m4(17, qqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f34218b0 = m4Var;
                qqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j3) {
        qq.U(this.f36446b, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f36445a) {
            case 2:
                this.f36446b.t0(false);
                return true;
            case 3:
                this.f36446b.t0(false);
                return true;
            default:
                return qq.W(this.f36446b, tL_error);
        }
    }
}
