package org.telegram.tgnet;

public abstract class TLRPC$PrivacyKey extends TLObject {
    public static TLRPC$PrivacyKey TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PrivacyKey tLRPC$PrivacyKey;
        switch (i) {
            case -1777000467:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    public static int constructor = -1777000467;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1137792208:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    public static int constructor = -1137792208;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -778378131:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    public static int constructor = -778378131;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 110621716:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    public static int constructor = 110621716;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 961092808:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    public static int constructor = 961092808;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1030105979:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    public static int constructor = 1030105979;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1124062251:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    public static int constructor = 1124062251;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1343122938:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    public static int constructor = 1343122938;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1777096355:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    public static int constructor = 1777096355;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            default:
                tLRPC$PrivacyKey = null;
                break;
        }
        if (tLRPC$PrivacyKey == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PrivacyKey", Integer.valueOf(i)));
        }
        if (tLRPC$PrivacyKey != null) {
            tLRPC$PrivacyKey.readParams(abstractSerializedData, z);
        }
        return tLRPC$PrivacyKey;
    }
}
