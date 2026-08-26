package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.android.billingclient.api.ProductDetails;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LinkSpanDrawable;

public final class CallLogActivity$$ExternalSyntheticLambda46 implements RequestDelegate {
    public final int $r8$classId;
    public final int f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;

    public CallLogActivity$$ExternalSyntheticLambda46(int i, TLRPC.InputGroupCall inputGroupCall, String[] strArr, FrameLayout frameLayout, LinkSpanDrawable.LinksTextView linksTextView, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider) {
        this.$r8$classId = 0;
        this.f$0 = i;
        this.f$1 = inputGroupCall;
        this.f$2 = strArr;
        this.f$3 = frameLayout;
        this.f$4 = linksTextView;
        this.f$5 = bottomSheet;
        this.f$6 = resourcesProvider;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                boolean z = tLObject instanceof TLRPC.Updates;
                int i = this.f$0;
                if (z) {
                    MessagesController.getInstance(i).processUpdates((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = (TLRPC.InputGroupCall) this.f$1;
                ConnectionsManager.getInstance(i).sendRequest(exportgroupcallinvite, new ChatActivity$$ExternalSyntheticLambda206((String[]) this.f$2, (FrameLayout) this.f$3, (LinkSpanDrawable.LinksTextView) this.f$4, (BottomSheet) this.f$5, (Theme.ResourcesProvider) this.f$6, 1));
                break;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f$1;
                externalActionActivity.getClass();
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                AlertDialog alertDialog = (AlertDialog) this.f$3;
                if (authorizationform == null) {
                    AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(externalActionActivity, alertDialog, tL_error, 18));
                } else {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i2 = this.f$0;
                    ((int[]) this.f$2)[0] = ConnectionsManager.getInstance(i2).sendRequest(getpassword, new CallLogActivity$$ExternalSyntheticLambda46(externalActionActivity, alertDialog, i2, authorizationform, (TL_account.getAuthorizationForm) this.f$4, (String) this.f$5, (String) this.f$6, 2));
                }
                break;
            case 2:
                ExternalActionActivity externalActionActivity2 = (ExternalActionActivity) this.f$1;
                externalActionActivity2.getClass();
                AndroidUtilities.runOnUIThread(new ExternalActionActivity$$ExternalSyntheticLambda9(externalActionActivity2, (AlertDialog) this.f$2, tLObject, this.f$0, (TL_account.authorizationForm) this.f$3, (TL_account.getAuthorizationForm) this.f$4, (String) this.f$5, (String) this.f$6));
                break;
            default:
                LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) this.f$1;
                loginPayView.getClass();
                AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda101(loginPayView, tLObject, tL_error, (ProductDetails.OneTimePurchaseOfferDetails) this.f$2, this.f$0, (ProductDetails) this.f$3, (TLRPC.TL_inputStorePaymentAuthCode) this.f$4, (String) this.f$5, (TLRPC.TL_payments_canPurchaseStore) this.f$6, 4));
                break;
        }
    }

    public CallLogActivity$$ExternalSyntheticLambda46(KeyEvent.Callback callback, Object obj, int i, Object obj2, TLObject tLObject, String str, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$1 = callback;
        this.f$2 = obj;
        this.f$0 = i;
        this.f$3 = obj2;
        this.f$4 = tLObject;
        this.f$5 = str;
        this.f$6 = obj3;
    }
}
