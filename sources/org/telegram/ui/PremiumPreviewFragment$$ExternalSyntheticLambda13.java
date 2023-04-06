package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class PremiumPreviewFragment$$ExternalSyntheticLambda13 implements RequestDelegate {
    public static final PremiumPreviewFragment$$ExternalSyntheticLambda13 INSTANCE = new PremiumPreviewFragment$$ExternalSyntheticLambda13();

    private PremiumPreviewFragment$$ExternalSyntheticLambda13() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PremiumPreviewFragment.lambda$sentPremiumButtonClick$15(tLObject, tLRPC$TL_error);
    }
}
