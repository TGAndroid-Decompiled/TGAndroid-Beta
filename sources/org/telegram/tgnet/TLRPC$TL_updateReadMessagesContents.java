package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_updateReadMessagesContents extends TLRPC$Update {
    public static int constructor = -131960447;
    public int date;
    public int flags;
    public ArrayList<Integer> messages = new ArrayList<>();
    public int pts;
    public int pts_count;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
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
        this.pts = abstractSerializedData.readInt32(z);
        this.pts_count = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.date = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(481674261);
        int size = this.messages.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt32(this.messages.get(i).intValue());
        }
        abstractSerializedData.writeInt32(this.pts);
        abstractSerializedData.writeInt32(this.pts_count);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.date);
        }
    }
}
