package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class AlertsCreator$$ExternalSyntheticLambda108 implements RequestDelegate {
    public static final AlertsCreator$$ExternalSyntheticLambda108 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda108();

    private AlertsCreator$$ExternalSyntheticLambda108() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AlertsCreator.lambda$createChangeBioAlert$38(tLObject, tLRPC$TL_error);
    }
}
