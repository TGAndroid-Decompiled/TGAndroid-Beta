package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
public final class nm0 implements v9 {
    public final qn0 f36138a;

    public nm0(qn0 qn0Var) {
        this.f36138a = qn0Var;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        qn0 qn0Var = this.f36138a;
        if (!isEmpty) {
            qn0Var.Y[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            qn0Var.Y[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            qn0Var.Y[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    qn0Var.f36996w = "female";
                    qn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
            } else {
                qn0Var.f36996w = "male";
                qn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            qn0Var.f36987s = str;
            String str2 = (String) qn0Var.Y0.get(str);
            if (str2 != null) {
                qn0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            qn0Var.v = str3;
            String str4 = (String) qn0Var.Y0.get(str3);
            if (str4 != null) {
                qn0Var.Y[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
            qn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
        }
    }

    @Override
    public final boolean e1(String str, n9 n9Var) {
        return false;
    }

    @Override
    public final void K(String str) {
    }

    @Override
    public final void onDismiss() {
    }
}
