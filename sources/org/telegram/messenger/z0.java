package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z0 implements RequestDelegate {
    public final int f20194a;
    public final ChatObject.Call f20195b;

    public z0(ChatObject.Call call, int i10) {
        this.f20194a = i10;
        this.f20195b = call;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20194a) {
            case 0:
                this.f20195b.lambda$loadGroupCall$11(tLObject, tL_error);
                return;
            case 1:
                this.f20195b.lambda$reloadGroupCall$9(tLObject, tL_error);
                return;
            case 2:
                this.f20195b.lambda$setTitle$4(tLObject, tL_error);
                return;
            default:
                this.f20195b.lambda$toggleRecord$13(tLObject, tL_error);
                return;
        }
    }
}
