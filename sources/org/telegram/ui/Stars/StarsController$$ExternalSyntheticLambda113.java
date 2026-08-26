package org.telegram.ui.Stars;

import android.app.Activity;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.UserInfoActivity$$ExternalSyntheticLambda7;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda10;

public final class StarsController$$ExternalSyntheticLambda113 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final BillingResult f$1;
    public final Object f$2;
    public final Object f$3;
    public final TLRPC.InputStorePaymentPurpose f$4;
    public final List f$5;

    public StarsController$$ExternalSyntheticLambda113(ProductDetails productDetails, BillingResult billingResult, Utilities.Callback2 callback2, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, int i) {
        this.$r8$classId = i;
        this.f$0 = productDetails;
        this.f$1 = billingResult;
        this.f$2 = callback2;
        this.f$3 = activity;
        this.f$4 = inputStorePaymentPurpose;
        this.f$5 = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new UserInfoActivity$$ExternalSyntheticLambda7(tLObject, (ProductDetails) this.f$0, this.f$1, (BotBiometry$$ExternalSyntheticLambda10) this.f$2, (Activity) this.f$3, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f$4, this.f$5, tL_error, 5));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new UserInfoActivity$$ExternalSyntheticLambda7(tL_error, (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$0, tLObject, this.f$5, this.f$1, (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$2, (BaseFragment) this.f$3, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f$4, 3));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new UserInfoActivity$$ExternalSyntheticLambda7(tL_error, (Utilities.Callback) this.f$0, tLObject, this.f$5, this.f$1, (Utilities.Callback) this.f$2, (BaseFragment) this.f$3, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f$4, 4));
                break;
            default:
                AndroidUtilities.runOnUIThread(new UserInfoActivity$$ExternalSyntheticLambda7(tLObject, (ProductDetails) this.f$0, this.f$1, (StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4) this.f$2, (Activity) this.f$3, (TLRPC.TL_inputStorePaymentStarsGift) this.f$4, this.f$5, tL_error, 6));
                break;
        }
    }

    public StarsController$$ExternalSyntheticLambda113(Utilities.Callback callback, List list, BillingResult billingResult, Utilities.Callback callback2, BaseFragment baseFragment, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$5 = list;
        this.f$1 = billingResult;
        this.f$2 = callback2;
        this.f$3 = baseFragment;
        this.f$4 = inputStorePaymentPurpose;
    }
}
