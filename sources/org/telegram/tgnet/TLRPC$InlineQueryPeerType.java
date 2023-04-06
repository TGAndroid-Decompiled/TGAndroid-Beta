package org.telegram.tgnet;
public abstract class TLRPC$InlineQueryPeerType extends TLObject {
    public static TLRPC$InlineQueryPeerType TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InlineQueryPeerType tLRPC$InlineQueryPeerType;
        switch (i) {
            case -2093215828:
                tLRPC$InlineQueryPeerType = new TLRPC$InlineQueryPeerType() {
                    public static int constructor = -2093215828;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -681130742:
                tLRPC$InlineQueryPeerType = new TLRPC$InlineQueryPeerType() {
                    public static int constructor = -681130742;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 238759180:
                tLRPC$InlineQueryPeerType = new TLRPC$InlineQueryPeerType() {
                    public static int constructor = 238759180;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 813821341:
                tLRPC$InlineQueryPeerType = new TLRPC$InlineQueryPeerType() {
                    public static int constructor = 813821341;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1589952067:
                tLRPC$InlineQueryPeerType = new TLRPC$InlineQueryPeerType() {
                    public static int constructor = 1589952067;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1664413338:
                tLRPC$InlineQueryPeerType = new TLRPC$InlineQueryPeerType() {
                    public static int constructor = 1664413338;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
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
