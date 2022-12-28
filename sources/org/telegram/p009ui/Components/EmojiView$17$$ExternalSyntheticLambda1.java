package org.telegram.p009ui.Components;

import org.telegram.p009ui.Components.EmojiView;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class EmojiView$17$$ExternalSyntheticLambda1 implements RequestDelegate {
    public static final EmojiView$17$$ExternalSyntheticLambda1 INSTANCE = new EmojiView$17$$ExternalSyntheticLambda1();

    private EmojiView$17$$ExternalSyntheticLambda1() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        EmojiView.C224117.lambda$sendReorder$1(tLObject, tLRPC$TL_error);
    }
}
