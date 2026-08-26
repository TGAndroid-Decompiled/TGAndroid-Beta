package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.JoinGroupAlert$$ExternalSyntheticLambda3;

public final class StarsController$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId;
    public final JoinGroupAlert$$ExternalSyntheticLambda3 f$0;

    public StarsController$$ExternalSyntheticLambda11(JoinGroupAlert$$ExternalSyntheticLambda3 joinGroupAlert$$ExternalSyntheticLambda3, int i) {
        this.$r8$classId = i;
        this.f$0 = joinGroupAlert$$ExternalSyntheticLambda3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda11(this.f$0, 3));
                break;
            case 1:
                this.f$0.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 2:
                this.f$0.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            default:
                this.f$0.run(Boolean.FALSE, null);
                break;
        }
    }
}
