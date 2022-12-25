package org.telegram.tgnet;

public abstract class TLRPC$TopPeerCategory extends TLObject {
    public static TLRPC$TopPeerCategory TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TopPeerCategory tLRPC$TopPeerCategory;
        switch (i) {
            case -1472172887:
                tLRPC$TopPeerCategory = new TLRPC$TopPeerCategory() {
                    public static int constructor = -1472172887;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1419371685:
                tLRPC$TopPeerCategory = new TLRPC$TopPeerCategory() {
                    public static int constructor = -1419371685;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1122524854:
                tLRPC$TopPeerCategory = new TLRPC$TopPeerCategory() {
                    public static int constructor = -1122524854;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -68239120:
                tLRPC$TopPeerCategory = new TLRPC$TopPeerCategory() {
                    public static int constructor = -68239120;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 104314861:
                tLRPC$TopPeerCategory = new TLRPC$TL_topPeerCategoryCorrespondents();
                break;
            case 344356834:
                tLRPC$TopPeerCategory = new TLRPC$TL_topPeerCategoryBotsInline();
                break;
            case 371037736:
                tLRPC$TopPeerCategory = new TLRPC$TopPeerCategory() {
                    public static int constructor = 371037736;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 511092620:
                tLRPC$TopPeerCategory = new TLRPC$TopPeerCategory() {
                    public static int constructor = 511092620;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            default:
                tLRPC$TopPeerCategory = null;
                break;
        }
        if (tLRPC$TopPeerCategory == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in TopPeerCategory", Integer.valueOf(i)));
        }
        if (tLRPC$TopPeerCategory != null) {
            tLRPC$TopPeerCategory.readParams(abstractSerializedData, z);
        }
        return tLRPC$TopPeerCategory;
    }
}
