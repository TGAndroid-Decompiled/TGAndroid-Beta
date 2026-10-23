package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c50 {
    public final TLObject f25243a;
    public TLRPC.User f25244b;
    public final int f25245c;
    public final boolean d;
    public boolean e;

    public c50(int i10, TLObject tLObject) {
        boolean z10;
        this.f25243a = tLObject;
        this.f25245c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
