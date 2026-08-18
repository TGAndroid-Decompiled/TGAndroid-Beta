package org.telegram.tgnet;

public final class TLRPC$TL_messages_favedStickers$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.TL_stickerPack.TLdeserialize(inputSerializedData, i, z);
    }
}
