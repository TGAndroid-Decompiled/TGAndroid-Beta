package org.telegram.tgnet;

public final class TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.Chat.TLdeserialize(inputSerializedData, i, z);
    }
}
