package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_pageTableRow extends TLObject {
    public ArrayList<TLRPC$TL_pageTableCell> cells = new ArrayList<>();

    public static TLRPC$TL_pageTableRow TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-524237339 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_pageTableRow", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_pageTableRow tLRPC$TL_pageTableRow = new TLRPC$TL_pageTableRow();
        tLRPC$TL_pageTableRow.readParams(abstractSerializedData, z);
        return tLRPC$TL_pageTableRow;
    }

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
            TLRPC$TL_pageTableCell TLdeserialize = TLRPC$TL_pageTableCell.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.cells.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-524237339);
        abstractSerializedData.writeInt32(481674261);
        int size = this.cells.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.cells.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
