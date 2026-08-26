package org.telegram.ui.Gifts;

public final class SendGiftSheet$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final SendGiftSheet f$0;

    public SendGiftSheet$$ExternalSyntheticLambda3(SendGiftSheet sendGiftSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = sendGiftSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$fillItems$15();
                break;
            case 1:
                this.f$0.onGiftSuccess(false);
                break;
            case 2:
                this.f$0.onGiftSuccess(true);
                break;
            case 3:
                this.f$0.lambda$fillItems$16();
                break;
            case 4:
                this.f$0.lambda$fillItems$17();
                break;
            default:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
        }
    }
}
