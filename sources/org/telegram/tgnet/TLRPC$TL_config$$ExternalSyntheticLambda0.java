package org.telegram.tgnet;

public final class TLRPC$TL_config$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.TL_dcOption.TLdeserialize(inputSerializedData, i, z);
    }
}
