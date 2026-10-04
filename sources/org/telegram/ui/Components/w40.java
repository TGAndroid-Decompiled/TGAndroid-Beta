package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w40 {
    public final TLObject f32460a;
    public TLRPC.User f32461b;
    public final int f32462c;
    public final boolean d;
    public boolean f32463e;

    public w40(int i10, TLObject tLObject) {
        boolean z10;
        this.f32460a = tLObject;
        this.f32462c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
