package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gh0 {
    public final TLObject f33943a;
    public final long f33944b;
    public int f33945c;

    public gh0(int i7, TLObject tLObject) {
        this.f33943a = tLObject;
        this.f33945c = i7;
        if (tLObject instanceof TLRPC.User) {
            this.f33944b = ((TLRPC.User) tLObject).f27105id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f33944b = -((TLRPC.Chat) tLObject).f26956id;
        }
    }
}
