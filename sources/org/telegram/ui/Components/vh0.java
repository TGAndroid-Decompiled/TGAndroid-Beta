package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vh0 {
    public final TLObject f40831a;
    public final long f40832b;
    public int f40833c;

    public vh0(int i7, TLObject tLObject) {
        this.f40831a = tLObject;
        this.f40833c = i7;
        if (tLObject instanceof TLRPC.User) {
            this.f40832b = ((TLRPC.User) tLObject).f28583id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f40832b = -((TLRPC.Chat) tLObject).f28434id;
        }
    }
}
