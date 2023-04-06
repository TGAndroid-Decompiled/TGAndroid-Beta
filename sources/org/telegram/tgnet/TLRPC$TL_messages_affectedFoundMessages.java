package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_messages_affectedFoundMessages extends TLObject {
    public static int constructor = -275956116;
    public ArrayList<Integer> messages = new ArrayList<>();
    public int offset;
    public int pts;
    public int pts_count;

    public static TLRPC$TL_messages_affectedFoundMessages TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messages_affectedFoundMessages", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messages_affectedFoundMessages tLRPC$TL_messages_affectedFoundMessages = new TLRPC$TL_messages_affectedFoundMessages();
        tLRPC$TL_messages_affectedFoundMessages.readParams(abstractSerializedData, z);
        return tLRPC$TL_messages_affectedFoundMessages;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.pts = abstractSerializedData.readInt32(z);
        this.pts_count = abstractSerializedData.readInt32(z);
        this.offset = abstractSerializedData.readInt32(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            this.messages.add(Integer.valueOf(abstractSerializedData.readInt32(z)));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.pts);
        abstractSerializedData.writeInt32(this.pts_count);
        abstractSerializedData.writeInt32(this.offset);
        abstractSerializedData.writeInt32(481674261);
        int size = this.messages.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt32(this.messages.get(i).intValue());
        }
    }
}
