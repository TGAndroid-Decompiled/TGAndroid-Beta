package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s40 {
    public final TLObject f30213a;
    public TLRPC.User f30214b;
    public final int f30215c;
    public final boolean d;
    public boolean f30216e;

    public s40(int i10, TLObject tLObject) {
        boolean z10;
        this.f30213a = tLObject;
        this.f30215c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
