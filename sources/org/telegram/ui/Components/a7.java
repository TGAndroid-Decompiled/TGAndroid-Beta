package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class a7 implements Runnable {
    public final int f33376a;
    public final e8 f33377b;
    public final org.telegram.messenger.fj f33378c;

    public a7(e8 e8Var, org.telegram.messenger.fj fjVar, int i7) {
        this.f33376a = i7;
        this.f33377b = e8Var;
        this.f33378c = fjVar;
    }

    @Override
    public final void run() {
        int i7 = this.f33376a;
        org.telegram.messenger.fj fjVar = this.f33378c;
        e8 e8Var = this.f33377b;
        switch (i7) {
            case 0:
                org.telegram.messenger.gp gpVar = e8Var.f34611q2;
                if (gpVar != null) {
                    TLRPC.Document a10 = gpVar.a();
                    gpVar.f24392c.remove(fjVar);
                    if (gpVar.a() != a10) {
                        gpVar.e();
                    }
                    if (e8Var.f34611q2.f24392c.isEmpty()) {
                        MediaController.B().o();
                        e8Var.dismiss();
                        return;
                    }
                    org.telegram.messenger.ks.f(e8Var.f30223a).k(247, e8Var.f34611q2);
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = e8Var.A2;
                int i10 = org.telegram.messenger.i10.f24637t0;
                int i11 = e8Var.f30223a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.fj.B0(fjVar.f24073k);
                if (org.telegram.messenger.n5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.n5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat O0 = org.telegram.messenger.mp.u1(e8Var.f30223a).O0(Long.valueOf(-B0));
                    if (O0 != null && O0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -O0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", fjVar.e1());
                org.telegram.messenger.ks.f(e8Var.f30223a).k(4, new Object[0]);
                launchActivity.u0(new org.telegram.ui.bn(bundle), false, false);
                e8Var.dismiss();
                return;
        }
    }
}
