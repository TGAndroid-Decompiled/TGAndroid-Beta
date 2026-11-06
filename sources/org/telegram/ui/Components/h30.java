package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h30 {
    public final TLObject f34154a;
    public TLRPC.User f34155b;
    public final int f34156c;
    public final boolean d;
    public boolean f34157e;

    public h30(int i7, TLObject tLObject) {
        boolean z9;
        this.f34154a = tLObject;
        this.f34156c = i7;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.d = z9;
    }
}
