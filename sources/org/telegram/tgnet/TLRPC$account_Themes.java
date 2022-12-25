package org.telegram.tgnet;

public abstract class TLRPC$account_Themes extends TLObject {
    public static TLRPC$account_Themes TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$account_Themes tLRPC$TL_account_themes;
        if (i == -1707242387) {
            tLRPC$TL_account_themes = new TLRPC$TL_account_themes();
        } else {
            tLRPC$TL_account_themes = i != -199313886 ? null : new TLRPC$account_Themes() {
                public static int constructor = -199313886;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        }
        if (tLRPC$TL_account_themes == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in account_Themes", Integer.valueOf(i)));
        }
        if (tLRPC$TL_account_themes != null) {
            tLRPC$TL_account_themes.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_account_themes;
    }
}
