package org.telegram.tgnet;

public final class TLRPC$TL_messages_preparedInlineMessage$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.InlineQueryPeerType.TLdeserialize(inputSerializedData, i, z);
    }
}
