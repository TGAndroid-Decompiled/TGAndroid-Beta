package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj0 {
    public final TLObject f27348a;
    public final long f27349b;
    public int f27350c;

    public pj0(int i10, TLObject tLObject) {
        this.f27348a = tLObject;
        this.f27350c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f27349b = ((TLRPC.User) tLObject).f18468id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f27349b = -((TLRPC.Chat) tLObject).f18321id;
        }
    }
}
