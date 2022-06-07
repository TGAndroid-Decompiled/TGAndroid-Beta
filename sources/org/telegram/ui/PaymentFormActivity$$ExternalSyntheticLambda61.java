package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class PaymentFormActivity$$ExternalSyntheticLambda61 implements RequestDelegate {
    public static final PaymentFormActivity$$ExternalSyntheticLambda61 INSTANCE = new PaymentFormActivity$$ExternalSyntheticLambda61();

    private PaymentFormActivity$$ExternalSyntheticLambda61() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PaymentFormActivity.lambda$createView$27(tLObject, tLRPC$TL_error);
    }
}
