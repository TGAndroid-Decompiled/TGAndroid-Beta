package org.telegram.tgnet;

public abstract class TLRPC$account_WallPapers extends TLObject {
    public static TLRPC$account_WallPapers TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$account_WallPapers tLRPC$account_WallPapers;
        if (i != -842824308) {
            tLRPC$account_WallPapers = i != 471437699 ? null : new TLRPC$account_WallPapers() {
                public static int constructor = 471437699;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        } else {
            tLRPC$account_WallPapers = new TLRPC$TL_account_wallPapers();
        }
        if (tLRPC$account_WallPapers != null || !z) {
            if (tLRPC$account_WallPapers != null) {
                tLRPC$account_WallPapers.readParams(abstractSerializedData, z);
            }
            return tLRPC$account_WallPapers;
        }
        throw new RuntimeException(String.format("can't parse magic %x in account_WallPapers", Integer.valueOf(i)));
    }
}
