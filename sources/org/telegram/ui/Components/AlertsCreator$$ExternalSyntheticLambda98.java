package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class AlertsCreator$$ExternalSyntheticLambda98 implements RequestDelegate {
    public static final AlertsCreator$$ExternalSyntheticLambda98 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda98();

    private AlertsCreator$$ExternalSyntheticLambda98() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AlertsCreator.lambda$createChangeBioAlert$29(tLObject, tLRPC$TL_error);
    }
}
