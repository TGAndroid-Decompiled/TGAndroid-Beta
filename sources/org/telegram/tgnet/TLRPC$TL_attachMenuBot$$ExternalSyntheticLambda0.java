package org.telegram.tgnet;

public final class TLRPC$TL_attachMenuBot$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.AttachMenuPeerType.TLdeserialize(inputSerializedData, i, z);
    }
}
