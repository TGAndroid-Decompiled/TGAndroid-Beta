package org.telegram.tgnet;

public final class TLRPC$TL_inputPrivacyValueAllowUsers$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.InputUser.TLdeserialize(inputSerializedData, i, z);
    }
}
