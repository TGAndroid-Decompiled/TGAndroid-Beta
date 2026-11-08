package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qe0 implements Runnable {
    public final int f49213a;
    public final cf0 f49214b;
    public final TLRPC.TL_chatInviteExported f49215c;
    public final TLRPC.TL_error d;
    public final TLObject f49216e;
    public final boolean f49217f;

    public qe0(cf0 cf0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9, int i7) {
        this.f49213a = i7;
        this.f49214b = cf0Var;
        this.f49215c = tL_chatInviteExported;
        this.d = tL_error;
        this.f49216e = tLObject;
        this.f49217f = z9;
    }

    @Override
    public final void run() {
        switch (this.f49213a) {
            case 0:
                cf0 cf0Var = this.f49214b;
                cf0Var.getNotificationCenter().d(new qe0(cf0Var, this.f49215c, this.d, this.f49216e, this.f49217f, 1));
                return;
            default:
                cf0.Z(this.f49214b, this.f49215c, this.d, this.f49216e, this.f49217f);
                return;
        }
    }
}
