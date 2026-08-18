package org.telegram.tgnet;

import org.telegram.tgnet.tl.TL_keyboard;

public final class TLRPC$TL_replyKeyboardMarkup$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TL_keyboard.KeyboardButtonRow.TLdeserialize(inputSerializedData, i, z);
    }
}
