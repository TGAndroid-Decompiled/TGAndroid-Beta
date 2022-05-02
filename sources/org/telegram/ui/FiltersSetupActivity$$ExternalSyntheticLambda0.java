package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class FiltersSetupActivity$$ExternalSyntheticLambda0 implements RequestDelegate {
    public static final FiltersSetupActivity$$ExternalSyntheticLambda0 INSTANCE = new FiltersSetupActivity$$ExternalSyntheticLambda0();

    private FiltersSetupActivity$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        FiltersSetupActivity.lambda$onFragmentDestroy$0(tLObject, tLRPC$TL_error);
    }
}
