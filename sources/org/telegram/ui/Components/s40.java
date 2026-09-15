package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s40 {
    public final TLObject f27766a;
    public TLRPC.User f27767b;
    public final int f27768c;
    public final boolean d;
    public boolean e;

    public s40(int i10, TLObject tLObject) {
        boolean z10;
        this.f27766a = tLObject;
        this.f27768c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
