package org.telegram.tgnet;

public class TLRPC$TL_auth_sentCode extends TLObject {
    public static int constructor = 1577067778;
    public int flags;
    public TLRPC$auth_CodeType next_type;
    public String phone_code_hash;
    public int timeout;
    public TLRPC$auth_SentCodeType type;

    public static TLRPC$TL_auth_sentCode TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_auth_sentCode tLRPC$TL_auth_sentCode = new TLRPC$TL_auth_sentCode();
            tLRPC$TL_auth_sentCode.readParams(abstractSerializedData, z);
            return tLRPC$TL_auth_sentCode;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_auth_sentCode", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.type = TLRPC$auth_SentCodeType.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.phone_code_hash = abstractSerializedData.readString(z);
        if ((this.flags & 2) != 0) {
            this.next_type = TLRPC$auth_CodeType.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 4) != 0) {
            this.timeout = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        this.type.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.phone_code_hash);
        if ((this.flags & 2) != 0) {
            this.next_type.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.timeout);
        }
    }
}
