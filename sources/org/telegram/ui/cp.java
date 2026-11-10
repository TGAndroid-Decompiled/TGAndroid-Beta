package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class cp implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.bp, org.telegram.messenger.tr {
    public final int f44766a;
    public final mp f44767b;

    public cp(mp mpVar, int i7) {
        this.f44766a = i7;
        this.f44767b = mpVar;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        switch (this.f44766a) {
            case 2:
                this.f44767b.y0(false);
                return true;
            case 3:
                this.f44767b.y0(false);
                return true;
            default:
                return mp.b0(this.f44767b, tL_error);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        TLRPC.TL_chatAdminRights t02;
        switch (this.f44766a) {
            case 0:
                this.f44767b.w0(true);
                return;
            case 1:
                mp mpVar = this.f44767b;
                mpVar.y0(true);
                ep epVar = new ep(mpVar, 0);
                if (!mpVar.K && !mpVar.L) {
                    mpVar.getMessagesController().m(mpVar.f48033x.f26960id, mpVar.f48031w, 0, mpVar.Y0, mpVar, true, epVar, new cp(mpVar, 3), null);
                    return;
                }
                org.telegram.messenger.qp messagesController = mpVar.getMessagesController();
                long j3 = mpVar.f48033x.f26960id;
                TLRPC.User user = mpVar.f48031w;
                if (mpVar.K) {
                    t02 = mpVar.M;
                } else {
                    t02 = mp.t0(false);
                }
                messagesController.P4(j3, user, t02, mpVar.S, false, mpVar, mpVar.Z0, mpVar.K, mpVar.Y0, epVar, new cp(mpVar, 2));
                return;
            case 2:
            case 3:
            default:
                mp mpVar2 = this.f44767b;
                mpVar2.getClass();
                mpVar2.presentFragment(new cb1(6, null));
                return;
            case 4:
                this.f44767b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                mp mpVar3 = this.f44767b;
                ni.c cVar = new ni.c(21, mpVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f42053b0 = cVar;
                mpVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j3) {
        mp.Z(this.f44767b, j3);
    }
}
