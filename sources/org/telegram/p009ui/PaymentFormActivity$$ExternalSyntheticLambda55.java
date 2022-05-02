package org.telegram.p009ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class PaymentFormActivity$$ExternalSyntheticLambda55 implements RequestDelegate {
    public static final PaymentFormActivity$$ExternalSyntheticLambda55 INSTANCE = new PaymentFormActivity$$ExternalSyntheticLambda55();

    private PaymentFormActivity$$ExternalSyntheticLambda55() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PaymentFormActivity.lambda$createView$25(tLObject, tLRPC$TL_error);
    }
}
