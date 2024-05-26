package org.telegram.tgnet;
public abstract class TLRPC$InputStorePaymentPurpose extends TLObject {
    public static TLRPC$InputStorePaymentPurpose TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputStorePaymentPurpose tLRPC$TL_inputStorePaymentPremiumGiftCode;
        switch (i) {
            case -1551868097:
                tLRPC$TL_inputStorePaymentPremiumGiftCode = new TLRPC$TL_inputStorePaymentPremiumGiftCode();
                break;
            case -1502273946:
                tLRPC$TL_inputStorePaymentPremiumGiftCode = new TLRPC$TL_inputStorePaymentPremiumSubscription();
                break;
            case 369444042:
                tLRPC$TL_inputStorePaymentPremiumGiftCode = new TLRPC$TL_inputStorePaymentPremiumGiveaway();
                break;
            case 1326377183:
                tLRPC$TL_inputStorePaymentPremiumGiftCode = new TLRPC$TL_inputStorePaymentStars();
                break;
            case 1634697192:
                tLRPC$TL_inputStorePaymentPremiumGiftCode = new TLRPC$TL_inputStorePaymentGiftPremium();
                break;
            default:
                tLRPC$TL_inputStorePaymentPremiumGiftCode = null;
                break;
        }
        if (tLRPC$TL_inputStorePaymentPremiumGiftCode == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputStorePaymentPurpose", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputStorePaymentPremiumGiftCode != null) {
            tLRPC$TL_inputStorePaymentPremiumGiftCode.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputStorePaymentPremiumGiftCode;
    }
}
