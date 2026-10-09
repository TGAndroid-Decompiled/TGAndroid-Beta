package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jk0 {
    public final TLObject f27734a;
    public final long f27735b;
    public int f27736c;

    public jk0(int i10, TLObject tLObject) {
        this.f27734a = tLObject;
        this.f27736c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f27735b = ((TLRPC.User) tLObject).f20185id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f27735b = -((TLRPC.Chat) tLObject).f20038id;
        }
    }
}
