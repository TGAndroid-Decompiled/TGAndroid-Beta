package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z implements Utilities.Callback {
    public final int f21945a;
    public final Object f21946b;
    public final Object f21947c;

    public z(int i10, Object obj, Object obj2) {
        this.f21945a = i10;
        this.f21946b = obj;
        this.f21947c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21945a) {
            case 0:
                ((BetaUpdaterController) this.f21946b).lambda$checkForUpdate$2((Runnable) this.f21947c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f21946b, (Utilities.Callback) this.f21947c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f21946b).lambda$sendMessage$51((SendMessagesHelper.SendMessageParams) this.f21947c, (Long) obj);
                return;
        }
    }
}
