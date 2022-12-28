package org.telegram.p009ui;

import org.telegram.p009ui.TopicCreateFragment;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class TopicCreateFragment$1$$ExternalSyntheticLambda3 implements RequestDelegate {
    public static final TopicCreateFragment$1$$ExternalSyntheticLambda3 INSTANCE = new TopicCreateFragment$1$$ExternalSyntheticLambda3();

    private TopicCreateFragment$1$$ExternalSyntheticLambda3() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TopicCreateFragment.C41781.lambda$onItemClick$2(tLObject, tLRPC$TL_error);
    }
}
