package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj0 {
    public final TLObject f27979a;
    public final long f27980b;
    public int f27981c;

    public rj0(int i10, TLObject tLObject) {
        this.f27979a = tLObject;
        this.f27981c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f27980b = ((TLRPC.User) tLObject).f18482id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f27980b = -((TLRPC.Chat) tLObject).f18335id;
        }
    }
}
