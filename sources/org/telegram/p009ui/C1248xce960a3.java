package org.telegram.p009ui;

import org.telegram.p009ui.ChangePhoneActivity;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class C1248xce960a3 implements RequestDelegate {
    public static final C1248xce960a3 INSTANCE = new C1248xce960a3();

    private C1248xce960a3() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ChangePhoneActivity.LoginActivitySmsView.lambda$onBackPressed$9(tLObject, tLRPC$TL_error);
    }
}
