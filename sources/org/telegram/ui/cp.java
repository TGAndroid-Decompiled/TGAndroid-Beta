package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class cp implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.yo, org.telegram.messenger.pr {
    public final int f46617a;
    public final np f46618b;

    public cp(np npVar, int i7) {
        this.f46617a = i7;
        this.f46618b = npVar;
    }

    @Override
    public boolean e(TLRPC.TL_error tL_error) {
        switch (this.f46617a) {
            case 2:
                this.f46618b.y0(false);
                return true;
            case 3:
                this.f46618b.y0(false);
                return true;
            default:
                return np.b0(this.f46618b, tL_error);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        TLRPC.TL_chatAdminRights t02;
        switch (this.f46617a) {
            case 0:
                this.f46618b.w0(true);
                return;
            case 1:
                np npVar = this.f46618b;
                npVar.y0(true);
                ep epVar = new ep(npVar, 0);
                if (!npVar.L && !npVar.M) {
                    npVar.getMessagesController().m(npVar.f50275x.f28398id, npVar.f50273w, 0, npVar.Z0, npVar, true, epVar, new cp(npVar, 3), null);
                    return;
                }
                org.telegram.messenger.np messagesController = npVar.getMessagesController();
                long j3 = npVar.f50275x.f28398id;
                TLRPC.User user = npVar.f50273w;
                if (npVar.L) {
                    t02 = npVar.N;
                } else {
                    t02 = np.t0(false);
                }
                messagesController.b5(j3, user, t02, npVar.T, false, npVar, npVar.f50243a1, npVar.L, npVar.Z0, epVar, new cp(npVar, 2));
                return;
            case 2:
            case 3:
            default:
                np npVar2 = this.f46618b;
                npVar2.getClass();
                npVar2.presentFragment(new bb1(6, null));
                return;
            case 4:
                this.f46618b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                np npVar3 = this.f46618b;
                oi.e0 e0Var = new oi.e0(23, npVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.f43882a0 = 0;
                twoStepVerificationActivity.f43886c0 = e0Var;
                npVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j3) {
        np.Z(this.f46618b, j3);
    }
}
