package org.telegram.p009ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class AlertsCreator$$ExternalSyntheticLambda99 implements RequestDelegate {
    public static final AlertsCreator$$ExternalSyntheticLambda99 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda99();

    private AlertsCreator$$ExternalSyntheticLambda99() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AlertsCreator.lambda$createDeleteMessagesAlert$117(tLObject, tLRPC$TL_error);
    }
}
