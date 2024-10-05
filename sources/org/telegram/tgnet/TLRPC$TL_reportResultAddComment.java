package org.telegram.tgnet;

public class TLRPC$TL_reportResultAddComment extends TLRPC$ReportResult {
    public int flags;
    public byte[] option;
    public boolean optional;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.optional = (readInt32 & 1) != 0;
        this.option = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1862904881);
        int i = this.optional ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeByteArray(this.option);
    }
}
