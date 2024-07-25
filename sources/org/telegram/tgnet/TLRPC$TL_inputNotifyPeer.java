package org.telegram.tgnet;
public class TLRPC$TL_inputNotifyPeer extends TLRPC$InputNotifyPeer {
    public TLRPC$InputPeer peer;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$InputPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1195615476);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
