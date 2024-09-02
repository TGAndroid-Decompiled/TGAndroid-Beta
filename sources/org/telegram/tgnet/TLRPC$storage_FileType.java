package org.telegram.tgnet;

public abstract class TLRPC$storage_FileType extends TLObject {
    public static TLRPC$storage_FileType TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$storage_FileType tLRPC$storage_FileType;
        switch (i) {
            case -1432995067:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1432995067);
                    }
                };
                break;
            case -1373745011:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1373745011);
                    }
                };
                break;
            case -1278304028:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1278304028);
                    }
                };
                break;
            case -891180321:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-891180321);
                    }
                };
                break;
            case 8322574:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(8322574);
                    }
                };
                break;
            case 172975040:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(172975040);
                    }
                };
                break;
            case 276907596:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(276907596);
                    }
                };
                break;
            case 1086091090:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1086091090);
                    }
                };
                break;
            case 1258941372:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1258941372);
                    }
                };
                break;
            case 1384777335:
                tLRPC$storage_FileType = new TLRPC$storage_FileType() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1384777335);
                    }
                };
                break;
            default:
                tLRPC$storage_FileType = null;
                break;
        }
        if (tLRPC$storage_FileType == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in storage_FileType", Integer.valueOf(i)));
        }
        if (tLRPC$storage_FileType != null) {
            tLRPC$storage_FileType.readParams(abstractSerializedData, z);
        }
        return tLRPC$storage_FileType;
    }
}
