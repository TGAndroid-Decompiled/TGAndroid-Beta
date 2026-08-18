package org.telegram.tgnet;

public final class Vector$$ExternalSyntheticLambda5 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return Vector.Int.TLDeserialize(inputSerializedData, i, z);
    }
}
