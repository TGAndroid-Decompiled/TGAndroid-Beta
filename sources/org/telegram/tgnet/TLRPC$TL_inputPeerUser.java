package org.telegram.tgnet;
public class TLRPC$TL_inputPeerUser extends TLRPC$InputPeer {
    public static int constructor = -571955892;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt64(this.access_hash);
    }
}
