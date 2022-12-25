package org.telegram.tgnet;

public class TLRPC$TL_reactionCustomEmoji extends TLRPC$Reaction {
    public static int constructor = -1992950669;
    public long document_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.document_id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.document_id);
    }
}
