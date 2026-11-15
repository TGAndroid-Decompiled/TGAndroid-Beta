package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class u6 implements Runnable {
    public final int f39936a;
    public final y7 f39937b;
    public final org.telegram.messenger.gj f39938c;

    public u6(y7 y7Var, org.telegram.messenger.gj gjVar, int i7) {
        this.f39936a = i7;
        this.f39937b = y7Var;
        this.f39938c = gjVar;
    }

    @Override
    public final void run() {
        int i7 = this.f39936a;
        org.telegram.messenger.gj gjVar = this.f39938c;
        y7 y7Var = this.f39937b;
        switch (i7) {
            case 0:
                org.telegram.messenger.hp hpVar = y7Var.f41913q2;
                if (hpVar != null) {
                    TLRPC.Document a10 = hpVar.a();
                    hpVar.f24202c.remove(gjVar);
                    if (hpVar.a() != a10) {
                        hpVar.e();
                    }
                    if (y7Var.f41913q2.f24202c.isEmpty()) {
                        MediaController.B().o();
                        y7Var.dismiss();
                        return;
                    }
                    org.telegram.messenger.ns.f(y7Var.f29679a).k(244, y7Var.f41913q2);
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = y7Var.A2;
                int i10 = org.telegram.messenger.m10.f24934t0;
                int i11 = y7Var.f29679a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.gj.B0(gjVar.f23817k);
                if (org.telegram.messenger.m5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat M0 = org.telegram.messenger.np.s1(y7Var.f29679a).M0(Long.valueOf(-B0));
                    if (M0 != null && M0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -M0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", gjVar.e1());
                org.telegram.messenger.ns.f(y7Var.f29679a).k(4, new Object[0]);
                launchActivity.u0(new org.telegram.ui.an(bundle), false, false);
                y7Var.dismiss();
                return;
        }
    }
}
