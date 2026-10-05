package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj0 {
    public final TLObject f30510a;
    public final long f30511b;
    public int f30512c;

    public rj0(int i10, TLObject tLObject) {
        this.f30510a = tLObject;
        this.f30512c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f30511b = ((TLRPC.User) tLObject).f20194id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f30511b = -((TLRPC.Chat) tLObject).f20047id;
        }
    }
}
