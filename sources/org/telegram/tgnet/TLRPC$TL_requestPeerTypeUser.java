package org.telegram.tgnet;
public class TLRPC$TL_requestPeerTypeUser extends TLRPC$RequestPeerType {
    public Boolean bot;
    public Boolean premium;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        if ((readInt32 & 1) != 0) {
            this.bot = Boolean.valueOf(abstractSerializedData.readBool(z));
        }
        if ((this.flags & 2) != 0) {
            this.premium = Boolean.valueOf(abstractSerializedData.readBool(z));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1597737472);
        int i = this.bot != null ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.premium != null ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        Boolean bool = this.bot;
        if (bool != null) {
            abstractSerializedData.writeBool(bool.booleanValue());
        }
        Boolean bool2 = this.premium;
        if (bool2 != null) {
            abstractSerializedData.writeBool(bool2.booleanValue());
        }
    }
}
