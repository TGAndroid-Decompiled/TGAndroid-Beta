package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yp0 implements TextWatcher {
    public final lq0 f33582a;

    public yp0(lq0 lq0Var) {
        this.f33582a = lq0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        lq0 lq0Var = this.f33582a;
        dq0 dq0Var = lq0Var.H;
        zw0 zw0Var = lq0Var.N;
        d20 d20Var = lq0Var.f28852v0;
        if (!TextUtils.isEmpty(d20Var.f26132r.getText())) {
            lq0Var.K0(false);
        }
        if (lq0Var.f28856x0) {
            String obj = d20Var.f26132r.getText().toString();
            if (obj.length() != 0) {
                if (zw0Var != null) {
                    zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (lq0Var.C.getAdapter() != dq0Var) {
                int F0 = lq0.F0(lq0Var);
                zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                zw0Var.e(false, true);
                lq0Var.K0(false);
                dq0Var.l();
                if (F0 > 0) {
                    lq0Var.E.h1(0, -F0);
                }
            }
            hq0 hq0Var = lq0Var.J;
            if (hq0Var != null) {
                hq0Var.E(obj);
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
