package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class PassportActivity$$ExternalSyntheticLambda7 implements AlertDialog.OnButtonClickListener, CountrySelectActivity.CountrySelectActivityDelegate {
    public final int $r8$classId;
    public final PassportActivity f$0;

    public PassportActivity$$ExternalSyntheticLambda7(PassportActivity passportActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = passportActivity;
    }

    @Override
    public void didSelectCountry(CountrySelectActivity.Country country) {
        switch (this.$r8$classId) {
            case 2:
                PassportActivity passportActivity = this.f$0;
                passportActivity.inputFields[5].setText(country.name);
                passportActivity.currentCitizeship = country.shortname;
                break;
            default:
                PassportActivity passportActivity2 = this.f$0;
                passportActivity2.inputFields[0].setText(country.name);
                if (passportActivity2.countriesArray.indexOf(country.name) != -1) {
                    passportActivity2.ignoreOnTextChange = true;
                    String str = (String) passportActivity2.countriesMap.get(country.name);
                    passportActivity2.inputFields[1].setText(str);
                    String str2 = (String) passportActivity2.phoneFormatMap.get(str);
                    passportActivity2.inputFields[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    passportActivity2.ignoreOnTextChange = false;
                }
                AndroidUtilities.runOnUIThread(new PassportActivity$$ExternalSyntheticLambda14(passportActivity2, 3), 300L);
                passportActivity2.inputFields[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = passportActivity2.inputFields[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkDiscard$69(alertDialog, i);
                break;
            case 1:
                PassportActivity passportActivity = this.f$0;
                passportActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    passportActivity.getParentActivity().startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 2:
            case 3:
            default:
                this.f$0.lambda$createManageInterface$20();
                break;
            case 4:
                this.f$0.lambda$createPasswordInterface$11();
                break;
        }
    }
}
