package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class PrivacySettingsActivity$$ExternalSyntheticLambda14 implements RequestDelegate {
    public static final PrivacySettingsActivity$$ExternalSyntheticLambda14 INSTANCE = new PrivacySettingsActivity$$ExternalSyntheticLambda14();

    private PrivacySettingsActivity$$ExternalSyntheticLambda14() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PrivacySettingsActivity.lambda$onFragmentDestroy$1(tLObject, tLRPC$TL_error);
    }
}
