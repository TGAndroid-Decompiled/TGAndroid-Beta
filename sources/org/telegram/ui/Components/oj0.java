package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oj0 {
    public final TLObject f25826a;
    public final long f25827b;
    public int f25828c;

    public oj0(int i10, TLObject tLObject) {
        this.f25826a = tLObject;
        this.f25828c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f25827b = ((TLRPC.User) tLObject).f17342id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f25827b = -((TLRPC.Chat) tLObject).f17195id;
        }
    }
}
