package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class SessionsActivity$$ExternalSyntheticLambda19 implements RequestDelegate {
    public static final SessionsActivity$$ExternalSyntheticLambda19 INSTANCE = new SessionsActivity$$ExternalSyntheticLambda19();

    private SessionsActivity$$ExternalSyntheticLambda19() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        SessionsActivity.lambda$createView$0(tLObject, tLRPC$TL_error);
    }
}
