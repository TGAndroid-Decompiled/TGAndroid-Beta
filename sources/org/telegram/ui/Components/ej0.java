package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ej0 {
    public final TLObject f23677a;
    public final long f23678b;
    public int f23679c;

    public ej0(int i10, TLObject tLObject) {
        this.f23677a = tLObject;
        this.f23679c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f23678b = ((TLRPC.User) tLObject).f18256id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f23678b = -((TLRPC.Chat) tLObject).f18109id;
        }
    }
}
