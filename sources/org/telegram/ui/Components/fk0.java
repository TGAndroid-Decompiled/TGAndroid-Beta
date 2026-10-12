package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fk0 {
    public final TLObject f25073a;
    public final long f25074b;
    public int f25075c;

    public fk0(int i10, TLObject tLObject) {
        this.f25073a = tLObject;
        this.f25075c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f25074b = ((TLRPC.User) tLObject).f19363id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f25074b = -((TLRPC.Chat) tLObject).f19216id;
        }
    }
}
