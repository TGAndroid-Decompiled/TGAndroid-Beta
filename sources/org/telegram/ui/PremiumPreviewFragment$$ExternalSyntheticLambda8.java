package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class PremiumPreviewFragment$$ExternalSyntheticLambda8 implements RequestDelegate {
    public static final PremiumPreviewFragment$$ExternalSyntheticLambda8 INSTANCE = new PremiumPreviewFragment$$ExternalSyntheticLambda8();

    private PremiumPreviewFragment$$ExternalSyntheticLambda8() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PremiumPreviewFragment.lambda$sentShowScreenStat$7(tLObject, tLRPC$TL_error);
    }
}
