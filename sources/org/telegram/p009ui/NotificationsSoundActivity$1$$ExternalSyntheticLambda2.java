package org.telegram.p009ui;

import org.telegram.p009ui.NotificationsSoundActivity;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class NotificationsSoundActivity$1$$ExternalSyntheticLambda2 implements RequestDelegate {
    public static final NotificationsSoundActivity$1$$ExternalSyntheticLambda2 INSTANCE = new NotificationsSoundActivity$1$$ExternalSyntheticLambda2();

    private NotificationsSoundActivity$1$$ExternalSyntheticLambda2() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        NotificationsSoundActivity.C31571.lambda$deleteSelectedMessages$2(tLObject, tLRPC$TL_error);
    }
}
