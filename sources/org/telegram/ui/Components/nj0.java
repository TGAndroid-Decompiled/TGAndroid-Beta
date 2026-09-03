package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nj0 {
    public final TLObject f27280a;
    public final long f27281b;
    public int f27282c;

    public nj0(int i10, TLObject tLObject) {
        this.f27280a = tLObject;
        this.f27282c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f27281b = ((TLRPC.User) tLObject).f19306id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f27281b = -((TLRPC.Chat) tLObject).f19159id;
        }
    }
}
