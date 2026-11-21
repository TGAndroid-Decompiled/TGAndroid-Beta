package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class b7 implements Runnable {
    public final int f33786a;
    public final f8 f33787b;
    public final org.telegram.messenger.fj f33788c;

    public b7(f8 f8Var, org.telegram.messenger.fj fjVar, int i7) {
        this.f33786a = i7;
        this.f33787b = f8Var;
        this.f33788c = fjVar;
    }

    @Override
    public final void run() {
        int i7 = this.f33786a;
        org.telegram.messenger.fj fjVar = this.f33788c;
        f8 f8Var = this.f33787b;
        switch (i7) {
            case 0:
                org.telegram.messenger.gp gpVar = f8Var.f35128q2;
                if (gpVar != null) {
                    TLRPC.Document a10 = gpVar.a();
                    gpVar.f24319c.remove(fjVar);
                    if (gpVar.a() != a10) {
                        gpVar.e();
                    }
                    if (f8Var.f35128q2.f24319c.isEmpty()) {
                        MediaController.B().o();
                        f8Var.dismiss();
                        return;
                    }
                    org.telegram.messenger.ks.f(f8Var.f30170a).k(247, f8Var.f35128q2);
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = f8Var.A2;
                int i10 = org.telegram.messenger.j10.f24798t0;
                int i11 = f8Var.f30170a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.fj.B0(fjVar.f23993k);
                if (org.telegram.messenger.n5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.n5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat O0 = org.telegram.messenger.mp.u1(f8Var.f30170a).O0(Long.valueOf(-B0));
                    if (O0 != null && O0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -O0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", fjVar.e1());
                org.telegram.messenger.ks.f(f8Var.f30170a).k(4, new Object[0]);
                launchActivity.u0(new org.telegram.ui.bn(bundle), false, false);
                f8Var.dismiss();
                return;
        }
    }
}
