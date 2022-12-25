package org.telegram.tgnet;

public abstract class TLRPC$SecureValueType extends TLObject {
    public static TLRPC$SecureValueType TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$SecureValueType tLRPC$SecureValueType;
        switch (i) {
            case -1995211763:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    public static int constructor = -1995211763;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1954007928:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    public static int constructor = -1954007928;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1908627474:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    public static int constructor = -1908627474;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1717268701:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    public static int constructor = -1717268701;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1713143702:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    public static int constructor = -1713143702;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1658158621:
                tLRPC$SecureValueType = new TLRPC$TL_secureValueTypePersonalDetails();
                break;
            case -1596951477:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    public static int constructor = -1596951477;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1289704741:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    public static int constructor = -1289704741;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -874308058:
                tLRPC$SecureValueType = new TLRPC$TL_secureValueTypeAddress();
                break;
            case -368907213:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    public static int constructor = -368907213;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -63531698:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    public static int constructor = -63531698;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 115615172:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    public static int constructor = 115615172;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1034709504:
                tLRPC$SecureValueType = new TLRPC$SecureValueType() {
                    public static int constructor = 1034709504;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
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
