package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ej0 {
    public final TLObject f25746a;
    public final long f25747b;
    public int f25748c;

    public ej0(int i10, TLObject tLObject) {
        this.f25746a = tLObject;
        this.f25748c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f25747b = ((TLRPC.User) tLObject).f20043id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f25747b = -((TLRPC.Chat) tLObject).f19896id;
        }
    }
}
