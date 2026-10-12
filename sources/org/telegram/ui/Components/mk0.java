package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mk0 {
    public final TLObject f28587a;
    public final long f28588b;
    public int f28589c;

    public mk0(int i10, TLObject tLObject) {
        this.f28587a = tLObject;
        this.f28589c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f28588b = ((TLRPC.User) tLObject).f19950id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f28588b = -((TLRPC.Chat) tLObject).f19803id;
        }
    }
}
