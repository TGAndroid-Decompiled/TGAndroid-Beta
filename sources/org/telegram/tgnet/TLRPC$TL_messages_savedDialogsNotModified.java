package org.telegram.tgnet;
public class TLRPC$TL_messages_savedDialogsNotModified extends TLRPC$messages_SavedDialogs {
    public int count;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.count = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1071681560);
        abstractSerializedData.writeInt32(this.count);
    }
}
