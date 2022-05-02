package org.telegram.tgnet;

public class TLRPC$TL_help_support extends TLObject {
    public static int constructor = 398898678;
    public String phone_number;
    public TLRPC$User user;

    public static TLRPC$TL_help_support TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_help_support tLRPC$TL_help_support = new TLRPC$TL_help_support();
            tLRPC$TL_help_support.readParams(abstractSerializedData, z);
            return tLRPC$TL_help_support;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_help_support", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.phone_number = abstractSerializedData.readString(z);
        this.user = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.phone_number);
        this.user.serializeToStream(abstractSerializedData);
    }
}
