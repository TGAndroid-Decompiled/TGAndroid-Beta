package org.telegram.messenger;

import android.app.Activity;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.hw0;
import org.telegram.ui.xm0;

public final class z5 implements Runnable {

    public final int f22302a = 0;

    public final Object f22303b;

    public final int f22304c;
    public final Object d;

    public final Object f22305e;

    public final Object f22306f;
    public final Object h;

    public final Object f22307n;

    public final Object f22308r;

    public z5(int i10, File file, String str, org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f22304c = i10;
        this.f22306f = file;
        this.d = str;
        this.f22303b = b2Var;
        this.h = zArr;
        this.f22305e = str2;
        this.f22308r = callback;
        this.f22307n = zArr2;
    }

    @Override
    public final void run() throws Throwable {
        int i10 = this.f22302a;
        int i11 = this.f22304c;
        Object obj = this.f22308r;
        Object obj2 = this.f22307n;
        Object obj3 = this.h;
        Object obj4 = this.f22303b;
        Object obj5 = this.f22305e;
        Object obj6 = this.d;
        Object obj7 = this.f22306f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$50(this.f22304c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.b2) obj4, (boolean[]) obj3, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj2);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj4;
                TLObject tLObject = (TLObject) obj3;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj2;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f35468x;
                try {
                    b2Var.dismiss();
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    xm0 xm0Var = new xm0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    xm0Var.f44537y1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, xm0Var);
                    } else {
                        externalActionActivity.f35472c.c(-1, xm0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.f35473e.setVisibility(8);
                    }
                    externalActionActivity.f35472c.c0();
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c0();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj6;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) obj5;
                hw0 hw0Var = (hw0) obj4;
                n2.e eVar = (n2.e) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                if (!(((TLObject) obj7) instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Components.y4.f0(i11, tL_error, n2Var, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                }
                Activity parentActivity = n2Var != null ? n2Var.getParentActivity() : AndroidUtilities.getActivity();
                BillingController billingController = BillingController.getInstance();
                AccountInstance accountInstance = n2Var.getAccountInstance();
                g5.b bVar = new g5.b(22);
                bVar.t(BillingController.PREMIUM_PRODUCT_DETAILS);
                hw0Var.a();
                String str3 = hw0Var.f38900g.f18159a;
                if (TextUtils.isEmpty(str3)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                bVar.f6390c = str3;
                billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(bVar.i()), eVar, false);
                return;
        }
    }

    public z5(TLObject tLObject, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, hw0 hw0Var, n2.e eVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f22306f = tLObject;
        this.d = n2Var;
        this.f22305e = tL_inputStorePaymentPremiumSubscription;
        this.f22303b = hw0Var;
        this.h = eVar;
        this.f22304c = i10;
        this.f22307n = tL_error;
        this.f22308r = tL_payments_canPurchaseStore;
    }

    public z5(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f22306f = externalActionActivity;
        this.f22303b = b2Var;
        this.h = tLObject;
        this.f22304c = i10;
        this.f22307n = authorizationform;
        this.f22308r = getauthorizationform;
        this.d = str;
        this.f22305e = str2;
    }
}
