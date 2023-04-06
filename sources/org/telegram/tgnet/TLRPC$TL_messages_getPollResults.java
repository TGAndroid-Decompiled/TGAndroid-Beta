package org.telegram.tgnet;
public class TLRPC$TL_messages_getPollResults extends TLObject {
    public static int constructor = 1941660731;
    public int msg_id;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.msg_id);
    }
}
