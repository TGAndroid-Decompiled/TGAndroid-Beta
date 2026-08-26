package org.telegram.ui.Gifts;

public final class ProfileGiftsContainer$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final ProfileGiftsContainer.Page f$0;
    public final int f$1;

    public ProfileGiftsContainer$$ExternalSyntheticLambda7(ProfileGiftsContainer.Page page, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = page;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                scrollBy(0, this.f$1);
                break;
            default:
                ProfileGiftsContainer.Page.AnonymousClass1 anonymousClass1 = this.f$0.listView;
                if (anonymousClass1 != null) {
                    anonymousClass1.setSpanCount(this.f$1);
                }
                break;
        }
    }
}
