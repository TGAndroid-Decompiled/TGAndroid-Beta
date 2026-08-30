package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nj0 {
    public final TLObject f27295a;
    public final long f27296b;
    public int f27297c;

    public nj0(int i10, TLObject tLObject) {
        this.f27295a = tLObject;
        this.f27297c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f27296b = ((TLRPC.User) tLObject).f19331id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f27296b = -((TLRPC.Chat) tLObject).f19184id;
        }
    }
}
