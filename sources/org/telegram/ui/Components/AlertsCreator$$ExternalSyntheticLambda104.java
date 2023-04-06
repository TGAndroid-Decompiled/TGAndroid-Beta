package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class AlertsCreator$$ExternalSyntheticLambda104 implements RequestDelegate {
    public static final AlertsCreator$$ExternalSyntheticLambda104 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda104();

    private AlertsCreator$$ExternalSyntheticLambda104() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AlertsCreator.lambda$createDeleteMessagesAlert$127(tLObject, tLRPC$TL_error);
    }
}
