package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class z0 implements Runnable {
    public final int f19943a;
    public final ChatObject.Call f19944b;
    public final TLObject f19945c;

    public z0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f19943a = i10;
        this.f19944b = call;
        this.f19945c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19943a) {
            case 0:
                this.f19944b.lambda$reloadGroupCall$8(this.f19945c);
                return;
            default:
                this.f19944b.lambda$loadGroupCall$10(this.f19945c);
                return;
        }
    }
}
