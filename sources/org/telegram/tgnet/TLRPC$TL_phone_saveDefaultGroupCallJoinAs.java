package org.telegram.tgnet;
public class TLRPC$TL_phone_saveDefaultGroupCallJoinAs extends TLObject {
    public TLRPC$InputPeer join_as;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1465786252);
        this.peer.serializeToStream(abstractSerializedData);
        this.join_as.serializeToStream(abstractSerializedData);
    }
}
