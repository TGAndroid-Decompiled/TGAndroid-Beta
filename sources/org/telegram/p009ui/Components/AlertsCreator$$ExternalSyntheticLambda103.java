package org.telegram.p009ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class AlertsCreator$$ExternalSyntheticLambda103 implements RequestDelegate {
    public static final AlertsCreator$$ExternalSyntheticLambda103 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda103();

    private AlertsCreator$$ExternalSyntheticLambda103() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AlertsCreator.lambda$createChangeNameAlert$34(tLObject, tLRPC$TL_error);
    }
}
