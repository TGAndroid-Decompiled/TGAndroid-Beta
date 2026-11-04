package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class u6 implements Runnable {
    public final int f38656a;
    public final z7 f38657b;
    public final org.telegram.messenger.zi f38658c;

    public u6(z7 z7Var, org.telegram.messenger.zi ziVar, int i3) {
        this.f38656a = i3;
        this.f38657b = z7Var;
        this.f38658c = ziVar;
    }

    @Override
    public final void run() {
        int i3 = this.f38656a;
        org.telegram.messenger.zi ziVar = this.f38658c;
        z7 z7Var = this.f38657b;
        switch (i3) {
            case 0:
                org.telegram.messenger.bp bpVar = z7Var.f40955n2;
                if (bpVar != null) {
                    TLRPC.Document a10 = bpVar.a();
                    bpVar.f21866c.remove(ziVar);
                    if (bpVar.a() != a10) {
                        bpVar.e();
                    }
                    if (z7Var.f40955n2.f21866c.isEmpty()) {
                        MediaController.B().o();
                        z7Var.dismiss();
                        return;
                    }
                    org.telegram.messenger.hs.f(z7Var.f28583a).k(244, z7Var.f40955n2);
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = z7Var.f40975x2;
                int i10 = org.telegram.messenger.h10.f22829t0;
                int i11 = z7Var.f28583a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
                if (org.telegram.messenger.m5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat M0 = org.telegram.messenger.hp.s1(z7Var.f28583a).M0(Long.valueOf(-B0));
                    if (M0 != null && M0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -M0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", ziVar.f1());
                org.telegram.messenger.hs.f(z7Var.f28583a).k(4, new Object[0]);
                launchActivity.u0(new org.telegram.ui.wm(bundle), false, false);
                z7Var.dismiss();
                return;
        }
    }
}
