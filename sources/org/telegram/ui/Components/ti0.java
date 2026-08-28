package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ti0 {
    public final TLObject f32702a;
    public final long f32703b;
    public int f32704c;

    public ti0(int i9, TLObject tLObject) {
        this.f32702a = tLObject;
        this.f32704c = i9;
        if (tLObject instanceof TLRPC.User) {
            this.f32703b = ((TLRPC.User) tLObject).f22527id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f32703b = -((TLRPC.Chat) tLObject).f22380id;
        }
    }
}
