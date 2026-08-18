package org.telegram.tgnet;

public final class TLRPC$TL_messageReactions$$ExternalSyntheticLambda1 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.MessagePeerReaction.TLdeserialize(inputSerializedData, i, z);
    }
}
