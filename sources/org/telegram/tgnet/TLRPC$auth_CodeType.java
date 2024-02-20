package org.telegram.tgnet;
public abstract class TLRPC$auth_CodeType extends TLObject {
    public static TLRPC$auth_CodeType TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$auth_CodeType tLRPC$auth_CodeType;
        switch (i) {
            case -702884114:
                tLRPC$auth_CodeType = new TLRPC$auth_CodeType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-702884114);
                    }
                };
                break;
            case 116234636:
                tLRPC$auth_CodeType = new TLRPC$auth_CodeType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(116234636);
                    }
                };
                break;
            case 577556219:
                tLRPC$auth_CodeType = new TLRPC$auth_CodeType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(577556219);
                    }
                };
                break;
            case 1923290508:
                tLRPC$auth_CodeType = new TLRPC$auth_CodeType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1923290508);
                    }
                };
                break;
            case 1948046307:
                tLRPC$auth_CodeType = new TLRPC$auth_CodeType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1948046307);
                    }
                };
                break;
            default:
                tLRPC$auth_CodeType = null;
                break;
        }
        if (tLRPC$auth_CodeType == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in auth_CodeType", Integer.valueOf(i)));
        }
        if (tLRPC$auth_CodeType != null) {
            tLRPC$auth_CodeType.readParams(abstractSerializedData, z);
        }
        return tLRPC$auth_CodeType;
    }
}
