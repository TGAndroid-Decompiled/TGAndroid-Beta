package org.telegram.tgnet;
public class TLRPC$TL_speakingInGroupCallAction extends TLRPC$SendMessageAction {
    public static int constructor = -651419003;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
