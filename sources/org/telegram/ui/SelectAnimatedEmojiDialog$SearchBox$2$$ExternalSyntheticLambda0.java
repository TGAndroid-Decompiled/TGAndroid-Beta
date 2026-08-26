package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Gifts.AuctionBidSheet;

public final class SelectAnimatedEmojiDialog$SearchBox$2$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final AuctionBidSheet.AnonymousClass4 f$0;

    public SelectAnimatedEmojiDialog$SearchBox$2$$ExternalSyntheticLambda0(AuctionBidSheet.AnonymousClass4 anonymousClass4, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass4;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.showKeyboard(((SelectAnimatedEmojiDialog.AnonymousClass18) this.f$0.val$drawable).input);
                break;
            default:
                this.f$0.lambda$onTouchEvent$0();
                break;
        }
    }
}
