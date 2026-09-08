package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ej0 {
    public final TLObject f25745a;
    public final long f25746b;
    public int f25747c;

    public ej0(int i10, TLObject tLObject) {
        this.f25745a = tLObject;
        this.f25747c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f25746b = ((TLRPC.User) tLObject).f20043id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f25746b = -((TLRPC.Chat) tLObject).f19896id;
        }
    }
}
