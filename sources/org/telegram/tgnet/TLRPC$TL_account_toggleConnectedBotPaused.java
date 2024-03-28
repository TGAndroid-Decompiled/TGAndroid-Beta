package org.telegram.tgnet;
public class TLRPC$TL_account_toggleConnectedBotPaused extends TLObject {
    public boolean paused;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1684934807);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.paused);
    }
}
