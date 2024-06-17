package org.telegram.tgnet;

public class TLRPC$TL_sendMessageHistoryImportAction extends TLRPC$SendMessageAction {
    public int progress;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.progress = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-606432698);
        abstractSerializedData.writeInt32(this.progress);
    }
}
