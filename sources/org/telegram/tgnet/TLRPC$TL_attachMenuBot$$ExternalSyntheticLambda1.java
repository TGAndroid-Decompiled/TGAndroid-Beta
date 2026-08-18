package org.telegram.tgnet;

public final class TLRPC$TL_attachMenuBot$$ExternalSyntheticLambda1 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.TL_attachMenuBotIcon.TLdeserialize(inputSerializedData, i, z);
    }
}
