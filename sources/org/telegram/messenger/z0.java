package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class z0 implements Runnable {
    public final int f19979a;
    public final ChatObject.Call f19980b;
    public final TLObject f19981c;

    public z0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f19979a = i10;
        this.f19980b = call;
        this.f19981c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19979a) {
            case 0:
                this.f19980b.lambda$reloadGroupCall$8(this.f19981c);
                return;
            default:
                this.f19980b.lambda$loadGroupCall$10(this.f19981c);
                return;
        }
    }
}
