package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class ChangeNameActivity$$ExternalSyntheticLambda4 implements RequestDelegate {
    public static final ChangeNameActivity$$ExternalSyntheticLambda4 INSTANCE = new ChangeNameActivity$$ExternalSyntheticLambda4();

    private ChangeNameActivity$$ExternalSyntheticLambda4() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ChangeNameActivity.lambda$saveName$3(tLObject, tLRPC$TL_error);
    }
}
