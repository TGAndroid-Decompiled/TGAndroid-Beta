package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gh0 {
    public final TLObject f33961a;
    public final long f33962b;
    public int f33963c;

    public gh0(int i7, TLObject tLObject) {
        this.f33961a = tLObject;
        this.f33963c = i7;
        if (tLObject instanceof TLRPC.User) {
            this.f33962b = ((TLRPC.User) tLObject).f27101id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f33962b = -((TLRPC.Chat) tLObject).f26952id;
        }
    }
}
