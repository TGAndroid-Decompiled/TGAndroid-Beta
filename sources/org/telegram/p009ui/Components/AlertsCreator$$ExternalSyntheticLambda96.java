package org.telegram.p009ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class AlertsCreator$$ExternalSyntheticLambda96 implements RequestDelegate {
    public static final AlertsCreator$$ExternalSyntheticLambda96 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda96();

    private AlertsCreator$$ExternalSyntheticLambda96() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AlertsCreator.lambda$createReportAlert$85(tLObject, tLRPC$TL_error);
    }
}
