package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_messages_createChat extends TLObject {
    public int flags;
    public String title;
    public int ttl_period;
    public ArrayList<TLRPC$InputUser> users = new ArrayList<>();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(3450904);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(481674261);
        int size = this.users.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.users.get(i).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeString(this.title);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.ttl_period);
        }
    }
}
