package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z30 {
    public final TLObject f32887a;
    public TLRPC.User f32888b;
    public final int f32889c;
    public final boolean d;
    public boolean e;

    public z30(int i10, TLObject tLObject) {
        boolean z10;
        this.f32887a = tLObject;
        this.f32889c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
