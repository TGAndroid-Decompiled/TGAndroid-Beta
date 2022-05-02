package org.telegram.tgnet;

public abstract class TLRPC$account_Themes extends TLObject {
    public static TLRPC$account_Themes TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$account_Themes tLRPC$account_Themes;
        if (i != -1707242387) {
            tLRPC$account_Themes = i != -199313886 ? null : new TLRPC$account_Themes() {
                public static int constructor = -199313886;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        } else {
            tLRPC$account_Themes = new TLRPC$TL_account_themes();
        }
        if (tLRPC$account_Themes != null || !z) {
            if (tLRPC$account_Themes != null) {
                tLRPC$account_Themes.readParams(abstractSerializedData, z);
            }
            return tLRPC$account_Themes;
        }
        throw new RuntimeException(String.format("can't parse magic %x in account_Themes", Integer.valueOf(i)));
    }
}
