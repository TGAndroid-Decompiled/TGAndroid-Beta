package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh0 {
    public final TLObject f35072a;
    public final long f35073b;
    public int f35074c;

    public jh0(int i3, TLObject tLObject) {
        this.f35072a = tLObject;
        this.f35074c = i3;
        if (tLObject instanceof TLRPC.User) {
            this.f35073b = ((TLRPC.User) tLObject).f27150id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f35073b = -((TLRPC.Chat) tLObject).f27001id;
        }
    }
}
