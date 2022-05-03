package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class TranslateAlert$$ExternalSyntheticLambda8 implements RequestDelegate {
    public static final TranslateAlert$$ExternalSyntheticLambda8 INSTANCE = new TranslateAlert$$ExternalSyntheticLambda8();

    private TranslateAlert$$ExternalSyntheticLambda8() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TranslateAlert.lambda$translateText$9(tLObject, tLRPC$TL_error);
    }
}
