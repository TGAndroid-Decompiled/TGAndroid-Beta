package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.ui.PassportActivity;

public final class PassportActivity$PhoneConfirmationView$$ExternalSyntheticLambda10 implements RequestDelegate {
    public static final PassportActivity$PhoneConfirmationView$$ExternalSyntheticLambda10 INSTANCE = new PassportActivity$PhoneConfirmationView$$ExternalSyntheticLambda10();

    private PassportActivity$PhoneConfirmationView$$ExternalSyntheticLambda10() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PassportActivity.PhoneConfirmationView.lambda$onBackPressed$9(tLObject, tLRPC$TL_error);
    }
}
