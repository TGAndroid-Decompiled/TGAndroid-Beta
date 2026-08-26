package org.telegram.ui.Stars;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda101;

public final class StarsController$$ExternalSyntheticLambda42 implements Utilities.Callback {
    public final StarsController f$0;
    public final long f$1;
    public final TLRPC.TL_payments_paymentFormStars f$10;
    public final int f$11;
    public final long f$12;
    public final boolean[] f$2;
    public final Utilities.Callback f$3;
    public final Context f$4;
    public final Theme.ResourcesProvider f$5;
    public final boolean f$6;
    public final String f$7;
    public final MessageObject f$8;
    public final TLRPC.InputInvoice f$9;

    public StarsController$$ExternalSyntheticLambda42(StarsController starsController, long j, boolean[] zArr, Utilities.Callback callback, Context context, Theme.ResourcesProvider resourcesProvider, boolean z, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i, long j2) {
        this.f$0 = starsController;
        this.f$1 = j;
        this.f$2 = zArr;
        this.f$3 = callback;
        this.f$4 = context;
        this.f$5 = resourcesProvider;
        this.f$6 = z;
        this.f$7 = str;
        this.f$8 = messageObject;
        this.f$9 = inputInvoice;
        this.f$10 = tL_payments_paymentFormStars;
        this.f$11 = i;
        this.f$12 = j2;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        StarsController starsController = this.f$0;
        long j = starsController.balance.amount;
        boolean[] zArr = this.f$2;
        long j2 = this.f$1;
        Utilities.Callback callback2 = this.f$3;
        MessageObject messageObject = this.f$8;
        TLRPC.InputInvoice inputInvoice = this.f$9;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f$10;
        int i = this.f$11;
        if (j >= j2) {
            starsController.payAfterConfirmed(messageObject, inputInvoice, tL_payments_paymentFormStars, new StarsController$$ExternalSyntheticLambda51(starsController, i, callback, zArr, callback2));
            return;
        }
        boolean zStarsPurchaseAvailable = MessagesController.getInstance(starsController.currentAccount).starsPurchaseAvailable();
        Context context = this.f$4;
        Theme.ResourcesProvider resourcesProvider = this.f$5;
        if (zStarsPurchaseAvailable) {
            boolean[] zArr2 = {false};
            StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j2, this.f$6 ? 9 : 0, this.f$7, new LaunchActivity$$ExternalSyntheticLambda101(starsController, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i, callback2, callback), this.f$12);
            starsNeededSheet.setOnDismissListener(new StarsController$$ExternalSyntheticLambda50(starsController, callback, zArr2, zArr, callback2, 0));
            starsNeededSheet.show();
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (!zArr[0] && callback2 != null) {
            callback2.run("cancelled");
            zArr[0] = true;
        }
        StarsController.showNoSupportDialog(context, resourcesProvider);
    }
}
