package org.telegram.tgnet;

public class TLRPC$TL_factCheck extends TLObject {
    public String country;
    public int flags;
    public long hash;
    public boolean need_check;
    public TLRPC$TL_textWithEntities text;

    public static TLRPC$TL_factCheck TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1197736753 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_factCheck", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_factCheck tLRPC$TL_factCheck = new TLRPC$TL_factCheck();
        tLRPC$TL_factCheck.readParams(abstractSerializedData, z);
        return tLRPC$TL_factCheck;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.need_check = (readInt32 & 1) != 0;
        if ((readInt32 & 2) != 0) {
            this.country = abstractSerializedData.readString(z);
            this.text = TLRPC$TL_textWithEntities.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.hash = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1197736753);
        int i = this.need_check ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.country);
            this.text.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt64(this.hash);
    }
}
