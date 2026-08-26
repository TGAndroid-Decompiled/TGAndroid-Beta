package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda3;

public final class LinkManager$$ExternalSyntheticLambda24 implements Utilities.Callback {
    public final int $r8$classId;
    public final SendGiftSheet$$ExternalSyntheticLambda3 f$0;

    public LinkManager$$ExternalSyntheticLambda24(SendGiftSheet$$ExternalSyntheticLambda3 sendGiftSheet$$ExternalSyntheticLambda3, int i) {
        this.$r8$classId = i;
        this.f$0 = sendGiftSheet$$ExternalSyntheticLambda3;
    }

    @Override
    public final void run(Object obj) {
        SendGiftSheet$$ExternalSyntheticLambda3 sendGiftSheet$$ExternalSyntheticLambda3 = this.f$0;
        String str = (String) obj;
        switch (this.$r8$classId) {
            case 0:
                if (sendGiftSheet$$ExternalSyntheticLambda3 != null && "paid".equals(str)) {
                    sendGiftSheet$$ExternalSyntheticLambda3.run();
                    break;
                }
                break;
            default:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                if (sendGiftSheet$$ExternalSyntheticLambda3 != null && "paid".equals(str)) {
                    sendGiftSheet$$ExternalSyntheticLambda3.run();
                    break;
                }
                break;
        }
    }
}
