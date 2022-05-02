package org.telegram.tgnet;

public abstract class TLRPC$storage_FileType extends TLObject {
    public static TLRPC$storage_FileType TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$storage_FileType tLRPC$storage_FileType;
        switch (i) {
            case -1432995067:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    public static int constructor = -1432995067;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1373745011:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    public static int constructor = -1373745011;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1278304028:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    public static int constructor = -1278304028;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -891180321:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    public static int constructor = -891180321;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 8322574:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    public static int constructor = 8322574;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 172975040:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    public static int constructor = 172975040;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 276907596:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    public static int constructor = 276907596;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1086091090:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    public static int constructor = 1086091090;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1258941372:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    public static int constructor = 1258941372;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1384777335:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    public static int constructor = 1384777335;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            default:
                tLRPC$storage_FileType = null;
                break;
        }
        if (tLRPC$storage_FileType != null || !z) {
            if (tLRPC$storage_FileType != null) {
                tLRPC$storage_FileType.readParams(abstractSerializedData, z);
            }
            return tLRPC$storage_FileType;
        }
        throw new RuntimeException(String.format("can't parse magic %x in storage_FileType", Integer.valueOf(i)));
    }
}
