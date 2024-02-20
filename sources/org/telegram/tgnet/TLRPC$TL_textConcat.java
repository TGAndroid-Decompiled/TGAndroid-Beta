package org.telegram.tgnet;
public class TLRPC$TL_textConcat extends TLRPC$RichText {
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
            TLRPC$RichText TLdeserialize = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.texts.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(2120376535);
        abstractSerializedData.writeInt32(481674261);
        int size = this.texts.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.texts.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
