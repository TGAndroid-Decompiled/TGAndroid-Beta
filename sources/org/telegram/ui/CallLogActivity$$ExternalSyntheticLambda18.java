package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.android.billingclient.api.ProductDetails;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LinkSpanDrawable;

public final class CallLogActivity$$ExternalSyntheticLambda18 implements RequestDelegate {
    public final int $r8$classId;
    public final int f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;

    public CallLogActivity$$ExternalSyntheticLambda18(KeyEvent.Callback callback, Object obj, int i, Object obj2, TLObject tLObject, String str, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$1 = callback;
        this.f$2 = obj;
        this.f$0 = i;
        this.f$3 = obj2;
        this.f$4 = tLObject;
        this.f$5 = str;
        this.f$6 = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                CallLogActivity.lambda$showCallLinkSheet$30(this.f$0, (TLRPC.InputGroupCall) this.f$1, (String[]) this.f$2, (FrameLayout) this.f$3, (LinkSpanDrawable.LinksTextView) this.f$4, (BottomSheet) this.f$5, (Theme.ResourcesProvider) this.f$6, tLObject, tL_error);
                break;
            case 1:
                ((ExternalActionActivity) this.f$1).lambda$handleIntent$10((int[]) this.f$2, this.f$0, (AlertDialog) this.f$3, (TL_account.getAuthorizationForm) this.f$4, (String) this.f$5, (String) this.f$6, tLObject, tL_error);
                break;
            case 2:
                ((ExternalActionActivity) this.f$1).lambda$handleIntent$7((AlertDialog) this.f$2, this.f$0, (TL_account.authorizationForm) this.f$3, (TL_account.getAuthorizationForm) this.f$4, (String) this.f$5, (String) this.f$6, tLObject, tL_error);
                break;
            default:
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f$6;
                ((LoginActivity.LoginPayView) this.f$1).lambda$setParams$27((ProductDetails.OneTimePurchaseOfferDetails) this.f$2, this.f$0, (ProductDetails) this.f$3, (TLRPC.TL_inputStorePaymentAuthCode) this.f$4, (String) this.f$5, tL_payments_canPurchaseStore, tLObject, tL_error);
                break;
        }
    }

    public CallLogActivity$$ExternalSyntheticLambda18(TLRPC.InputGroupCall inputGroupCall, int i, String[] strArr, FrameLayout frameLayout, LinkSpanDrawable.LinksTextView linksTextView, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider) {
        this.$r8$classId = 0;
        this.f$0 = i;
        this.f$1 = inputGroupCall;
        this.f$2 = strArr;
        this.f$3 = frameLayout;
        this.f$4 = linksTextView;
        this.f$5 = bottomSheet;
        this.f$6 = resourcesProvider;
    }
}
