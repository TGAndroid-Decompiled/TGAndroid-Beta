package org.telegram.tgnet;

public class TLRPC$TL_messageEncryptedAction extends TLRPC$MessageAction {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.encryptedAction = TLRPC$DecryptedMessageAction.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1431655927);
        this.encryptedAction.serializeToStream(abstractSerializedData);
    }
}
