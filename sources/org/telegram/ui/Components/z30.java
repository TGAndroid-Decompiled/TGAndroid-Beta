package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z30 {
    public final TLObject f32983a;
    public TLRPC.User f32984b;
    public final int f32985c;
    public final boolean d;
    public boolean e;

    public z30(int i10, TLObject tLObject) {
        boolean z10;
        this.f32983a = tLObject;
        this.f32985c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
