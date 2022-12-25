package org.telegram.p009ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class PaymentFormActivity$$ExternalSyntheticLambda64 implements RequestDelegate {
    public static final PaymentFormActivity$$ExternalSyntheticLambda64 INSTANCE = new PaymentFormActivity$$ExternalSyntheticLambda64();

    private PaymentFormActivity$$ExternalSyntheticLambda64() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PaymentFormActivity.lambda$createView$26(tLObject, tLRPC$TL_error);
    }
}
