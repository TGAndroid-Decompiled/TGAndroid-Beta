package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class AlertsCreator$$ExternalSyntheticLambda112 implements RequestDelegate {
    public static final AlertsCreator$$ExternalSyntheticLambda112 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda112();

    private AlertsCreator$$ExternalSyntheticLambda112() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AlertsCreator.lambda$createChangeNameAlert$42(tLObject, tLRPC$TL_error);
    }
}