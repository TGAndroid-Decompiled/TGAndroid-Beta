package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class dp implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.yo, org.telegram.messenger.pr {
    public final int f47024a;
    public final np f47025b;

    public dp(np npVar, int i7) {
        this.f47024a = i7;
        this.f47025b = npVar;
    }

    @Override
    public boolean e(TLRPC.TL_error tL_error) {
        switch (this.f47024a) {
            case 2:
                this.f47025b.y0(false);
                return true;
            case 3:
                this.f47025b.y0(false);
                return true;
            default:
                return np.b0(this.f47025b, tL_error);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        TLRPC.TL_chatAdminRights t02;
        switch (this.f47024a) {
            case 0:
                this.f47025b.w0(true);
                return;
            case 1:
                np npVar = this.f47025b;
                npVar.y0(true);
                fp fpVar = new fp(npVar, 0);
                if (!npVar.L && !npVar.M) {
                    npVar.getMessagesController().m(npVar.f50268x.f28434id, npVar.f50266w, 0, npVar.Z0, npVar, true, fpVar, new dp(npVar, 3), null);
                    return;
                }
                org.telegram.messenger.np messagesController = npVar.getMessagesController();
                long j3 = npVar.f50268x.f28434id;
                TLRPC.User user = npVar.f50266w;
                if (npVar.L) {
                    t02 = npVar.N;
                } else {
                    t02 = np.t0(false);
                }
                messagesController.b5(j3, user, t02, npVar.T, false, npVar, npVar.f50236a1, npVar.L, npVar.Z0, fpVar, new dp(npVar, 2));
                return;
            case 2:
            case 3:
            default:
                np npVar2 = this.f47025b;
                npVar2.getClass();
                npVar2.presentFragment(new bb1(6, null));
                return;
            case 4:
                this.f47025b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                np npVar3 = this.f47025b;
                oi.f0 f0Var = new oi.f0(23, npVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.f43917a0 = 0;
                twoStepVerificationActivity.f43921c0 = f0Var;
                npVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j3) {
        np.Z(this.f47025b, j3);
    }
}
