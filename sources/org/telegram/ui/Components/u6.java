package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class u6 implements Runnable {
    public final int f39933a;
    public final y7 f39934b;
    public final org.telegram.messenger.gj f39935c;

    public u6(y7 y7Var, org.telegram.messenger.gj gjVar, int i7) {
        this.f39933a = i7;
        this.f39934b = y7Var;
        this.f39935c = gjVar;
    }

    @Override
    public final void run() {
        int i7 = this.f39933a;
        org.telegram.messenger.gj gjVar = this.f39935c;
        y7 y7Var = this.f39934b;
        switch (i7) {
            case 0:
                org.telegram.messenger.hp hpVar = y7Var.f41905q2;
                if (hpVar != null) {
                    TLRPC.Document a10 = hpVar.a();
                    hpVar.f24205c.remove(gjVar);
                    if (hpVar.a() != a10) {
                        hpVar.e();
                    }
                    if (y7Var.f41905q2.f24205c.isEmpty()) {
                        MediaController.B().o();
                        y7Var.dismiss();
                        return;
                    }
                    org.telegram.messenger.ns.f(y7Var.f29679a).k(244, y7Var.f41905q2);
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = y7Var.A2;
                int i10 = org.telegram.messenger.m10.f24940t0;
                int i11 = y7Var.f29679a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.gj.B0(gjVar.f23819k);
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
