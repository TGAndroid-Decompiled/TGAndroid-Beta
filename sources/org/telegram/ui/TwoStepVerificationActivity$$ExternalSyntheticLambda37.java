package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class TwoStepVerificationActivity$$ExternalSyntheticLambda37 implements RequestDelegate {
    public static final TwoStepVerificationActivity$$ExternalSyntheticLambda37 INSTANCE = new TwoStepVerificationActivity$$ExternalSyntheticLambda37();

    private TwoStepVerificationActivity$$ExternalSyntheticLambda37() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TwoStepVerificationActivity.lambda$checkSecretValues$28(tLObject, tLRPC$TL_error);
    }
}
