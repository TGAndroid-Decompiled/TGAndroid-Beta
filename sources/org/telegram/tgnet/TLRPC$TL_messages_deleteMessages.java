package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_deleteMessages extends TLObject {
    public int flags;
    public ArrayList id = new ArrayList();
    public boolean revoke;

    public static TLRPC$TL_messages_deleteMessages TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-443640366 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messages_deleteMessages", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messages_deleteMessages tLRPC$TL_messages_deleteMessages = new TLRPC$TL_messages_deleteMessages();
        tLRPC$TL_messages_deleteMessages.readParams(abstractSerializedData, z);
        return tLRPC$TL_messages_deleteMessages;
    }

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_affectedMessages.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.revoke = (readInt32 & 1) != 0;
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
        } else {
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                this.id.add(Integer.valueOf(abstractSerializedData.readInt32(z)));
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-443640366);
        int i = this.revoke ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(481674261);
        int size = this.id.size();
        abstractSerializedData.writeInt32(size);
        for (int i2 = 0; i2 < size; i2++) {
            abstractSerializedData.writeInt32(((Integer) this.id.get(i2)).intValue());
        }
    }
}
