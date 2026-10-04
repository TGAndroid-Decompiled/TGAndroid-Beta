package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class z0 implements Runnable {
    public final int f19945a;
    public final ChatObject.Call f19946b;
    public final TLObject f19947c;

    public z0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f19945a = i10;
        this.f19946b = call;
        this.f19947c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19945a) {
            case 0:
                this.f19946b.lambda$reloadGroupCall$8(this.f19947c);
                return;
            default:
                this.f19946b.lambda$loadGroupCall$10(this.f19947c);
                return;
        }
    }
}
