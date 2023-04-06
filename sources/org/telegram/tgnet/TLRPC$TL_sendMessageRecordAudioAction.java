package org.telegram.tgnet;
public class TLRPC$TL_sendMessageRecordAudioAction extends TLRPC$SendMessageAction {
    public static int constructor = -718310409;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
