package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hh0 {
    public final TLObject f34299a;
    public final long f34300b;
    public int f34301c;

    public hh0(int i7, TLObject tLObject) {
        this.f34299a = tLObject;
        this.f34301c = i7;
        if (tLObject instanceof TLRPC.User) {
            this.f34300b = ((TLRPC.User) tLObject).f27105id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f34300b = -((TLRPC.Chat) tLObject).f26956id;
        }
    }
}
