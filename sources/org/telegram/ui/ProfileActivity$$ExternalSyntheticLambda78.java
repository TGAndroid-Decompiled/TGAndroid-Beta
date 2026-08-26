package org.telegram.ui;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftSentBottomSheet;

public final class ProfileActivity$$ExternalSyntheticLambda78 implements Runnable {
    public final int $r8$classId;
    public final TLRPC.User f$0;

    public ProfileActivity$$ExternalSyntheticLambda78(int i, TLRPC.User user) {
        this.$r8$classId = i;
        this.f$0 = user;
    }

    @Override
    public final void run() {
        TLRPC.User user = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername(user));
                break;
            case 1:
                PremiumPreviewGiftSentBottomSheet.show(new ArrayList(Arrays.asList(user)));
                break;
            case 2:
                PremiumPreviewGiftSentBottomSheet.show(new ArrayList(Arrays.asList(user)));
                break;
            default:
                PremiumPreviewGiftSentBottomSheet.show(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
