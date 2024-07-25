package org.telegram.tgnet;
public class TLRPC$TL_messages_toggleNoForwards extends TLObject {
    public boolean enabled;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1323389022);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.enabled);
    }
}
