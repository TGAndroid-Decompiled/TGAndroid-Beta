package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class z0 implements Runnable {
    public final int f18254a;
    public final ChatObject.Call f18255b;
    public final TLObject f18256c;

    public z0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f18254a = i10;
        this.f18255b = call;
        this.f18256c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18254a) {
            case 0:
                this.f18255b.lambda$reloadGroupCall$8(this.f18256c);
                return;
            default:
                this.f18255b.lambda$loadGroupCall$10(this.f18256c);
                return;
        }
    }
}
