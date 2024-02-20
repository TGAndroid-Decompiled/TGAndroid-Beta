package org.telegram.tgnet;
public class TLRPC$TL_speakingInGroupCallAction extends TLRPC$SendMessageAction {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-651419003);
    }
}
