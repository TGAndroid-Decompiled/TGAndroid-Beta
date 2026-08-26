package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams;
import com.android.billingclient.api.BillingResult;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class ArticleViewer$$ExternalSyntheticLambda25 implements Runnable {
    public final int $r8$classId = 2;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final Object f$3;
    public final Object f$4;
    public final boolean f$5;
    public final Object f$6;

    public ArticleViewer$$ExternalSyntheticLambda25(BillingResult billingResult, BaseFragment baseFragment, boolean z, List list, int i, BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams, PremiumPreviewFragment.SubscriptionTier subscriptionTier) {
        this.f$0 = billingResult;
        this.f$1 = baseFragment;
        this.f$5 = z;
        this.f$3 = list;
        this.f$2 = i;
        this.f$4 = billingFlowParams$SubscriptionUpdateParams;
        this.f$6 = subscriptionTier;
    }

    @Override
    public final void run() {
        Object obj = this.f$6;
        Object obj2 = this.f$4;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        Object obj5 = this.f$3;
        switch (this.$r8$classId) {
            case 0:
                ((ArticleViewer) obj4).lambda$open$53((TLObject) obj3, this.f$2, (TLRPC.WebPage) obj5, (MessageObject) obj2, this.f$5, (String) obj);
                break;
            case 1:
                AlertDialog[] alertDialogArr = (AlertDialog[]) obj5;
                Browser.Progress progress = (Browser.Progress) obj4;
                if (progress != null) {
                    progress.end();
                } else {
                    try {
                        alertDialogArr[0].dismiss();
                        break;
                    } catch (Throwable unused) {
                    }
                    alertDialogArr[0] = null;
                }
                TLObject tLObject = (TLObject) obj3;
                Uri uri = (Uri) obj2;
                if (tLObject instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                    int i = this.f$2;
                    MessagesController.getInstance(i).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if ((webPage instanceof TLRPC.TL_webPage) && webPage.cached_page != null) {
                            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, tL_messageMediaWebPage.webpage, uri.toString());
                        }
                    }
                }
                Browser.openUrl((Context) obj, uri, this.f$5, false);
                break;
            default:
                PremiumPreviewFragment.lambda$buyPremium$15((BillingResult) obj4, (BaseFragment) obj3, this.f$5, (List) obj5, this.f$2, (BillingFlowParams$SubscriptionUpdateParams) obj2, (PremiumPreviewFragment.SubscriptionTier) obj);
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda25(Browser.Progress progress, AlertDialog[] alertDialogArr, TLObject tLObject, int i, Uri uri, Context context, boolean z) {
        this.f$0 = progress;
        this.f$3 = alertDialogArr;
        this.f$1 = tLObject;
        this.f$2 = i;
        this.f$4 = uri;
        this.f$6 = context;
        this.f$5 = z;
    }

    public ArticleViewer$$ExternalSyntheticLambda25(ArticleViewer articleViewer, TLObject tLObject, int i, TLRPC.WebPage webPage, MessageObject messageObject, boolean z, String str) {
        this.f$0 = articleViewer;
        this.f$1 = tLObject;
        this.f$2 = i;
        this.f$3 = webPage;
        this.f$4 = messageObject;
        this.f$5 = z;
        this.f$6 = str;
    }
}
