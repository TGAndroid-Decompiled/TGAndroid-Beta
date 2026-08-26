package org.telegram.ui.Components.Premium.boosts;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import java.util.List;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda113;

public final class BoostRepository$$ExternalSyntheticLambda8 implements BillingController.ProductDetailsResponseListenerLegacy {
    public final int $r8$classId;
    public final TLRPC.InputStorePaymentPurpose f$0;
    public final TLRPC.TL_premiumGiftCodeOption f$1;
    public final ConnectionsManager f$2;
    public final Utilities.Callback f$3;
    public final Utilities.Callback f$4;
    public final BaseFragment f$5;

    public BoostRepository$$ExternalSyntheticLambda8(TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, ConnectionsManager connectionsManager, Utilities.Callback callback, Utilities.Callback callback2, BaseFragment baseFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = inputStorePaymentPurpose;
        this.f$1 = tL_premiumGiftCodeOption;
        this.f$2 = connectionsManager;
        this.f$3 = callback;
        this.f$4 = callback2;
        this.f$5 = baseFragment;
    }

    @Override
    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        switch (this.$r8$classId) {
            case 0:
                ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = ((ProductDetails) list.get(0)).getOneTimePurchaseOfferDetails();
                String str = oneTimePurchaseOfferDetails.zzc;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f$0;
                tL_inputStorePaymentPremiumGiveaway.currency = str;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(this.f$1.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiveaway;
                this.f$2.sendRequest(tL_payments_canPurchaseStore, new StarsController$$ExternalSyntheticLambda113((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$3, list, billingResult, (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$4, this.f$5, tL_inputStorePaymentPremiumGiveaway, 1));
                break;
            default:
                ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 = ((ProductDetails) list.get(0)).getOneTimePurchaseOfferDetails();
                String str2 = oneTimePurchaseOfferDetails2.zzc;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f$0;
                tL_inputStorePaymentPremiumGiftCode.currency = str2;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(this.f$1.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiftCode;
                this.f$2.sendRequest(tL_payments_canPurchaseStore2, new StarsController$$ExternalSyntheticLambda113(this.f$3, list, billingResult, this.f$4, this.f$5, tL_inputStorePaymentPremiumGiftCode, 2));
                break;
        }
    }
}
