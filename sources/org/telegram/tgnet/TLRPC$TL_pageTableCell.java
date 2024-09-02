package org.telegram.tgnet;

public class TLRPC$TL_pageTableCell extends TLObject {
    public boolean align_center;
    public boolean align_right;
    public int colspan;
    public int flags;
    public boolean header;
    public int rowspan;
    public TLRPC$RichText text;
    public boolean valign_bottom;
    public boolean valign_middle;

    public static TLRPC$TL_pageTableCell TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (878078826 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_pageTableCell", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_pageTableCell tLRPC$TL_pageTableCell = new TLRPC$TL_pageTableCell();
        tLRPC$TL_pageTableCell.readParams(abstractSerializedData, z);
        return tLRPC$TL_pageTableCell;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.header = (readInt32 & 1) != 0;
        this.align_center = (readInt32 & 8) != 0;
        this.align_right = (readInt32 & 16) != 0;
        this.valign_middle = (readInt32 & 32) != 0;
        this.valign_bottom = (readInt32 & 64) != 0;
        if ((readInt32 & 128) != 0) {
            this.text = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 2) != 0) {
            this.colspan = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 4) != 0) {
            this.rowspan = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(878078826);
        int i = this.header ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.align_center ? i | 8 : i & (-9);
        this.flags = i2;
        int i3 = this.align_right ? i2 | 16 : i2 & (-17);
        this.flags = i3;
        int i4 = this.valign_middle ? i3 | 32 : i3 & (-33);
        this.flags = i4;
        int i5 = this.valign_bottom ? i4 | 64 : i4 & (-65);
        this.flags = i5;
        abstractSerializedData.writeInt32(i5);
        if ((this.flags & 128) != 0) {
            this.text.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.colspan);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.rowspan);
        }
    }
}
