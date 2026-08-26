package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Gifts.GiftMessageBottomSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda189;

public final class PeerColorActivity$$ExternalSyntheticLambda9 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final Object f$1;
    public final TL_stars.TL_starGiftUnique f$2;
    public final long f$3;
    public final Object f$4;

    public PeerColorActivity$$ExternalSyntheticLambda9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
        this.f$1 = obj;
        this.f$2 = tL_starGiftUnique;
        this.f$3 = j;
        this.f$4 = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((PeerColorActivity) this.f$0).lambda$buy$7((boolean[]) this.f$1, this.f$2, this.f$3, (OAuthSheet$$ExternalSyntheticLambda13) this.f$4, (StarGiftSheet.PaymentFormState) obj, (Browser.Progress) obj2);
                break;
            default:
                StarGiftSheet starGiftSheet = (StarGiftSheet) this.f$0;
                starGiftSheet.getClass();
                ((Browser.Progress) this.f$1).end();
                if (((Boolean) obj).booleanValue()) {
                    StarGiftSheet.BoughtGiftCallback boughtGiftCallback = starGiftSheet.boughtGift;
                    GiftMessageBottomSheet giftMessageBottomSheet = (GiftMessageBottomSheet) this.f$4;
                    if (boughtGiftCallback != null) {
                        boughtGiftCallback.onBoughtGift(this.f$2, this.f$3, giftMessageBottomSheet != null);
                    }
                    if (giftMessageBottomSheet != null) {
                        AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda189(giftMessageBottomSheet, 0));
                        starGiftSheet.skipDismissAnimation();
                    }
                    starGiftSheet.lambda$showGiftOfferSheet$15();
                }
                break;
        }
    }
}
