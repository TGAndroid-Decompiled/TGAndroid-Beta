package org.telegram.ui.Gifts;

import org.telegram.messenger.Utilities;

public final class GiftSheet$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final GiftSheet f$0;
    public final Utilities.Callback f$1;

    public GiftSheet$$ExternalSyntheticLambda10(GiftSheet giftSheet, Utilities.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = giftSheet;
        this.f$1 = callback;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                GiftSheet giftSheet = this.f$0;
                Utilities.Callback callback = this.f$1;
                if (callback != null) {
                    giftSheet.getClass();
                    callback.run(Boolean.FALSE);
                }
                giftSheet.lambda$showGiftOfferSheet$15();
                break;
            case 1:
                GiftSheet giftSheet2 = this.f$0;
                Utilities.Callback callback2 = this.f$1;
                if (callback2 != null) {
                    giftSheet2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                giftSheet2.lambda$showGiftOfferSheet$15();
                break;
            default:
                GiftSheet giftSheet3 = this.f$0;
                Utilities.Callback callback3 = this.f$1;
                if (callback3 != null) {
                    giftSheet3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                giftSheet3.lambda$showGiftOfferSheet$15();
                break;
        }
    }
}
