package org.telegram.messenger;

import android.widget.TextView;
import java.io.File;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.ms0;
public final class yd implements Runnable {
    public final int f26570a = 0;
    public final Object f26571b;
    public final int f26572c;
    public final Object d;
    public final Object f26573e;
    public final Object f26574f;
    public final Object h;
    public final Object f26575n;
    public final Object f26576r;

    public yd(int i3, File file, String str, org.telegram.ui.ActionBar.s1 s1Var, boolean[] zArr, String str2, u10 u10Var, boolean[] zArr2) {
        this.f26572c = i3;
        this.f26574f = file;
        this.d = str;
        this.f26571b = s1Var;
        this.h = zArr;
        this.f26573e = str2;
        this.f26576r = u10Var;
        this.f26575n = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yd.run():void");
    }

    public yd(TLObject tLObject, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, ms0 ms0Var, ad.b bVar, int i3, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f26574f = tLObject;
        this.d = d2Var;
        this.f26573e = tL_inputStorePaymentPremiumSubscription;
        this.f26571b = ms0Var;
        this.h = bVar;
        this.f26572c = i3;
        this.f26575n = tL_error;
        this.f26576r = tL_payments_canPurchaseStore;
    }

    public yd(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, int i3, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f26574f = externalActionActivity;
        this.f26571b = s1Var;
        this.h = tLObject;
        this.f26572c = i3;
        this.f26575n = authorizationform;
        this.f26576r = getauthorizationform;
        this.d = str;
        this.f26573e = str2;
    }

    public yd(org.telegram.ui.Wallet.h0 h0Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i3, org.telegram.ui.Wallet.s2 s2Var, org.telegram.ui.Wallet.k0 k0Var) {
        this.f26574f = h0Var;
        this.d = str;
        this.f26571b = bArr;
        this.h = jSONObject;
        this.f26573e = str2;
        this.f26572c = i3;
        this.f26575n = s2Var;
        this.f26576r = k0Var;
    }

    public yd(Runnable[] runnableArr, TextView[] textViewArr, int i3, org.telegram.ui.ActionBar.e6 e6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f26574f = runnableArr;
        this.d = textViewArr;
        this.f26572c = i3;
        this.f26573e = e6Var;
        this.f26571b = wallettransaction;
        this.f26575n = strArr;
        this.h = zArr;
        this.f26576r = bArr;
    }
}
