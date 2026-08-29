package org.telegram.messenger;

import android.app.Activity;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.gw0;
import org.telegram.ui.vm0;
public final class z5 implements Runnable {
    public final int f22313a = 0;
    public final Object f22314b;
    public final int f22315c;
    public final Object d;
    public final Object f22316e;
    public final Object f22317f;
    public final Object h;
    public final Object f22318n;
    public final Object f22319r;

    public z5(int i10, File file, String str, org.telegram.ui.ActionBar.c2 c2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f22315c = i10;
        this.f22317f = file;
        this.d = str;
        this.f22314b = c2Var;
        this.h = zArr;
        this.f22316e = str2;
        this.f22319r = callback;
        this.f22318n = zArr2;
    }

    @Override
    public final void run() {
        Activity activity;
        int i10 = this.f22313a;
        int i11 = this.f22315c;
        Object obj = this.f22319r;
        Object obj2 = this.f22318n;
        Object obj3 = this.h;
        Object obj4 = this.f22314b;
        Object obj5 = this.f22316e;
        Object obj6 = this.d;
        Object obj7 = this.f22317f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$50(this.f22315c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.c2) obj4, (boolean[]) obj3, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj2);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj4;
                TLObject tLObject = (TLObject) obj3;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj2;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f35532x;
                try {
                    c2Var.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    vm0 vm0Var = new vm0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    vm0Var.f43680y1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, vm0Var);
                    } else {
                        externalActionActivity.f35536c.c(-1, vm0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.f35537e.setVisibility(8);
                    }
                    externalActionActivity.f35536c.c0();
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c0();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj6;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) obj5;
                gw0 gw0Var = (gw0) obj4;
                p2.e eVar = (p2.e) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                if (((TLObject) obj7) instanceof TLRPC.TL_boolTrue) {
                    if (o2Var != null) {
                        activity = o2Var.getParentActivity();
                    } else {
                        activity = AndroidUtilities.getActivity();
                    }
                    Activity activity2 = activity;
                    BillingController billingController = BillingController.getInstance();
                    AccountInstance accountInstance = o2Var.getAccountInstance();
                    oc.i iVar = new oc.i(16);
                    iVar.i2(BillingController.PREMIUM_PRODUCT_DETAILS);
                    gw0Var.a();
                    String str3 = gw0Var.f38682g.f45469a;
                    if (!TextUtils.isEmpty(str3)) {
                        iVar.f19484c = str3;
                        billingController.launchBillingFlow(activity2, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(iVar.M1()), eVar, false);
                        return;
                    }
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                org.telegram.ui.Components.c5.f0(i11, tL_error, o2Var, tL_payments_canPurchaseStore, new Object[0]);
                return;
        }
    }

    public z5(TLObject tLObject, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, gw0 gw0Var, p2.e eVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f22317f = tLObject;
        this.d = o2Var;
        this.f22316e = tL_inputStorePaymentPremiumSubscription;
        this.f22314b = gw0Var;
        this.h = eVar;
        this.f22315c = i10;
        this.f22318n = tL_error;
        this.f22319r = tL_payments_canPurchaseStore;
    }

    public z5(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f22317f = externalActionActivity;
        this.f22314b = c2Var;
        this.h = tLObject;
        this.f22315c = i10;
        this.f22318n = authorizationform;
        this.f22319r = getauthorizationform;
        this.d = str;
        this.f22316e = str2;
    }
}
