package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;

public final class StarsReactionsSheet$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId;
    public final StarsReactionsSheet f$0;

    public StarsReactionsSheet$$ExternalSyntheticLambda11(StarsReactionsSheet starsReactionsSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = starsReactionsSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StarsReactionsSheet starsReactionsSheet = this.f$0;
                starsReactionsSheet.sending = true;
                starsReactionsSheet.animate3dIcon(null);
                AndroidUtilities.runOnUIThread(new StarsReactionsSheet$$ExternalSyntheticLambda11(starsReactionsSheet, 1), 240L);
                break;
            case 1:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
            default:
                StarsReactionsSheet.AnonymousClass1 anonymousClass1 = this.f$0.slider;
                anonymousClass1.drawCounterImage = false;
                anonymousClass1.invalidate();
                break;
        }
    }
}
