package org.telegram.tgnet;

public abstract class TLRPC$SecureValueType extends TLObject {
    public static TLRPC$SecureValueType TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$SecureValueType tLRPC$SecureValueType;
        switch (i) {
            case -1995211763:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1995211763);
                    }
                };
                break;
            case -1954007928:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1954007928);
                    }
                };
                break;
            case -1908627474:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1908627474);
                    }
                };
                break;
            case -1717268701:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1717268701);
                    }
                };
                break;
            case -1713143702:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1713143702);
                    }
                };
                break;
            case -1658158621:
                tLRPC$SecureValueType = new TLRPC$TL_secureValueTypePersonalDetails();
                break;
            case -1596951477:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1596951477);
                    }
                };
                break;
            case -1289704741:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1289704741);
                    }
                };
                break;
            case -874308058:
                tLRPC$SecureValueType = new TLRPC$TL_secureValueTypeAddress();
                break;
            case -368907213:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-368907213);
                    }
                };
                break;
            case -63531698:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-63531698);
                    }
                };
                break;
            case 115615172:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(115615172);
                    }
                };
                break;
            case 1034709504:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1034709504);
                    }
                };
                break;
            default:
                tLRPC$SecureValueType = null;
                break;
        }
        if (tLRPC$SecureValueType == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in SecureValueType", Integer.valueOf(i)));
        }
        if (tLRPC$SecureValueType != null) {
            tLRPC$SecureValueType.readParams(abstractSerializedData, z);
        }
        return tLRPC$SecureValueType;
    }
}
