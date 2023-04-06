package org.telegram.tgnet;
public abstract class TLRPC$UserStatus extends TLObject {
    public int expires;

    public static TLRPC$UserStatus TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$UserStatus tLRPC$UserStatus;
        switch (i) {
            case -496024847:
                tLRPC$UserStatus = new TLRPC$UserStatus() {
                    public static int constructor = -496024847;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -306628279:
                tLRPC$UserStatus = new TLRPC$UserStatus() {
                    public static int constructor = -306628279;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.expires = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.expires);
                    }
                };
                break;
            case 9203775:
                tLRPC$UserStatus = new TLRPC$UserStatus() {
                    public static int constructor = 9203775;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.expires = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.expires);
                    }
                };
                break;
            case 129960444:
                tLRPC$UserStatus = new TLRPC$UserStatus() {
                    public static int constructor = 129960444;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 164646985:
                tLRPC$UserStatus = new TLRPC$UserStatus() {
                    public static int constructor = 164646985;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 2011940674:
                tLRPC$UserStatus = new TLRPC$UserStatus() {
                    public static int constructor = 2011940674;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            default:
                tLRPC$UserStatus = null;
                break;
        }
        if (tLRPC$UserStatus == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in UserStatus", Integer.valueOf(i)));
        }
        if (tLRPC$UserStatus != null) {
            tLRPC$UserStatus.readParams(abstractSerializedData, z);
        }
        return tLRPC$UserStatus;
    }
}
