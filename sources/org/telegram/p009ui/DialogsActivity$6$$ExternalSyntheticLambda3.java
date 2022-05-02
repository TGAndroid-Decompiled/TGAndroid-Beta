package org.telegram.p009ui;

import org.telegram.p009ui.DialogsActivity;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class DialogsActivity$6$$ExternalSyntheticLambda3 implements RequestDelegate {
    public static final DialogsActivity$6$$ExternalSyntheticLambda3 INSTANCE = new DialogsActivity$6$$ExternalSyntheticLambda3();

    private DialogsActivity$6$$ExternalSyntheticLambda3() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        DialogsActivity.C27896.lambda$showDeleteAlert$1(tLObject, tLRPC$TL_error);
    }
}
