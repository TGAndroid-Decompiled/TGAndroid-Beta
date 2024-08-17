package org.telegram.tgnet;

public class TLRPC$TL_messageActionScreenshotTaken extends TLRPC$MessageAction {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1200788123);
    }
}
