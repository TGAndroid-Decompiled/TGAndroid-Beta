package org.telegram.p009ui;

import org.telegram.p009ui.PassportActivity;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class C3684x3891375b implements RequestDelegate {
    public static final C3684x3891375b INSTANCE = new C3684x3891375b();

    private C3684x3891375b() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PassportActivity.PhoneConfirmationView.lambda$onBackPressed$9(tLObject, tLRPC$TL_error);
    }
}
