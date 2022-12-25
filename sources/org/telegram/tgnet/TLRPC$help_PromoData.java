package org.telegram.tgnet;

public abstract class TLRPC$help_PromoData extends TLObject {
    public static TLRPC$help_PromoData TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$help_PromoData tLRPC$TL_help_promoData;
        if (i == -1942390465) {
            tLRPC$TL_help_promoData = new TLRPC$TL_help_promoData();
        } else {
            tLRPC$TL_help_promoData = i != -1728664459 ? null : new TLRPC$TL_help_promoDataEmpty();
        }
        if (tLRPC$TL_help_promoData == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in help_PromoData", Integer.valueOf(i)));
        }
        if (tLRPC$TL_help_promoData != null) {
            tLRPC$TL_help_promoData.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_help_promoData;
    }
}
