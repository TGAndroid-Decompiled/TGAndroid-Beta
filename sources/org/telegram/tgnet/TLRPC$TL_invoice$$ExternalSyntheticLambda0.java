package org.telegram.tgnet;

public final class TLRPC$TL_invoice$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.TL_labeledPrice.TLdeserialize(inputSerializedData, i, z);
    }
}
