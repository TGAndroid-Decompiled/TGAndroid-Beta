package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.AlertDialog;

public final class PaymentFormActivity$$ExternalSyntheticLambda30 implements OnCompleteListener, AlertDialog.OnButtonClickListener, CountrySelectActivity.CountrySelectActivityDelegate {
    public final int $r8$classId;
    public final PaymentFormActivity f$0;

    public PaymentFormActivity$$ExternalSyntheticLambda30(PaymentFormActivity paymentFormActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = paymentFormActivity;
    }

    @Override
    public void didSelectCountry(CountrySelectActivity.Country country) {
        switch (this.$r8$classId) {
            case 3:
                PaymentFormActivity paymentFormActivity = this.f$0;
                paymentFormActivity.country = country;
                paymentFormActivity.inputFields[4].setText(country.name);
                break;
            default:
                PaymentFormActivity paymentFormActivity2 = this.f$0;
                paymentFormActivity2.country = country;
                paymentFormActivity2.inputFields[4].setText(country.name);
                paymentFormActivity2.countryName = country.shortname;
                break;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.sendSavePassword(true);
                break;
            case 2:
                PaymentFormActivity paymentFormActivity = this.f$0;
                paymentFormActivity.showPayAlert(paymentFormActivity.totalPrice[0]);
                break;
            default:
                PaymentFormActivity paymentFormActivity2 = this.f$0;
                paymentFormActivity2.setDonePressed(true);
                paymentFormActivity2.sendData();
                break;
        }
    }

    @Override
    public void onComplete(Task task) {
        PaymentFormActivity paymentFormActivity = this.f$0;
        paymentFormActivity.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = paymentFormActivity.googlePayContainer;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
