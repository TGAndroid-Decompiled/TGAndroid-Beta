package org.telegram.tgnet;

public final class TLRPC$TL_messages_channelMessages$$ExternalSyntheticLambda1 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.TL_forumTopic.TLdeserialize(inputSerializedData, i, z);
    }
}
