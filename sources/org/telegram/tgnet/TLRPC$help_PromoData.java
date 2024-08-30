package org.telegram.tgnet;

public abstract class TLRPC$help_PromoData extends TLObject {
    public static TLRPC$help_PromoData TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$help_PromoData tLRPC$TL_help_promoDataEmpty = i != -1942390465 ? i != -1728664459 ? null : new TLRPC$TL_help_promoDataEmpty() : new TLRPC$TL_help_promoData();
        if (tLRPC$TL_help_promoDataEmpty == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in help_PromoData", Integer.valueOf(i)));
        }
        if (tLRPC$TL_help_promoDataEmpty != null) {
            tLRPC$TL_help_promoDataEmpty.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_help_promoDataEmpty;
    }
}
