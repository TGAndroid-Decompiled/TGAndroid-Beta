package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z0 implements RequestDelegate {
    public final int f20184a;
    public final ChatObject.Call f20185b;

    public z0(ChatObject.Call call, int i10) {
        this.f20184a = i10;
        this.f20185b = call;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20184a) {
            case 0:
                this.f20185b.lambda$loadGroupCall$11(tLObject, tL_error);
                return;
            case 1:
                this.f20185b.lambda$reloadGroupCall$9(tLObject, tL_error);
                return;
            case 2:
                this.f20185b.lambda$setTitle$4(tLObject, tL_error);
                return;
            default:
                this.f20185b.lambda$toggleRecord$13(tLObject, tL_error);
                return;
        }
    }
}
