package org.telegram.ui.Stars;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Gifts.ResaleGiftsFragment;

public final class StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final BottomSheetWithRecyclerListView f$0;
    public final Object f$1;
    public final long f$2;

    public StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4(BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView, Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetWithRecyclerListView;
        this.f$1 = obj;
        this.f$2 = j;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                UItem uItem = (UItem) this.f$1;
                long j = this.f$2;
                ((StarsIntroActivity.GiftStarsSheet) this.f$0).lambda$onItemClick$4(uItem, j, (Boolean) obj, (String) obj2);
                break;
            default:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f$1;
                long j2 = this.f$2;
                ((ResaleGiftsFragment.SelectGiftSheet) this.f$0).lambda$buyGift$26(tL_starGiftUnique, j2, (StarGiftSheet.PaymentFormState) obj, (Browser.Progress) obj2);
                break;
        }
    }
}
