package org.telegram.tgnet;
public class TLRPC$TL_channelForbidden extends TLRPC$Chat {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.broadcast = (readInt32 & 32) != 0;
        this.megagroup = (readInt32 & 256) != 0;
        this.id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
        this.title = abstractSerializedData.readString(z);
        if ((this.flags & 65536) != 0) {
            this.until_date = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(399807445);
        int i = this.broadcast ? this.flags | 32 : this.flags & (-33);
        this.flags = i;
        int i2 = this.megagroup ? i | 256 : i & (-257);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeString(this.title);
        if ((this.flags & 65536) != 0) {
            abstractSerializedData.writeInt32(this.until_date);
        }
    }
}
