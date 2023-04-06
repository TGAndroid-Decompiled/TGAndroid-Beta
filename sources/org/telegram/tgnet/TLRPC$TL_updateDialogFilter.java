package org.telegram.tgnet;
public class TLRPC$TL_updateDialogFilter extends TLRPC$Update {
    public static int constructor = 654302845;
    public TLRPC$DialogFilter filter;
    public int flags;
    public int id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.id = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.filter = TLRPC$DialogFilter.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.id);
        if ((this.flags & 1) != 0) {
            this.filter.serializeToStream(abstractSerializedData);
        }
    }
}
