package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s40 {
    public final TLObject f28045a;
    public TLRPC.User f28046b;
    public final int f28047c;
    public final boolean d;
    public boolean e;

    public s40(int i10, TLObject tLObject) {
        boolean z10;
        this.f28045a = tLObject;
        this.f28047c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
