package org.telegram.ui;

import com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams;
import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class ExternalActionActivity$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final int f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;
    public final Object f$7;

    public ExternalActionActivity$$ExternalSyntheticLambda3(int i, File file, String str, AlertDialog alertDialog, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f$3 = i;
        this.f$0 = file;
        this.f$6 = str;
        this.f$1 = alertDialog;
        this.f$2 = zArr;
        this.f$7 = str2;
        this.f$4 = callback;
        this.f$5 = zArr2;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((ExternalActionActivity) this.f$0).lambda$handleIntent$6((AlertDialog) this.f$1, (TLObject) this.f$2, this.f$3, (TL_account.authorizationForm) this.f$4, (TL_account.getAuthorizationForm) this.f$5, (String) this.f$6, (String) this.f$7);
                break;
            case 1:
                boolean[] zArr = (boolean[]) this.f$5;
                MediaController.lambda$saveFile$50(this.f$3, (File) this.f$0, (String) this.f$6, (AlertDialog) this.f$1, (boolean[]) this.f$2, (String) this.f$7, (Utilities.Callback) this.f$4, zArr);
                break;
            default:
                PremiumPreviewFragment.lambda$buyPremium$13((TLObject) this.f$2, (BaseFragment) this.f$0, (TLRPC.TL_inputStorePaymentPremiumSubscription) this.f$1, (PremiumPreviewFragment.SubscriptionTier) this.f$4, (BillingFlowParams$SubscriptionUpdateParams) this.f$5, this.f$3, (TLRPC.TL_error) this.f$6, (TLRPC.TL_payments_canPurchaseStore) this.f$7);
                break;
        }
    }

    public ExternalActionActivity$$ExternalSyntheticLambda3(TLObject tLObject, BaseFragment baseFragment, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, PremiumPreviewFragment.SubscriptionTier subscriptionTier, BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams, int i, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f$2 = tLObject;
        this.f$0 = baseFragment;
        this.f$1 = tL_inputStorePaymentPremiumSubscription;
        this.f$4 = subscriptionTier;
        this.f$5 = billingFlowParams$SubscriptionUpdateParams;
        this.f$3 = i;
        this.f$6 = tL_error;
        this.f$7 = tL_payments_canPurchaseStore;
    }

    public ExternalActionActivity$$ExternalSyntheticLambda3(ExternalActionActivity externalActionActivity, AlertDialog alertDialog, TLObject tLObject, int i, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f$0 = externalActionActivity;
        this.f$1 = alertDialog;
        this.f$2 = tLObject;
        this.f$3 = i;
        this.f$4 = authorizationform;
        this.f$5 = getauthorizationform;
        this.f$6 = str;
        this.f$7 = str2;
    }
}
