package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ek0 {
    public final TLObject f27892a;
    public final long f27893b;
    public int f27894c;

    public ek0(int i10, TLObject tLObject) {
        this.f27892a = tLObject;
        this.f27894c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f27893b = ((TLRPC.User) tLObject).f22176id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f27893b = -((TLRPC.Chat) tLObject).f22027id;
        }
    }
}
