package org.telegram.ui.Components.Premium;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ImageUpdater$$ExternalSyntheticLambda2;

public final class LimitReachedBottomSheet$$ExternalSyntheticLambda4 implements RequestDelegate {
    public final int $r8$classId;
    public final LimitReachedBottomSheet f$0;

    public LimitReachedBottomSheet$$ExternalSyntheticLambda4(LimitReachedBottomSheet limitReachedBottomSheet, int i) {
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
                LimitReachedBottomSheet limitReachedBottomSheet = this.f$0;
                limitReachedBottomSheet.getClass();
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(limitReachedBottomSheet.onSuccessRunnable);
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(18, this.f$0, tLObject));
                break;
        }
    }
}
