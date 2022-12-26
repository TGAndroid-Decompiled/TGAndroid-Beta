package org.telegram.p009ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class AlertsCreator$$ExternalSyntheticLambda101 implements RequestDelegate {
    public static final AlertsCreator$$ExternalSyntheticLambda101 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda101();

    private AlertsCreator$$ExternalSyntheticLambda101() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AlertsCreator.lambda$createDeleteMessagesAlert$124(tLObject, tLRPC$TL_error);
    }
}
