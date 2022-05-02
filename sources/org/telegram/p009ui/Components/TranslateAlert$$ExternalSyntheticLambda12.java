package org.telegram.p009ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class TranslateAlert$$ExternalSyntheticLambda12 implements RequestDelegate {
    public static final TranslateAlert$$ExternalSyntheticLambda12 INSTANCE = new TranslateAlert$$ExternalSyntheticLambda12();

    private TranslateAlert$$ExternalSyntheticLambda12() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TranslateAlert.lambda$translateText$13(tLObject, tLRPC$TL_error);
    }
}
