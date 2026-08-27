package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class h40 {

    public final TLObject f28924a;

    public TLRPC.User f28925b;

    public final int f28926c;
    public final boolean d;

    public boolean f28927e;

    public h40(int i10, TLObject tLObject) {
        this.f28924a = tLObject;
        this.f28926c = i10;
        this.d = (tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self;
    }
}
