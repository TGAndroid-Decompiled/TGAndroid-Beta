package org.telegram.tgnet;
public class TLRPC$TL_messageEntityPre extends TLRPC$MessageEntity {
    public static int constructor = 1938967520;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.offset = abstractSerializedData.readInt32(z);
        this.length = abstractSerializedData.readInt32(z);
        this.language = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.offset);
        abstractSerializedData.writeInt32(this.length);
        abstractSerializedData.writeString(this.language);
    }
}
