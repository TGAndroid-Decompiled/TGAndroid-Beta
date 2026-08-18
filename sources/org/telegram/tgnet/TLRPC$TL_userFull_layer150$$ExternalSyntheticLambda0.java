package org.telegram.tgnet;

public final class TLRPC$TL_userFull_layer150$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.TL_premiumGiftOption.TLdeserialize(inputSerializedData, i, z);
    }
}
