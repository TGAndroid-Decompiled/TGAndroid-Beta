package org.telegram.tgnet;
public class TLRPC$TL_sendMessageUploadDocumentAction extends TLRPC$SendMessageAction {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.progress = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1441998364);
        abstractSerializedData.writeInt32(this.progress);
    }
}
