package org.telegram.tgnet;

public abstract class TLRPC$InputStorePaymentPurpose extends TLObject {
    public static TLRPC$InputStorePaymentPurpose TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputStorePaymentPurpose tLRPC$TL_inputStorePaymentPremiumSubscription;
        switch (i) {
            case -1502273946:
                tLRPC$TL_inputStorePaymentPremiumSubscription = new TLRPC$TL_inputStorePaymentPremiumSubscription();
                break;
            case -572715178:
                tLRPC$TL_inputStorePaymentPremiumSubscription = new TLRPC$TL_inputStorePaymentStarsTopup();
                break;
            case -75955309:
                tLRPC$TL_inputStorePaymentPremiumSubscription = new TLRPC$TL_inputStorePaymentPremiumGiftCode();
                break;
            case 369444042:
                tLRPC$TL_inputStorePaymentPremiumSubscription = new TLRPC$TL_inputStorePaymentPremiumGiveaway();
                break;
            case 494149367:
                tLRPC$TL_inputStorePaymentPremiumSubscription = new TLRPC$TL_inputStorePaymentStarsGift();
                break;
            case 1634697192:
                tLRPC$TL_inputStorePaymentPremiumSubscription = new TLRPC$TL_inputStorePaymentGiftPremium();
                break;
            case 1964968186:
                tLRPC$TL_inputStorePaymentPremiumSubscription = new TLRPC$TL_inputStorePaymentStarsGiveaway();
                break;
            default:
                tLRPC$TL_inputStorePaymentPremiumSubscription = null;
                break;
        }
        if (tLRPC$TL_inputStorePaymentPremiumSubscription == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputStorePaymentPurpose", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputStorePaymentPremiumSubscription != null) {
            tLRPC$TL_inputStorePaymentPremiumSubscription.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputStorePaymentPremiumSubscription;
    }
}
