package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class a7 implements Runnable {
    public final int f33253a;
    public final g8 f33254b;
    public final org.telegram.messenger.fj f33255c;

    public a7(g8 g8Var, org.telegram.messenger.fj fjVar, int i7) {
        this.f33253a = i7;
        this.f33254b = g8Var;
        this.f33255c = fjVar;
    }

    @Override
    public final void run() {
        int i7 = this.f33253a;
        org.telegram.messenger.fj fjVar = this.f33255c;
        g8 g8Var = this.f33254b;
        switch (i7) {
            case 0:
                org.telegram.messenger.gp gpVar = g8Var.f35405q2;
                if (gpVar != null) {
                    TLRPC.Document a10 = gpVar.a();
                    gpVar.f24294c.remove(fjVar);
                    if (gpVar.a() != a10) {
                        gpVar.e();
                    }
                    if (g8Var.f35405q2.f24294c.isEmpty()) {
                        MediaController.B().o();
                        g8Var.dismiss();
                        return;
                    }
                    org.telegram.messenger.ks.f(g8Var.f30189a).k(246, g8Var.f35405q2);
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = g8Var.A2;
                int i10 = org.telegram.messenger.j10.f24773t0;
                int i11 = g8Var.f30189a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.fj.B0(fjVar.f23968k);
                if (org.telegram.messenger.n5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.n5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat O0 = org.telegram.messenger.mp.u1(g8Var.f30189a).O0(Long.valueOf(-B0));
                    if (O0 != null && O0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -O0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", fjVar.e1());
                org.telegram.messenger.ks.f(g8Var.f30189a).k(4, new Object[0]);
                launchActivity.u0(new org.telegram.ui.bn(bundle), false, false);
                g8Var.dismiss();
                return;
        }
    }
}
