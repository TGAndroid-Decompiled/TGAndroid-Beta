package org.telegram.ui.Cells;

public final class SharedLinkCell$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final SharedLinkCell f$0;

    public SharedLinkCell$$ExternalSyntheticLambda0(SharedLinkCell sharedLinkCell, int i) {
        this.$r8$classId = i;
        this.f$0 = sharedLinkCell;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SharedLinkCell sharedLinkCell = this.f$0;
                sharedLinkCell.getClass();
                sharedLinkCell.post(new SharedLinkCell$$ExternalSyntheticLambda0(sharedLinkCell, 1));
                break;
            default:
                SharedLinkCell sharedLinkCell2 = this.f$0;
                sharedLinkCell2.message.isSpoilersRevealed = true;
                sharedLinkCell2.linkSpoilers.clear();
                sharedLinkCell2.descriptionLayoutSpoilers.clear();
                sharedLinkCell2.descriptionLayout2Spoilers.clear();
                sharedLinkCell2.invalidate();
                break;
        }
    }
}
