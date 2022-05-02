package org.telegram.tgnet;

public class TLRPC$TL_updateGroupCallConnection extends TLRPC$Update {
    public static int constructor = 192428418;
    public int flags;
    public TLRPC$TL_dataJSON params;
    public boolean presentation;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        boolean z2 = true;
        if ((readInt32 & 1) == 0) {
            z2 = false;
        }
        this.presentation = z2;
        this.params = TLRPC$TL_dataJSON.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.presentation ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.params.serializeToStream(abstractSerializedData);
    }
}
