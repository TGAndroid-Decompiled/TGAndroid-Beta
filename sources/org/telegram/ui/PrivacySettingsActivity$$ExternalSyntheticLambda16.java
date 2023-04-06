package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class PrivacySettingsActivity$$ExternalSyntheticLambda16 implements RequestDelegate {
    public static final PrivacySettingsActivity$$ExternalSyntheticLambda16 INSTANCE = new PrivacySettingsActivity$$ExternalSyntheticLambda16();

    private PrivacySettingsActivity$$ExternalSyntheticLambda16() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PrivacySettingsActivity.lambda$onFragmentDestroy$1(tLObject, tLRPC$TL_error);
    }
}
