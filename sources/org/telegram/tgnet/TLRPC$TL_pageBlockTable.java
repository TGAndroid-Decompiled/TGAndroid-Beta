package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_pageBlockTable extends TLRPC$PageBlock {
    public boolean bordered;
    public int flags;
    public ArrayList<TLRPC$TL_pageTableRow> rows = new ArrayList<>();
    public boolean striped;
    public TLRPC$RichText title;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.bordered = (readInt32 & 1) != 0;
        this.striped = (readInt32 & 2) != 0;
        this.title = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TLRPC$TL_pageTableRow TLdeserialize = TLRPC$TL_pageTableRow.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.rows.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1085412734);
        int i = this.bordered ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.striped ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.title.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.rows.size();
        abstractSerializedData.writeInt32(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.rows.get(i3).serializeToStream(abstractSerializedData);
        }
    }
}
