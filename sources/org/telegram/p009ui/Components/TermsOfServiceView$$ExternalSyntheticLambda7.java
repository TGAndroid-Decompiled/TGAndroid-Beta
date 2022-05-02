package org.telegram.p009ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class TermsOfServiceView$$ExternalSyntheticLambda7 implements RequestDelegate {
    public static final TermsOfServiceView$$ExternalSyntheticLambda7 INSTANCE = new TermsOfServiceView$$ExternalSyntheticLambda7();

    private TermsOfServiceView$$ExternalSyntheticLambda7() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TermsOfServiceView.lambda$accept$7(tLObject, tLRPC$TL_error);
    }
}
