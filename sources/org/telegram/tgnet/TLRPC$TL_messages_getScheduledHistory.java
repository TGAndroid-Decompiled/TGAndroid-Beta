package org.telegram.tgnet;
public class TLRPC$TL_messages_getScheduledHistory extends TLObject {
    public long hash;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_Messages.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-183077365);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.hash);
    }
}
