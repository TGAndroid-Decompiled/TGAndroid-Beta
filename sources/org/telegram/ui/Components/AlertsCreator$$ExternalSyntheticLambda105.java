package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class AlertsCreator$$ExternalSyntheticLambda105 implements RequestDelegate {
    public static final AlertsCreator$$ExternalSyntheticLambda105 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda105();

    private AlertsCreator$$ExternalSyntheticLambda105() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AlertsCreator.lambda$createChangeNameAlert$36(tLObject, tLRPC$TL_error);
    }
}
