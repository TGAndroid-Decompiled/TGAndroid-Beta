package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
public final class am0 implements u9 {
    public final dn0 f32670a;

    public am0(dn0 dn0Var) {
        this.f32670a = dn0Var;
    }

    @Override
    public final String G0() {
        return null;
    }

    @Override
    public final void S0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        dn0 dn0Var = this.f32670a;
        if (!isEmpty) {
            dn0Var.V[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            dn0Var.V[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            dn0Var.V[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    dn0Var.f33731w = "female";
                    dn0Var.V[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
            } else {
                dn0Var.f33731w = "male";
                dn0Var.V[4].setText(LocaleController.getString(R.string.PassportMale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            dn0Var.f33722s = str;
            String str2 = (String) dn0Var.V0.get(str);
            if (str2 != null) {
                dn0Var.V[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            dn0Var.v = str3;
            String str4 = (String) dn0Var.V0.get(str3);
            if (str4 != null) {
                dn0Var.V[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
            dn0Var.V[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
        }
    }

    @Override
    public final boolean f1(String str, m9 m9Var) {
        return false;
    }

    @Override
    public final void K(String str) {
    }

    @Override
    public final void onDismiss() {
    }
}
