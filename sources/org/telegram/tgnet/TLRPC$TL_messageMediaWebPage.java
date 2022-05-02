package org.telegram.tgnet;

public class TLRPC$TL_messageMediaWebPage extends TLRPC$MessageMedia {
    public static int constructor = -1557277184;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.webpage = TLRPC$WebPage.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.webpage.serializeToStream(abstractSerializedData);
    }
}
