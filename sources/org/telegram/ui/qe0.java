package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qe0 implements Runnable {
    public final int f49211a;
    public final cf0 f49212b;
    public final TLRPC.TL_chatInviteExported f49213c;
    public final TLRPC.TL_error d;
    public final TLObject f49214e;
    public final boolean f49215f;

    public qe0(cf0 cf0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9, int i7) {
        this.f49211a = i7;
        this.f49212b = cf0Var;
        this.f49213c = tL_chatInviteExported;
        this.d = tL_error;
        this.f49214e = tLObject;
        this.f49215f = z9;
    }

    @Override
    public final void run() {
        switch (this.f49211a) {
            case 0:
                cf0 cf0Var = this.f49212b;
                cf0Var.getNotificationCenter().d(new qe0(cf0Var, this.f49213c, this.d, this.f49214e, this.f49215f, 1));
                return;
            default:
                cf0.Z(this.f49212b, this.f49213c, this.d, this.f49214e, this.f49215f);
                return;
        }
    }
}
