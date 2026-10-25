package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
public final class fm0 implements x9 {
    public final in0 f39419a;

    public fm0(in0 in0Var) {
        this.f39419a = in0Var;
    }

    @Override
    public final String H0() {
        return null;
    }

    @Override
    public final void R0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        in0 in0Var = this.f39419a;
        if (!isEmpty) {
            in0Var.Y[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            in0Var.Y[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            in0Var.Y[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    in0Var.f40318w = "female";
                    in0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
            } else {
                in0Var.f40318w = "male";
                in0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            in0Var.f40309s = str;
            String str2 = (String) in0Var.Y0.get(str);
            if (str2 != null) {
                in0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            in0Var.v = str3;
            String str4 = (String) in0Var.Y0.get(str3);
            if (str4 != null) {
                in0Var.Y[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
            in0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
        }
    }

    @Override
    public final boolean d1(String str, p9 p9Var) {
        return false;
    }

    @Override
    public final void onDismiss() {
    }

    @Override
    public final void H(String str) {
    }
}
