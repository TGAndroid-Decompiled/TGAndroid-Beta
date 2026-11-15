package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kh0 {
    public final TLObject f36421a;
    public final long f36422b;
    public int f36423c;

    public kh0(int i7, TLObject tLObject) {
        this.f36421a = tLObject;
        this.f36423c = i7;
        if (tLObject instanceof TLRPC.User) {
            this.f36422b = ((TLRPC.User) tLObject).f28200id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f36422b = -((TLRPC.Chat) tLObject).f28051id;
        }
    }
}
