package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.ui.DialogsActivity;

public final class DialogsActivity$6$$ExternalSyntheticLambda3 implements RequestDelegate {
    public static final DialogsActivity$6$$ExternalSyntheticLambda3 INSTANCE = new DialogsActivity$6$$ExternalSyntheticLambda3();

    private DialogsActivity$6$$ExternalSyntheticLambda3() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        DialogsActivity.AnonymousClass6.lambda$showDeleteAlert$1(tLObject, tLRPC$TL_error);
    }
}
