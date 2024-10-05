package org.telegram.tgnet;

public class TLRPC$TL_replyKeyboardMarkup extends TLRPC$ReplyMarkup {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.resize = (readInt32 & 1) != 0;
        this.single_use = (readInt32 & 2) != 0;
        this.selective = (readInt32 & 4) != 0;
        this.is_persistent = (readInt32 & 16) != 0;
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TLRPC$TL_keyboardButtonRow TLdeserialize = TLRPC$TL_keyboardButtonRow.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.rows.add(TLdeserialize);
        }
        if ((this.flags & 8) != 0) {
            this.placeholder = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2049074735);
        int i = this.resize ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.single_use ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.selective ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.is_persistent ? i3 | 16 : i3 & (-17);
        this.flags = i4;
        abstractSerializedData.writeInt32(i4);
        abstractSerializedData.writeInt32(481674261);
        int size = this.rows.size();
        abstractSerializedData.writeInt32(size);
        for (int i5 = 0; i5 < size; i5++) {
            ((TLRPC$TL_keyboardButtonRow) this.rows.get(i5)).serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeString(this.placeholder);
        }
    }
}
