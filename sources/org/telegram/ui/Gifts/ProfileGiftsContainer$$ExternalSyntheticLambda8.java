package org.telegram.ui.Gifts;

public final class ProfileGiftsContainer$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final ProfileGiftsContainer f$0;

    public ProfileGiftsContainer$$ExternalSyntheticLambda8(ProfileGiftsContainer profileGiftsContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = profileGiftsContainer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.addGifts();
                break;
            case 1:
                this.f$0.lambda$new$5();
                break;
            case 2:
                this.f$0.lambda$new$12$1();
                break;
            default:
                this.f$0.updateTabsY();
                break;
        }
    }
}
