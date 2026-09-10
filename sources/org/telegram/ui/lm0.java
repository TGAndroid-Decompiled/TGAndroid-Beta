package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
public final class lm0 implements t9 {
    public final on0 f34740a;

    public lm0(on0 on0Var) {
        this.f34740a = on0Var;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        on0 on0Var = this.f34740a;
        if (!isEmpty) {
            on0Var.Y[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            on0Var.Y[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            on0Var.Y[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    on0Var.f35566w = "female";
                    on0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
            } else {
                on0Var.f35566w = "male";
                on0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            on0Var.f35557s = str;
            String str2 = (String) on0Var.Y0.get(str);
            if (str2 != null) {
                on0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            on0Var.v = str3;
            String str4 = (String) on0Var.Y0.get(str3);
            if (str4 != null) {
                on0Var.Y[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
            on0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
        }
    }

    @Override
    public final boolean e1(String str, l9 l9Var) {
        return false;
    }

    @Override
    public final void J(String str) {
    }

    @Override
    public final void onDismiss() {
    }
}
