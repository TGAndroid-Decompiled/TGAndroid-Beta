package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class SessionsActivity$$ExternalSyntheticLambda17 implements RequestDelegate {
    public static final SessionsActivity$$ExternalSyntheticLambda17 INSTANCE = new SessionsActivity$$ExternalSyntheticLambda17();

    private SessionsActivity$$ExternalSyntheticLambda17() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        SessionsActivity.lambda$createView$0(tLObject, tLRPC$TL_error);
    }
}
