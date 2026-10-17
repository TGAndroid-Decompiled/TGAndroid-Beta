package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bk0 {
    public final TLObject f24998a;
    public final long f24999b;
    public int f25000c;

    public bk0(int i10, TLObject tLObject) {
        this.f24998a = tLObject;
        this.f25000c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f24999b = ((TLRPC.User) tLObject).f20419id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f24999b = -((TLRPC.Chat) tLObject).f20272id;
        }
    }
}
