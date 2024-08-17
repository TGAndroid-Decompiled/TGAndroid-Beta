package org.telegram.tgnet;

public abstract class TLRPC$InlineQueryPeerType extends TLObject {
    public static TLRPC$InlineQueryPeerType TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InlineQueryPeerType tLRPC$InlineQueryPeerType;
        switch (i) {
            case -2093215828:
                tLRPC$InlineQueryPeerType = new TLRPC$InlineQueryPeerType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-2093215828);
                    }
                };
                break;
            case -681130742:
                tLRPC$InlineQueryPeerType = new TLRPC$InlineQueryPeerType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-681130742);
                    }
                };
                break;
            case 238759180:
                tLRPC$InlineQueryPeerType = new TLRPC$InlineQueryPeerType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(238759180);
                    }
                };
                break;
            case 813821341:
                tLRPC$InlineQueryPeerType = new TLRPC$InlineQueryPeerType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(813821341);
                    }
                };
                break;
            case 1589952067:
                tLRPC$InlineQueryPeerType = new TLRPC$InlineQueryPeerType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1589952067);
                    }
                };
                break;
            case 1664413338:
                tLRPC$InlineQueryPeerType = new TLRPC$InlineQueryPeerType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1664413338);
                    }
                };
                break;
            default:
                tLRPC$InlineQueryPeerType = null;
                break;
        }
        if (tLRPC$InlineQueryPeerType == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InlineQueryPeerType", Integer.valueOf(i)));
        }
        if (tLRPC$InlineQueryPeerType != null) {
            tLRPC$InlineQueryPeerType.readParams(abstractSerializedData, z);
        }
        return tLRPC$InlineQueryPeerType;
    }
}
