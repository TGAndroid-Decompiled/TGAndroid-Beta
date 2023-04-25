package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class AlertsCreator$$ExternalSyntheticLambda111 implements RequestDelegate {
    public static final AlertsCreator$$ExternalSyntheticLambda111 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda111();

    private AlertsCreator$$ExternalSyntheticLambda111() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AlertsCreator.lambda$sendReport$101(tLObject, tLRPC$TL_error);
    }
}
