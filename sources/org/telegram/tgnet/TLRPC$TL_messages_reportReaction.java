package org.telegram.tgnet;
public class TLRPC$TL_messages_reportReaction extends TLObject {
    public static int constructor = 1631726152;
    public int id;
    public TLRPC$InputPeer peer;
    public TLRPC$InputUser user_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.id);
        this.user_id.serializeToStream(abstractSerializedData);
    }
}
