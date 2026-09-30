package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jq0 implements TextWatcher {
    public final wq0 f25502a;

    public jq0(wq0 wq0Var) {
        this.f25502a = wq0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        wq0 wq0Var = this.f25502a;
        oq0 oq0Var = wq0Var.K;
        kx0 kx0Var = wq0Var.Q;
        e20 e20Var = wq0Var.f30150y0;
        if (!TextUtils.isEmpty(e20Var.f23822r.getText())) {
            wq0Var.K0(false);
        }
        if (wq0Var.A0) {
            String obj = e20Var.f23822r.getText().toString();
            if (obj.length() != 0) {
                if (kx0Var != null) {
                    kx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (wq0Var.F.getAdapter() != oq0Var) {
                int F0 = wq0.F0(wq0Var);
                kx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                kx0Var.e(false, true);
                wq0Var.K0(false);
                oq0Var.l();
                if (F0 > 0) {
                    wq0Var.H.h1(0, -F0);
                }
            }
            sq0 sq0Var = wq0Var.M;
            if (sq0Var != null) {
                sq0Var.E(obj);
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
