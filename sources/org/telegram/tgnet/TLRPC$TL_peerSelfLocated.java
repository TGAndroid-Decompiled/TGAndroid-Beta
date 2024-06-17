package org.telegram.tgnet;

public class TLRPC$TL_peerSelfLocated extends TLRPC$PeerLocated {
    public int expires;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.expires = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-118740917);
        abstractSerializedData.writeInt32(this.expires);
    }
}
