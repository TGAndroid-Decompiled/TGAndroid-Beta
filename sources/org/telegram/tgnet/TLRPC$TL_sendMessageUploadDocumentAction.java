package org.telegram.tgnet;
public class TLRPC$TL_sendMessageUploadDocumentAction extends TLRPC$SendMessageAction {
    public static int constructor = -1441998364;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.progress = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.progress);
    }
}
