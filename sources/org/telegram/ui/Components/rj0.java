package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj0 {
    public final TLObject f28017a;
    public final long f28018b;
    public int f28019c;

    public rj0(int i10, TLObject tLObject) {
        this.f28017a = tLObject;
        this.f28019c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f28018b = ((TLRPC.User) tLObject).f18476id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f28018b = -((TLRPC.Chat) tLObject).f18329id;
        }
    }
}
