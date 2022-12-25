package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_saveDraft extends TLObject {
    public static int constructor = -1271718337;
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public int flags;
    public String message;
    public boolean no_webpage;
    public TLRPC$InputPeer peer;
    public int reply_to_msg_id;
    public int top_msg_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.no_webpage ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.reply_to_msg_id);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.top_msg_id);
        }
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.message);
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.entities.size();
            abstractSerializedData.writeInt32(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.entities.get(i2).serializeToStream(abstractSerializedData);
            }
        }
    }
}
