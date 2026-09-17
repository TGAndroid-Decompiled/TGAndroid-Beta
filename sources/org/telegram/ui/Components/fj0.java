package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fj0 {
    public final TLObject f23952a;
    public final long f23953b;
    public int f23954c;

    public fj0(int i10, TLObject tLObject) {
        this.f23952a = tLObject;
        this.f23954c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f23953b = ((TLRPC.User) tLObject).f18268id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f23953b = -((TLRPC.Chat) tLObject).f18121id;
        }
    }
}
