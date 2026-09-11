package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
public final class mm0 implements t9 {
    public final pn0 f38734a;

    public mm0(pn0 pn0Var) {
        this.f38734a = pn0Var;
    }

    @Override
    public final String K0() {
        return null;
    }

    @Override
    public final void W0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        pn0 pn0Var = this.f38734a;
        if (!isEmpty) {
            pn0Var.Y[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            pn0Var.Y[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            pn0Var.Y[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    pn0Var.f39598w = "female";
                    pn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
            } else {
                pn0Var.f39598w = "male";
                pn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            pn0Var.f39589s = str;
            String str2 = (String) pn0Var.Y0.get(str);
            if (str2 != null) {
                pn0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            pn0Var.v = str3;
            String str4 = (String) pn0Var.Y0.get(str3);
            if (str4 != null) {
                pn0Var.Y[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
            pn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
        }
    }

    @Override
    public final boolean f1(String str, l9 l9Var) {
        return false;
    }

    @Override
    public final void K(String str) {
    }

    @Override
    public final void onDismiss() {
    }
}
