package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
public final class km0 implements u9 {
    public final nn0 f39361a;

    public km0(nn0 nn0Var) {
        this.f39361a = nn0Var;
    }

    @Override
    public final void P0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        nn0 nn0Var = this.f39361a;
        if (!isEmpty) {
            nn0Var.Y[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            nn0Var.Y[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            nn0Var.Y[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    nn0Var.f40334w = "female";
                    nn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
            } else {
                nn0Var.f40334w = "male";
                nn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            nn0Var.f40325s = str;
            String str2 = (String) nn0Var.Y0.get(str);
            if (str2 != null) {
                nn0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            nn0Var.v = str3;
            String str4 = (String) nn0Var.Y0.get(str3);
            if (str4 != null) {
                nn0Var.Y[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
            nn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
        }
    }

    @Override
    public final boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override
    public final String z0() {
        return null;
    }

    @Override
    public final void K(String str) {
    }

    @Override
    public final void onDismiss() {
    }
}
