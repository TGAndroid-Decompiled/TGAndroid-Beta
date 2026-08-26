package org.telegram.ui.Gifts;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftSentBottomSheet;

public final class SendGiftSheet$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId;
    public final TLRPC.User f$0;

    public SendGiftSheet$$ExternalSyntheticLambda15(TLRPC.User user, int i) {
        this.$r8$classId = i;
        this.f$0 = user;
    }

    @Override
    public final void run() {
        TLRPC.User user = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                PremiumPreviewGiftSentBottomSheet.show(new ArrayList(Arrays.asList(user)));
                break;
            case 1:
                PremiumPreviewGiftSentBottomSheet.show(new ArrayList(Arrays.asList(user)));
                break;
            default:
                PremiumPreviewGiftSentBottomSheet.show(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
