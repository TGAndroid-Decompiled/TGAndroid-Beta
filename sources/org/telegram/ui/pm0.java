package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
public final class pm0 implements y9 {
    public final sn0 f38975a;

    public pm0(sn0 sn0Var) {
        this.f38975a = sn0Var;
    }

    @Override
    public final String I0() {
        return null;
    }

    @Override
    public final void V0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        sn0 sn0Var = this.f38975a;
        if (!isEmpty) {
            sn0Var.Y[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            sn0Var.Y[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            sn0Var.Y[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn0Var.f39903w = "female";
                    sn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
            } else {
                sn0Var.f39903w = "male";
                sn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            sn0Var.f39894s = str;
            String str2 = (String) sn0Var.Y0.get(str);
            if (str2 != null) {
                sn0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            sn0Var.v = str3;
            String str4 = (String) sn0Var.Y0.get(str3);
            if (str4 != null) {
                sn0Var.Y[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
            sn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
        }
    }

    @Override
    public final boolean d1(String str, o9 o9Var) {
        return false;
    }

    @Override
    public final void K(String str) {
    }

    @Override
    public final void onDismiss() {
    }
}
