package org.telegram.tgnet;

public final class TLRPC$TL_messages_channelMessages$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.Message.TLdeserialize(inputSerializedData, i, z);
    }
}
