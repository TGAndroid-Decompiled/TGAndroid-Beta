package org.telegram.tgnet;

public class TLRPC$TL_messageMediaEmpty extends TLRPC$MessageMedia {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1038967584);
    }
}
