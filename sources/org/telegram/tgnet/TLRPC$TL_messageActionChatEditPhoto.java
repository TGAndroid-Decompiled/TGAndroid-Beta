package org.telegram.tgnet;
public class TLRPC$TL_messageActionChatEditPhoto extends TLRPC$MessageAction {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.photo = TLRPC$Photo.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(2144015272);
        this.photo.serializeToStream(abstractSerializedData);
    }
}
