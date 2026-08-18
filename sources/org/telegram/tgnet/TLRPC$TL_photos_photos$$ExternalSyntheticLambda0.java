package org.telegram.tgnet;

public final class TLRPC$TL_photos_photos$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.Photo.TLdeserialize(inputSerializedData, i, z);
    }
}
