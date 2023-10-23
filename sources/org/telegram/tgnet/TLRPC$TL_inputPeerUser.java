package org.telegram.tgnet;
public class TLRPC$TL_inputPeerUser extends TLRPC$InputPeer {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-571955892);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt64(this.access_hash);
    }
}
