package org.telegram.tgnet;

public class TLRPC$TL_messageEncryptedAction extends TLRPC$MessageAction {
    public static int constructor = 1431655927;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.encryptedAction = TLRPC$DecryptedMessageAction.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.encryptedAction.serializeToStream(abstractSerializedData);
    }
}
