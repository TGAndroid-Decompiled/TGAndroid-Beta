package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gh0 {
    public final TLObject f33909a;
    public final long f33910b;
    public int f33911c;

    public gh0(int i7, TLObject tLObject) {
        this.f33909a = tLObject;
        this.f33911c = i7;
        if (tLObject instanceof TLRPC.User) {
            this.f33910b = ((TLRPC.User) tLObject).f27101id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f33910b = -((TLRPC.Chat) tLObject).f26952id;
        }
    }
}
