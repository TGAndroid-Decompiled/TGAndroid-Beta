package org.telegram.tgnet;
public class TLRPC$TL_sendMessageUploadPhotoAction extends TLRPC$SendMessageAction {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.progress = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-774682074);
        abstractSerializedData.writeInt32(this.progress);
    }
}
