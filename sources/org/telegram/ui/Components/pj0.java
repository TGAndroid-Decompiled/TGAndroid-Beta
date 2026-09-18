package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj0 {
    public final TLObject f27249a;
    public final long f27250b;
    public int f27251c;

    public pj0(int i10, TLObject tLObject) {
        this.f27249a = tLObject;
        this.f27251c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f27250b = ((TLRPC.User) tLObject).f18443id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f27250b = -((TLRPC.Chat) tLObject).f18296id;
        }
    }
}
