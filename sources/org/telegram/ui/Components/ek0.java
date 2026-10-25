package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ek0 {
    public final TLObject f27890a;
    public final long f27891b;
    public int f27892c;

    public ek0(int i10, TLObject tLObject) {
        this.f27890a = tLObject;
        this.f27892c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f27891b = ((TLRPC.User) tLObject).f22174id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f27891b = -((TLRPC.Chat) tLObject).f22027id;
        }
    }
}
