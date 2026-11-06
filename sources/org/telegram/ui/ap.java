package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ap implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.bp, org.telegram.messenger.tr {
    public final int f44069a;
    public final kp f44070b;

    public ap(kp kpVar, int i7) {
        this.f44069a = i7;
        this.f44070b = kpVar;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        switch (this.f44069a) {
            case 2:
                this.f44070b.y0(false);
                return true;
            case 3:
                this.f44070b.y0(false);
                return true;
            default:
                return kp.b0(this.f44070b, tL_error);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        TLRPC.TL_chatAdminRights t02;
        switch (this.f44069a) {
            case 0:
                this.f44070b.w0(true);
                return;
            case 1:
                kp kpVar = this.f44070b;
                kpVar.y0(true);
                cp cpVar = new cp(kpVar, 0);
                if (!kpVar.K && !kpVar.L) {
                    kpVar.getMessagesController().m(kpVar.f47253x.f26952id, kpVar.f47251w, 0, kpVar.Y0, kpVar, true, cpVar, new ap(kpVar, 3), null);
                    return;
                }
                org.telegram.messenger.qp messagesController = kpVar.getMessagesController();
                long j3 = kpVar.f47253x.f26952id;
                TLRPC.User user = kpVar.f47251w;
                if (kpVar.K) {
                    t02 = kpVar.M;
                } else {
                    t02 = kp.t0(false);
                }
                messagesController.P4(j3, user, t02, kpVar.S, false, kpVar, kpVar.Z0, kpVar.K, kpVar.Y0, cpVar, new ap(kpVar, 2));
                return;
            case 2:
            case 3:
            default:
                kp kpVar2 = this.f44070b;
                kpVar2.getClass();
                kpVar2.presentFragment(new ya1(6, null));
                return;
            case 4:
                this.f44070b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                kp kpVar3 = this.f44070b;
                ni.c cVar = new ni.c(21, kpVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f42052b0 = cVar;
                kpVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j3) {
        kp.Z(this.f44070b, j3);
    }
}
