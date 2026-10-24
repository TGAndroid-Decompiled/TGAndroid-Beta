package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a50 {
    public final TLObject f24628a;
    public TLRPC.User f24629b;
    public final int f24630c;
    public final boolean d;
    public boolean e;

    public a50(int i10, TLObject tLObject) {
        boolean z10;
        this.f24628a = tLObject;
        this.f24630c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
