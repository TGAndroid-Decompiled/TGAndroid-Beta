package org.telegram.tgnet;
public class TLRPC$TL_inputDialogPeer extends TLRPC$InputDialogPeer {
    public TLRPC$InputPeer peer;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$InputPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-55902537);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
