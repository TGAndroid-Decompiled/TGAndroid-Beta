package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class TwoStepVerificationSetupActivity$$ExternalSyntheticLambda51 implements RequestDelegate {
    public static final TwoStepVerificationSetupActivity$$ExternalSyntheticLambda51 INSTANCE = new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda51();

    private TwoStepVerificationSetupActivity$$ExternalSyntheticLambda51() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TwoStepVerificationSetupActivity.lambda$createView$19(tLObject, tLRPC$TL_error);
    }
}
