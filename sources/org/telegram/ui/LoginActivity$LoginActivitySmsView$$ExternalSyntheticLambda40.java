package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.ui.LoginActivity;

public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda40 implements RequestDelegate {
    public static final LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda40 INSTANCE = new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda40();

    private LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda40() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        LoginActivity.LoginActivitySmsView.lambda$onBackPressed$39(tLObject, tLRPC$TL_error);
    }
}
