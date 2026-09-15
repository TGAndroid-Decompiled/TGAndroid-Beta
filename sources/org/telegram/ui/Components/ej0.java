package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ej0 {
    public final TLObject f23680a;
    public final long f23681b;
    public int f23682c;

    public ej0(int i10, TLObject tLObject) {
        this.f23680a = tLObject;
        this.f23682c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f23681b = ((TLRPC.User) tLObject).f18259id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f23681b = -((TLRPC.Chat) tLObject).f18112id;
        }
    }
}
