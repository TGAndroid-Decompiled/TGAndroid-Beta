package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;

public final class StarsController$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final OAuthSheet$$ExternalSyntheticLambda18 f$0;

    public StarsController$$ExternalSyntheticLambda7(OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18, int i) {
        this.$r8$classId = i;
        this.f$0 = oAuthSheet$$ExternalSyntheticLambda18;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run(Boolean.FALSE, null);
                break;
            case 1:
                this.f$0.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 2:
                this.f$0.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            default:
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda7(this.f$0, 0));
                break;
        }
    }
}
