package org.telegram.tgnet;

public abstract class TLRPC$account_WallPapers extends TLObject {
    public static TLRPC$account_WallPapers TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$account_WallPapers tLRPC$TL_account_wallPapers = i != -842824308 ? i != 471437699 ? null : new TLRPC$account_WallPapers() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(471437699);
            }
        } : new TLRPC$TL_account_wallPapers();
        if (tLRPC$TL_account_wallPapers == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in account_WallPapers", Integer.valueOf(i)));
        }
        if (tLRPC$TL_account_wallPapers != null) {
            tLRPC$TL_account_wallPapers.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_account_wallPapers;
    }
}
