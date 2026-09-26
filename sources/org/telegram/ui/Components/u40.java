package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u40 {
    public final TLObject f28692a;
    public TLRPC.User f28693b;
    public final int f28694c;
    public final boolean d;
    public boolean e;

    public u40(int i10, TLObject tLObject) {
        boolean z10;
        this.f28692a = tLObject;
        this.f28694c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
