package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fj0 {
    public final TLObject f23995a;
    public final long f23996b;
    public int f23997c;

    public fj0(int i10, TLObject tLObject) {
        this.f23995a = tLObject;
        this.f23997c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f23996b = ((TLRPC.User) tLObject).f18230id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f23996b = -((TLRPC.Chat) tLObject).f18083id;
        }
    }
}
