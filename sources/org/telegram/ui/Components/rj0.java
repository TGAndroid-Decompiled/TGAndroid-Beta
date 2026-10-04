package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj0 {
    public final TLObject f30421a;
    public final long f30422b;
    public int f30423c;

    public rj0(int i10, TLObject tLObject) {
        this.f30421a = tLObject;
        this.f30423c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f30422b = ((TLRPC.User) tLObject).f20184id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f30422b = -((TLRPC.Chat) tLObject).f20037id;
        }
    }
}
