package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.ui.Components.EmojiView;

public final class EmojiView$18$$ExternalSyntheticLambda0 implements RequestDelegate {
    public static final EmojiView$18$$ExternalSyntheticLambda0 INSTANCE = new EmojiView$18$$ExternalSyntheticLambda0();

    private EmojiView$18$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        EmojiView.AnonymousClass18.lambda$sendReorder$0(tLObject, tLRPC$TL_error);
    }
}
