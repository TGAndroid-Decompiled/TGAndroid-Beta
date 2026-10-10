package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kk0 {
    public final TLObject f28063a;
    public final long f28064b;
    public int f28065c;

    public kk0(int i10, TLObject tLObject) {
        this.f28063a = tLObject;
        this.f28065c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f28064b = ((TLRPC.User) tLObject).f20189id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f28064b = -((TLRPC.Chat) tLObject).f20042id;
        }
    }
}
