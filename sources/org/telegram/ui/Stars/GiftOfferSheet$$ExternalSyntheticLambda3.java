package org.telegram.ui.Stars;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;

public final class GiftOfferSheet$$ExternalSyntheticLambda3 implements MessagesStorage.IntCallback {
    public final int $r8$classId;
    public final Object f$0;

    public GiftOfferSheet$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(int i) {
        switch (this.$r8$classId) {
            case 0:
                GiftOfferSheet giftOfferSheet = (GiftOfferSheet) this.f$0;
                giftOfferSheet.getClass();
                giftOfferSheet.setAmount(AmountUtils$Amount.fromNano(0L, i == 0 ? AmountUtils$Currency.STARS : AmountUtils$Currency.TON), true, false, true);
                giftOfferSheet.starsCountEditField.setText("");
                break;
            case 1:
                MessageSuggestionOfferSheet messageSuggestionOfferSheet = (MessageSuggestionOfferSheet) this.f$0;
                messageSuggestionOfferSheet.getClass();
                messageSuggestionOfferSheet.setAmount$1(AmountUtils$Amount.fromNano(0L, i == 0 ? AmountUtils$Currency.STARS : AmountUtils$Currency.TON), true, false, true);
                messageSuggestionOfferSheet.starsCountEditField.setText("");
                break;
            default:
                StarGiftSheet.ResaleBuyTransferAlert resaleBuyTransferAlert = (StarGiftSheet.ResaleBuyTransferAlert) this.f$0;
                resaleBuyTransferAlert.getClass();
                resaleBuyTransferAlert.selectedCurrency = i == 0 ? AmountUtils$Currency.STARS : AmountUtils$Currency.TON;
                resaleBuyTransferAlert.onUpdateCurrency(true);
                break;
        }
    }
}
