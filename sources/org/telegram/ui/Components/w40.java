package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w40 {
    public final TLObject f32639a;
    public TLRPC.User f32640b;
    public final int f32641c;
    public final boolean d;
    public boolean f32642e;

    public w40(int i10, TLObject tLObject) {
        boolean z4;
        this.f32639a = tLObject;
        this.f32641c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = z4;
    }
}
