package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams;
import com.android.billingclient.api.zzcl;
import java.io.File;
import java.util.Collections;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AlertsCreator;

public final class ExternalActionActivity$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final int f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;
    public final Object f$7;

    public ExternalActionActivity$$ExternalSyntheticLambda9(int i, File file, String str, AlertDialog alertDialog, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
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
                AlertDialog alertDialog = (AlertDialog) this.f$1;
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f$0;
                externalActionActivity.getClass();
                try {
                    alertDialog.dismiss();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = (TLObject) this.f$2;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    MessagesController messagesController = MessagesController.getInstance(this.f$3);
                    TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) this.f$4;
                    messagesController.putUsers(authorizationform.users, false);
                    TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) this.f$5;
                    PassportActivity passportActivity = new PassportActivity(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, (String) this.f$6, (String) this.f$7, (String) null, authorizationform, password);
                    passportActivity.needActivityResult = true;
                    if (AndroidUtilities.isTablet()) {
                        ActionBarLayout actionBarLayout = externalActionActivity.layersActionBarLayout;
                        actionBarLayout.getClass();
                        actionBarLayout.addFragmentToStack(-1, passportActivity);
                    } else {
                        ActionBarLayout actionBarLayout2 = externalActionActivity.actionBarLayout;
                        actionBarLayout2.getClass();
                        actionBarLayout2.addFragmentToStack(-1, passportActivity);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.backgroundTablet.setVisibility(8);
                    }
                    externalActionActivity.actionBarLayout.showLastFragment();
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.layersActionBarLayout.showLastFragment();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                MediaController.lambda$saveFile$50(this.f$3, (File) this.f$0, (String) this.f$6, (AlertDialog) this.f$1, (boolean[]) this.f$2, (String) this.f$7, (Utilities.Callback) this.f$4, (boolean[]) this.f$5);
                return;
            default:
                boolean z = ((TLObject) this.f$2) instanceof TLRPC.TL_boolTrue;
                BaseFragment baseFragment = (BaseFragment) this.f$0;
                if (!z) {
                    AlertsCreator.processError(this.f$3, (TLRPC.TL_error) this.f$6, baseFragment, (TLRPC.TL_payments_canPurchaseStore) this.f$7, new Object[0]);
                    return;
                }
                Activity parentActivity = baseFragment != null ? baseFragment.getParentActivity() : AndroidUtilities.getActivity();
                BillingController billingController = BillingController.getInstance();
                AccountInstance accountInstance = baseFragment.getAccountInstance();
                zzcl zzclVar = new zzcl((char) 0, 16);
                zzclVar.setProductDetails(BillingController.PREMIUM_PRODUCT_DETAILS);
                PremiumPreviewFragment.SubscriptionTier subscriptionTier = (PremiumPreviewFragment.SubscriptionTier) this.f$4;
                subscriptionTier.checkOfferDetails();
                String str = subscriptionTier.offerDetails.zzc;
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                zzclVar.zzc = str;
                billingController.launchBillingFlow(parentActivity, accountInstance, (TLRPC.TL_inputStorePaymentPremiumSubscription) this.f$1, Collections.singletonList(zzclVar.build()), (BillingFlowParams$SubscriptionUpdateParams) this.f$5, false);
                return;
        }
    }

    public ExternalActionActivity$$ExternalSyntheticLambda9(TLObject tLObject, BaseFragment baseFragment, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, PremiumPreviewFragment.SubscriptionTier subscriptionTier, BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams, int i, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f$2 = tLObject;
        this.f$0 = baseFragment;
        this.f$1 = tL_inputStorePaymentPremiumSubscription;
        this.f$4 = subscriptionTier;
        this.f$5 = billingFlowParams$SubscriptionUpdateParams;
        this.f$3 = i;
        this.f$6 = tL_error;
        this.f$7 = tL_payments_canPurchaseStore;
    }

    public ExternalActionActivity$$ExternalSyntheticLambda9(ExternalActionActivity externalActionActivity, AlertDialog alertDialog, TLObject tLObject, int i, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
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
