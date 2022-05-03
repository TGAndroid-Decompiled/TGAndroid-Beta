package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class PaymentFormActivity$$ExternalSyntheticLambda56 implements RequestDelegate {
    public static final PaymentFormActivity$$ExternalSyntheticLambda56 INSTANCE = new PaymentFormActivity$$ExternalSyntheticLambda56();

    private PaymentFormActivity$$ExternalSyntheticLambda56() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PaymentFormActivity.lambda$sendForm$46(tLObject, tLRPC$TL_error);
    }
}
