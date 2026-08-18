package org.telegram.tgnet;

public final class TLRPC$TL_messages_quickReplies$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.TL_quickReply.TLdeserialize(inputSerializedData, i, z);
    }
}
