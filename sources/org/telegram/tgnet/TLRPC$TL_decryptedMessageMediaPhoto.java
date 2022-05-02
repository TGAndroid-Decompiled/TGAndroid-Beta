package org.telegram.tgnet;

public class TLRPC$TL_decryptedMessageMediaPhoto extends TLRPC$DecryptedMessageMedia {
    public static int constructor = -235238024;
    public byte[] thumb;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.thumb = abstractSerializedData.readByteArray(z);
        this.thumb_w = abstractSerializedData.readInt32(z);
        this.thumb_h = abstractSerializedData.readInt32(z);
        this.f859w = abstractSerializedData.readInt32(z);
        this.f856h = abstractSerializedData.readInt32(z);
        this.size = abstractSerializedData.readInt32(z);
        this.key = abstractSerializedData.readByteArray(z);
        this.f858iv = abstractSerializedData.readByteArray(z);
        this.caption = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeByteArray(this.thumb);
        abstractSerializedData.writeInt32(this.thumb_w);
        abstractSerializedData.writeInt32(this.thumb_h);
        abstractSerializedData.writeInt32(this.f859w);
        abstractSerializedData.writeInt32(this.f856h);
        abstractSerializedData.writeInt32(this.size);
        abstractSerializedData.writeByteArray(this.key);
        abstractSerializedData.writeByteArray(this.f858iv);
        abstractSerializedData.writeString(this.caption);
    }
}
