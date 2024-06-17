package org.telegram.tgnet;

public abstract class TLRPC$AttachMenuPeerType extends TLObject {
    public static TLRPC$AttachMenuPeerType TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$AttachMenuPeerType tLRPC$AttachMenuPeerType;
        switch (i) {
            case -1020528102:
                tLRPC$AttachMenuPeerType = new TLRPC$AttachMenuPeerType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1020528102);
                    }
                };
                break;
            case -247016673:
                tLRPC$AttachMenuPeerType = new TLRPC$AttachMenuPeerType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-247016673);
                    }
                };
                break;
            case 84480319:
                tLRPC$AttachMenuPeerType = new TLRPC$AttachMenuPeerType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(84480319);
                    }
                };
                break;
            case 2080104188:
                tLRPC$AttachMenuPeerType = new TLRPC$AttachMenuPeerType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(2080104188);
                    }
                };
                break;
            case 2104224014:
                tLRPC$AttachMenuPeerType = new TLRPC$AttachMenuPeerType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(2104224014);
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
