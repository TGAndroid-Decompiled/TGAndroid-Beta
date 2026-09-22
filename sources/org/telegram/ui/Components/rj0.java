package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj0 {
    public final TLObject f28000a;
    public final long f28001b;
    public int f28002c;

    public rj0(int i10, TLObject tLObject) {
        this.f28000a = tLObject;
        this.f28002c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f28001b = ((TLRPC.User) tLObject).f18490id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f28001b = -((TLRPC.Chat) tLObject).f18343id;
        }
    }
}
