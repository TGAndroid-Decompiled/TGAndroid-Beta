package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class w6 implements Runnable {
    public final int f39818a;
    public final b8 f39819b;
    public final org.telegram.messenger.ij f39820c;

    public w6(b8 b8Var, org.telegram.messenger.ij ijVar, int i7) {
        this.f39818a = i7;
        this.f39819b = b8Var;
        this.f39820c = ijVar;
    }

    @Override
    public final void run() {
        int i7 = this.f39818a;
        org.telegram.messenger.ij ijVar = this.f39820c;
        b8 b8Var = this.f39819b;
        switch (i7) {
            case 0:
                org.telegram.messenger.kp kpVar = b8Var.f32098m2;
                if (kpVar != null) {
                    TLRPC.Document a10 = kpVar.a();
                    kpVar.f23741c.remove(ijVar);
                    if (kpVar.a() != a10) {
                        kpVar.e();
                    }
                    if (b8Var.f32098m2.f23741c.isEmpty()) {
                        MediaController.B().o();
                        b8Var.dismiss();
                        return;
                    }
                    org.telegram.messenger.qs.f(b8Var.f28616a).k(244, b8Var.f32098m2);
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = b8Var.f32117w2;
                int i10 = org.telegram.messenger.p10.f24470s0;
                int i11 = b8Var.f28616a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.ij.B0(ijVar.f23262k);
                if (org.telegram.messenger.m5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat M0 = org.telegram.messenger.qp.s1(b8Var.f28616a).M0(Long.valueOf(-B0));
                    if (M0 != null && M0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -M0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", ijVar.f1());
                org.telegram.messenger.qs.f(b8Var.f28616a).k(4, new Object[0]);
                launchActivity.u0(new org.telegram.ui.an(bundle), false, false);
                b8Var.dismiss();
                return;
        }
    }
}
