package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e50 {
    public final TLObject f27743a;
    public TLRPC.User f27744b;
    public final int f27745c;
    public final boolean d;
    public boolean e;

    public e50(int i10, TLObject tLObject) {
        boolean z10;
        this.f27743a = tLObject;
        this.f27745c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
