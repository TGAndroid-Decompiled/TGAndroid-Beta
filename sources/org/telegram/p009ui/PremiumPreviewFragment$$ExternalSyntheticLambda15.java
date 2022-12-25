package org.telegram.p009ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class PremiumPreviewFragment$$ExternalSyntheticLambda15 implements RequestDelegate {
    public static final PremiumPreviewFragment$$ExternalSyntheticLambda15 INSTANCE = new PremiumPreviewFragment$$ExternalSyntheticLambda15();

    private PremiumPreviewFragment$$ExternalSyntheticLambda15() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PremiumPreviewFragment.lambda$sentPremiumBuyCanceled$16(tLObject, tLRPC$TL_error);
    }
}
