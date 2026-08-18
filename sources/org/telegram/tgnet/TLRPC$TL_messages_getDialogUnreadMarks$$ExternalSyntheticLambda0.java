package org.telegram.tgnet;

public final class TLRPC$TL_messages_getDialogUnreadMarks$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.DialogPeer.TLdeserialize(inputSerializedData, i, z);
    }
}
