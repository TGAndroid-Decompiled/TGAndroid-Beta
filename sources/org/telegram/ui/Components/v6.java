package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class v6 implements Runnable {
    public final int f38887a;
    public final a8 f38888b;
    public final org.telegram.messenger.ij f38889c;

    public v6(a8 a8Var, org.telegram.messenger.ij ijVar, int i7) {
        this.f38887a = i7;
        this.f38888b = a8Var;
        this.f38889c = ijVar;
    }

    @Override
    public final void run() {
        int i7 = this.f38887a;
        org.telegram.messenger.ij ijVar = this.f38889c;
        a8 a8Var = this.f38888b;
        switch (i7) {
            case 0:
                org.telegram.messenger.kp kpVar = a8Var.f31751p2;
                if (kpVar != null) {
                    TLRPC.Document a10 = kpVar.a();
                    kpVar.f23745c.remove(ijVar);
                    if (kpVar.a() != a10) {
                        kpVar.e();
                    }
                    if (a8Var.f31751p2.f23745c.isEmpty()) {
                        MediaController.B().o();
                        a8Var.dismiss();
                        return;
                    }
                    org.telegram.messenger.qs.f(a8Var.f28669a).k(244, a8Var.f31751p2);
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = a8Var.f31771z2;
                int i10 = org.telegram.messenger.p10.f24474s0;
                int i11 = a8Var.f28669a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.ij.B0(ijVar.f23266k);
                if (org.telegram.messenger.m5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat M0 = org.telegram.messenger.qp.s1(a8Var.f28669a).M0(Long.valueOf(-B0));
                    if (M0 != null && M0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -M0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", ijVar.e1());
                org.telegram.messenger.qs.f(a8Var.f28669a).k(4, new Object[0]);
                launchActivity.u0(new org.telegram.ui.cn(bundle), false, false);
                a8Var.dismiss();
                return;
        }
    }
}
