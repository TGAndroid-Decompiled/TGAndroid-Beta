package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s30 {
    public final TLObject f39468a;
    public TLRPC.User f39469b;
    public final int f39470c;
    public final boolean d;
    public boolean f39471e;

    public s30(int i7, TLObject tLObject) {
        boolean z10;
        this.f39468a = tLObject;
        this.f39470c = i7;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
