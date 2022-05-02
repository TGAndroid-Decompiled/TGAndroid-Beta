package org.telegram.p009ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class PassportActivity$$ExternalSyntheticLambda68 implements RequestDelegate {
    public static final PassportActivity$$ExternalSyntheticLambda68 INSTANCE = new PassportActivity$$ExternalSyntheticLambda68();

    private PassportActivity$$ExternalSyntheticLambda68() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PassportActivity.lambda$new$1(tLObject, tLRPC$TL_error);
    }
}
