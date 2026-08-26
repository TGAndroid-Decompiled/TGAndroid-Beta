package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog;

public final class PassportActivity$$ExternalSyntheticLambda11 implements View.OnTouchListener {
    public final int $r8$classId;
    public final PassportActivity f$0;

    public PassportActivity$$ExternalSyntheticLambda11(PassportActivity passportActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = passportActivity;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        PassportActivity passportActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                if (passportActivity.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                CountrySelectActivity countrySelectActivity = new CountrySelectActivity(null, false);
                countrySelectActivity.delegate = new PassportActivity$$ExternalSyntheticLambda7(passportActivity, 3);
                passportActivity.presentFragment(countrySelectActivity);
                return true;
            case 1:
                if (passportActivity.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(passportActivity.getParentActivity(), 0, null);
                String string = LocaleController.getString(R.string.PassportSelectGender);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                builder.setItems(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new DialogsActivity$$ExternalSyntheticLambda124(passportActivity, 3));
                builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
                passportActivity.showDialog(alertDialog);
                return true;
            case 2:
                if (passportActivity.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                CountrySelectActivity countrySelectActivity2 = new CountrySelectActivity(null, false);
                countrySelectActivity2.delegate = new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(2, passportActivity, view);
                passportActivity.presentFragment(countrySelectActivity2);
                return true;
            default:
                if (passportActivity.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                CountrySelectActivity countrySelectActivity3 = new CountrySelectActivity(null, false);
                countrySelectActivity3.delegate = new PassportActivity$$ExternalSyntheticLambda7(passportActivity, 2);
                passportActivity.presentFragment(countrySelectActivity3);
                return true;
        }
    }
}
