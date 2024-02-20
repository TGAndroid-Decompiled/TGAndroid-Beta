package org.telegram.tgnet;
public class TLRPC$TL_updateNewAuthorization extends TLRPC$Update {
    public int date;
    public String device;
    public int flags;
    public long hash;
    public String location;
    public boolean unconfirmed;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.unconfirmed = (readInt32 & 1) != 0;
        this.hash = abstractSerializedData.readInt64(z);
        if ((this.flags & 1) != 0) {
            this.date = abstractSerializedData.readInt32(z);
            this.device = abstractSerializedData.readString(z);
            this.location = abstractSerializedData.readString(z);
        }
    }
}
