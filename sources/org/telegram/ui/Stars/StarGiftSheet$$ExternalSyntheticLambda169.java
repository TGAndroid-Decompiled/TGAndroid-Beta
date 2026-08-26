package org.telegram.ui.Stars;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda464;
import org.telegram.ui.Components.ButtonSpan;

public final class StarGiftSheet$$ExternalSyntheticLambda169 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity$$ExternalSyntheticLambda464 f$0;
    public final ButtonSpan.TextViewButtons[] f$1;
    public final TL_stars.UniqueStarGiftValueInfo f$2;
    public final String f$3;

    public StarGiftSheet$$ExternalSyntheticLambda169(ChatActivity$$ExternalSyntheticLambda464 chatActivity$$ExternalSyntheticLambda464, ButtonSpan.TextViewButtons[] textViewButtonsArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity$$ExternalSyntheticLambda464;
        this.f$1 = textViewButtonsArr;
        this.f$2 = uniqueStarGiftValueInfo;
        this.f$3 = str;
    }

    @Override
    public final void run() {
        ChatActivity$$ExternalSyntheticLambda464 chatActivity$$ExternalSyntheticLambda464 = this.f$0;
        String str = this.f$3;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.f$2;
        ButtonSpan.TextViewButtons[] textViewButtonsArr = this.f$1;
        switch (this.$r8$classId) {
            case 0:
                chatActivity$$ExternalSyntheticLambda464.run(textViewButtonsArr[0], LocaleController.formatString(R.string.GiftValueMinPriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                break;
            default:
                chatActivity$$ExternalSyntheticLambda464.run(textViewButtonsArr[0], LocaleController.formatString(R.string.GiftValueAveragePriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                break;
        }
    }
}
