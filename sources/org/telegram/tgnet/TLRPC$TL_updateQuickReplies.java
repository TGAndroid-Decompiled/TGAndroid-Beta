package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_updateQuickReplies extends TLRPC$Update {
    public ArrayList<TLRPC$TL_quickReply> quick_replies = new ArrayList<>();

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            this.quick_replies.add(TLRPC$TL_quickReply.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-112784718);
        abstractSerializedData.writeInt32(481674261);
        int size = this.quick_replies.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.quick_replies.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
