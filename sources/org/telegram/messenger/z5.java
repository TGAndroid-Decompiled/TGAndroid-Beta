package org.telegram.messenger;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.kx0;
import org.telegram.ui.mn0;
public final class z5 implements Runnable {
    public final int f19966a = 0;
    public final Object f19967b;
    public final int f19968c;
    public final Object d;
    public final Object f19969e;
    public final Object f19970f;
    public final Object h;
    public final Object f19971n;
    public final Object f19972r;

    public z5(int i10, File file, String str, org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f19968c = i10;
        this.f19970f = file;
        this.d = str;
        this.f19967b = a2Var;
        this.h = zArr;
        this.f19969e = str2;
        this.f19972r = callback;
        this.f19971n = zArr2;
    }

    @Override
    public final void run() {
        Activity activity;
        org.telegram.ui.Wallet.o h;
        int i10 = this.f19966a;
        int i11 = this.f19968c;
        Object obj = this.f19972r;
        Object obj2 = this.h;
        Object obj3 = this.f19971n;
        Object obj4 = this.f19967b;
        Object obj5 = this.f19969e;
        Object obj6 = this.d;
        Object obj7 = this.f19970f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$50(this.f19968c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.a2) obj4, (boolean[]) obj2, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj3);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj4;
                TLObject tLObject = (TLObject) obj2;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj3;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f33777x;
                try {
                    a2Var.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    mn0 mn0Var = new mn0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    mn0Var.C1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, mn0Var);
                    } else {
                        externalActionActivity.f33781c.c(-1, mn0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.f33782e.setVisibility(8);
                    }
                    externalActionActivity.f33781c.c0();
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj6;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) obj5;
                kx0 kx0Var = (kx0) obj4;
                c5.f fVar = (c5.f) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                if (((TLObject) obj7) instanceof TLRPC.TL_boolTrue) {
                    if (m2Var != null) {
                        activity = m2Var.getParentActivity();
                    } else {
                        activity = AndroidUtilities.getActivity();
                    }
                    Activity activity2 = activity;
                    BillingController billingController = BillingController.getInstance();
                    AccountInstance accountInstance = m2Var.getAccountInstance();
                    pf.b bVar = new pf.b(7, false);
                    bVar.X(BillingController.PREMIUM_PRODUCT_DETAILS);
                    kx0Var.a();
                    String str3 = kx0Var.f39443g.f4274a;
                    if (!TextUtils.isEmpty(str3)) {
                        bVar.f45593c = str3;
                        billingController.launchBillingFlow(activity2, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(bVar.H()), fVar, false);
                        return;
                    }
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                org.telegram.ui.Components.g5.e0(i11, tL_error, m2Var, tL_payments_canPurchaseStore, new Object[0]);
                return;
            default:
                Runnable[] runnableArr = (Runnable[]) obj7;
                TextView[] textViewArr = (TextView[]) obj6;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj5;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                String[] strArr = (String[]) obj3;
                boolean[] zArr = (boolean[]) obj2;
                byte[] bArr = (byte[]) obj;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                int i12 = this.f19968c;
                ei.h1 h1Var = new ei.h1(runnableArr, textViewArr, i12, d6Var, 7);
                org.telegram.ui.Wallet.l0 v = org.telegram.ui.Wallet.l0.v(i12);
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null) {
                    org.telegram.ui.Wallet.b0 b0Var = new org.telegram.ui.Wallet.b0(v, wallettransaction.peer.address, nftitem, strArr[0], h1Var);
                    v.h0(b0Var);
                    h = new org.telegram.ui.Wallet.o(b0Var, 1);
                } else {
                    String str4 = wallettransaction.peer.address;
                    long j3 = wallettransaction.amount;
                    String str5 = strArr[0];
                    if (!zArr[0]) {
                        bArr = null;
                    }
                    h = v.h(str4, j3, str5, bArr, h1Var);
                }
                runnableArr[0] = h;
                return;
        }
    }

    public z5(TLObject tLObject, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, kx0 kx0Var, c5.f fVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f19970f = tLObject;
        this.d = m2Var;
        this.f19969e = tL_inputStorePaymentPremiumSubscription;
        this.f19967b = kx0Var;
        this.h = fVar;
        this.f19968c = i10;
        this.f19971n = tL_error;
        this.f19972r = tL_payments_canPurchaseStore;
    }

    public z5(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f19970f = externalActionActivity;
        this.f19967b = a2Var;
        this.h = tLObject;
        this.f19968c = i10;
        this.f19971n = authorizationform;
        this.f19972r = getauthorizationform;
        this.d = str;
        this.f19969e = str2;
    }

    public z5(Runnable[] runnableArr, TextView[] textViewArr, int i10, org.telegram.ui.ActionBar.d6 d6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f19970f = runnableArr;
        this.d = textViewArr;
        this.f19968c = i10;
        this.f19969e = d6Var;
        this.f19967b = wallettransaction;
        this.f19971n = strArr;
        this.h = zArr;
        this.f19972r = bArr;
    }
}
