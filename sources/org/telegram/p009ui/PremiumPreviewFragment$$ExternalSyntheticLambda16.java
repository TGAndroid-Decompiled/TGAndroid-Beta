package org.telegram.p009ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class PremiumPreviewFragment$$ExternalSyntheticLambda16 implements RequestDelegate {
    public static final PremiumPreviewFragment$$ExternalSyntheticLambda16 INSTANCE = new PremiumPreviewFragment$$ExternalSyntheticLambda16();

    private PremiumPreviewFragment$$ExternalSyntheticLambda16() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PremiumPreviewFragment.lambda$sentShowScreenStat$14(tLObject, tLRPC$TL_error);
    }
}
