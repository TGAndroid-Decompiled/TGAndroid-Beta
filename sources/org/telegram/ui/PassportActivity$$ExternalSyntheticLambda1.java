package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class PassportActivity$$ExternalSyntheticLambda1 implements PassportActivity.ErrorRunnable, AlertDialog.OnButtonClickListener, CountrySelectActivity.CountrySelectActivityDelegate {
    public final int $r8$classId;
    public final PassportActivity f$0;

    public PassportActivity$$ExternalSyntheticLambda1(PassportActivity passportActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = passportActivity;
    }

    @Override
    public void didSelectCountry(CountrySelectActivity.Country country) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createAddressInterface$34(country);
                break;
            default:
                this.f$0.lambda$createPhoneInterface$28(country);
                break;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 2:
                this.f$0.lambda$createPasswordInterface$11(alertDialog, i);
                break;
            case 3:
            default:
                this.f$0.lambda$checkDiscard$69(alertDialog, i);
                break;
            case 4:
                this.f$0.lambda$onRequestPermissionsResultFragment$68(alertDialog, i);
                break;
            case 5:
                this.f$0.lambda$createManageInterface$20(alertDialog, i);
                break;
        }
    }

    @Override
    public void onError(String str, String str2) {
        this.f$0.lambda$addField$62(str, str2);
    }
}
