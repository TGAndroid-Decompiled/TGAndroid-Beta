package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.ui.SessionsActivity;
public final class SessionsActivity$5$$ExternalSyntheticLambda1 implements RequestDelegate {
    public static final SessionsActivity$5$$ExternalSyntheticLambda1 INSTANCE = new SessionsActivity$5$$ExternalSyntheticLambda1();

    private SessionsActivity$5$$ExternalSyntheticLambda1() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        SessionsActivity.AnonymousClass5.lambda$onSessionTerminated$1(tLObject, tLRPC$TL_error);
    }
}
