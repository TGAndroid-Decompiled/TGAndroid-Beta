package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class bp implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.yo, org.telegram.messenger.qr {
    public final int f45812a;
    public final mp f45813b;

    public bp(mp mpVar, int i7) {
        this.f45812a = i7;
        this.f45813b = mpVar;
    }

    @Override
    public boolean d(TLRPC.TL_error tL_error) {
        switch (this.f45812a) {
            case 2:
                this.f45813b.y0(false);
                return true;
            case 3:
                this.f45813b.y0(false);
                return true;
            default:
                return mp.b0(this.f45813b, tL_error);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        TLRPC.TL_chatAdminRights t02;
        switch (this.f45812a) {
            case 0:
                this.f45813b.w0(true);
                return;
            case 1:
                mp mpVar = this.f45813b;
                mpVar.y0(true);
                dp dpVar = new dp(mpVar, 0);
                if (!mpVar.L && !mpVar.M) {
                    mpVar.getMessagesController().m(mpVar.f49301x.f28051id, mpVar.f49299w, 0, mpVar.Z0, mpVar, true, dpVar, new bp(mpVar, 3), null);
                    return;
                }
                org.telegram.messenger.np messagesController = mpVar.getMessagesController();
                long j3 = mpVar.f49301x.f28051id;
                TLRPC.User user = mpVar.f49299w;
                if (mpVar.L) {
                    t02 = mpVar.N;
                } else {
                    t02 = mp.t0(false);
                }
                messagesController.Q4(j3, user, t02, mpVar.T, false, mpVar, mpVar.f49269a1, mpVar.L, mpVar.Z0, dpVar, new bp(mpVar, 2));
                return;
            case 2:
            case 3:
            default:
                mp mpVar2 = this.f45813b;
                mpVar2.getClass();
                mpVar2.presentFragment(new xa1(6, null));
                return;
            case 4:
                this.f45813b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                mp mpVar3 = this.f45813b;
                m2.d dVar = new m2.d(25, mpVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.f43426a0 = 0;
                twoStepVerificationActivity.f43430c0 = dVar;
                mpVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j3) {
        mp.Z(this.f45813b, j3);
    }
}
