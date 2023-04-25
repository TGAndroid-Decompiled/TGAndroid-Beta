package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class AlertsCreator$$ExternalSyntheticLambda110 implements RequestDelegate {
    public static final AlertsCreator$$ExternalSyntheticLambda110 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda110();

    private AlertsCreator$$ExternalSyntheticLambda110() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AlertsCreator.lambda$createDeleteMessagesAlert$133(tLObject, tLRPC$TL_error);
    }
}
