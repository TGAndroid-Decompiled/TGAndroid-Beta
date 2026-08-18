package org.telegram.tgnet;

public final class TLRPC$TL_chatParticipants$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.ChatParticipant.TLdeserialize(inputSerializedData, i, z);
    }
}
