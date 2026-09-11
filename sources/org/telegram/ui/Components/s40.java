package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s40 {
    public final TLObject f30186a;
    public TLRPC.User f30187b;
    public final int f30188c;
    public final boolean d;
    public boolean f30189e;

    public s40(int i10, TLObject tLObject) {
        boolean z10;
        this.f30186a = tLObject;
        this.f30188c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
