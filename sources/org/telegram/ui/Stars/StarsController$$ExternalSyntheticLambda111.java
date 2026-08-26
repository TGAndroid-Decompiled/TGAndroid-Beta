package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda10;

public final class StarsController$$ExternalSyntheticLambda111 implements Runnable {
    public final int $r8$classId;
    public final BotBiometry$$ExternalSyntheticLambda10 f$0;

    public StarsController$$ExternalSyntheticLambda111(BotBiometry$$ExternalSyntheticLambda10 botBiometry$$ExternalSyntheticLambda10, int i) {
        this.$r8$classId = i;
        this.f$0 = botBiometry$$ExternalSyntheticLambda10;
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
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda111(this.f$0, 3));
                break;
            default:
                this.f$0.run(Boolean.FALSE, null);
                break;
        }
    }
}
