package org.telegram.ui.Components.Premium;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LimitReachedBottomSheet$$ExternalSyntheticLambda7 implements RequestDelegate {
    public final int $r8$classId;
    public final LimitReachedBottomSheet f$0;

    public LimitReachedBottomSheet$$ExternalSyntheticLambda7(LimitReachedBottomSheet limitReachedBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = limitReachedBottomSheet;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadInactiveChannels$27(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$revokeLinks$24(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$loadAdminedChannels$23(tLObject, tL_error);
                break;
        }
    }
}
