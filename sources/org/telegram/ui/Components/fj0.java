package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fj0 {
    public final TLObject f23955a;
    public final long f23956b;
    public int f23957c;

    public fj0(int i10, TLObject tLObject) {
        this.f23955a = tLObject;
        this.f23957c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f23956b = ((TLRPC.User) tLObject).f18268id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f23956b = -((TLRPC.Chat) tLObject).f18121id;
        }
    }
}
