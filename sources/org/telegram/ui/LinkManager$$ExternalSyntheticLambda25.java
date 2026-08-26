package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda3;

public final class LinkManager$$ExternalSyntheticLambda25 implements PaymentFormActivity.PaymentFormCallback {
    public final int $r8$classId;
    public final SendGiftSheet$$ExternalSyntheticLambda3 f$0;

    public LinkManager$$ExternalSyntheticLambda25(SendGiftSheet$$ExternalSyntheticLambda3 sendGiftSheet$$ExternalSyntheticLambda3, int i) {
        this.$r8$classId = i;
        this.f$0 = sendGiftSheet$$ExternalSyntheticLambda3;
    }

    @Override
    public final void onInvoiceStatusChanged(int i) {
        SendGiftSheet$$ExternalSyntheticLambda3 sendGiftSheet$$ExternalSyntheticLambda3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                if (i == 1) {
                    sendGiftSheet$$ExternalSyntheticLambda3.run();
                }
                break;
            default:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                if (i == 1) {
                    sendGiftSheet$$ExternalSyntheticLambda3.run();
                }
                break;
        }
    }
}
