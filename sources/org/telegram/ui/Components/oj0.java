package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oj0 {
    public final TLObject f29785a;
    public final long f29786b;
    public int f29787c;

    public oj0(int i10, TLObject tLObject) {
        this.f29785a = tLObject;
        this.f29787c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f29786b = ((TLRPC.User) tLObject).f20992id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f29786b = -((TLRPC.Chat) tLObject).f20845id;
        }
    }
}
