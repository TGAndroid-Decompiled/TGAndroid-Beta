package org.telegram.tgnet;

public abstract class TLRPC$auth_SentCodeType extends TLObject {
    public int length;
    public String pattern;
    public String prefix;

    public static TLRPC$auth_SentCodeType TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$auth_SentCodeType tLRPC$auth_SentCodeType;
        switch (i) {
            case -2113903484:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    public static int constructor = -2113903484;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.prefix = abstractSerializedData2.readString(z2);
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeString(this.prefix);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            case -1425815847:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    public static int constructor = -1425815847;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.pattern = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeString(this.pattern);
                    }
                };
                break;
            case -1073693790:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    public static int constructor = -1073693790;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            case 1035688326:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    public static int constructor = 1035688326;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            case 1398007207:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    public static int constructor = 1398007207;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            default:
                tLRPC$auth_SentCodeType = null;
                break;
        }
        if (tLRPC$auth_SentCodeType != null || !z) {
            if (tLRPC$auth_SentCodeType != null) {
                tLRPC$auth_SentCodeType.readParams(abstractSerializedData, z);
            }
            return tLRPC$auth_SentCodeType;
        }
        throw new RuntimeException(String.format("can't parse magic %x in auth_SentCodeType", Integer.valueOf(i)));
    }
}
