package org.telegram.tgnet;
public class TLRPC$TL_messageMediaUnsupported extends TLRPC$MessageMedia {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1618676578);
    }
}
