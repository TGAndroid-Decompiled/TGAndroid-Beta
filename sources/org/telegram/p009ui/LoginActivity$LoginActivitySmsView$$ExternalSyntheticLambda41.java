package org.telegram.p009ui;

import org.telegram.p009ui.LoginActivity;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda41 implements RequestDelegate {
    public static final LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda41 INSTANCE = new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda41();

    private LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda41() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        LoginActivity.LoginActivitySmsView.lambda$onBackPressed$40(tLObject, tLRPC$TL_error);
    }
}
