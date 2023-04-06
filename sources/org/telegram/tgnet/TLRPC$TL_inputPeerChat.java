package org.telegram.tgnet;
public class TLRPC$TL_inputPeerChat extends TLRPC$InputPeer {
    public static int constructor = 900291769;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.chat_id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.chat_id);
    }
}
