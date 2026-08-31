package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w40 {
    public final TLObject f32640a;
    public TLRPC.User f32641b;
    public final int f32642c;
    public final boolean d;
    public boolean f32643e;

    public w40(int i10, TLObject tLObject) {
        boolean z4;
        this.f32640a = tLObject;
        this.f32642c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = z4;
    }
}
