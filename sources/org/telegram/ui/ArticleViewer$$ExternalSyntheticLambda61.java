package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;

public final class ArticleViewer$$ExternalSyntheticLambda61 implements RequestDelegate {
    public final int $r8$classId = 3;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;

    public ArticleViewer$$ExternalSyntheticLambda61(int i, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Activity activity) {
        this.f$1 = i;
        this.f$0 = zArr;
        this.f$2 = file;
        this.f$3 = setcallrating;
        this.f$4 = arrayList;
        this.f$5 = activity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer articleViewer = (ArticleViewer) this.f$0;
                articleViewer.getClass();
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda70(articleViewer, this.f$1, (ArticleViewer.AnonymousClass13) this.f$2, tLObject, (String) this.f$3, (ArticleViewer$$ExternalSyntheticLambda60) this.f$4, (TLRPC.TL_messages_getWebPage) this.f$5, 0));
                break;
            case 1:
                ((SendMessagesHelper) this.f$0).lambda$performSendDelayedMessage$54((TLRPC.InputFile) this.f$2, (TLRPC.InputMedia) this.f$4, (SendMessagesHelper.DelayedMessage) this.f$5, this.f$1, (String) this.f$3, tLObject, tL_error);
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda70(tLObject, (AlertDialog) this.f$0, (Context) this.f$2, this.f$1, (TL_phone.exportGroupCallInvite) this.f$3, (Theme.ResourcesProvider) this.f$4, (GroupCreateActivity$$ExternalSyntheticLambda7) this.f$5));
                break;
            case 3:
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(this.f$1).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                if (((boolean[]) this.f$0)[0]) {
                    File file = (File) this.f$2;
                    if (file.exists() && ((TL_phone.setCallRating) this.f$3).rating < 4) {
                        SendMessagesHelper.prepareSendingDocument(AccountInstance.getInstance(UserConfig.selectedAccount), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", (ArrayList) this.f$4), "text/plain", 4244000L, null, null, null, null, null, true, 0, null, null, false);
                        Toast.makeText((Activity) this.f$5, LocaleController.getString(R.string.CallReportSent), 1).show();
                        break;
                    }
                }
                break;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                launchActivity.getClass();
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda70(launchActivity, tLObject, this.f$1, (DialogsActivity) this.f$2, (BaseFragment) this.f$4, (TLRPC.User) this.f$5, (String) this.f$3));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ExternalActionActivity$$ExternalSyntheticLambda9(tLObject, (BaseFragment) this.f$0, (TLRPC.TL_inputStorePaymentPremiumSubscription) this.f$2, (PremiumPreviewFragment.SubscriptionTier) this.f$3, (BillingFlowParams$SubscriptionUpdateParams) this.f$4, this.f$1, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.f$5));
                break;
            default:
                Activity activity = (Activity) this.f$0;
                ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda29 = (ShareAlert$$ExternalSyntheticLambda29) this.f$5;
                Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$2;
                BaseFragment baseFragment = (BaseFragment) this.f$4;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375(tLObject, (Object) activity, (Object) resourcesProvider, this.f$3, (Object) baseFragment, (Object) shareAlert$$ExternalSyntheticLambda29, 10));
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda25(baseFragment, activity, resourcesProvider, shareAlert$$ExternalSyntheticLambda29, 0), 200L);
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2(baseFragment, this.f$1, shareAlert$$ExternalSyntheticLambda29, 1), 200L);
                    }
                    break;
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda25(baseFragment, activity, resourcesProvider, shareAlert$$ExternalSyntheticLambda29, 1), 200L);
                    break;
                }
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda61(Activity activity, Theme.ResourcesProvider resourcesProvider, byte[] bArr, BaseFragment baseFragment, ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda29, int i) {
        this.f$0 = activity;
        this.f$2 = resourcesProvider;
        this.f$3 = bArr;
        this.f$4 = baseFragment;
        this.f$5 = shareAlert$$ExternalSyntheticLambda29;
        this.f$1 = i;
    }

    public ArticleViewer$$ExternalSyntheticLambda61(SendMessagesHelper sendMessagesHelper, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i, String str) {
        this.f$0 = sendMessagesHelper;
        this.f$2 = inputFile;
        this.f$4 = inputMedia;
        this.f$5 = delayedMessage;
        this.f$1 = i;
        this.f$3 = str;
    }

    public ArticleViewer$$ExternalSyntheticLambda61(AlertDialog alertDialog, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, Theme.ResourcesProvider resourcesProvider, GroupCreateActivity$$ExternalSyntheticLambda7 groupCreateActivity$$ExternalSyntheticLambda7) {
        this.f$0 = alertDialog;
        this.f$2 = context;
        this.f$1 = i;
        this.f$3 = exportgroupcallinvite;
        this.f$4 = resourcesProvider;
        this.f$5 = groupCreateActivity$$ExternalSyntheticLambda7;
    }

    public ArticleViewer$$ExternalSyntheticLambda61(BaseFragment baseFragment, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, PremiumPreviewFragment.SubscriptionTier subscriptionTier, BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams, int i, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f$0 = baseFragment;
        this.f$2 = tL_inputStorePaymentPremiumSubscription;
        this.f$3 = subscriptionTier;
        this.f$4 = billingFlowParams$SubscriptionUpdateParams;
        this.f$1 = i;
        this.f$5 = tL_payments_canPurchaseStore;
    }

    public ArticleViewer$$ExternalSyntheticLambda61(ArticleViewer articleViewer, int i, ArticleViewer.AnonymousClass13 anonymousClass13, String str, ArticleViewer$$ExternalSyntheticLambda60 articleViewer$$ExternalSyntheticLambda60, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f$0 = articleViewer;
        this.f$1 = i;
        this.f$2 = anonymousClass13;
        this.f$3 = str;
        this.f$4 = articleViewer$$ExternalSyntheticLambda60;
        this.f$5 = tL_messages_getWebPage;
    }

    public ArticleViewer$$ExternalSyntheticLambda61(LaunchActivity launchActivity, int i, DialogsActivity dialogsActivity, BaseFragment baseFragment, TLRPC.User user, String str) {
        this.f$0 = launchActivity;
        this.f$1 = i;
        this.f$2 = dialogsActivity;
        this.f$4 = baseFragment;
        this.f$5 = user;
        this.f$3 = str;
    }
}
