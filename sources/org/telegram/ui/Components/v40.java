package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v40 {
    public final TLObject f28968a;
    public TLRPC.User f28969b;
    public final int f28970c;
    public final boolean d;
    public boolean e;

    public v40(int i10, TLObject tLObject) {
        boolean z10;
        this.f28968a = tLObject;
        this.f28970c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
