package org.telegram.tgnet;

public final class TLRPC$TL_messages_archivedStickers$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.StickerSetCovered.TLdeserialize(inputSerializedData, i, z);
    }
}
