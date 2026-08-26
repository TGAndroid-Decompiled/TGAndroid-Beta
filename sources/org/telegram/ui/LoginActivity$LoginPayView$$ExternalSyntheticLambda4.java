package org.telegram.ui;

import android.view.ViewGroup;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$LoginPayView$$ExternalSyntheticLambda4 implements PurchasesResponseListener, MediaDataController.KeywordResultCallback {
    public final ViewGroup f$0;
    public final Serializable f$1;
    public final Object f$2;
    public final Object f$3;
    public final Runnable f$4;

    public LoginActivity$LoginPayView$$ExternalSyntheticLambda4(ViewGroup viewGroup, Serializable serializable, Object obj, Object obj2, Runnable runnable) {
        this.f$0 = viewGroup;
        this.f$1 = serializable;
        this.f$2 = obj;
        this.f$3 = obj2;
        this.f$4 = runnable;
    }

    @Override
    public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        ((LoginActivity.LoginPayView) this.f$0).lambda$setParams$24((String) this.f$1, (TLRPC.TL_inputStorePaymentAuthCode) this.f$2, (TLRPC.TL_payments_canPurchaseStore) this.f$3, (LinkManager$$ExternalSyntheticLambda23) this.f$4, billingResult, list);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((SelectAnimatedEmojiDialog) this.f$0).lambda$search$26((LinkedHashSet) this.f$1, (HashMap) this.f$2, (ArrayList) this.f$3, this.f$4, arrayList, str);
    }
}
