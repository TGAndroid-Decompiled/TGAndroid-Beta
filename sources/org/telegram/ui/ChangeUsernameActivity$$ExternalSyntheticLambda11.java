package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class ChangeUsernameActivity$$ExternalSyntheticLambda11 implements RequestDelegate {
    public static final ChangeUsernameActivity$$ExternalSyntheticLambda11 INSTANCE = new ChangeUsernameActivity$$ExternalSyntheticLambda11();

    private ChangeUsernameActivity$$ExternalSyntheticLambda11() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ChangeUsernameActivity.lambda$sendReorder$2(tLObject, tLRPC$TL_error);
    }
}
