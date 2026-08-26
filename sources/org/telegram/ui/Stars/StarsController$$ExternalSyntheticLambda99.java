package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

public final class StarsController$$ExternalSyntheticLambda99 implements Runnable {
    public final int $r8$classId;
    public final Utilities.Callback2 f$0;

    public StarsController$$ExternalSyntheticLambda99(int i, Utilities.Callback2 callback2) {
        this.$r8$classId = i;
        this.f$0 = callback2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 1:
                this.f$0.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            case 2:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda99(3, this.f$0));
                break;
            default:
                this.f$0.run(Boolean.FALSE, null);
                break;
        }
    }
}
