package org.telegram.tgnet;
public class TLRPC$TL_decryptedMessageMediaWebPage extends TLRPC$DecryptedMessageMedia {
    public static int constructor = -452652584;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.url = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.url);
    }
}
