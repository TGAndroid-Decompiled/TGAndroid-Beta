package org.telegram.tgnet;

public final class TLRPC$TL_messages_botResults$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.BotInlineResult.TLdeserialize(inputSerializedData, i, z);
    }
}
