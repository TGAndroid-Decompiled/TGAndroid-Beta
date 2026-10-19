package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bk0 {
    public final TLObject f24982a;
    public final long f24983b;
    public int f24984c;

    public bk0(int i10, TLObject tLObject) {
        this.f24982a = tLObject;
        this.f24984c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f24983b = ((TLRPC.User) tLObject).f20422id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f24983b = -((TLRPC.Chat) tLObject).f20275id;
        }
    }
}
