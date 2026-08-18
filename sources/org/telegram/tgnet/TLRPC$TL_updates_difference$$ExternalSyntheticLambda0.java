package org.telegram.tgnet;

public final class TLRPC$TL_updates_difference$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.EncryptedMessage.TLdeserialize(inputSerializedData, i, z);
    }
}
