package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class PremiumPreviewFragment$$ExternalSyntheticLambda9 implements RequestDelegate {
    public static final PremiumPreviewFragment$$ExternalSyntheticLambda9 INSTANCE = new PremiumPreviewFragment$$ExternalSyntheticLambda9();

    private PremiumPreviewFragment$$ExternalSyntheticLambda9() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PremiumPreviewFragment.lambda$sentPremiumBuyCanceled$9(tLObject, tLRPC$TL_error);
    }
}
