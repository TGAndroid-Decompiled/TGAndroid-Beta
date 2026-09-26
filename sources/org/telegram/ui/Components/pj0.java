package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj0 {
    public final TLObject f27362a;
    public final long f27363b;
    public int f27364c;

    public pj0(int i10, TLObject tLObject) {
        this.f27362a = tLObject;
        this.f27364c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f27363b = ((TLRPC.User) tLObject).f18482id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f27363b = -((TLRPC.Chat) tLObject).f18335id;
        }
    }
}
