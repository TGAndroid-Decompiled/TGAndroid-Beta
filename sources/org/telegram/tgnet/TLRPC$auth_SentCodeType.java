package org.telegram.tgnet;

public abstract class TLRPC$auth_SentCodeType extends TLObject {
    public boolean apple_signin_allowed;
    public String email_pattern;
    public int flags;
    public boolean google_signin_allowed;
    public int length;
    public int next_phone_login_date;
    public String pattern;
    public String prefix;
    public String url;

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
            case -1521934870:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    public static int constructor = -1521934870;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.apple_signin_allowed = (readInt32 & 1) != 0;
                        this.google_signin_allowed = (readInt32 & 2) != 0;
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.apple_signin_allowed ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.google_signin_allowed ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
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
            case -648651719:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    public static int constructor = -648651719;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.url = abstractSerializedData2.readString(z2);
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeString(this.url);
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
            case 1511364673:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    public static int constructor = 1511364673;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.apple_signin_allowed = (readInt32 & 1) != 0;
                        this.google_signin_allowed = (readInt32 & 2) != 0;
                        this.email_pattern = abstractSerializedData2.readString(z2);
                        this.length = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 4) != 0) {
                            this.next_phone_login_date = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.apple_signin_allowed ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.google_signin_allowed ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeString(this.email_pattern);
                        abstractSerializedData2.writeInt32(this.length);
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.next_phone_login_date);
                        }
                    }
                };
                break;
            default:
                tLRPC$auth_SentCodeType = null;
                break;
        }
        if (tLRPC$auth_SentCodeType == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in auth_SentCodeType", Integer.valueOf(i)));
        }
        if (tLRPC$auth_SentCodeType != null) {
            tLRPC$auth_SentCodeType.readParams(abstractSerializedData, z);
        }
        return tLRPC$auth_SentCodeType;
    }
}
