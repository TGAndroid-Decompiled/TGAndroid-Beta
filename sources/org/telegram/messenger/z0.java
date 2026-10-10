package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class z0 implements Runnable {
    public final int f19946a;
    public final ChatObject.Call f19947b;
    public final TLObject f19948c;

    public z0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f19946a = i10;
        this.f19947b = call;
        this.f19948c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19946a) {
            case 0:
                this.f19947b.lambda$reloadGroupCall$8(this.f19948c);
                return;
            default:
                this.f19947b.lambda$loadGroupCall$10(this.f19948c);
                return;
        }
    }
}
