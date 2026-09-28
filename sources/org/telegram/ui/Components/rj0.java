package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj0 {
    public final TLObject f27980a;
    public final long f27981b;
    public int f27982c;

    public rj0(int i10, TLObject tLObject) {
        this.f27980a = tLObject;
        this.f27982c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f27981b = ((TLRPC.User) tLObject).f18483id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f27981b = -((TLRPC.Chat) tLObject).f18336id;
        }
    }
}
