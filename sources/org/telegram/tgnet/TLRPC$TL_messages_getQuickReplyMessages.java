package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_messages_getQuickReplyMessages extends TLObject {
    public int flags;
    public long hash;
    public ArrayList<Integer> id = new ArrayList<>();
    public int shortcut_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_Messages.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1801153085);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.shortcut_id);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.id.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                abstractSerializedData.writeInt32(this.id.get(i).intValue());
            }
        }
        abstractSerializedData.writeInt64(this.hash);
    }
}
