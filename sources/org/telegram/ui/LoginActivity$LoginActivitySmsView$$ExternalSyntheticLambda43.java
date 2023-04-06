package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.ui.LoginActivity;
public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda43 implements RequestDelegate {
    public static final LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda43 INSTANCE = new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda43();

    private LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda43() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        LoginActivity.LoginActivitySmsView.lambda$onBackPressed$42(tLObject, tLRPC$TL_error);
    }
}
