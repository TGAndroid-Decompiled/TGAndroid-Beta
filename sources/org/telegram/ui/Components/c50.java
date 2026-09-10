package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c50 {
    public final TLObject f21989a;
    public TLRPC.User f21990b;
    public final int f21991c;
    public final boolean d;
    public boolean e;

    public c50(int i10, TLObject tLObject) {
        boolean z10;
        this.f21989a = tLObject;
        this.f21991c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
