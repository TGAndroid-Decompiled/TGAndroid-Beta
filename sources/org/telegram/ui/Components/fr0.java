package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fr0 implements TextWatcher {
    public final sr0 f26158a;

    public fr0(sr0 sr0Var) {
        this.f26158a = sr0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        sr0 sr0Var = this.f26158a;
        kr0 kr0Var = sr0Var.K;
        gy0 gy0Var = sr0Var.Q;
        v20 v20Var = sr0Var.f30665y0;
        if (!TextUtils.isEmpty(v20Var.f31362r.getText())) {
            sr0Var.L0(false);
        }
        if (sr0Var.A0) {
            String obj = v20Var.f31362r.getText().toString();
            if (obj.length() != 0) {
                if (gy0Var != null) {
                    gy0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (sr0Var.F.getAdapter() != kr0Var) {
                int G0 = sr0.G0(sr0Var);
                gy0Var.d.setText(LocaleController.getString(R.string.NoResult));
                gy0Var.e(false, true);
                sr0Var.L0(false);
                kr0Var.l();
                if (G0 > 0) {
                    sr0Var.H.h1(0, -G0);
                }
            }
            or0 or0Var = sr0Var.M;
            if (or0Var != null) {
                or0Var.E(obj);
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
