package org.telegram.p009ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class AlertsCreator$$ExternalSyntheticLambda102 implements RequestDelegate {
    public static final AlertsCreator$$ExternalSyntheticLambda102 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda102();

    private AlertsCreator$$ExternalSyntheticLambda102() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AlertsCreator.lambda$createDeleteMessagesAlert$125(tLObject, tLRPC$TL_error);
    }
}
