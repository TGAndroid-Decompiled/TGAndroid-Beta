package org.telegram.tgnet;

public class TLRPC$TL_sendMessageUploadVideoAction extends TLRPC$SendMessageAction {
    public static int constructor = -378127636;

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
