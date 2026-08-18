package org.telegram.tgnet;

public final class TLRPC$TL_messageMediaPaidMedia$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.MessageExtendedMedia.TLdeserialize(inputSerializedData, i, z);
    }
}
