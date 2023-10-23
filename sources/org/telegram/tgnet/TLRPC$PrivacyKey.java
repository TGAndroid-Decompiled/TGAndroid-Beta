package org.telegram.tgnet;
public abstract class TLRPC$PrivacyKey extends TLObject {
    public static TLRPC$PrivacyKey TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PrivacyKey tLRPC$PrivacyKey;
        switch (i) {
            case -1777000467:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1777000467);
                    }
                };
                break;
            case -1534675103:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1534675103);
                    }
                };
                break;
            case -1137792208:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1137792208);
                    }
                };
                break;
            case -778378131:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-778378131);
                    }
                };
                break;
            case 110621716:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(110621716);
                    }
                };
                break;
            case 961092808:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(961092808);
                    }
                };
                break;
            case 1030105979:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1030105979);
                    }
                };
                break;
            case 1124062251:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1124062251);
                    }
                };
                break;
            case 1343122938:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1343122938);
                    }
                };
                break;
            case 1777096355:
                tLRPC$PrivacyKey = new TLRPC$PrivacyKey() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1777096355);
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
