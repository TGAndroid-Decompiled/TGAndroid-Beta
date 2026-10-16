package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g50 {
    public final TLObject f24880a;
    public TLRPC.User f24881b;
    public final int f24882c;
    public final boolean d;
    public boolean e;

    public g50(int i10, TLObject tLObject) {
        boolean z10;
        this.f24880a = tLObject;
        this.f24882c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
