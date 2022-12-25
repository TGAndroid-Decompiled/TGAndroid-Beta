package org.telegram.p009ui;

import org.telegram.p009ui.DialogsActivity;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class DialogsActivity$31$$ExternalSyntheticLambda0 implements RequestDelegate {
    public static final DialogsActivity$31$$ExternalSyntheticLambda0 INSTANCE = new DialogsActivity$31$$ExternalSyntheticLambda0();

    private DialogsActivity$31$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        DialogsActivity.C319431.lambda$onEmojiSelected$0(tLObject, tLRPC$TL_error);
    }
}
