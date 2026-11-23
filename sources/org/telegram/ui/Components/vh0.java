package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vh0 {
    public final TLObject f40703a;
    public final long f40704b;
    public int f40705c;

    public vh0(int i7, TLObject tLObject) {
        this.f40703a = tLObject;
        this.f40705c = i7;
        if (tLObject instanceof TLRPC.User) {
            this.f40704b = ((TLRPC.User) tLObject).f28641id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f40704b = -((TLRPC.Chat) tLObject).f28492id;
        }
    }
}
