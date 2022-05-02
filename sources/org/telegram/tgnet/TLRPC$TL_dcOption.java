package org.telegram.tgnet;

public class TLRPC$TL_dcOption extends TLObject {
    public static int constructor = 414687501;
    public boolean cdn;
    public int flags;
    public int f892id;
    public String ip_address;
    public boolean ipv6;
    public boolean isStatic;
    public boolean media_only;
    public int port;
    public byte[] secret;
    public boolean tcpo_only;

    public static TLRPC$TL_dcOption TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_dcOption tLRPC$TL_dcOption = new TLRPC$TL_dcOption();
            tLRPC$TL_dcOption.readParams(abstractSerializedData, z);
            return tLRPC$TL_dcOption;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_dcOption", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        boolean z2 = false;
        this.ipv6 = (readInt32 & 1) != 0;
        this.media_only = (readInt32 & 2) != 0;
        this.tcpo_only = (readInt32 & 4) != 0;
        this.cdn = (readInt32 & 8) != 0;
        if ((readInt32 & 16) != 0) {
            z2 = true;
        }
        this.isStatic = z2;
        this.f892id = abstractSerializedData.readInt32(z);
        this.ip_address = abstractSerializedData.readString(z);
        this.port = abstractSerializedData.readInt32(z);
        if ((this.flags & 1024) != 0) {
            this.secret = abstractSerializedData.readByteArray(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.ipv6 ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.media_only ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.tcpo_only ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.cdn ? i3 | 8 : i3 & (-9);
        this.flags = i4;
        int i5 = this.isStatic ? i4 | 16 : i4 & (-17);
        this.flags = i5;
        abstractSerializedData.writeInt32(i5);
        abstractSerializedData.writeInt32(this.f892id);
        abstractSerializedData.writeString(this.ip_address);
        abstractSerializedData.writeInt32(this.port);
        if ((this.flags & 1024) != 0) {
            abstractSerializedData.writeByteArray(this.secret);
        }
    }
}
