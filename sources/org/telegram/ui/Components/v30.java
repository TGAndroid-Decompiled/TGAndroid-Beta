package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v30 {
    public final TLObject f40668a;
    public TLRPC.User f40669b;
    public final int f40670c;
    public final boolean d;
    public boolean f40671e;

    public v30(int i7, TLObject tLObject) {
        boolean z10;
        this.f40668a = tLObject;
        this.f40670c = i7;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
