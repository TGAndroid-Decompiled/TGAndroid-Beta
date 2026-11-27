package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_keyboard;
public final class a implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        TLObject TLdeserializeLegacy;
        int i2 = TL_keyboard.TL_keyboardInlineButtonRow_layer228.constructor;
        TLdeserializeLegacy = TL_keyboard.TLdeserializeLegacy(inputSerializedData, i, z);
        return TLdeserializeLegacy;
    }
}
