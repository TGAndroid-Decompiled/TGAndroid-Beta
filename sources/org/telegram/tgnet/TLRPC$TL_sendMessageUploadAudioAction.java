package org.telegram.tgnet;

public class TLRPC$TL_sendMessageUploadAudioAction extends TLRPC$SendMessageAction {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.progress = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-212740181);
        abstractSerializedData.writeInt32(this.progress);
    }
}
