package org.telegram.p009ui;

import org.telegram.p009ui.GroupCallActivity;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class GroupCallActivity$6$$ExternalSyntheticLambda9 implements RequestDelegate {
    public static final GroupCallActivity$6$$ExternalSyntheticLambda9 INSTANCE = new GroupCallActivity$6$$ExternalSyntheticLambda9();

    private GroupCallActivity$6$$ExternalSyntheticLambda9() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        GroupCallActivity.C28966.lambda$onItemClick$8(tLObject, tLRPC$TL_error);
    }
}
