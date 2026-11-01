package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class li0 {
    public final TLObject f28176a;
    public final long f28177b;
    public int f28178c;

    public li0(int i10, TLObject tLObject) {
        this.f28176a = tLObject;
        this.f28178c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f28177b = ((TLRPC.User) tLObject).f19943id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f28177b = -((TLRPC.Chat) tLObject).f19794id;
        }
    }
}
