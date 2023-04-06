package org.telegram.tgnet;
public class TLRPC$TL_updateDraftMessage extends TLRPC$Update {
    public static int constructor = 457829485;
    public TLRPC$DraftMessage draft;
    public int flags;
    public TLRPC$Peer peer;
    public int top_msg_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 1) != 0) {
            this.top_msg_id = abstractSerializedData.readInt32(z);
        }
        this.draft = TLRPC$DraftMessage.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        this.peer.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.top_msg_id);
        }
        this.draft.serializeToStream(abstractSerializedData);
    }
}
