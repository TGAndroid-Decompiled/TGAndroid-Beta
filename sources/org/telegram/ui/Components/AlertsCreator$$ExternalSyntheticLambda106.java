package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class AlertsCreator$$ExternalSyntheticLambda106 implements RequestDelegate {
    public static final AlertsCreator$$ExternalSyntheticLambda106 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda106();

    private AlertsCreator$$ExternalSyntheticLambda106() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AlertsCreator.lambda$createReportAlert$97(tLObject, tLRPC$TL_error);
    }
}
