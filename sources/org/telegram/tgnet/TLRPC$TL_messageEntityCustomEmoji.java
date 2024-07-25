package org.telegram.tgnet;
public class TLRPC$TL_messageEntityCustomEmoji extends TLRPC$MessageEntity {
    public static final int constructor = -925956616;
    public TLRPC$Document document;
    public long document_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.offset = abstractSerializedData.readInt32(z);
        this.length = abstractSerializedData.readInt32(z);
        this.document_id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.offset);
        abstractSerializedData.writeInt32(this.length);
        abstractSerializedData.writeInt64(this.document_id);
    }
}
