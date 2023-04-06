package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.ui.NotificationsSoundActivity;
public final class NotificationsSoundActivity$1$$ExternalSyntheticLambda2 implements RequestDelegate {
    public static final NotificationsSoundActivity$1$$ExternalSyntheticLambda2 INSTANCE = new NotificationsSoundActivity$1$$ExternalSyntheticLambda2();

    private NotificationsSoundActivity$1$$ExternalSyntheticLambda2() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        NotificationsSoundActivity.AnonymousClass1.lambda$deleteSelectedMessages$2(tLObject, tLRPC$TL_error);
    }
}
