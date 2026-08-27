package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class vi0 {

    public final TLObject f33424a;

    public final long f33425b;

    public int f33426c;

    public vi0(int i10, TLObject tLObject) {
        this.f33424a = tLObject;
        this.f33426c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f33425b = ((TLRPC.User) tLObject).f22527id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f33425b = -((TLRPC.Chat) tLObject).f22380id;
        }
    }
}
