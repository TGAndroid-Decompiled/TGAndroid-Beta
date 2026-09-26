package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qj0 {
    public final TLObject f27694a;
    public final long f27695b;
    public int f27696c;

    public qj0(int i10, TLObject tLObject) {
        this.f27694a = tLObject;
        this.f27696c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f27695b = ((TLRPC.User) tLObject).f18482id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f27695b = -((TLRPC.Chat) tLObject).f18335id;
        }
    }
}
