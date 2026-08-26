package org.telegram.ui.Gifts;

public final class GiftSheet$GiftCell$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final GiftSheet.GiftCell f$0;
    public final boolean f$1;

    public GiftSheet$GiftCell$$ExternalSyntheticLambda0(GiftSheet.GiftCell giftCell, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = giftCell;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                GiftSheet.GiftCell giftCell = this.f$0;
                if (!this.f$1) {
                    giftCell.pinView.setVisibility(8);
                } else {
                    giftCell.getClass();
                }
                break;
            default:
                GiftSheet.GiftCell giftCell2 = this.f$0;
                if (!this.f$1) {
                    giftCell2.pinnedView.setVisibility(8);
                } else {
                    giftCell2.getClass();
                }
                break;
        }
    }
}
