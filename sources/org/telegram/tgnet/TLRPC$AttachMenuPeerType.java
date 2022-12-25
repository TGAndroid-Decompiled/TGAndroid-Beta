package org.telegram.tgnet;

public abstract class TLRPC$AttachMenuPeerType extends TLObject {
    public static TLRPC$AttachMenuPeerType TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$AttachMenuPeerType tLRPC$AttachMenuPeerType;
        switch (i) {
            case -1020528102:
                tLRPC$AttachMenuPeerType = new TLRPC$AttachMenuPeerType() {
                    public static int constructor = -1020528102;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -247016673:
                tLRPC$AttachMenuPeerType = new TLRPC$AttachMenuPeerType() {
                    public static int constructor = -247016673;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 84480319:
                tLRPC$AttachMenuPeerType = new TLRPC$AttachMenuPeerType() {
                    public static int constructor = 84480319;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 2080104188:
                tLRPC$AttachMenuPeerType = new TLRPC$AttachMenuPeerType() {
                    public static int constructor = 2080104188;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 2104224014:
                tLRPC$AttachMenuPeerType = new TLRPC$AttachMenuPeerType() {
                    public static int constructor = 2104224014;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            default:
                tLRPC$AttachMenuPeerType = null;
                break;
        }
        if (tLRPC$AttachMenuPeerType == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in AttachMenuPeerType", Integer.valueOf(i)));
        }
        if (tLRPC$AttachMenuPeerType != null) {
            tLRPC$AttachMenuPeerType.readParams(abstractSerializedData, z);
        }
        return tLRPC$AttachMenuPeerType;
    }
}
