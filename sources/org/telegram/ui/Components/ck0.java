package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ck0 {
    public final TLObject f25214a;
    public final long f25215b;
    public int f25216c;

    public ck0(int i10, TLObject tLObject) {
        this.f25214a = tLObject;
        this.f25216c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f25215b = ((TLRPC.User) tLObject).f20426id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f25215b = -((TLRPC.Chat) tLObject).f20279id;
        }
    }
}
