package org.telegram.p009ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class TopicsNotifySettingsFragments$$ExternalSyntheticLambda0 implements RequestDelegate {
    public static final TopicsNotifySettingsFragments$$ExternalSyntheticLambda0 INSTANCE = new TopicsNotifySettingsFragments$$ExternalSyntheticLambda0();

    private TopicsNotifySettingsFragments$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TopicsNotifySettingsFragments.lambda$removeException$0(tLObject, tLRPC$TL_error);
    }
}
