package org.telegram.p009ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class PrivacySettingsActivity$$ExternalSyntheticLambda18 implements RequestDelegate {
    public static final PrivacySettingsActivity$$ExternalSyntheticLambda18 INSTANCE = new PrivacySettingsActivity$$ExternalSyntheticLambda18();

    private PrivacySettingsActivity$$ExternalSyntheticLambda18() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PrivacySettingsActivity.lambda$createView$14(tLObject, tLRPC$TL_error);
    }
}
