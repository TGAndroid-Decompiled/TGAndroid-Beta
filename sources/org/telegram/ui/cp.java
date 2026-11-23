package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class cp implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.xo, org.telegram.messenger.or {
    public final int f46846a;
    public final np f46847b;

    public cp(np npVar, int i7) {
        this.f46846a = i7;
        this.f46847b = npVar;
    }

    @Override
    public boolean d(TLRPC.TL_error tL_error) {
        switch (this.f46846a) {
            case 2:
                this.f46847b.y0(false);
                return true;
            case 3:
                this.f46847b.y0(false);
                return true;
            default:
                return np.b0(this.f46847b, tL_error);
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        TLRPC.TL_chatAdminRights t02;
        switch (this.f46846a) {
            case 0:
                this.f46847b.w0(true);
                return;
            case 1:
                np npVar = this.f46847b;
                npVar.y0(true);
                ep epVar = new ep(npVar, 0);
                if (!npVar.L && !npVar.M) {
                    npVar.getMessagesController().m(npVar.f50384x.f28492id, npVar.f50382w, 0, npVar.Z0, npVar, true, epVar, new cp(npVar, 3), null);
                    return;
                }
                org.telegram.messenger.mp messagesController = npVar.getMessagesController();
                long j3 = npVar.f50384x.f28492id;
                TLRPC.User user = npVar.f50382w;
                if (npVar.L) {
                    t02 = npVar.N;
                } else {
                    t02 = np.t0(false);
                }
                messagesController.b5(j3, user, t02, npVar.T, false, npVar, npVar.f50352a1, npVar.L, npVar.Z0, epVar, new cp(npVar, 2));
                return;
            case 2:
            case 3:
            default:
                np npVar2 = this.f46847b;
                npVar2.getClass();
                npVar2.presentFragment(new za1(6, null));
                return;
            case 4:
                this.f46847b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                np npVar3 = this.f46847b;
                oi.f0 f0Var = new oi.f0(23, npVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.f43998a0 = 0;
                twoStepVerificationActivity.f44002c0 = f0Var;
                npVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j3) {
        np.Z(this.f46847b, j3);
    }
}
