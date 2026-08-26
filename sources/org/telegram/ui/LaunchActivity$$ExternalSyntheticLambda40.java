package org.telegram.ui;

import com.android.billingclient.api.ProductDetails;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.CreateBotAlert;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda61;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class LaunchActivity$$ExternalSyntheticLambda40 implements Runnable {
    public final int $r8$classId = 4;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final int f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;
    public final Object f$7;
    public final Object f$8;

    public LaunchActivity$$ExternalSyntheticLambda40(int i, ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails, ProductDetails productDetails, String str, TLObject tLObject, TLRPC.TL_error tL_error, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, LoginActivity.LoginPayView loginPayView) {
        this.f$0 = loginPayView;
        this.f$1 = tLObject;
        this.f$2 = tL_error;
        this.f$4 = oneTimePurchaseOfferDetails;
        this.f$3 = i;
        this.f$5 = productDetails;
        this.f$6 = tL_inputStorePaymentAuthCode;
        this.f$8 = str;
        this.f$7 = tL_payments_canPurchaseStore;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$106((TLObject) this.f$1, (int[]) this.f$2, this.f$3, (Runnable) this.f$4, (Integer) this.f$5, (Integer) this.f$6, (Long) this.f$7, (Integer) this.f$8);
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$processLoadedDialogFilters$23((TLRPC.messages_Dialogs) this.f$1, (ArrayList) this.f$2, (TLRPC.messages_Dialogs) this.f$5, this.f$3, (ArrayList) this.f$6, (ArrayList) this.f$8, (ArrayList) this.f$7, (Runnable) this.f$4);
                break;
            case 2:
                int[] iArr = (int[]) this.f$7;
                CreateBotAlert.lambda$show$2((EditTextCell) this.f$0, (int[]) this.f$2, this.f$3, (String[]) this.f$1, (String[]) this.f$4, (ButtonWithCounterView) this.f$5, (TextInfoPrivacyCell) this.f$6, (Theme.ResourcesProvider) this.f$8, iArr);
                break;
            case 3:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$92((Runnable) this.f$4, (TLObject) this.f$1, this.f$3, (TL_account.authorizationForm) this.f$2, (TL_account.getAuthorizationForm) this.f$5, (String) this.f$6, (String) this.f$8, (String) this.f$7);
                break;
            case 4:
                ((LoginActivity.LoginPayView) this.f$0).lambda$setParams$26((TLObject) this.f$1, (TLRPC.TL_error) this.f$2, (ProductDetails.OneTimePurchaseOfferDetails) this.f$4, this.f$3, (ProductDetails) this.f$5, (TLRPC.TL_inputStorePaymentAuthCode) this.f$6, (String) this.f$8, (TLRPC.TL_payments_canPurchaseStore) this.f$7);
                break;
            default:
                StarsController starsController = (StarsController) this.f$0;
                starsController.getClass();
                ((boolean[]) this.f$1)[0] = true;
                StarsController$$ExternalSyntheticLambda61 starsController$$ExternalSyntheticLambda61 = new StarsController$$ExternalSyntheticLambda61(starsController, (boolean[]) this.f$6, this.f$3, (Utilities.Callback) this.f$8, (Utilities.Callback) this.f$7);
                starsController.payAfterConfirmed((MessageObject) this.f$2, (TLRPC.InputInvoice) this.f$4, (TLRPC.TL_payments_paymentFormStars) this.f$5, starsController$$ExternalSyntheticLambda61);
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda40(MessagesController messagesController, TLRPC.messages_Dialogs messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs2, int i, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f$0 = messagesController;
        this.f$1 = messages_dialogs;
        this.f$2 = arrayList;
        this.f$5 = messages_dialogs2;
        this.f$3 = i;
        this.f$6 = arrayList2;
        this.f$8 = arrayList3;
        this.f$7 = arrayList4;
        this.f$4 = runnable;
    }

    public LaunchActivity$$ExternalSyntheticLambda40(EditTextCell editTextCell, int[] iArr, int i, String[] strArr, String[] strArr2, ButtonWithCounterView buttonWithCounterView, TextInfoPrivacyCell textInfoPrivacyCell, Theme.ResourcesProvider resourcesProvider, int[] iArr2) {
        this.f$0 = editTextCell;
        this.f$2 = iArr;
        this.f$3 = i;
        this.f$1 = strArr;
        this.f$4 = strArr2;
        this.f$5 = buttonWithCounterView;
        this.f$6 = textInfoPrivacyCell;
        this.f$8 = resourcesProvider;
        this.f$7 = iArr2;
    }

    public LaunchActivity$$ExternalSyntheticLambda40(LaunchActivity launchActivity, Runnable runnable, TLObject tLObject, int i, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f$0 = launchActivity;
        this.f$4 = runnable;
        this.f$1 = tLObject;
        this.f$3 = i;
        this.f$2 = authorizationform;
        this.f$5 = getauthorizationform;
        this.f$6 = str;
        this.f$8 = str2;
        this.f$7 = str3;
    }

    public LaunchActivity$$ExternalSyntheticLambda40(LaunchActivity launchActivity, TLObject tLObject, int[] iArr, int i, Runnable runnable, Integer num, Integer num2, Long l, Integer num3) {
        this.f$0 = launchActivity;
        this.f$1 = tLObject;
        this.f$2 = iArr;
        this.f$3 = i;
        this.f$4 = runnable;
        this.f$5 = num;
        this.f$6 = num2;
        this.f$7 = l;
        this.f$8 = num3;
    }

    public LaunchActivity$$ExternalSyntheticLambda40(StarsController starsController, boolean[] zArr, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f$0 = starsController;
        this.f$1 = zArr;
        this.f$2 = messageObject;
        this.f$4 = inputInvoice;
        this.f$5 = tL_payments_paymentFormStars;
        this.f$6 = zArr2;
        this.f$3 = i;
        this.f$8 = callback;
        this.f$7 = callback2;
    }
}
