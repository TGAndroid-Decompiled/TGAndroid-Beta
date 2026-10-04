package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class z0 implements Runnable {
    public final int f19955a;
    public final ChatObject.Call f19956b;
    public final TLObject f19957c;

    public z0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f19955a = i10;
        this.f19956b = call;
        this.f19957c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19955a) {
            case 0:
                this.f19956b.lambda$reloadGroupCall$8(this.f19957c);
                return;
            default:
                this.f19956b.lambda$loadGroupCall$10(this.f19957c);
                return;
        }
    }
}
