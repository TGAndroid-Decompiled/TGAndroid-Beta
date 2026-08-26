package org.telegram.ui;

import com.android.billingclient.api.BillingResult;
import java.util.List;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.SecureDocument;
import org.telegram.ui.ActionBar.AlertDialog;

public final class PassportActivity$$ExternalSyntheticLambda52 implements BillingController.ProductDetailsResponseListenerLegacy, AlertDialog.OnButtonClickListener {
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final Object f$3;
    public final String f$4;

    public PassportActivity$$ExternalSyntheticLambda52(int i, String str, SecureDocument secureDocument, PassportActivity.SecureDocumentCell secureDocumentCell, PassportActivity passportActivity) {
        this.f$0 = passportActivity;
        this.f$1 = secureDocument;
        this.f$2 = i;
        this.f$3 = secureDocumentCell;
        this.f$4 = str;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ((PassportActivity) this.f$0).lambda$addDocumentView$56((SecureDocument) this.f$1, this.f$2, (PassportActivity.SecureDocumentCell) this.f$3, this.f$4, alertDialog, i);
    }

    @Override
    public void onProductDetailsResponse(BillingResult billingResult, List list) {
        ((LoginActivity.LoginPayView) this.f$0).lambda$setParams$29(this.f$4, (String) this.f$1, (String) this.f$3, this.f$2, billingResult, list);
    }

    public PassportActivity$$ExternalSyntheticLambda52(LoginActivity.LoginPayView loginPayView, String str, String str2, String str3, int i) {
        this.f$0 = loginPayView;
        this.f$4 = str;
        this.f$1 = str2;
        this.f$3 = str3;
        this.f$2 = i;
    }
}
