package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ki0 {
    public final TLObject f27768a;
    public final long f27769b;
    public int f27770c;

    public ki0(int i10, TLObject tLObject) {
        this.f27768a = tLObject;
        this.f27770c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f27769b = ((TLRPC.User) tLObject).f19942id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f27769b = -((TLRPC.Chat) tLObject).f19793id;
        }
    }
}
