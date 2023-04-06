package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class NotificationsSettingsActivity$$ExternalSyntheticLambda8 implements RequestDelegate {
    public static final NotificationsSettingsActivity$$ExternalSyntheticLambda8 INSTANCE = new NotificationsSettingsActivity$$ExternalSyntheticLambda8();

    private NotificationsSettingsActivity$$ExternalSyntheticLambda8() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        NotificationsSettingsActivity.lambda$createView$5(tLObject, tLRPC$TL_error);
    }
}
