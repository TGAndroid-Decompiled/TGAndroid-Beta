package org.telegram.tgnet;
public class TLRPC$TL_messageActionScreenshotTaken extends TLRPC$MessageAction {
    public static int constructor = 1200788123;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
