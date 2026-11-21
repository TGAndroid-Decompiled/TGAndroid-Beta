package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vh0 {
    public final TLObject f40830a;
    public final long f40831b;
    public int f40832c;

    public vh0(int i7, TLObject tLObject) {
        this.f40830a = tLObject;
        this.f40832c = i7;
        if (tLObject instanceof TLRPC.User) {
            this.f40831b = ((TLRPC.User) tLObject).f28580id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f40831b = -((TLRPC.Chat) tLObject).f28431id;
        }
    }
}
