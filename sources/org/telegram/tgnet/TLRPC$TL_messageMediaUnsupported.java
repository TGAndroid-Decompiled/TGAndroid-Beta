package org.telegram.tgnet;
public class TLRPC$TL_messageMediaUnsupported extends TLRPC$MessageMedia {
    public static int constructor = -1618676578;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
