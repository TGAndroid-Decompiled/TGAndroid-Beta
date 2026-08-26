package org.telegram.ui;

import android.app.Activity;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.JoinGroupAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;

public final class UserInfoActivity$$ExternalSyntheticLambda1 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;

    public UserInfoActivity$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f$0;
                userInfoActivity.getClass();
                AndroidUtilities.runOnUIThread(new UserInfoActivity$$ExternalSyntheticLambda7(userInfoActivity, tL_error, (TLObject) this.f$1, (TL_account.TL_birthday) this.f$2, (TLRPC.UserFull) this.f$3, tLObject, (int[]) this.f$4, (ArrayList) this.f$5));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new UserInfoActivity$$ExternalSyntheticLambda7(tL_error, (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$0, tLObject, (List) this.f$1, (BillingResult) this.f$2, (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$3, (BaseFragment) this.f$4, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f$5, 3));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new UserInfoActivity$$ExternalSyntheticLambda7(tL_error, (Utilities.Callback) this.f$0, tLObject, (List) this.f$1, (BillingResult) this.f$2, (Utilities.Callback) this.f$3, (BaseFragment) this.f$4, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f$5, 4));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new UserInfoActivity$$ExternalSyntheticLambda7(tLObject, (ProductDetails) this.f$0, (BillingResult) this.f$1, (OAuthSheet$$ExternalSyntheticLambda18) this.f$2, (Activity) this.f$3, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f$4, (List) this.f$5, tL_error, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new UserInfoActivity$$ExternalSyntheticLambda7(tLObject, (ProductDetails) this.f$0, (BillingResult) this.f$1, (JoinGroupAlert$$ExternalSyntheticLambda3) this.f$2, (Activity) this.f$3, (TLRPC.TL_inputStorePaymentStarsGift) this.f$4, (List) this.f$5, tL_error, 6));
                break;
        }
    }
}
