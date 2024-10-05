package org.telegram.tgnet;

public class TLRPC$TL_phone_getGroupCallStreamRtmpUrl extends TLObject {
    public TLRPC$InputPeer peer;
    public boolean revoke;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_phone_groupCallStreamRtmpUrl.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-558650433);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.revoke);
    }
}
