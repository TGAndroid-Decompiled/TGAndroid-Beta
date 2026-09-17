package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s40 {
    public final TLObject f27760a;
    public TLRPC.User f27761b;
    public final int f27762c;
    public final boolean d;
    public boolean e;

    public s40(int i10, TLObject tLObject) {
        boolean z10;
        this.f27760a = tLObject;
        this.f27762c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
