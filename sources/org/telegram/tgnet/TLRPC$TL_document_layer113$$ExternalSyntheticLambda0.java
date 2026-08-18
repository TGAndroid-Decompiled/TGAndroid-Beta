package org.telegram.tgnet;

public final class TLRPC$TL_document_layer113$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.PhotoSize.TLdeserialize(inputSerializedData, i, z);
    }
}
