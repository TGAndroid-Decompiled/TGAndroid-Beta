package org.telegram.tgnet;

public abstract class TLRPC$payments_GiveawayInfo extends TLObject {
    public static TLRPC$payments_GiveawayInfo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$payments_GiveawayInfo tLRPC$TL_payments_giveawayInfo = i != 13456752 ? i != 1130879648 ? null : new TLRPC$TL_payments_giveawayInfo() : new TLRPC$TL_payments_giveawayInfoResults();
        if (tLRPC$TL_payments_giveawayInfo == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in payments_GiveawayInfo", Integer.valueOf(i)));
        }
        if (tLRPC$TL_payments_giveawayInfo != null) {
            tLRPC$TL_payments_giveawayInfo.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_payments_giveawayInfo;
    }
}
