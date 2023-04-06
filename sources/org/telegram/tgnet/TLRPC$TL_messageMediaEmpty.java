package org.telegram.tgnet;
public class TLRPC$TL_messageMediaEmpty extends TLRPC$MessageMedia {
    public static int constructor = 1038967584;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
