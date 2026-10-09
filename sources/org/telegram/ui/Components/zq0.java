package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zq0 implements TextWatcher {
    public final mr0 f33624a;

    public zq0(mr0 mr0Var) {
        this.f33624a = mr0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        mr0 mr0Var = this.f33624a;
        er0 er0Var = mr0Var.K;
        ay0 ay0Var = mr0Var.Q;
        s20 s20Var = mr0Var.f28926y0;
        if (!TextUtils.isEmpty(s20Var.f30614r.getText())) {
            mr0Var.L0(false);
        }
        if (mr0Var.A0) {
            String obj = s20Var.f30614r.getText().toString();
            if (obj.length() != 0) {
                if (ay0Var != null) {
                    ay0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (mr0Var.F.getAdapter() != er0Var) {
                int G0 = mr0.G0(mr0Var);
                ay0Var.d.setText(LocaleController.getString(R.string.NoResult));
                ay0Var.e(false, true);
                mr0Var.L0(false);
                er0Var.l();
                if (G0 > 0) {
                    mr0Var.H.h1(0, -G0);
                }
            }
            ir0 ir0Var = mr0Var.M;
            if (ir0Var != null) {
                ir0Var.E(obj);
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
