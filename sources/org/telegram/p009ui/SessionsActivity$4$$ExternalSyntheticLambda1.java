package org.telegram.p009ui;

import org.telegram.p009ui.SessionsActivity;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class SessionsActivity$4$$ExternalSyntheticLambda1 implements RequestDelegate {
    public static final SessionsActivity$4$$ExternalSyntheticLambda1 INSTANCE = new SessionsActivity$4$$ExternalSyntheticLambda1();

    private SessionsActivity$4$$ExternalSyntheticLambda1() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        SessionsActivity.C34974.lambda$onSessionTerminated$1(tLObject, tLRPC$TL_error);
    }
}
