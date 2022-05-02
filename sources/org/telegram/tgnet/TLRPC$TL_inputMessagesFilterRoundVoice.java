package org.telegram.tgnet;

public class TLRPC$TL_inputMessagesFilterRoundVoice extends TLRPC$MessagesFilter {
    public static int constructor = 2054952868;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
