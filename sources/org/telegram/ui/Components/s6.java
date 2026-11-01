package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class s6 implements Runnable {
    public final int f30220a;
    public final w7 f30221b;
    public final org.telegram.messenger.kj f30222c;

    public s6(w7 w7Var, org.telegram.messenger.kj kjVar, int i10) {
        this.f30220a = i10;
        this.f30221b = w7Var;
        this.f30222c = kjVar;
    }

    @Override
    public final void run() {
        int i10 = this.f30220a;
        org.telegram.messenger.kj kjVar = this.f30222c;
        w7 w7Var = this.f30221b;
        switch (i10) {
            case 0:
                org.telegram.messenger.qp qpVar = w7Var.f32107m2;
                if (qpVar != null) {
                    TLRPC.Document a2 = qpVar.a();
                    qpVar.f17804c.remove(kjVar);
                    if (qpVar.a() != a2) {
                        qpVar.e();
                    }
                    if (w7Var.f32107m2.f17804c.isEmpty()) {
                        MediaController.B().o();
                        w7Var.dismiss();
                        return;
                    }
                    org.telegram.messenger.at.f(w7Var.f21584a).k(244, w7Var.f32107m2);
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = w7Var.f32127w2;
                int i11 = org.telegram.messenger.e20.f15506s0;
                int i12 = w7Var.f21584a;
                if (i11 != i12) {
                    launchActivity.O0(i12);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.kj.B0(kjVar.f16690k);
                if (org.telegram.messenger.o5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.o5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat L0 = org.telegram.messenger.wp.r1(w7Var.f21584a).L0(Long.valueOf(-B0));
                    if (L0 != null && L0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -L0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", kjVar.f1());
                org.telegram.messenger.at.f(w7Var.f21584a).k(4, new Object[0]);
                launchActivity.u0(new org.telegram.ui.un(bundle), false, false);
                w7Var.dismiss();
                return;
        }
    }
}
