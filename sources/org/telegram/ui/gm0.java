package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
public final class gm0 implements w9 {
    public final jn0 f33977a;

    public gm0(jn0 jn0Var) {
        this.f33977a = jn0Var;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        jn0 jn0Var = this.f33977a;
        if (!isEmpty) {
            jn0Var.Y[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            jn0Var.Y[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            jn0Var.Y[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    jn0Var.f34816w = "female";
                    jn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
            } else {
                jn0Var.f34816w = "male";
                jn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            jn0Var.f34807s = str;
            String str2 = (String) jn0Var.Y0.get(str);
            if (str2 != null) {
                jn0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            jn0Var.v = str3;
            String str4 = (String) jn0Var.Y0.get(str3);
            if (str4 != null) {
                jn0Var.Y[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
            jn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
        }
    }

    @Override
    public final boolean e1(String str, o9 o9Var) {
        return false;
    }

    @Override
    public final void K(String str) {
    }

    @Override
    public final void onDismiss() {
    }
}
