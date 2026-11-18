package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class dp implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.xo, org.telegram.messenger.or {
    public final int f46955a;
    public final np f46956b;

    public dp(np npVar, int i7) {
        this.f46955a = i7;
        this.f46956b = npVar;
    }

    @Override
    public boolean e(TLRPC.TL_error tL_error) {
        switch (this.f46955a) {
            case 2:
                this.f46956b.y0(false);
                return true;
            case 3:
                this.f46956b.y0(false);
                return true;
            default:
                return np.b0(this.f46956b, tL_error);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        TLRPC.TL_chatAdminRights t02;
        switch (this.f46955a) {
            case 0:
                this.f46956b.w0(true);
                return;
            case 1:
                np npVar = this.f46956b;
                npVar.y0(true);
                fp fpVar = new fp(npVar, 0);
                if (!npVar.L && !npVar.M) {
                    npVar.getMessagesController().m(npVar.f50257x.f28403id, npVar.f50255w, 0, npVar.Z0, npVar, true, fpVar, new dp(npVar, 3), null);
                    return;
                }
                org.telegram.messenger.mp messagesController = npVar.getMessagesController();
                long j3 = npVar.f50257x.f28403id;
                TLRPC.User user = npVar.f50255w;
                if (npVar.L) {
                    t02 = npVar.N;
                } else {
                    t02 = np.t0(false);
                }
                messagesController.b5(j3, user, t02, npVar.T, false, npVar, npVar.f50225a1, npVar.L, npVar.Z0, fpVar, new dp(npVar, 2));
                return;
            case 2:
            case 3:
            default:
                np npVar2 = this.f46956b;
                npVar2.getClass();
                npVar2.presentFragment(new bb1(6, null));
                return;
            case 4:
                this.f46956b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                np npVar3 = this.f46956b;
                oi.e0 e0Var = new oi.e0(23, npVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.f43872a0 = 0;
                twoStepVerificationActivity.f43876c0 = e0Var;
                npVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j3) {
        np.Z(this.f46956b, j3);
    }
}
