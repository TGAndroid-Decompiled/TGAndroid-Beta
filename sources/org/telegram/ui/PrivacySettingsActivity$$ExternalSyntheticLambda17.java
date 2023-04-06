package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class PrivacySettingsActivity$$ExternalSyntheticLambda17 implements RequestDelegate {
    public static final PrivacySettingsActivity$$ExternalSyntheticLambda17 INSTANCE = new PrivacySettingsActivity$$ExternalSyntheticLambda17();

    private PrivacySettingsActivity$$ExternalSyntheticLambda17() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PrivacySettingsActivity.lambda$onFragmentDestroy$2(tLObject, tLRPC$TL_error);
    }
}
