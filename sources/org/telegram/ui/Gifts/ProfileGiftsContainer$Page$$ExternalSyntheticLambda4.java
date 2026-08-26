package org.telegram.ui.Gifts;

public final class ProfileGiftsContainer$Page$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final ProfileGiftsContainer.Page f$0;

    public ProfileGiftsContainer$Page$$ExternalSyntheticLambda4(ProfileGiftsContainer.Page page, int i) {
        this.$r8$classId = i;
        this.f$0 = page;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.update(false);
                break;
            case 1:
                this.f$0.lambda$onItemLongPress$14();
                break;
            case 2:
                this.f$0.lambda$onItemLongPress$15();
                break;
            default:
                this.f$0.lambda$onItemLongPress$19();
                break;
        }
    }
}
