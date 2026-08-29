package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ej0 {
    public final TLObject f28093a;
    public final long f28094b;
    public int f28095c;

    public ej0(int i10, TLObject tLObject) {
        this.f28093a = tLObject;
        this.f28095c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f28094b = ((TLRPC.User) tLObject).f22539id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f28094b = -((TLRPC.Chat) tLObject).f22392id;
        }
    }
}
