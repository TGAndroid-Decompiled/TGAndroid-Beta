package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.Components.ContextProgressView;

public final class PaymentFormActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final PaymentFormActivity f$0;
    public final TLObject f$1;

    public PaymentFormActivity$$ExternalSyntheticLambda0(PaymentFormActivity paymentFormActivity, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = paymentFormActivity;
        this.f$1 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$sendData$62(this.f$1);
                break;
            case 1:
                PaymentFormActivity paymentFormActivity = this.f$0;
                Utilities.Callback callback = paymentFormActivity.customAnyResultReceiver;
                TLObject tLObject = this.f$1;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                paymentFormActivity.setDonePressed(false);
                paymentFormActivity.webviewLoading = true;
                paymentFormActivity.showEditDoneProgress$3(true, true);
                ContextProgressView contextProgressView = paymentFormActivity.progressView;
                if (contextProgressView != null) {
                    contextProgressView.setVisibility(0);
                }
                ActionBarMenuItem actionBarMenuItem = paymentFormActivity.doneItem;
                if (actionBarMenuItem != null) {
                    actionBarMenuItem.setEnabled(false);
                    paymentFormActivity.doneItem.getContentView().setVisibility(4);
                }
                INavigationLayout parentLayout = paymentFormActivity.getParentLayout();
                Activity parentActivity = paymentFormActivity.getParentActivity();
                paymentFormActivity.getMessagesController().newMessageCallback = new VoIPFragment$$ExternalSyntheticLambda42(paymentFormActivity, parentLayout, parentActivity, 14);
                WebView webView = paymentFormActivity.webView;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = paymentFormActivity.webView;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    paymentFormActivity.webViewUrl = str;
                    webView2.loadUrl(str);
                }
                paymentFormActivity.paymentStatusSent = true;
                paymentFormActivity.invoiceStatus = 3;
                PaymentFormActivity.PaymentFormCallback paymentFormCallback = paymentFormActivity.paymentFormCallback;
                if (paymentFormCallback != null) {
                    paymentFormCallback.onInvoiceStatusChanged(3);
                }
                break;
            default:
                this.f$0.lambda$sendData$57(this.f$1);
                break;
        }
    }
}
