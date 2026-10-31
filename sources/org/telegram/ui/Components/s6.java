package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class s6 implements Runnable {
    public final int f30164a;
    public final w7 f30165b;
    public final org.telegram.messenger.jj f30166c;

    public s6(w7 w7Var, org.telegram.messenger.jj jjVar, int i10) {
        this.f30164a = i10;
        this.f30165b = w7Var;
        this.f30166c = jjVar;
    }

    @Override
    public final void run() {
        int i10 = this.f30164a;
        org.telegram.messenger.jj jjVar = this.f30166c;
        w7 w7Var = this.f30165b;
        switch (i10) {
            case 0:
                org.telegram.messenger.pp ppVar = w7Var.f32059m2;
                if (ppVar != null) {
                    TLRPC.Document a2 = ppVar.a();
                    ppVar.f17469c.remove(jjVar);
                    if (ppVar.a() != a2) {
                        ppVar.e();
                    }
                    if (w7Var.f32059m2.f17469c.isEmpty()) {
                        MediaController.B().o();
                        w7Var.dismiss();
                        return;
                    }
                    org.telegram.messenger.zs.f(w7Var.f21583a).k(244, w7Var.f32059m2);
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = w7Var.f32079w2;
                int i11 = org.telegram.messenger.d20.f15147s0;
                int i12 = w7Var.f21583a;
                if (i11 != i12) {
                    launchActivity.O0(i12);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.jj.B0(jjVar.f16337k);
                if (org.telegram.messenger.o5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.o5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat L0 = org.telegram.messenger.vp.r1(w7Var.f21583a).L0(Long.valueOf(-B0));
                    if (L0 != null && L0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -L0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", jjVar.f1());
                org.telegram.messenger.zs.f(w7Var.f21583a).k(4, new Object[0]);
                launchActivity.u0(new org.telegram.ui.un(bundle), false, false);
                w7Var.dismiss();
                return;
        }
    }
}
