package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class le0 implements Runnable {
    public final int f47312a;
    public final xe0 f47313b;
    public final TLRPC.TL_chatInviteExported f47314c;
    public final TLRPC.TL_error d;
    public final TLObject f47315e;
    public final boolean f47316f;

    public le0(xe0 xe0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i3) {
        this.f47312a = i3;
        this.f47313b = xe0Var;
        this.f47314c = tL_chatInviteExported;
        this.d = tL_error;
        this.f47315e = tLObject;
        this.f47316f = z10;
    }

    @Override
    public final void run() {
        switch (this.f47312a) {
            case 0:
                xe0 xe0Var = this.f47313b;
                xe0Var.getNotificationCenter().d(new le0(xe0Var, this.f47314c, this.d, this.f47315e, this.f47316f, 1));
                return;
            default:
                xe0.Z(this.f47313b, this.f47314c, this.d, this.f47315e, this.f47316f);
                return;
        }
    }
}
