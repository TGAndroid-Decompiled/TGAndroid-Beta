package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$PhoneView$$ExternalSyntheticLambda25 implements RequestDelegate {
    public final int $r8$classId;
    public final LoginActivity.PhoneView f$0;

    public LoginActivity$PhoneView$$ExternalSyntheticLambda25(LoginActivity.PhoneView phoneView, int i) {
        this.$r8$classId = i;
        this.f$0 = phoneView;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$requestPasskey$28(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$loadCountries$15(tLObject, tL_error);
                break;
        }
    }
}
