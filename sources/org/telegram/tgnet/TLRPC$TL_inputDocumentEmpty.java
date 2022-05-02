package org.telegram.tgnet;

public class TLRPC$TL_inputDocumentEmpty extends TLRPC$InputDocument {
    public static int constructor = 1928391342;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
