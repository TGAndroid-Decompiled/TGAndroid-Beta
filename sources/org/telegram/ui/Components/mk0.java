package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mk0 {
    public final TLObject f28597a;
    public final long f28598b;
    public int f28599c;

    public mk0(int i10, TLObject tLObject) {
        this.f28597a = tLObject;
        this.f28599c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f28598b = ((TLRPC.User) tLObject).f19949id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f28598b = -((TLRPC.Chat) tLObject).f19802id;
        }
    }
}
