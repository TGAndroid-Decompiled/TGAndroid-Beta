package org.telegram.p009ui;

import org.telegram.p009ui.LoginActivity;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda35 implements RequestDelegate {
    public static final LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda35 INSTANCE = new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda35();

    private LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda35() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        LoginActivity.LoginActivitySmsView.lambda$onBackPressed$34(tLObject, tLRPC$TL_error);
    }
}
