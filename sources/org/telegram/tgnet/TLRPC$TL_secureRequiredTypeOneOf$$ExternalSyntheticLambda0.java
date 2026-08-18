package org.telegram.tgnet;

public final class TLRPC$TL_secureRequiredTypeOneOf$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.SecureRequiredType.TLdeserialize(inputSerializedData, i, z);
    }
}
