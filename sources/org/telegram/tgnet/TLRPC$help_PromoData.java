package org.telegram.tgnet;

public abstract class TLRPC$help_PromoData extends TLObject {
    public static TLRPC$help_PromoData TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$help_PromoData tLRPC$help_PromoData;
        if (i != -1942390465) {
            tLRPC$help_PromoData = i != -1728664459 ? null : new TLRPC$TL_help_promoDataEmpty();
        } else {
            tLRPC$help_PromoData = new TLRPC$TL_help_promoData();
        }
        if (tLRPC$help_PromoData != null || !z) {
            if (tLRPC$help_PromoData != null) {
                tLRPC$help_PromoData.readParams(abstractSerializedData, z);
            }
            return tLRPC$help_PromoData;
        }
        throw new RuntimeException(String.format("can't parse magic %x in help_PromoData", Integer.valueOf(i)));
    }
}
