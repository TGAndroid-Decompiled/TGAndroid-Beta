package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class th0 {
    public final TLObject f40004a;
    public final long f40005b;
    public int f40006c;

    public th0(int i7, TLObject tLObject) {
        this.f40004a = tLObject;
        this.f40006c = i7;
        if (tLObject instanceof TLRPC.User) {
            this.f40005b = ((TLRPC.User) tLObject).f28552id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f40005b = -((TLRPC.Chat) tLObject).f28403id;
        }
    }
}
