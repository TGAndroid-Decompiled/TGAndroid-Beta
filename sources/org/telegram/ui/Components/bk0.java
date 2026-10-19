package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bk0 {
    public final TLObject f24980a;
    public final long f24981b;
    public int f24982c;

    public bk0(int i10, TLObject tLObject) {
        this.f24980a = tLObject;
        this.f24982c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f24981b = ((TLRPC.User) tLObject).f20420id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f24981b = -((TLRPC.Chat) tLObject).f20273id;
        }
    }
}
