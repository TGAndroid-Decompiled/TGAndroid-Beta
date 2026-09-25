package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj0 {
    public final TLObject f27363a;
    public final long f27364b;
    public int f27365c;

    public pj0(int i10, TLObject tLObject) {
        this.f27363a = tLObject;
        this.f27365c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f27364b = ((TLRPC.User) tLObject).f18483id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f27364b = -((TLRPC.Chat) tLObject).f18336id;
        }
    }
}
