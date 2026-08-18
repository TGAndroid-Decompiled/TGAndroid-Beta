package org.telegram.tgnet;

public final class TLRPC$TL_messageReactions$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.ReactionCount.TLdeserialize(inputSerializedData, i, z);
    }
}
