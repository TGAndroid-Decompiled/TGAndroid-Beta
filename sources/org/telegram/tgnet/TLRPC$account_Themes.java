package org.telegram.tgnet;

public abstract class TLRPC$account_Themes extends TLObject {
    public static TLRPC$account_Themes TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$account_Themes tLRPC$TL_account_themes = i != -1707242387 ? i != -199313886 ? null : new TLRPC$account_Themes() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-199313886);
            }
        } : new TLRPC$TL_account_themes();
        if (tLRPC$TL_account_themes == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in account_Themes", Integer.valueOf(i)));
        }
        if (tLRPC$TL_account_themes != null) {
            tLRPC$TL_account_themes.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_account_themes;
    }
}
