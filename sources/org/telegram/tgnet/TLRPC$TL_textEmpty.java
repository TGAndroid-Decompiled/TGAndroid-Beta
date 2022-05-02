package org.telegram.tgnet;

public class TLRPC$TL_textEmpty extends TLRPC$RichText {
    public static int constructor = -599948721;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
