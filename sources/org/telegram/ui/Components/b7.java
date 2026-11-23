package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class b7 implements Runnable {
    public final int f33779a;
    public final f8 f33780b;
    public final org.telegram.messenger.gj f33781c;

    public b7(f8 f8Var, org.telegram.messenger.gj gjVar, int i7) {
        this.f33779a = i7;
        this.f33780b = f8Var;
        this.f33781c = gjVar;
    }

    @Override
    public final void run() {
        int i7 = this.f33779a;
        org.telegram.messenger.gj gjVar = this.f33781c;
        f8 f8Var = this.f33780b;
        switch (i7) {
            case 0:
                org.telegram.messenger.hp hpVar = f8Var.f35130q2;
                if (hpVar != null) {
                    TLRPC.Document a10 = hpVar.a();
                    hpVar.f24522c.remove(gjVar);
                    if (hpVar.a() != a10) {
                        hpVar.e();
                    }
                    if (f8Var.f35130q2.f24522c.isEmpty()) {
                        MediaController.B().o();
                        f8Var.dismiss();
                        return;
                    }
                    org.telegram.messenger.ls.f(f8Var.f30173a).k(247, f8Var.f35130q2);
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = f8Var.A2;
                int i10 = org.telegram.messenger.k10.f24968t0;
                int i11 = f8Var.f30173a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.gj.B0(gjVar.f24213k);
                if (org.telegram.messenger.n5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.n5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat O0 = org.telegram.messenger.np.u1(f8Var.f30173a).O0(Long.valueOf(-B0));
                    if (O0 != null && O0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -O0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", gjVar.e1());
                org.telegram.messenger.ls.f(f8Var.f30173a).k(4, new Object[0]);
                launchActivity.u0(new org.telegram.ui.bn(bundle), false, false);
                f8Var.dismiss();
                return;
        }
    }
}
