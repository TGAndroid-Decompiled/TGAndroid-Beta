package org.telegram.tgnet;
public class TLRPC$TL_decryptedMessageActionNotifyLayer extends TLRPC$DecryptedMessageAction {
    public static int constructor = -217806717;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.layer = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.layer);
    }
}
