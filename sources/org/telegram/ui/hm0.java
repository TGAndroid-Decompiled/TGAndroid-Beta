package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
public final class hm0 implements x9 {
    public final kn0 f39937a;

    public hm0(kn0 kn0Var) {
        this.f39937a = kn0Var;
    }

    @Override
    public final String H0() {
        return null;
    }

    @Override
    public final void R0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        kn0 kn0Var = this.f39937a;
        if (!isEmpty) {
            kn0Var.Y[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            kn0Var.Y[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            kn0Var.Y[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    kn0Var.f40884w = "female";
                    kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
            } else {
                kn0Var.f40884w = "male";
                kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            kn0Var.f40875s = str;
            String str2 = (String) kn0Var.Y0.get(str);
            if (str2 != null) {
                kn0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            kn0Var.v = str3;
            String str4 = (String) kn0Var.Y0.get(str3);
            if (str4 != null) {
                kn0Var.Y[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
            kn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
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
