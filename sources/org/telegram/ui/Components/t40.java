package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t40 {
    public final TLObject f28087a;
    public TLRPC.User f28088b;
    public final int f28089c;
    public final boolean d;
    public boolean e;

    public t40(int i10, TLObject tLObject) {
        boolean z10;
        this.f28087a = tLObject;
        this.f28089c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
