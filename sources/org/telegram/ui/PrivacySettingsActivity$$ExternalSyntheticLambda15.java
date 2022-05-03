package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class PrivacySettingsActivity$$ExternalSyntheticLambda15 implements RequestDelegate {
    public static final PrivacySettingsActivity$$ExternalSyntheticLambda15 INSTANCE = new PrivacySettingsActivity$$ExternalSyntheticLambda15();

    private PrivacySettingsActivity$$ExternalSyntheticLambda15() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PrivacySettingsActivity.lambda$createView$12(tLObject, tLRPC$TL_error);
    }
}
