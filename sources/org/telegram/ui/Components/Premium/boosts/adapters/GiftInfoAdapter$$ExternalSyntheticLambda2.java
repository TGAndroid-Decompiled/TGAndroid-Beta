package org.telegram.ui.Components.Premium.boosts.adapters;

import org.telegram.messenger.TelegramMediaSession$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.DialogsActivity;

public final class GiftInfoAdapter$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final GiftInfoAdapter f$0;

    public GiftInfoAdapter$$ExternalSyntheticLambda2(GiftInfoAdapter giftInfoAdapter, int i) {
        this.$r8$classId = i;
        this.f$0 = giftInfoAdapter;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                GiftInfoAdapter giftInfoAdapter = this.f$0;
                String str = "https://t.me/giftcode/" + giftInfoAdapter.slug;
                DialogsActivity dialogsActivity = new DialogsActivity(TelegramMediaSession$$ExternalSyntheticOutline0.m(3, "onlySelect", "dialogsType", true));
                dialogsActivity.delegate = new RateCallLayout$$ExternalSyntheticLambda1(15, giftInfoAdapter, str);
                giftInfoAdapter.baseFragment.presentFragment(dialogsActivity);
                GiftInfoBottomSheet.this.lambda$showGiftOfferSheet$15();
                break;
            default:
                this.f$0.onHiddenLinkClicked();
                break;
        }
    }
}
