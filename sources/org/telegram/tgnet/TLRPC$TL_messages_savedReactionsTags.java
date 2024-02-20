package org.telegram.tgnet;
public class TLRPC$TL_messages_savedReactionsTags extends TLRPC$messages_SavedReactionTags {
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
            TLRPC$TL_savedReactionTag TLdeserialize = TLRPC$TL_savedReactionTag.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.tags.add(TLdeserialize);
        }
        this.hash = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(844731658);
        abstractSerializedData.writeInt32(481674261);
        int size = this.tags.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.tags.get(i).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt64(this.hash);
    }
}
