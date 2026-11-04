package org.telegram.ui.Wallet;

import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
public final class q9 implements u10 {
    public final int f43100a;
    public final w9 f43101b;

    public q9(w9 w9Var, int i3) {
        this.f43100a = i3;
        this.f43101b = w9Var;
    }

    @Override
    public final void a(Object obj) {
        bh.g gVar;
        switch (this.f43100a) {
            case 0:
                w9.e0(this.f43101b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                w9 w9Var = this.f43101b;
                if (!w9Var.isFinished && (gVar = w9Var.O) != null) {
                    if (user == null) {
                        org.telegram.messenger.g0.h3(new r9(w9Var, 1));
                        return;
                    }
                    org.telegram.messenger.g0.v1(gVar);
                    w9Var.m0(null, user);
                    return;
                }
                return;
        }
    }
}
