package org.telegram.ui;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.ui.ActionBar.AlertDialog;

public final class PaymentFormActivity$$ExternalSyntheticLambda0 implements OnCompleteListener, AlertDialog.OnButtonClickListener, CountrySelectActivity.CountrySelectActivityDelegate {
    public final int $r8$classId;
    public final PaymentFormActivity f$0;

    public PaymentFormActivity$$ExternalSyntheticLambda0(PaymentFormActivity paymentFormActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = paymentFormActivity;
    }

    @Override
    public void didSelectCountry(CountrySelectActivity.Country country) {
        switch (this.$r8$classId) {
            case 3:
                this.f$0.lambda$createView$5(country);
                break;
            default:
                this.f$0.lambda$createView$0(country);
                break;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.lambda$showPayAlert$36(alertDialog, i);
                break;
            case 2:
                this.f$0.lambda$createView$22(alertDialog, i);
                break;
            default:
                this.f$0.lambda$createView$28(alertDialog, i);
                break;
        }
    }

    @Override
    public void onComplete(Task task) {
        this.f$0.lambda$initGooglePay$37(task);
    }
}
