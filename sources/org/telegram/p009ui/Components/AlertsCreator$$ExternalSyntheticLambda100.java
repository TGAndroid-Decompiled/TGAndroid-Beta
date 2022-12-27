package org.telegram.p009ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class AlertsCreator$$ExternalSyntheticLambda100 implements RequestDelegate {
    public static final AlertsCreator$$ExternalSyntheticLambda100 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda100();

    private AlertsCreator$$ExternalSyntheticLambda100() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AlertsCreator.lambda$createDeleteMessagesAlert$123(tLObject, tLRPC$TL_error);
    }
}
