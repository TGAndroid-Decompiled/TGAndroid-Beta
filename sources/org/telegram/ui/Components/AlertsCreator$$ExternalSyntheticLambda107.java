package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class AlertsCreator$$ExternalSyntheticLambda107 implements RequestDelegate {
    public static final AlertsCreator$$ExternalSyntheticLambda107 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda107();

    private AlertsCreator$$ExternalSyntheticLambda107() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AlertsCreator.lambda$sendReport$100(tLObject, tLRPC$TL_error);
    }
}
