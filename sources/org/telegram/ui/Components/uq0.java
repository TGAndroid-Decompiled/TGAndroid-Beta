package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uq0 implements TextWatcher {
    public final hr0 f31213a;

    public uq0(hr0 hr0Var) {
        this.f31213a = hr0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        hr0 hr0Var = this.f31213a;
        zq0 zq0Var = hr0Var.L;
        vx0 vx0Var = hr0Var.R;
        i20 i20Var = hr0Var.f27154z0;
        if (!TextUtils.isEmpty(i20Var.f27258r.getText())) {
            hr0Var.P0(false);
        }
        if (hr0Var.B0) {
            String obj = i20Var.f27258r.getText().toString();
            if (obj.length() != 0) {
                if (vx0Var != null) {
                    vx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (hr0Var.G.getAdapter() != zq0Var) {
                int O0 = hr0.O0(hr0Var);
                vx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                vx0Var.e(false, true);
                hr0Var.P0(false);
                zq0Var.l();
                if (O0 > 0) {
                    hr0Var.I.h1(0, -O0);
                }
            }
            dr0 dr0Var = hr0Var.N;
            if (dr0Var != null) {
                dr0Var.E(obj);
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
