package org.telegram.tgnet;
public abstract class TLRPC$auth_SentCode extends TLObject {
    public TLRPC$auth_Authorization authorization;
    public int flags;
    public TLRPC$auth_CodeType next_type;
    public String phone_code_hash;
    public int timeout;
    public TLRPC$auth_SentCodeType type;

    public static TLRPC$auth_SentCode TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$auth_SentCode tLRPC$auth_SentCode;
        if (i == 596704836) {
            tLRPC$auth_SentCode = new TLRPC$auth_SentCode() {
                public static int constructor = 596704836;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.authorization = TLRPC$auth_Authorization.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    this.authorization.serializeToStream(abstractSerializedData2);
                }
            };
        } else {
            tLRPC$auth_SentCode = i != 1577067778 ? null : new TLRPC$auth_SentCode() {
                public static int constructor = 1577067778;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.flags = abstractSerializedData2.readInt32(z2);
                    this.type = TLRPC$auth_SentCodeType.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    this.phone_code_hash = abstractSerializedData2.readString(z2);
                    if ((this.flags & 2) != 0) {
                        this.next_type = TLRPC$auth_CodeType.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                    if ((this.flags & 4) != 0) {
                        this.timeout = abstractSerializedData2.readInt32(z2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    abstractSerializedData2.writeInt32(this.flags);
                    this.type.serializeToStream(abstractSerializedData2);
                    abstractSerializedData2.writeString(this.phone_code_hash);
                    if ((this.flags & 2) != 0) {
                        this.next_type.serializeToStream(abstractSerializedData2);
                    }
                    if ((this.flags & 4) != 0) {
                        abstractSerializedData2.writeInt32(this.timeout);
                    }
                }
            };
        }
        if (tLRPC$auth_SentCode == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in auth_SentCode", Integer.valueOf(i)));
        }
        if (tLRPC$auth_SentCode != null) {
            tLRPC$auth_SentCode.readParams(abstractSerializedData, z);
        }
        return tLRPC$auth_SentCode;
    }
}
