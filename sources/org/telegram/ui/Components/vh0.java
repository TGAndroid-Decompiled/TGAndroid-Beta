package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vh0 {
    public final TLObject f40832a;
    public final long f40833b;
    public int f40834c;

    public vh0(int i7, TLObject tLObject) {
        this.f40832a = tLObject;
        this.f40834c = i7;
        if (tLObject instanceof TLRPC.User) {
            this.f40833b = ((TLRPC.User) tLObject).f28583id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f40833b = -((TLRPC.Chat) tLObject).f28434id;
        }
    }
}
