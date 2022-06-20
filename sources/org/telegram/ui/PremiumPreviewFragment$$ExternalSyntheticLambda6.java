package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class PremiumPreviewFragment$$ExternalSyntheticLambda6 implements RequestDelegate {
    public static final PremiumPreviewFragment$$ExternalSyntheticLambda6 INSTANCE = new PremiumPreviewFragment$$ExternalSyntheticLambda6();

    private PremiumPreviewFragment$$ExternalSyntheticLambda6() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PremiumPreviewFragment.lambda$sentShowFeaturePreview$10(tLObject, tLRPC$TL_error);
    }
}
