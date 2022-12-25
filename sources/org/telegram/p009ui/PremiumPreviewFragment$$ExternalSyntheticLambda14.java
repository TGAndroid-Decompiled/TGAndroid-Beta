package org.telegram.p009ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class PremiumPreviewFragment$$ExternalSyntheticLambda14 implements RequestDelegate {
    public static final PremiumPreviewFragment$$ExternalSyntheticLambda14 INSTANCE = new PremiumPreviewFragment$$ExternalSyntheticLambda14();

    private PremiumPreviewFragment$$ExternalSyntheticLambda14() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PremiumPreviewFragment.lambda$sentShowFeaturePreview$17(tLObject, tLRPC$TL_error);
    }
}
