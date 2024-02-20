package org.telegram.tgnet;
public class TLRPC$TL_sendMessageUploadVideoAction extends TLRPC$SendMessageAction {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.progress = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-378127636);
        abstractSerializedData.writeInt32(this.progress);
    }
}
