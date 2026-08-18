package org.telegram.tgnet;

public final class TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.User.TLdeserialize(inputSerializedData, i, z);
    }
}
