package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj0 {
    public final TLObject f30422a;
    public final long f30423b;
    public int f30424c;

    public rj0(int i10, TLObject tLObject) {
        this.f30422a = tLObject;
        this.f30424c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f30423b = ((TLRPC.User) tLObject).f20185id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f30423b = -((TLRPC.Chat) tLObject).f20038id;
        }
    }
}
