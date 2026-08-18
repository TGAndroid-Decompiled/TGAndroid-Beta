package org.telegram.tgnet;

import org.telegram.tgnet.tl.TL_keyboard;

public final class TLRPC$TL_replyInlineMarkup$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TL_keyboard.KeyboardInlineButtonRow.TLdeserialize(inputSerializedData, i, z);
    }
}
