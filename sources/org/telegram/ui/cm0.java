package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
public final class cm0 implements t9 {
    public final fn0 f32834a;

    public cm0(fn0 fn0Var) {
        this.f32834a = fn0Var;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        fn0 fn0Var = this.f32834a;
        if (!isEmpty) {
            fn0Var.Y[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            fn0Var.Y[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            fn0Var.Y[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    fn0Var.f33836w = "female";
                    fn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
            } else {
                fn0Var.f33836w = "male";
                fn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            fn0Var.f33827s = str;
            String str2 = (String) fn0Var.Y0.get(str);
            if (str2 != null) {
                fn0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            fn0Var.v = str3;
            String str4 = (String) fn0Var.Y0.get(str3);
            if (str4 != null) {
                fn0Var.Y[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
            fn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
        }
    }

    @Override
    public final boolean e1(String str, l9 l9Var) {
        return false;
    }

    @Override
    public final void K(String str) {
    }

    @Override
    public final void onDismiss() {
    }
}
