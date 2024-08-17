package org.telegram.tgnet;

public class TLRPC$TL_decryptedMessageMediaWebPage extends TLRPC$DecryptedMessageMedia {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.url = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-452652584);
        abstractSerializedData.writeString(this.url);
    }
}
