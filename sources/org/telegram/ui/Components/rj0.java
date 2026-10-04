package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj0 {
    public final TLObject f30428a;
    public final long f30429b;
    public int f30430c;

    public rj0(int i10, TLObject tLObject) {
        this.f30428a = tLObject;
        this.f30430c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f30429b = ((TLRPC.User) tLObject).f20189id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f30429b = -((TLRPC.Chat) tLObject).f20042id;
        }
    }
}
