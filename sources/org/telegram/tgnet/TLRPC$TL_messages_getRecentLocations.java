package org.telegram.tgnet;
public class TLRPC$TL_messages_getRecentLocations extends TLObject {
    public long hash;
    public int limit;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_Messages.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1881817312);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.limit);
        abstractSerializedData.writeInt64(this.hash);
    }
}
